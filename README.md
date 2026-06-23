# Spring Boot Student Validation and Exception Handling API

## Project Description

This is a RESTful Student Management API developed using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

The project demonstrates CRUD operations along with Form Validation, Custom Exception Handling, and Global Exception Handling using Spring Boot.

---

## Features

* Add Student
* Get All Students
* Get Student By ID
* Update Student Details
* Delete Student
* Form Validation using Bean Validation
* Custom Exception Handling
* Global Exception Handling
* REST API Development
* MySQL Database Integration

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman
* Lombok

---

## Concepts Used

* REST API
* CRUD Operations
* Bean Validation
* Exception Handling
* Custom Exceptions
* Global Exception Handling
* Dependency Injection
* Repository Pattern
* JPA Repository
* Hibernate ORM

---

## Project Structure

src/main/java

├── com.example.FormValidation

│   ├── Controller

│   │   └── StudentController.java

│   ├── Entity

│   │   └── Student.java

│   ├── Repository

│   │   └── StudentRepository.java

│   ├── Service

│   │   └── StudentService.java

│   ├── Exception

│   │   ├── StudentNotFoundException.java

│   │   └── GlobalExceptionHandler.java

│   └── FormValidationApplication.java

---

## Validation Annotations Used

```java
@NotBlank
@Size
@Email
@Min
@Max
```

### Student Fields

* id
* name
* email
* course
* age

---

## API Endpoints

### Save Student

POST

```http
/student/save
```

### Get All Students

GET

```http
/student/all
```

### Get Student By ID

GET

```http
/student/{id}
```

### Update Student

PUT

```http
/student/{id}
```

### Delete Student

DELETE

```http
/student/{id}
```

---

## Validation Example

### Invalid Request

```json
{
  "name":"P",
  "email":"abc",
  "course":"",
  "age":15
}
```

### Response

```json
{
  "name":"Name must be at least 3 characters",
  "email":"Enter valid email",
  "course":"course is requried",
  "age":"minimum age is 18"
}
```

---

## Custom Exception Example

### Request

```http
GET /student/100
```

### Response

```json
{
  "message":"Student not found with id: 100"
}
```

---

## Learning Outcomes

* Spring Boot REST API Development
* Spring Data JPA
* Hibernate ORM
* Bean Validation
* Custom Exception Handling
* Global Exception Handling
* CRUD Operations
* API Testing Using Postman

---

## Future Enhancements

* Swagger Documentation
* Spring Security
* JWT Authentication
* Pagination and Sorting
* Search APIs
* Role Based Access Control

---

## Author

Pradeep Bhat

MCA Graduate | Java Full Stack Developer
