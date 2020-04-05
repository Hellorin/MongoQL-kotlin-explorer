FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=target/mongoql-kotlin-explorer-1.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

