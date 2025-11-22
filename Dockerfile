# Stage 1: build com Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia pom.xml e o jar do Oracle
COPY pom.xml .
COPY ojdbc8.jar /tmp/ojdbc8.jar

# Instala o ojdbc8 no repositório local do Maven
RUN mvn install:install-file -Dfile=/tmp/ojdbc8.jar \
    -DgroupId=com.oracle.database.jdbc \
    -DartifactId=ojdbc8 \
    -Dversion=19.14.0.0 \
    -Dpackaging=jar \
    -DgeneratePom=true

# Copia o código-fonte e builda
COPY src ./src
RUN mvn -DskipTests package

# Stage 2: runtime com JDK
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o JAR final do stage anterior
COPY --from=build /app/target/*.jar app.jar

# Porta que sua aplicação expõe
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java","-jar","app.jar"]