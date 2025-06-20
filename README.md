LearningSecurity
A simple Spring Boot project demonstrating basic authentication with Spring Security using PostgreSQL.

Overview
This project is a learning exercise to understand how to secure Spring Boot applications with Spring Security. It shows how to:

1) Authenticate users stored in a PostgreSQL database
2) Implement a custom UserDetailsService to load users
3) Use DaoAuthenticationProvider with a no-op password encoder (for learning purposes)
4) Configure HTTP Basic authentication with stateless sessions
5)Disable CSRF protection (only for API simplicity)

Technologies Used:

#Java 17

#Spring Boot 3.x

#Spring Security

#Spring Data JPA

#PostgreSQL

#Maven

Features:

1)User login via HTTP Basic Authentication

2)Custom user details service fetching users from PostgreSQL

3)Stateless session management

4)Simple user entity with username and password

5)Roles assigned via UserPrincipal

Getting Started

Prerequisites:

#Java JDK 17+

#PostgreSQL database

#Maven

Setup:

1)Clone the repository

git clone https://github.com/Hyouka72/LearningSecurity.git
cd LearningSecurity

2)Configure PostgreSQL connection in application.properties:

properties(In spring boot properties)

spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

3)Run the application

mvn spring-boot:run

4)Test authentication with any user in your database (make sure users exist in your users table)

#Notes
Passwords are stored and checked in plain text for learning purposes only. Do NOT use this approach in production!

CSRF protection is disabled for simplicity; this should be enabled and properly configured for web applications.

#Future Improvements

Implement password hashing using BCrypt

Add role-based authorization

Switch to JWT token authentication for stateless security

Add user registration and password reset flows

