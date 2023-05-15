
/*
-- Any default values apart from those catered for by the updates below?
select '''' || field_name || ''', ', field_def_value, count(*) 
  from tux_fml_buffers
 where buffer_type = 'IN'
   and field_name not in ('APPLICATION_ID', 'ENV_CODE', 'MARKET_CODE', 
                          'ONLINE_TRX_NO', 'OPERATOR_ID', 'SESSION_ID', 'TRANSACTION_MODE')
   and field_def_value is not null
group by field_name, field_def_value
order by field_name, field_def_value
;

-- 3 LINK_TYPE_STR values are null:
select field_name, count(*) 
  from tux_fml_buffers
 where buffer_type = 'IN'
   and field_name in ('CAAP_TYPE', 'DIRECTIVE', 'LINK_TYPE_STR', 'MKT_CODE', 'THRESHOLD_AMT')
   and field_def_value is null
group by field_name
order by field_name
;

-- U for csGtCtn as that's always 'U'ser. The other 3 services are more general purpose.
select *
  from tux_fml_buffers
 where buffer_type = 'IN'
   and field_name = 'LINK_TYPE_STR'
;

-- One approach is to copy the existing values across.
-- This won't cater for new values though, so do comparisons then (if correct) 
-- run the queries below.
-- *** DON'T do this copy - do the stuff below that sets (standard) new values too. ***
update tux_fml_buffers_new a
set a.field_def_value = (select b.field_def_value 
                           from tux_fml_buffers b
                          where b.svc_name = a.svc_name
                            and b.buffer_type = a.buffer_type
                            and b.field_name = a.field_name
                         )
where a.buffer_type = 'IN'
;

-- Now analyse what we've just done:
select 'tux_fml_buffers' as table_name, count(*) as default_value_count
from tux_fml_buffers
where field_def_value is not null
UNION
select 'tux_fml_buffers_new' as table_name, count(*) as default_value_count
from tux_fml_buffers_new
where field_def_value is not null
;

select field_name, field_def_value, count(*) 
  from tux_fml_buffers_new
 where buffer_type = 'IN'
   and field_def_value is not null
group by field_name, field_def_value
order by field_name, field_def_value
;

-- Should just be 3 for LINK_TYPE_STR
select field_name, field_def_value, count(*) 
  from tux_fml_buffers_new
 where buffer_type = 'IN'
   and field_def_value is null
   and field_name in ('APPLICATION_ID', 'CAAP_TYPE', 'DIRECTIVE', 'ENV_CODE', 
                      'LINK_TYPE_STR', 'MARKET_CODE', 'MKT_CODE', 'ONLINE_TRX_NO', 
                      'OPERATOR_ID', 'SESSION_ID', 'THRESHOLD_AMT', 'TRANSACTION_MODE')
group by field_name, field_def_value
order by field_name, field_def_value
;

-- If there were others from the previous query, what services are they? New ones?
select svc_name, count(*)
  from tux_fml_buffers_new a
 where buffer_type = 'IN'
   and field_def_value is null
   and field_name in ('APPLICATION_ID', 'CAAP_TYPE', 'DIRECTIVE', 'ENV_CODE', 
                      --'LINK_TYPE_STR', 
                      'MARKET_CODE', 'MKT_CODE', 'ONLINE_TRX_NO', 
                      'OPERATOR_ID', 'SESSION_ID', 'THRESHOLD_AMT', 'TRANSACTION_MODE')
group by svc_name
order by svc_name--, field_name, field_def_value
;
*/

--------------------------------------------------------------

/*
-- Needed for when we start using reference data method calls instead of literal values:

alter table tux_fml_buffers 
 modify ( field_def_value varchar2 (200 byte) ) -- was 50
 
alter table tux_fml_buffers_new 
 modify ( field_def_value varchar2 (200 byte) ) -- was 50
;

alter table tux_fml_buffers_old 
 modify ( field_def_value varchar2 (200 byte) ) -- was 50
;

alter table tux_fml_buffers_versions 
 modify ( field_def_value varchar2 (200 byte) ) -- was 50
;

*/

-- 508 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getApplicationId()' -- 'Ninja'
-- select * from tux_fml_buffers_new 
where field_name = 'APPLICATION_ID'
and buffer_type = 'IN'
  --and (field_def_value <> 'Ninja' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getApplicationId()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getFokusEnvironmentCode()' -- 'PRDENV' -- 'APPCLNG5'
-- select * from tux_fml_buffers_new 
where field_name = 'ENV_CODE'
and buffer_type = 'IN'
  --and (field_def_value <> 'PRDENV' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getFokusEnvironmentCode()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getDefaultMarket()' --'NTC'
-- select * from tux_fml_buffers_new 
where field_name = 'MARKET_CODE'
and buffer_type = 'IN'
  --and (field_def_value <> 'NTC' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getDefaultMarket()' or field_def_value is null);

-- 4 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getDefaultMarket()' -- 'NTC'
-- select * from tux_fml_buffers_new 
where field_name = 'MKT_CODE'
and buffer_type = 'IN'
  --and (field_def_value <> 'NTC' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getDefaultMarket()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getTuxedoOnlineTrxNo()' -- '0'
-- select * from tux_fml_buffers_new 
where field_name = 'ONLINE_TRX_NO'
and buffer_type = 'IN'
  --and (field_def_value <> '0' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getTuxedoOnlineTrxNo()' or field_def_value is null);

-- 508 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getDefaultFokusOperatorId()' -- '200900'
-- select * from tux_fml_buffers_new 
where field_name = 'OPERATOR_ID'
and buffer_type = 'IN'
  --and (field_def_value <> '200900' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getDefaultFokusOperatorId()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getTuxedoSessionId()' -- '0'
-- select * from tux_fml_buffers_new 
where field_name = 'SESSION_ID'
and buffer_type = 'IN'
  --and (field_def_value <> '0' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getTuxedoSessionId()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getTuxedoTransactionMode()' -- 'O'
-- select * from tux_fml_buffers_new 
where field_name = 'TRANSACTION_MODE'
and buffer_type = 'IN'
  --and (field_def_value <> 'O' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getTuxedoTransactionMode()' or field_def_value is null);

-- The following updates added by GLL on 05/11/2006 (after analysing which 
-- existing default values were not covered by the above).
-- 5 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getCAAPType()' -- 'B'
-- select * from tux_fml_buffers_new 
where field_name = 'CAAP_TYPE'
and buffer_type = 'IN'
  --and (field_def_value <> 'B' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getCAAPType()' or field_def_value is null);

-- 507 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getTuxedoDirective()' -- '0'
-- select * from tux_fml_buffers_new 
where field_name = 'DIRECTIVE'
and buffer_type = 'IN'
  --and (field_def_value <> '0' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getTuxedoDirective()' or field_def_value is null);

-- 18 rows:
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getThresholdAmt()' -- '999999999.99'
-- select * from tux_fml_buffers_new 
where field_name = 'THRESHOLD_AMT'
and buffer_type = 'IN'
  --and (field_def_value <> '999999999.99' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getThresholdAmt()' or field_def_value is null);

-- 1 row:
update tux_fml_buffers_new
set field_def_value = 'U'
-- select * from tux_fml_buffers_new 
where field_name = 'LINK_TYPE_STR'
and buffer_type = 'IN'
and svc_name = 'csGtCtn' -- only for this service (to get at subscriber level?) The other 3 are ban or more general.
  and (field_def_value <> 'U' or field_def_value is null);

------------------------------------------------------------

-- New for 15.2.0:

-- 1 row (as the where clause limits it to that: LOCATION_ID is in lots of inputs, 
--        and none of them are set!!)
-- GLL: 26/06/2011. If it's only in the one input buffer DO WE NEED IT AT ALL???
--                  If we do need it SHOULD IT BE IN THE OTHERS TOO???
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getLocationId()' -- 'NCLO'
-- select * from tux_fml_buffers_new 
where field_name = 'LOCATION_ID'
  and buffer_type = 'IN'
  and svc_name = 'csChkValImp' -- Only for this service. *** GLL (28/06/2011): WHY??? Do we need it at all? ***
  -- Telia: TEMO, TMD, Netcom: NCLO 
  --and (field_def_value <> 'NCLO' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getLocationId()' or field_def_value is null)
;


-- 2 rows: csGetCtnNm, csLsSimCtn 
update tux_fml_buffers_new
set field_def_value = ':NinjaConfigurationReferenceTable.getDefaultNumberLength()' -- '8'
-- select * from tux_fml_buffers_new 
where field_name = 'NUMBER_LENGTH'
  and buffer_type = 'IN'
  -- the allowable values are 8 and 12
  --and (field_def_value <> '8' or field_def_value is null)
  and (field_def_value <> ':NinjaConfigurationReferenceTable.getDefaultNumberLength()' or field_def_value is null)
;

------------------------------------------------------------

commit work;

------------------------------------------------------------

-- 13 rows (plus 1 for null). 12 are methods to get the value from sys defaults. Only 1 row is hardcoded. 
select --* 
       field_def_value, count(*)
from tux_fml_buffers_new 
--where field_def_value is not null
group by field_def_value
order by field_def_value
;
 
UNION????

-- To compare to previous versions: 
select --* 
       field_def_value, ninja_version, count(*)
from tux_fml_buffers_versions
where ninja_version > '20'
--where field_def_value is not null
group by field_def_value, ninja_version
order by field_def_value, ninja_version
;

/*
-- 4,097 rows 
select * 
from tux_fml_buffers_new 
where field_def_value is not null
order by svc_name, buffer_type, field_name
;
--*/


