
-- d) Having done all of the setup in the _new (work) tables, now copy the _new to the versions 
--    tables. Make sure you use the correct version number for the new version - ie modify it in 
--    this script for each new version.

-- 519 rows 
insert into TUX_SERVICES_versions
select '22.0.0.0' as ninja_version, s.* 
from TUX_SERVICES_new s
;

/*
delete 
-- select *
from TUX_SERVICES_versions
where ninja_version = '21.0.0.0'
;
*/

--commit;

-- 39,660 rows 
insert into TUX_FML_BUFFERS_versions f
select '22.0.0.0' as ninja_version, f.* 
-- select count(*) 
from TUX_FML_BUFFERS_new f
;

commit;
