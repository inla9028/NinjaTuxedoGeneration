/*
** Simply select the following string and search/replace it:
**  +  '31.0.0.0'
*/
-- d) Having done all of the setup in the _new (work) tables, now copy the _new to the versions 
--    tables. Make sure you use the correct version number for the new version - ie modify it in 
--    this script for each new version.

-- 519 rows 
-- hgu: 519 rows
-- hgu: 521 rows
-- hgu: 521 rows
-- vmb: 538 rows inserted.
/* Formatted on 2017-11-21 12:23:49 (QP5 v5.160) */
INSERT INTO tux_services_versions
    SELECT '31.0.0.0' AS "NINJA_VERSION", s.*
      FROM tux_services_new s
;

/*
delete 
-- select *
from TUX_SERVICES_versions
where ninja_version = '31.0.0.0'
;
*/

--commit;

-- 39,660 rows
-- hgu: 39,681 rows
-- hgu: 39,796 rows
-- hgu: 39,796 rows
-- vmb: 41,829 rows inserted.
/* Formatted on 2017-11-21 12:24:20 (QP5 v5.160) */
INSERT INTO tux_fml_buffers_versions f
    SELECT '31.0.0.0' AS "NINJA_VERSION", f.*
      -- select count(*)
      FROM tux_fml_buffers_new f
;

COMMIT;


-- update attribute for vesrion 31.0.0.0 from version 29.0.0.0

-- in_use
UPDATE tux_services_versions curr
   SET  curr.in_use = (select in_use from tux_services_versions  prev where curr.svc_name = prev.svc_name and prev.ninja_version = '29.0.0.0' )
 WHERE curr.ninja_version = '31.0.0.0';

-- comments
UPDATE tux_services_versions curr
  SET  curr.comments = (select t.comments from tux_services_new t where curr.svc_name = t.svc_name  )
 WHERE curr.ninja_version = '31.0.0.0';

-- CONVERSATIONAL
UPDATE tux_services_versions curr
   SET  curr.CONVERSATIONAL = (select prev.CONVERSATIONAL from tux_services_versions  prev where curr.svc_name = prev.svc_name and prev.ninja_version = '29.0.0.0' )
 WHERE curr.ninja_version = '31.0.0.0';

-- FIELDS_SHARED_WITH_CSAPIBAN
UPDATE tux_services_versions curr
   SET  curr.FIELDS_SHARED_WITH_CSAPIBAN = (select prev.FIELDS_SHARED_WITH_CSAPIBAN from tux_services_versions  prev where curr.svc_name = prev.svc_name and prev.ninja_version = '29.0.0.0' )
 WHERE curr.ninja_version = '31.0.0.0';



select 
       curr.*, prev.*
from   
       tux_services_versions curr, 
       tux_services_versions prev
where  
       curr.ninja_version = '31.0.0.0'
       and
       prev.ninja_version = '29.0.0.0'       
       and 
         curr.svc_name = prev.svc_name
       ;

SELECT a.ninja_version, a.in_use, a.conversational, count(1) AS "COUNT"
  FROM tux_services_versions a
GROUP BY a.ninja_version, a.in_use, a.conversational
ORDER BY 1,2,3;

COMMIT;

-- Something went wrong when I generated 27.0.0.0 Drop 4, I had to run the following:
/*
UPDATE tux_services_versions a
   SET a.in_use = 'Y', a.comments = NULL
 WHERE a.ninja_version = '31.0.0.0' 
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version  = '29.0.0.0'
                         AND b.in_use         = 'Y')
;

UPDATE tux_services_versions a
   SET a.conversational = 'Y'
 WHERE a.ninja_version = '31.0.0.0' 
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version  = '28.5.0.0'
                         AND b.conversational = 'Y')
;

UPDATE tux_services_versions a
   SET a.fields_shared_with_csapiban = 'Y'
 WHERE a.ninja_version = '31.0.0.0' 
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version               = '28.5.0.0'
                         AND b.fields_shared_with_csapiban = 'Y')
;

SELECT a.ninja_version, a.in_use, a.conversational, count(1) AS "COUNT"
  FROM tux_services_versions a
GROUP BY a.ninja_version, a.in_use, a.conversational
ORDER BY 1,2,3
;
*/
