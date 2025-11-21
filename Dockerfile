FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY src ./src
COPY ojdbc8.jar /tmp/ojdbc8.jar

RUN mvn install:install-file -Dfile=/tmp/ojdbc8.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=19.14.0.0 -Dpackaging=jar

RUN mvn -DskipTests package -Dmaven.repo.local=/root/.m2/repository