# Task Manager REST API

A RESTful Task Management API built using Java and Spring Boot, with MySQL for persistent data storage.

## Features

* Create, retrieve, update, and delete tasks
* Validate task titles
* Filter tasks by status
* Pagination and sorting
* Centralized exception handling
* RESTful endpoints with appropriate HTTP responses

## Technologies Used

* Java 25
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST API

## Task Fields

* `id` — unique task identifier
* `title` — task title (required, maximum 100 characters)
* `description` — task description
* `status` — task status, such as `PENDING` or `IN_PROGRESS`
* `dueDate` — due date in `YYYY-MM-DD` format

## API Endpoints

| Method | Endpoint                     | Description                                |
| ------ | ---------------------------- | ------------------------------------------ |
| POST   | `/api/tasks`                 | Create a task                              |
| GET    | `/api/tasks`                 | Retrieve tasks with pagination and sorting |
| GET    | `/api/tasks/{id}`            | Retrieve a task by ID                      |
| GET    | `/api/tasks/status/{status}` | Filter tasks by status                     |
| PUT    | `/api/tasks/{id}`            | Update a task                              |
| DELETE | `/api/tasks/{id}`            | Delete a task                              |

## Pagination and Sorting Example

`GET /api/tasks?page=0&size=5&sortBy=title&direction=asc`

# Task Status Values

-> PENDING
-> IN_PROGRESS
-> COMPLETED

# Setup Instructions

1. Clone this repository.
2. Create a MySQL database named taskmanager.
3. Configure the database connection using environment variables:
    DB_URL
    DB_USERNAME
    DB_PASSWORD
4. Run the application using IntelliJ IDEA or Maven.

# Future Improvements

Add automated tests for API endpoints.
Add API documentation using Swagger/OpenAPI.
Implement authentication and authorization.

## Setup

1. Install Java 25, Maven (or use the Maven Wrapper), and MySQL.
2. Create a MySQL database named `taskmanager`.
3. Configure your database URL, username, and password in `src/main/resources/application.properties`.
4. Run the application from IntelliJ IDEA or using Maven:

   `mvn spring-boot:run`

The API runs at `http://localhost:8080` by default.

**Security note:** Never commit real database passwords or other secrets to GitHub.
