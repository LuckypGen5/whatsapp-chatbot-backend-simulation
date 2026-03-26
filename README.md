# WhatsApp Chatbot Backend Simulation

## Overview

This project is a simple backend chatbot simulation built using Java and Spring Boot. It mimics WhatsApp message handling using a REST API.

## Features

* REST API endpoint: `/webhook`
* Accepts POST requests with JSON input
* Returns predefined replies:

  * Hi → Hello
  * Bye → Goodbye
* Logs all incoming messages
* Simple and clean architecture

## Tech Stack

* Java
* Spring Boot
* Maven

## API Usage

### Endpoint

POST `/webhook`

### Request

```json
{
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello"
}
```

## Run Locally

```bash
mvn spring-boot:run
```

Server runs at:
http://localhost:8080

## Author

Lucky Patil
