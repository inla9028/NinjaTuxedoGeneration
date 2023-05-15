#!/usr/bin/env bash
JOLT_DIR="/opt/tuxedo10.3/udataobj/jolt";
JAVA_DIR="/opt/java6";

#java -classpath .:/usr/lib/classes.zip:/usr/local/tuxedo/udataobj/jolt/jolt.jar:/usr/local/tuxedo/udataobj/jolt/joltadmin.jar bea.jolt.admin.jbld -p NINJA //tuxtst:22380 $1

${JAVA_DIR}/bin/java -classpath .:${JOLT_DIR}/jolt.jar:${JOLT_DIR}/joltadmin.jar bea.jolt.admin.jbld -p NINJA $1 $2

