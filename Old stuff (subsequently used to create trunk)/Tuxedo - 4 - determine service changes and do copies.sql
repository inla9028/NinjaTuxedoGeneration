
-- Let's look at the in_use flags.
-- We haven't touched this table so they should be the same as last time 
-- - ie 502 rows:
select *
from tux_services_versions a
where ninja_version = '15_2_0_0'
--  and in_use = 'Y'
order by a.svc_name;

-- 133 services in use. (372 not in use.):
select in_use, count(*)
from tux_services_versions
where ninja_version = '15_2_0_0'
group by in_use;


-- 1. Any services changed? (Does counts, and matches fields by sequence)
select a.svc_name, 
       --'''' || a.svc_name || ''', ' as svc_name_string, 
       a.in_use, decode(a.svc_name, 'csApiBan', '*** Requires extra mapping work? ***', '') as "Comment"
from tux_services_versions a
where ninja_version = '15_2_0_0'
  --and in_use = 'Y'
  and (exists (select 1
                from tux_fml_buffers b, tux_fml_buffers_new c
               where b.svc_name = a.svc_name
                 and c.svc_name = b.svc_name
                 and c.buffer_type = b.buffer_type
                 and c.field_seq = b.field_seq
                 and (c.field_name          <> b.field_name or
                      c.field_type          <> b.field_type or
                      c.field_size          <> b.field_size or 
                      c.field_max_occurence <> b.field_max_occurence or
                      c.field_def_value     <> b.field_def_value)
                ) or
       ((select count(*) from tux_fml_buffers d     where d.svc_name = a.svc_name) <>
        (select count(*) from tux_fml_buffers_new e where e.svc_name = a.svc_name))
	   )
order by svc_name
;

-- 2. Any new services? 
--    *** If so add the rows to the tux_services_new table!! ***
insert into tux_services_new
select svc_name, null as in_use, null as conversational, 
       null as fields_shared_with_csapiban, 
       'Added as part of Fokus 15.2.5.2' as comments -- *** MODIFY THIS EACH TIME ***
-- select svc_name, count(*)
from tux_fml_buffers_new a
where not exists (select 1
                    from tux_services_versions b
                   where ninja_version = '15_2_0_0'
                     and b.svc_name = a.svc_name
                     --and b.in_use = 'Y'
                     )
group by svc_name
;

-- 3. Any services no longer in tux_fml_buffers(_new)?
-- There are 9 (due to excluding the non-online *.v files):
-- ifCrCvReq, parPhpp, csCrdEvReqOld, csGtCstCrd, csGtCust, csInCust, csLsCasWrk, csUpCasRes, csUpCust
-- None of them are in use SO WE COULD REMOVE THEM!! (BUT DOESN'T MATTER MUCH IF WE DON'T.) Their fields
-- will no longer be in the tux_fml_buffers table when we copy them from ..._new 
delete
-- select * from tux_services_versions a where ninja_version = '15_2_0_0'
-- select *
from tux_services_new a
where not exists (select 1 
                    from tux_fml_buffers_new b
                   where b.svc_name = a.svc_name)
;

/*
select *
from tux_services_versions b
where b.svc_name in ('csUpdUMAGrp', 'csGtUMAGrp', 'csLsUMAGrp')
order by ninja_version desc, svc_name
;

select *
from tux_fml_buffers_new b
where b.svc_name in ('csUpdUMAGrp', 'csGtUMAGrp', 'csLsUMAGrp')
;

select ninja_version, svc_name, buffer_type, count(*)
from tux_fml_buffers_versions b
where b.svc_name in ('csUpdUMAGrp', 'csGtUMAGrp', 'csLsUMAGrp')
group by ninja_version, svc_name, buffer_type
order by ninja_version desc, svc_name, buffer_type
;
*/

-- 4. Any new fields (on existing services)? On which datasets?
select a.svc_name, '     ' || c.in_use as in_use, buffer_type, field_name, field_seq, field_type, field_size, field_max_occurence, field_def_value, exclude_from_csapiban_copy, csapiban_mapping1, csapiban_mapping2, csapiban_mapping3, a.comments
       --a.svc_name || decode(buffer_type, 'IN', 'Input', 'OUT', 'Output', '') as buffer_name, buffer_type, count(*)
       --a.svc_name, count(*)
from tux_fml_buffers_new a, tux_services_versions c
where c.ninja_version = '15_2_0_0'
  and c.svc_name = a.svc_name
  --and c.in_use = 'Y' -- COMMENT OUT IF NECESSARY
  and not exists(
				 select 1 
				   from tux_fml_buffers_versions b
				  where b.ninja_version = c.ninja_version --'15_2_0_0'
                    and b.field_name = a.field_name
					and b.svc_name = a.svc_name
					and b.buffer_type = a.buffer_type 
					--and b.field_max_occurence = a.field_max_occurence
				)
--group by a.svc_name --|| decode(buffer_type, 'IN', 'Input', 'OUT', 'Output', ''), buffer_type
order by a.svc_name, a.buffer_type, a.field_seq
;

-- 4a. Let's see if the new fields are at the end of the buffers:
select * from tux_fml_buffers_new a
where a.svc_name = 'csSrchCtn' -- 'arGtBan', 'csSrchCtn'
  and a.buffer_type = 'OUT' -- 'IN', 'OUT'
order by a.field_seq desc;


-- 5. Any fields removed?
select * 
from tux_fml_buffers_versions a
where ninja_version = '15_2_0_0' --'15_0_8_3'
  and not exists(
				 select 1 
				   from tux_fml_buffers_new b
				   --from tux_fml_buffers_versions b
				  where 1 = 1
				    --and b.ninja_version = '15_2_0_0'
                    and b.field_name = a.field_name
					and b.svc_name = a.svc_name
					and b.buffer_type = a.buffer_type )
--  and svc_name not in ('ifCrCvReq', 'parPhpp', 'csCrdEvReqOld', 'csGtCstCrd', 
--                       'csGtCust', 'csInCust', 'csLsCasWrk', 'csUpCasRes', 'csUpCust')
;


-- 6. Have any fields had a definition change?
select old_flds.field_name, old_flds.svc_name, old_flds.buffer_type, 
       --new_flds.field_seq, old_flds.field_seq as old_field_seq, 
       new_flds.field_type, old_flds.field_type as old_field_type, 
       new_flds.field_size, old_flds.field_size as old_field_size, 
       new_flds.field_max_occurence, old_flds.field_max_occurence as old_field_max_occurence, 
       new_flds.field_def_value, old_flds.field_def_value as old_field_def_value
       --old_flds.svc_name, old_flds.buffer_type, min(old_flds.field_seq), max(old_flds.field_seq)
from tux_fml_buffers_versions old_flds, tux_fml_buffers_new new_flds, 
     tux_services_new serv -- *** GLL (24/02/2010): Should this be tux_services_versions??? ***
where old_flds.ninja_version = '15_2_0_0'
  --and serv.in_use = 'Y' -- COMMENT OUT IF NECESSARY
  and old_flds.svc_name = serv.svc_name and new_flds.svc_name = serv.svc_name
  and new_flds.svc_name = old_flds.svc_name
  and new_flds.buffer_type = old_flds.buffer_type
  and new_flds.field_name = old_flds.field_name
  and (1 = 2 or
       --b.field_seq <> old_flds.field_seq or
       new_flds.field_type <> old_flds.field_type or
       new_flds.field_size <> old_flds.field_size or
       new_flds.field_max_occurence <> old_flds.field_max_occurence or
       new_flds.field_def_value <> old_flds.field_def_value
	   )
--group by old_flds.svc_name, old_flds.buffer_type
order by /*old_flds.field_name,*/ old_flds.svc_name, old_flds.buffer_type, old_flds.field_name
;

