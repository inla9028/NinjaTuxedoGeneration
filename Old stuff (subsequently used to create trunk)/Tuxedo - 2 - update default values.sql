
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

-- 492 rows:
update tux_fml_buffers_new
set field_def_value = 'Ninja'
-- select * from tux_fml_buffers_new 
where field_name = 'APPLICATION_ID'
  and (field_def_value <> 'Ninja' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = 'PRDENV' -- 'APPCLNG5'
-- select * from tux_fml_buffers_new 
where field_name = 'ENV_CODE'
  and (field_def_value <> 'PRDENV' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = 'NTC'
-- select * from tux_fml_buffers_new 
where field_name = 'MARKET_CODE'
  and (field_def_value <> 'NTC' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = '0'
-- select * from tux_fml_buffers_new 
where field_name = 'ONLINE_TRX_NO'
  --and (field_def_value <> '0' or field_def_value is null)
and buffer_type = 'IN';

-- 492 rows:
update tux_fml_buffers_new
set field_def_value = '200900'
-- select * from tux_fml_buffers_new 
where field_name = 'OPERATOR_ID'
  and (field_def_value <> '200900' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = '0'
-- select * from tux_fml_buffers_new 
where field_name = 'SESSION_ID'
  and (field_def_value <> '0' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = 'O'
-- select * from tux_fml_buffers_new 
where field_name = 'TRANSACTION_MODE'
  and (field_def_value <> 'O' or field_def_value is null)
and buffer_type = 'IN';

-- The following updates added by GLL on 05/11/2006 (after analysing which 
-- existing default values were not covered by the above).
-- 5 rows:
update tux_fml_buffers_new
set field_def_value = 'B'
-- select * from tux_fml_buffers_new 
where field_name = 'CAAP_TYPE'
  and (field_def_value <> 'B' or field_def_value is null)
and buffer_type = 'IN';

-- 491 rows:
update tux_fml_buffers_new
set field_def_value = '0'
-- select * from tux_fml_buffers_new 
where field_name = 'DIRECTIVE'
  and (field_def_value <> '0' or field_def_value is null)
and buffer_type = 'IN';

-- 1 row:
update tux_fml_buffers_new
set field_def_value = 'U'
-- select * from tux_fml_buffers_new 
where field_name = 'LINK_TYPE_STR'
  and (field_def_value <> 'U' or field_def_value is null)
and buffer_type = 'IN'
and svc_name = 'csGtCtn'; -- only for this service

-- 4 rows:
update tux_fml_buffers_new
set field_def_value = 'NTC'
-- select * from tux_fml_buffers_new 
where field_name = 'MKT_CODE'
  and (field_def_value <> 'NTC' or field_def_value is null)
and buffer_type = 'IN';

-- 18 rows:
update tux_fml_buffers_new
set field_def_value = '999999999.99'
-- select * from tux_fml_buffers_new 
where field_name = 'THRESHOLD_AMT'
  and (field_def_value <> '999999999.99' or field_def_value is null)
and buffer_type = 'IN';

------------------------------------------------------------

-- New for 15.2.0:


-- 2 rows: csGetCtnNm, csLsSimCtn 
update tux_fml_buffers_new
set field_def_value = '8'
-- select * from tux_fml_buffers_new 
where field_name = 'NUMBER_LENGTH'
  and buffer_type = 'IN'
  -- the allowable values are 8 and 12
  and (field_def_value <> '8' or field_def_value is null)
;


-- 1 row (as the where clause limits it to that: LOCATION_ID is in lots of inputs, 
--        and none of them are set!!)
update tux_fml_buffers_new
set field_def_value = 'NCLO'
-- select * from tux_fml_buffers_new 
where field_name = 'LOCATION_ID'
  and buffer_type = 'IN'
  and svc_name = 'csChkValImp'
  -- Telia: TEMO, TMD, Netcom: NCLO 
  and (field_def_value <> 'NCLO' or field_def_value is null)
;

------------------------------------------------------------

commit work;


