# 🎯 Personal Projects API
A personal Spring Boot RESTful API that manages personal project data. Built using Java, Spring Boot, and PostgreSQL.
---
## 🧠 Features
- Create, Read, Update, and Delete (CRUD) personal project records
- PostgreSQL database integration
- Layered Architecture (Controller → Service → Repository)
- RESTful endpoints
---
## ⚙️ Tech Stack
- Java 21
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven
---
## 🚀 Getting Started
### 1️⃣ Clone the repository
```bash
git clone https://github.com/xXElCarteroXx/spring-boot-personal-projects.git
```
### 2️⃣ Configure database credentials
## Update your credentials in src/main/resources/application.properties:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/my_projects_db
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
```
### 3️⃣ Run the app:
```bash
mvn spring-boot:run
```
### 4️⃣ Test URL endpoints
Base URL: http://localhost:8080/projects
## Example endpoints:
- GET /projects → List all projects
- POST /projects → Add a new project
- PUT /projects/{id} → Update a project
- DELETE /projects/{id} → Delete a project
