# spring-boot-kafka-example
![Java](https://img.shields.io/badge/-Java-0a0a0a?style=for-the-badge&logo=Java) ![Spring](https://img.shields.io/badge/-Spring-0a0a0a?style=for-the-badge&logo=Spring) 
![Spring](https://img.shields.io/badge/-RabbitMQ-0a0a0a?style=for-the-badge&logo=rabbitmq)
<br/>

>This is a simple project made for educational purposes in order to learn how to communicate between microservices using the RabbitMQ message broker.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
Our application will have the following interaction structure.
<br/>
![architecture](https://github.com/Mark1708/spring-boot-rabbitmq-example/blob/main/assets/rabbitmq.png?raw=true)
<br/>
The project includes 2 services:
* rabbitmq-consumer
* rabbitmq-producer


To run the project, you need to run RabbitMQ. To do this, enter the command:

  `docker-compose up -d`
<br/>
Then run rabbitmq-consumer and rabbitmq-producer via IDEA
<br/>

## Technologies
* Java - version 11
* Spring Boot - version 2.6.3

## Code Examples
### Request
```
POST http://localhost:8080/api/messages
Content-Type: application/json

{
  "message": "Some message"
}
```
#### In console of Consumer application you can see:
`Listener received: Some message 🎉`

## Features
* Used RabbitMQ

## Status
Project is: _finished_

## Inspiration
The project was created for educational purposes

## Contact
Created by [Gurianov Mark](https://mark1708.github.io/) - feel free to contact me!
#### +7(962)024-50-04 | mark1708.work@gmail.com | [github](http://github.com/Mark1708)

![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=mark1708&repo=spring-boot-rabbitmq-example&theme=chartreuse-dark&show_icons=true)