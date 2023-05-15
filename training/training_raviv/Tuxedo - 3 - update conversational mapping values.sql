
-- a) non-mappings (ie exclusion from "general" - like-named copy - "mappings")
--    7 of these (well, 6 really: 1 is null)
--    Taken from Step4...genInputHashSetsForConversational()

-- b) special mappings - ie between not like named fields
--    taken from Step4...genInputSpecialMappingsForConversational()

-- 1. CvSideEffect

-- a) non-mappings: 3 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y' -- new column, null is equivalent to 'N' (ie is included)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSideEffect'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'CUSTOMER_ID', 'SUSP_RC_RATE_TYPE')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;

-- b) special: 3 rows - *** SAME AS ABOVE ***
update tux_fml_buffers_new
set csapiban_mapping1 = -- new column, null is equivalent to 'N' (ie is included)
             decode(field_name, 'BAN',               'PCTNAGRPRMRECBAN',
                                'CUSTOMER_ID',       'PCTNAGRPRMRECCUSTOMER_ID',
                                'SUSP_RC_RATE_TYPE', 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE',
                                                      null)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSideEffect'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'CUSTOMER_ID', 'SUSP_RC_RATE_TYPE')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;

----------------------------------------------------------------------------------

-- 2. CvStart: 0 rows
-- There are none for this - it passes null into genInputHashSetForConversational()
-- *** Does it still do the HashSet declaration? If so remove it. ***

----------------------------------------------------------------------------------


-- 3. CvSvBan: 2 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y'
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvBan'
  and buffer_type = 'IN'
  and field_name in ('PCUSTRECOPERATOR_ID', 'PCUSTRECAPPLICATION_ID')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;

-- b) special: 3 rows - *** NOT SAME AS ABOVE, although above is subset of this, AND 1:MANY ***
update tux_fml_buffers_new
set csapiban_mapping1 = 
             decode(field_name, 'BAN',                    'PCTNAGRPRMRECBAN',
                                'PCUSTRECOPERATOR_ID',    'PBANCUSTRECOPERATOR_ID',
                                'PCUSTRECAPPLICATION_ID', 'PBANCUSTRECAPPLICATION_ID',
                                                           null),
    csapiban_mapping2 =
             -- *** Why don't we map customer_id to PCTNAGRPRMRECCUSTOMER_ID and PBANRECCUSTOMER_ID? ***
             decode(field_name, 'BAN',                    'PCTNAGRPRMRECCUSTOMER_ID',
                                                           null),
    csapiban_mapping3 =
             -- *** Why don't we map customer_id to PCTNAGRPRMRECCUSTOMER_ID and PBANRECCUSTOMER_ID? ***
             decode(field_name, 'BAN',                    'PBANRECCUSTOMER_ID',
                                                           null)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvBan'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'PCUSTRECOPERATOR_ID', 'PCUSTRECAPPLICATION_ID')
--order by svc_name, buffer_type, field_name,
--         field_seq
;


----------------------------------------------------------------------------------


-- 4. cvSvCtnAgr: 16 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y'
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvCtnAgr'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'CUSTOMER_ID', 'SUBSCRIBER_NO', 
                     'ROWID', 'EFFECTIVE_DATE', 'DEALER_CODE', 'SALES_AGENT', 
                     'COMMIT_ORIG_NO_MONTH', 'PRODUCT_TYPE', 'PCSFRNDFMLROWCOUNT', 
                     'PFTRDEPBUFROWCOUNT', 'SYS_CREATION_DATE', 'SYS_UPDATE_DATE', 
                     'DL_SERVICE_CODE', 'DL_UPDATE_STAMP', 'SUBSCRIBER_ID')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;

-- b) special: 16 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'BAN',                  'PCTNAGRPRMRECBAN',
                                -- TODO: is the 2nd of these really correct? Would guess they should only be mapped from the cvSvCtn-service
                                'CUSTOMER_ID',          'PCTNAGRPRMRECCUSTOMER_ID', 
                                'SUBSCRIBER_NO',        'PCTNRECSUBSCRIBER_NO',
                                'ROWID',                'PAGRSOCBUFROWID',
                                'EFFECTIVE_DATE',       'PAGRSOCBUFEFFECTIVE_DATE',
                                'DEALER_CODE',          'PAGRSOCBUFDEALER_CODE',
                                'SALES_AGENT',          'PAGRSOCBUFSALES_AGENT',
                                'COMMIT_ORIG_NO_MONTH', 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH',
                                'PRODUCT_TYPE',         'PAGRSOCBUFPRODUCT_TYPE',
                                'PCSFRNDFMLROWCOUNT',   'PAGRFRNDFMLROWCOUNT',
                                'PFTRDEPBUFROWCOUNT',   'PAGRFTRDEPBUFROWCOUNT',
                                'SYS_CREATION_DATE',    'NPNUMINFORECSYS_CREATION_DATE',
                                'SYS_UPDATE_DATE',      'NPNUMINFORECSYS_UPDATE_DATE',
                                'DL_SERVICE_CODE',      'NPNUMINFORECDL_SERVICE_CODE',
                                'DL_UPDATE_STAMP',      'NPNUMINFORECDL_UPDATE_STAMP',
                                'SUBSCRIBER_ID',        'NPNUMINFORECSUBSCRIBER_ID',
                                                         null),
    csapiban_mapping2 = 
             decode(field_name, 'CUSTOMER_ID',          'PCTNRECCUSTOMER_ID',
                                'SUBSCRIBER_NO',        'SUBSCRIBER_NO', -- *** shum mishtake shorly!?! ***
                                                         null)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvCtnAgr'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'CUSTOMER_ID', 'SUBSCRIBER_NO', 'ROWID', 
                     'EFFECTIVE_DATE', 'DEALER_CODE', 'SALES_AGENT', 
                     'COMMIT_ORIG_NO_MONTH', 'PRODUCT_TYPE', 'PCSFRNDFMLROWCOUNT', 
                     'PFTRDEPBUFROWCOUNT', 'SYS_CREATION_DATE', 'SYS_UPDATE_DATE', 
                     'DL_SERVICE_CODE', 'DL_UPDATE_STAMP', 'SUBSCRIBER_ID')   
--order by svc_name, buffer_type, field_name,
--         field_seq
;
 

----------------------------------------------------------------------------------


-- 5. CvSvCtn: 11 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y'
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvCtn'
  and buffer_type = 'IN'
  and field_name in ('CUSTOMER_ID', 'ROWID', 'SUBSCRIBER_NO', 
                     'SYS_CREATION_DATE', 'DEALER_CODE', 'SYS_UPDATE_DATE', 
                     'DL_SERVICE_CODE', 'CONV_RUN_NO', 'DL_UPDATE_STAMP',
                     'SALES_AGENT', 'ALLOW_ADVERTISING_IND')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;


-- b) special: 12 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'CUSTOMER_BAN',          'PCTNAGRPRMRECBAN',
                                'CUSTOMER_ID',           'PCTNAGRPRMRECCUSTOMER_ID',
                                'ROWID',                 'PCTNRECROWID',
                                'SUBSCRIBER_NO',         'PCTNRECSUBSCRIBER_NO',
                                'SYS_CREATION_DATE',     'PCTNRECSYS_CREATION_DATE',
                                'DEALER_CODE',           'PCTNRECDEALER_CODE',
                                'SYS_UPDATE_DATE',       'PCTNRECSYS_UPDATE_DATE',
                                'DL_SERVICE_CODE',       'PCTNRECDL_SERVICE_CODE',
                                'CONV_RUN_NO',           'PCTNRECCONV_RUN_NO',
                                'DL_UPDATE_STAMP',       'PCTNRECDL_UPDATE_STAMP',
                                'SALES_AGENT',           'PCTNRECSALES_AGENT',
                                'ALLOW_ADVERTISING_IND', 'PCTNRECALLOW_ADVERTISING_IND',
                                'SUBSCRIBER_NO',         'SUBSCRIBER_NO', -- *** shum mishtake shorly!?! ***
                                                          null),
    csapiban_mapping2 = 
             decode(field_name, 'CUSTOMER_ID',          'PCTNRECCUSTOMER_ID',
                                'CUSTOMER_BAN',         'CUSTOMER_BAN', -- *** shum mishtake shorly!?! ***
                                'SUBSCRIBER_NO',         'SUBSCRIBER_NO', -- *** shum mishtake shorly!?! ***
                                                         null)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvCtn'
  and buffer_type = 'IN'
  and field_name in ('CUSTOMER_BAN', 'CUSTOMER_ID', 'ROWID', 'SUBSCRIBER_NO', 
                     'SYS_CREATION_DATE', 'DEALER_CODE', 'SYS_UPDATE_DATE', 
                     'DL_SERVICE_CODE', 'CONV_RUN_NO', 'DL_UPDATE_STAMP',
                     'SALES_AGENT', 'ALLOW_ADVERTISING_IND')  
--order by svc_name, buffer_type, --field_name,
--         field_seq
;


----------------------------------------------------------------------------------


-- 6. CvSvEsn: 6 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y'
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvEsn'
  and buffer_type = 'IN'
  and field_name in ('CUSTOMER_ID', 'ROWCOUNT', 'BAN', 
                     'EXPIRATION_DATE', 'EFFECTIVE_DATE', 'DEALER_CODE')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;


-- b) special: 6 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'CUSTOMER_ID',     'PCTNAGRPRMRECCUSTOMER_ID', 
                                'ROWCOUNT',        'PESNBUFROWCOUNT', 
                                'BAN',             'PCTNAGRPRMRECBAN', 
                                'EXPIRATION_DATE', 'PHYDEVARRAYEXPIRATION_DATE', 
                                'EFFECTIVE_DATE',  'PHYDEVARRAYEFFECTIVE_DATE', 
                                'DEALER_CODE',     'PHYDEVARRAYDEALER_CODE', 
                                                    null)
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvEsn'
  and buffer_type = 'IN'
  and field_name in ('CUSTOMER_ID', 'ROWCOUNT', 'BAN', 
                     'EXPIRATION_DATE', 'EFFECTIVE_DATE', 'DEALER_CODE')
--order by svc_name, buffer_type, --field_name,
--         field_seq
;
 

----------------------------------------------------------------------------------


-- 7. CvSvNmAdr: 8 rows
update tux_fml_buffers_new
set exclude_from_csapiban_copy = 'Y'
-- select * from tux_fml_buffers_new
where svc_name = 'cvSvNmAdr'
  and buffer_type = 'IN'
  and field_name in ('ROWCOUNT', 'EFFECTIVE_DATE', 'ROWID', 
                     'SYS_CREATION_DATE', 'SYS_UPDATE_DATE', 'DL_SERVICE_CODE',
                     'CONV_RUN_NO', 'DL_UPDATE_STAMP')  
--order by svc_name, buffer_type, field_name,
--         field_seq
;


-- b) special: 10 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'BAN',               'PCTNAGRPRMRECBAN',
                                'CUSTOMER_ID',       'PCTNAGRPRMRECCUSTOMER_ID', 
                                'ROWCOUNT',          'PNAMEADRBUFROWCOUNT', 
                                'EFFECTIVE_DATE',    'LNKRECEFFECTIVE_DATE', 
                                'ROWID',             'NAMERECROWID', 
                                'SYS_CREATION_DATE', 'NAMERECSYS_CREATION_DATE', 
                                'SYS_UPDATE_DATE',   'NAMERECSYS_UPDATE_DATE', 
                                'DL_SERVICE_CODE',   'NAMERECDL_SERVICE_CODE', 
                                'CONV_RUN_NO',       'NAMERECCONV_RUN_NO', 
                                'DL_UPDATE_STAMP',   'NAMERECDL_UPDATE_STAMP', 
                                                      null)
-- select * from tux_fml_buffers_new 
where svc_name = 'cvSvNmAdr'
  and buffer_type = 'IN'
  and field_name in ('BAN', 'CUSTOMER_ID', 
                     'ROWCOUNT', 'EFFECTIVE_DATE', 'ROWID', 
                     'SYS_CREATION_DATE', 'SYS_UPDATE_DATE', 'DL_SERVICE_CODE',
                     'CONV_RUN_NO', 'DL_UPDATE_STAMP')  
--order by svc_name, buffer_type, --field_name,
--         field_seq
;
 

----------------------------------------------------------------------------------
----------------------------------------------------------------------------------

-- OUTPUT BUFFER

-- b) special: 5 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'SYS_CREATION_DATE', 'NPNUMINFORECSYS_CREATION_DATE', 
                                'SYS_UPDATE_DATE',   'NPNUMINFORECSYS_UPDATE_DATE', 
                                'DL_SERVICE_CODE',   'NPNUMINFORECDL_SERVICE_CODE', 
                                'DL_UPDATE_STAMP',   'NPNUMINFORECDL_UPDATE_STAMP', 
                                'SUBSCRIBER_ID',     'NPNUMINFORECSUBSCRIBER_ID', 
                                                      null)
-- select * from tux_fml_buffers_new 
where svc_name = 'cvSvCtnAgr'
  and buffer_type = 'OUT'
  and field_name in ('SYS_CREATION_DATE', 'SYS_UPDATE_DATE',  'DL_SERVICE_CODE', 
                     'DL_UPDATE_STAMP', 'SUBSCRIBER_ID')  
--order by svc_name, buffer_type, --field_name,
--         field_seq
;


-- b) special: 4 rows
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'ROWCOUNT',        'PESNBUFROWCOUNT', 
                                'EFFECTIVE_DATE',  'PHYDEVARRAYEFFECTIVE_DATE', 
                                'EXPIRATION_DATE', 'PHYDEVARRAYEXPIRATION_DATE', 
                                'DEALER_CODE',     'PHYDEVARRAYDEALER_CODE', 
                                                    null)
-- select * from tux_fml_buffers_new 
where svc_name = 'cvSvEsn'
  and buffer_type = 'OUT'
  and field_name in ('ROWCOUNT', 'EFFECTIVE_DATE',  'EXPIRATION_DATE', 'DEALER_CODE')  
--order by svc_name, buffer_type, --field_name,
--         field_seq
;


-- b) special: 9 rows - SHOULD THIS HAVE EXPIRATION_DATE TOO? NOT IN THE BUFFER!!
update tux_fml_buffers_new
set csapiban_mapping1 =
             decode(field_name, 'ROWCOUNT',          'PNAMEADRBUFROWCOUNT', 
                                'EFFECTIVE_DATE',    'LNKRECEFFECTIVE_DATE', 
                                --'EXPIRATION_DATE', 'LNKRECEXPIRATION_DATE', 
                                'ROWID',             'NAMERECROWID', 
                                'SYS_CREATION_DATE', 'NAMERECSYS_CREATION_DATE', 
                                'SYS_UPDATE_DATE',   'NAMERECSYS_UPDATE_DATE', 
                                'DL_SERVICE_CODE',   'NAMERECDL_SERVICE_CODE', 
                                'DL_UPDATE_STAMP',   'NAMERECDL_UPDATE_STAMP', 
                                'CONV_RUN_NO',       'NAMERECCONV_RUN_NO', 
                                'LINK_TYPE',         'LINK_TYPE', 
                                                      null)
-- select * from tux_fml_buffers_new 
where svc_name = 'cvSvNmAdr'
  and buffer_type = 'OUT'
  and field_name in ('ROWCOUNT', 'EFFECTIVE_DATE',  --'EXPIRATION_DATE', 
                     'ROWID', 'SYS_CREATION_DATE', 'SYS_UPDATE_DATE', 'DL_SERVICE_CODE', 
                     'DL_UPDATE_STAMP', 'CONV_RUN_NO', 'LINK_TYPE')  
--order by svc_name, buffer_type, --field_name,
--        field_seq
;
 

----------------------------------------------------------------------------------
----------------------------------------------------------------------------------

-- services table:

-- 9 rows (but usually set so will update 0):
update tux_services_new
set conversational = 'Y'
-- select * from tux_services_new 
where svc_name in ('cvCommit', 'cvRollback', 
                   'cvSideEffect', 'cvStart', 'cvSvBan', 'cvSvCtn', 
                   'cvSvCtnAgr', 'cvSvEsn', 'cvSvNmAdr')
  and conversational <> 'Y' -- Will probably already have this value
;

-- 7 rows (but usually set so will update 0):
update tux_services_new
set fields_shared_with_csapiban = 'Y'
-- select * from tux_services_new 
where svc_name in (--'cvCommit', 'cvRollback', 
                   'cvSideEffect', 'cvStart', 'cvSvBan', 'cvSvCtn', 
                   'cvSvCtnAgr', 'cvSvEsn', 'cvSvNmAdr')
  and fields_shared_with_csapiban <> 'Y' -- Will probably already have this value
;

commit; 

