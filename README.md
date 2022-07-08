# SupercellGameInfoAPI
 
## Technologies
Project created with:
* Java 18
* Spring Boot: 2.7.0
* OkHttp: 2.6.8
* Lombok
* PostgreSQL

## Setup
#### Running locally
```
/mvn clean package
java -jar target/ClashOfClansModule-0.0.1-SNAPSHOT.jar
```

## What you need to run?
* PostgreSQL database called - clashofclans
* Your own auth token from https://developer.clashofclans.com/#/new-key

## Endpoints
Finding player by tag
```
/findplayer/{playerTag}
```
Finding clan by tag
```
/findplayer/{clanTag}
```

## What's important
Application's working at <i><b>8081</i></b> port