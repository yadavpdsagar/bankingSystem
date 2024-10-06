FROM maven:3.3.2-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/BANKINGSYSTEM-0.0.1-SNAPSHOT.jar BANKINGSYSTEM.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "BANKINGSYSTEM.jar" ]
