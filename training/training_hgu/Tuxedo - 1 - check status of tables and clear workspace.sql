
/*
  Now we can't compare to the production version of the tables: because we don't 
  have a production version any more - they're no longer referenced at runtime, but
  are only used for class generation. 
  The way forward was to add a "Fokus_vsn" column to the start of the tables 
  (and primary key) - ie to keep different versions of the table content. 
  a) the version id could be made a (compulsory?) parameter to step 3 of the 
  generation process - ie run it off the new tables instead.
  b) Something else that might be useful is a Java class that compares the content 
  of the tables to a particular set of generated Tuxedo buffer classes. That way
  we should always be able to match one to the other. (It would only do basic 
  checks - eg that each field has a getter, and perhaps the other way round too.)
*/

-- For ninjacstaging - *** have we updated things yet? If not do this: ***

-- *** NOTE that 19.0.1.0 was misnamed - it should have been 19.1.0.0. D'oh!!! ***
select 'fields' as content_type, ninja_version , count(*)
from tux_fml_buffers_versions v
where v.ninja_version > '30'
group by ninja_version
UNION
select 'fields a)', 'tux_fml_buffers_new', count(*)
from tux_fml_buffers_new
--UNION
--select 'fields b)', 'tux_fml_buffers', count(*)
--from tux_fml_buffers
--UNION
--select 'fields c)', 'tux_fml_buffers_old', count(*)
--from tux_fml_buffers_old
--UNION
--select '4. tux_fml_buffers_production', count(*)
--from ninjaconfig.tux_fml_buffers
UNION
select 'services', ninja_version , count(*)
from tux_services_versions v
where v.ninja_version > '30'
group by ninja_version
UNION
select 'services a)', 'tux_services_new', count(*)
from tux_services_new
--UNION
--select 'services b)', 'tux_services', count(*)
--from tux_services
--UNION
--select 'services c)', 'tux_services_old', count(*)
--from tux_services_old
--UNION
--select 'services d)', 'tux_services_production', count(*)
--from ninjaconfig.tux_services
order by 1, 2
;

------------------------------------------------------------------------------
------------------------------------------------------------------------------


-- 2. Move stuff down the line. Std to old, new (which is current production) to std!!


-- a) from the above you should be able to see whether the copy to the versions table
--    was done at the end of the last procedure (ie for the current production version).
--    It should have (must have?) been, but if not do sql script 5 here - making sure to use the correct version number.


-- b) clear out the "new" table so it can be repopulated from the *.v files (by step 3 java class):

truncate table TUX_FML_BUFFERS_new;

-- DON'T truncate this one - it isn't regenerated, in fact it's needed in the 
-- case of a full regeneration:
-- truncate table TUX_SERVICES_new;


-- c) Do the db generation (step 3 java class)

-- d) defaults (sql script 2), 

-- e) conversational set-up  (sql script 3), 

-- f) analysis + inserts/deletes into tux_services (sql script 4)

-- g) copy of generated (and now completed) working db stuff to the xxx_versions tables
--    - making sure you use the correct version number for the new version (sql script 5).
