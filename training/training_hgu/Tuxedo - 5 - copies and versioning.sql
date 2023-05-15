/*
** Simply select the following string and search/replace it:
**  +  '37.0.0.0'
*/
-- d) Having done all of the setup in the _new (work) tables, now copy the _new to the versions
--    tables. Make sure you use the correct version number for the new version - ie modify it in
--    this script for each new version.

-- 519 rows
-- hgu: 519 rows
-- hgu: 521 rows
-- hgu: 521 rows
INSERT INTO tux_services_versions
    SELECT '37.0.0.0' AS "NINJA_VERSION", s.*
      FROM tux_services_new s
;

/*
delete
-- select *
from TUX_SERVICES_versions
where ninja_version = '37.0.0.0'
;
*/

--commit;

-- 39,660 rows
-- hgu: 39,681 rows
-- hgu: 39,796 rows
-- hgu: 39,796 rows
INSERT INTO tux_fml_buffers_versions f
    SELECT '37.0.0.0' AS "NINJA_VERSION", f.*
      -- select count(*)
      FROM tux_fml_buffers_new f
;

COMMIT;

-- Something went wrong when I generated 27.0.0.0 Drop 4, I had to run the following:
/*
UPDATE tux_services_versions a
   SET a.in_use = 'Y', a.comments = NULL
 WHERE a.ninja_version = '37.0.0.0'
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version  = '36.0.0.0'
                         AND b.in_use         = 'Y')
;

UPDATE tux_services_versions a
   SET a.conversational = 'Y'
 WHERE a.ninja_version = '37.0.0.0'
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version  = '36.0.0.0'
                         AND b.conversational = 'Y')
;

UPDATE tux_services_versions a
   SET a.fields_shared_with_csapiban = 'Y'
 WHERE a.ninja_version = '37.0.0.0'
   AND a.svc_name IN (SELECT b.svc_name
                        FROM tux_services_versions b
                       WHERE b.ninja_version               = '36.0.0.0'
                         AND b.fields_shared_with_csapiban = 'Y')
;

SELECT a.ninja_version, a.in_use, a.conversational, count(1) AS "COUNT"
  FROM tux_services_versions a
 WHERE a.ninja_version > '30'
GROUP BY a.ninja_version, a.in_use, a.conversational
ORDER BY 1,2,3
;
*/
