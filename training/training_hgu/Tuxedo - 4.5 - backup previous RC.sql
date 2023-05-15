/*
** In case we're generating the same version again, perhaps due to an updated jrepository (25.5)
** We might want to rename the version rather than removing it, in case we made an error, etc.
*/

-- 1. Copy TUX SERVICES
INSERT INTO tux_services_versions
SELECT '34.0.0.0.drop1' AS "NINJA_VERSION", a.svc_name, a.in_use, a.conversational,
       a.fields_shared_with_csapiban, a.comments
  FROM tux_services_versions a
 WHERE a.ninja_version = '34.0.0.0'
;

-- 2. Copy TUX FML BUFFERS
INSERT INTO tux_fml_buffers_versions
SELECT '34.0.0.0.drop1' AS "NINJA_VERSION", a.svc_name, a.buffer_type, a.field_name,
       a.field_seq, a.field_type, a.field_size, a.field_max_occurence,
       a.field_def_value, a.exclude_from_csapiban_copy,
       a.csapiban_mapping1, a.csapiban_mapping2, a.csapiban_mapping3,
       a.comments
  FROM tux_fml_buffers_versions a
 WHERE a.ninja_version = '34.0.0.0'
;

-- 3. List SERVICES...
SELECT a.ninja_version, COUNT(1) AS "COUNT"
  FROM tux_services_versions a
 WHERE a.ninja_version IN ( '34.0.0.0', '34.0.0.0.drop1' )
GROUP BY a.ninja_version
ORDER BY a.ninja_version
;

-- 4. List FML BUFFERS
SELECT a.ninja_version, COUNT(1) AS "COUNT"
  FROM tux_fml_buffers_versions a
 WHERE a.ninja_version IN ( '34.0.0.0', '34.0.0.0.drop1' )
GROUP BY a.ninja_version
ORDER BY a.ninja_version
;


-- 5. Remove old version from TUX FML BUFFERS
DELETE
  FROM tux_fml_buffers_versions
 WHERE ninja_version = '34.0.0.0'
;

-- 6. Remove old version from TUX SERVICES
DELETE
  FROM tux_services_versions
 WHERE ninja_version = '34.0.0.0'
;


-- 7. List SERVICES...
SELECT a.ninja_version, COUNT(1) AS "COUNT"
  FROM tux_services_versions a
 WHERE a.ninja_version IN ( '34.0.0.0', '34.0.0.0.drop1' )
GROUP BY a.ninja_version
ORDER BY a.ninja_version
;

-- 8. List FML BUFFERS
SELECT a.ninja_version, COUNT(1) AS "COUNT"
  FROM tux_fml_buffers_versions a
 WHERE a.ninja_version IN ( '34.0.0.0', '34.0.0.0.drop1' )
GROUP BY a.ninja_version
ORDER BY a.ninja_version
;


-- 9. Commit. Be careful....
--COMMIT WORK;
