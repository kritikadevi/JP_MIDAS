#!/usr/bin/env sh

# Maven wrapper script for Unix-based systems
# Use this script to run Maven commands without requiring a local installation of Maven.

MAVEN_VERSION=3.8.1
MVNW_HOME="$HOME/.m2/wrapper/dists/apache-maven-$MAVEN_VERSION-bin"
MVNW_CMD="$MVNW_HOME/maven-wrapper.jar"

if [ ! -f "$MVNW_CMD" ]; then
  echo "Maven wrapper not found. Please run './mvnw -N io.takari:maven:wrapper' to generate it."
  exit 1
fi

exec java -cp "$MVNW_CMD" org.apache.maven.wrapper.MavenWrapperMain "$@"