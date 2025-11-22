FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY ojdbc8.jar /tmp/ojdbc8.jar

RUN mvn install:install-file -Dfile=/tmp/ojdbc8.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=19.14.0.0 -Dpackaging=jar -DgeneratePom=true

COPY src ./src

RUN mvn -DskipTests package