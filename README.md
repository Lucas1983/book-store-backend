# book-store-backend

## Table of content
* [General Info](###general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Build](#build)
* [Launch](#launch)

### General Info

### Technologies
* Spring Boot
* Hibernate 
* Postgres

### Setup
To setup application 
* Change database URL, PORT and DATABASE NAME in **application.properties**
```
spring.datasource.url=jdbc:postgresql://<URL>:<PORT>/<DB_NAME>
```

### Build
To build project use included gradle wrapper 
```
$ cd ../book-store-backend
$ ./gradlew build
```
### Launch
To run project execute following commnads
```
$ cd ../book-store-backend/build/libs
$ java -jar book-store-0.0.1-SNAPSHOT.jar
```
