# MongoQL-kotlin-explorer
[![Build Status](https://travis-ci.com/Hellorin/MongoQL-kotlin-explorer.svg?token=PJDEGMQ6qhHd76soTotT&branch=master)](https://travis-ci.com/Hellorin/MongoQL-kotlin-explorer)

## Purpose
Show usage of the MongoQL-springboot-maven-plugin to be able to easily explore MongoQL data through a GraphQL interface

## Deployed on Heroku
If you don't want to go through all the trouble of setting things up, you can see the result deployed on the Heroku plateform using a Mongo Atlas database:

**[HERE](https://mongoql-kotlin-explorer.herokuapp.com/graphiql)**

## How to use (MongoDB Atlas)
Please refer to [MongoQL-core readme](https://github.com/Hellorin/MongoQL-core) for the initial setup of MongoDB data.

Then you should be able to call simply
```java
mvn spring-boot:run -DPORT=8080 -DmongodbUserPwd=*pwd*
```
Following the call to this command, open a browser and go to [this link](http://localhost:8080/graphiql). You have a here a console to type your graphql query. If you followed the [MongoQL-core readme](https://github.com/Hellorin/MongoQL-core) for the initial setup, type the following:
```
{
  allPerson {
    name
  }
}
```
The result should then be:
```
{
  "data": {
    "allPerson": [
      {
        "name": "David"
      },
      {
        "name": "Mathieu"
      },
      {
        "name": "Nuno"
      },
      {
        "name": "Kevin"
      },
      {
        "name": "Michael"
      }
    ]
  }
}
```

## Technologies
- Kotlin
- Spring Boot
- GraphQL Java
- Spring Boot GraphQL
