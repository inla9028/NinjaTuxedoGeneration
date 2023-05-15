
/*
  We need to sort out the procedure a bit now we can't compare to the production
  version of the tables:
  a) The way forward is almost certainly to add a "Fokus_vsn" column to the start 
  of the tables (and primary key), and make it a compulsory parameter to step 3 
  of the generation process.
  b) Something else that might be useful is a Java class that compares the content 
  of the tables to a particular set of generated Tuxedo buffer classes. That way
  we should always be able to match one to the other. (It would only do basic 
  checks - eg that each field has a getter, and perhaps the other way round too.)
*/

-- For ninjacstaging - have we updated things yet?:

select 'buffers', ninja_version , count(*)
from tux_fml_buffers_versions
group by ninja_version
UNION
select 'buffers a)', 'tux_fml_buffers_new', count(*)
from tux_fml_buffers_new
UNION
select 'buffers b)', 'tux_fml_buffers', count(*)
from tux_fml_buffers
UNION
select 'buffers c)', 'tux_fml_buffers_old', count(*)
from tux_fml_buffers_old
--UNION
--select '4. tux_fml_buffers_production', count(*)
--from ninjaconfig.tux_fml_buffers
UNION
select 'services', ninja_version , count(*)
from tux_services_versions
group by ninja_version
UNION
select 'services a)', 'tux_services_new', count(*)
from tux_services_new
UNION
select 'services b)', 'tux_services', count(*)
from tux_services
UNION
select 'services c)', 'tux_services_old', count(*)
from tux_services_old
--UNION
--select 'services d)', 'tux_services_production', count(*)
--from ninjaconfig.tux_services
order by 1, 2
;

------------------------------------------------------------------------------
------------------------------------------------------------------------------


-- 2. Move stuff down the line. Std to old, new (which is current production) to std!!
/*
-- a) Std to old
truncate table TUX_FML_BUFFERS_old;

truncate table TUX_SERVICES_old;

insert into TUX_SERVICES_old select * from TUX_SERVICES;
commit;

insert into TUX_FML_BUFFERS_old select * from TUX_FML_BUFFERS;
commit;
*/

-- b) new (current production) to std
/*
delete 
-- select *
from TUX_FML_BUFFERS_versions
where ninja_version = '15_2_0_0'
;

delete 
-- select *
from TUX_SERVICES_versions
where ninja_version = '15_2_0_0'
;

--commit;
*/

insert into TUX_SERVICES_versions
select '15_25_0_0_OLD' as ninja_version, s.* 
from TUX_SERVICES_new s
;

--commit;

insert into TUX_FML_BUFFERS_versions f
select '15_25_0_0_OLD' as ninja_version, f.* 
from TUX_FML_BUFFERS_new f
;

commit;

truncate table TUX_FML_BUFFERS_new;

-- DON'T truncate this one:
-- truncate table TUX_SERVICES_new;

/*
truncate table TUX_FML_BUFFERS;

--truncate table TUX_SERVICES;
delete from TUX_SERVICES;
commit;

insert into TUX_SERVICES select * from TUX_SERVICES_new;

commit;

insert into TUX_FML_BUFFERS select * from TUX_FML_BUFFERS_new;

commit;
*/


/*
-- b) Populate std from production (just to make sure). Run in ninjacstaging.
truncate table TUX_FML_BUFFERS;

--truncate table TUX_SERVICES;
delete from TUX_SERVICES;
commit;

insert into TUX_SERVICES select * from ninjaconfig.TUX_SERVICES;
commit;

insert into TUX_FML_BUFFERS select * from ninjaconfig.TUX_FML_BUFFERS;
commit;
*/


-- c) Truncate new as we're going to repopulate as part of the generation process
--    for the new version. Run in ninjacstaging.
truncate table TUX_FML_BUFFERS_new;

-- DON'T empty this for generation: we need it for that process:
--truncate table TUX_SERVICES;
--delete from TUX_SERVICES_new;
--commit;

------------------------------------------------------------------------------
------------------------------------------------------------------------------

-- For dev, at, etc - compare to cstaging - HERE and NEW should match:

/*select 'tux_fml_buffers CSTAGING', count(*)
from tux_fml_buffers@ninjacstaging
UNION*/
select 'tux_fml_buffers_new CSTAGING', count(*)
from tux_fml_buffers_new@ninjacstaging
UNION
/*select 'tux_fml_buffers_old CSTAGING', count(*)
from tux_fml_buffers_old@ninjacstaging
UNION*/
select 'tux_fml_buffers HERE', count(*)
from tux_fml_buffers
UNION
/*select 'tux_services CSTAGING', count(*)
from tux_services@ninjacstaging
UNION
select 'tux_services_old CSTAGING', count(*)
from tux_services_old@ninjacstaging
UNION*/
select 'tux_services_new CSTAGING', count(*)
from tux_services_new@ninjacstaging
UNION
select 'tux_services HERE', count(*)
from tux_services
;

--------------------------------------------------------------------------


-- update the buffer table in test/dev:

truncate table TUX_FML_BUFFERS;

insert into TUX_FML_BUFFERS select * from TUX_FML_BUFFERS_new@ninjacstaging;

delete
select *
from tux_services a
where not exists (select 1
                    from tux_fml_buffers b
                   where b.svc_name = a.svc_name
                     )

--------------------------------------------------------------------------


-- update the buffer table (prod deployment):

truncate table TUX_FML_BUFFERS_old;

insert into TUX_FML_BUFFERS_OLD select * from TUX_FML_BUFFERS;

truncate table TUX_FML_BUFFERS;

insert into TUX_FML_BUFFERS select * from TUX_FML_BUFFERS_new;

delete
select *
from tux_services a
where not exists (select 1
                    from tux_fml_buffers b
                   where b.svc_name = a.svc_name
                     )

