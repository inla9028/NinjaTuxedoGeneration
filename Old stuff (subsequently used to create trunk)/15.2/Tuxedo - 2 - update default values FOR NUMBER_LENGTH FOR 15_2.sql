
-- 2 rows: csGetCtnNm, csLsSimCtn 
update tux_fml_buffers_new
set field_def_value = '8'
-- select * from tux_fml_buffers_new 
where field_name = 'NUMBER_LENGTH'
  and buffer_type = 'IN'
  -- the allowable values are 8 and 12
  and (field_def_value <> '8' or field_def_value is null)
;


-- LOCATION_ID is in lots of inputs, and none of them are set!!
update tux_fml_buffers_new
set field_def_value = 'NCLO'
-- select * from tux_fml_buffers_new 
where field_name = 'LOCATION_ID'
  and buffer_type = 'IN'
  and svc_name = 'csChkValImp'
  -- Telia: TEMO, TMD, Netcom: NCLO 
  and (field_def_value <> 'NCLO' or field_def_value is null)
;

