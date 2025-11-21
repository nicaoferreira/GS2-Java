FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN ./mvnw dependency:go-offline || true

RUN ./mvnw package -DskipTests

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]