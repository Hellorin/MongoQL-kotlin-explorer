FROM openjdk:8-jdk-alpine

ARG PORT
ARG MONGODB_USER_PWD
ARG GITHUB_TOKEN

RUN apk add --update nodejs npm git mongodb maven
RUN npm install variety-cli -g

COPY settings.xml /usr/share/maven/ref/settings.xml
RUN sed -i -r "s/\\$\\{env\\.GITHUB_TOKEN}/$GITHUB_TOKEN/g" /usr/share/maven/ref/settings.xml
COPY pom.xml /usr/local/pom.xml
WORKDIR /usr/local/

RUN mvn clean install -s /usr/share/maven/ref/settings.xml -DmongodbUserPwd=${MONGODB_USER_PWD} -DPORT=${PORT}

FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/mongoql-kotlin-explorer-1.1.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
