# Sakila Web App

This is a web application called Sakila that uses the MySQL Sakila database. The project consists of SOAP and REST APIs and includes Servlets and JSPs for the client-side. The repository design pattern and JPA are also implemented.

## Introduction
Sakila Web App is a web-based application designed to showcase the usage of the Sakila database. The application is implemented using Java and J2EE technologies such as Servlets, JSP, and JPA. The Sakila database is a sample database provided by MySQL for testing purposes, and it contains various tables related to a video rental store.

The application is designed to provide users with access to the data stored in the Sakila database through both SOAP and REST APIs. The repository design pattern is implemented to separate the data access layer from the rest of the application, making it easier to maintain and extend. The JPA framework is used to map the database tables to Java objects, simplifying the data access and manipulation.

## Installation
To use the Sakila Web App, you need to have a local installation of MySQL and Tomcat. Follow the steps below to get started:

Clone the repository to your local machine using the following command:

- git clone https://github.com/your-username/sakila-web-app.git
Import the Sakila database to your local MySQL installation using the following command:

- mysql -u root -p sakila < sakila-db.sql
Update the database configuration in the persistence.xml file located in the src/main/resources/META-INF directory.

### Build the project using Maven:

mvn clean package
Deploy the sakila-web-app.war file located in the target directory to your local Tomcat installation.

### Access the application using the following URL:


http://localhost:8080/sakila-web-app/

## Usage
The Sakila Web App provides users with access to the Sakila database through both SOAP and REST APIs. The APIs are implemented using JAX-WS and JAX-RS, respectively.

The client-side of the application is implemented using Servlets and JSPs, providing users with a web-based interface to access the data stored in the database. The interface allows users to view, add, edit, and delete records from the database.


### Imporatant note: This readme file will be updated while working on the project and the final version of this readme file will be 100% accurate after finshing the project and this note will be deleted.
