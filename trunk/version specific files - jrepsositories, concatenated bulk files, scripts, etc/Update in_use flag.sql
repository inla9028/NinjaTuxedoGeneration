
update tux_services_new
set in_use = 'Y'--, comments = 'Set in_use to Y on 07/09/10 as Ina used it in TD 4897'
-- select * from tux_services_new 
where svc_name = 'csGtDumSIM' --'csValFandFLst'
;

commit;

