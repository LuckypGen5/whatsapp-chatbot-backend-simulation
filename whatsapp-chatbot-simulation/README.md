# WhatsApp Chatbot Backend Simulation

This is a simple backend chatbot simulation built using Java and Spring Boot.

## Features
- REST API endpoint: `/webhook`
- Accepts POST requests with JSON input
- Simulates WhatsApp messages
- Returns predefined replies:
  - Hi -> Hello
  - Bye -> Goodbye
- Logs all incoming messages
- Runs locally on port 8080

## Tech Stack
- Java 17
- Spring Boot
- Maven

## API Endpoint

### POST /webhook

Request:
```json
{
  "message": "Hi"
}
```

Response:
```json
{
  "reply": "Hello"
}
```

## Run Locally

```bash
mvn spring-boot:run
```

Server starts at:
`http://localhost:8080`

## Sample Test Cases
- `Hi` -> `Hello`
- `Bye` -> `Goodbye`
- any other message -> `Sorry, I can only respond to simple messages right now.`
