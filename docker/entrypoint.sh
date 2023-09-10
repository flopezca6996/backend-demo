#!/bin/sh

echo "Starting odin demand center app "
exec java $JAVA_OPTS $additionalJavaOpts -Dspring.profiles.active=test -jar /app.jar