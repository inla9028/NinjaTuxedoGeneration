#!/bin/sh
#java -classpath .:/usr/lib/classes.zip:/usr/local/tuxedo/udataobj/jolt/jolt.jar:/usr/local/tuxedo/udataobj/jolt/joltadmin.jar bea.jolt.admin.jbld -p NINJA //fokustest:22380 $1

/opt/java1.4/bin/java -classpath .:/opt/tuxedo81/udataobj/jolt/jolt.jar:/opt/tuxedo81/udataobj/jolt/joltadmin.jar bea.jolt.admin.jbld -p NINJA $1 $2

