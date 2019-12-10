# MongoQL-springboot-maven-plugin

## Purpose
In a nutshell, the purpose of this tool is to generate at *compile-time* the nut and bolt to easily explore a MongoDB database/collection.

## How to use
Please refer to [its readme](https://github.com/Hellorin/MongoQL-core) for the initial setup of MongoDB data.

Then, you can replace in the ```mongoql-springboot-maven-plugin``` definition the following:
  - ```<packageName>yourBasePackageForClassesGeneration</packageName>```;
  - ```<databaseName>yourMongoDBDatabaseName</databaseName>```;
  - ```<collectionName>yourMongoDBCollectionName</collectionName>```.

## Technologies
- Kotlin
- Spring Boot
- GraphQL Java
- Spring Boot GraphQL
