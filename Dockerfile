FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY ojdbc8.jar /tmp/ojdbc8.jar
RUN mvn install:install-file -Dfile=/tmp/ojdbc8.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=19.14.0.0 -Dpackaging=jar
RUN mvn -DskipTests package

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target /app
CMD ["java", "-jar", "/app/gs-java-project.jar"]
