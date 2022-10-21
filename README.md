# WebServices with SpringBoot

[![LICENSE](https://img.shields.io/github/license/Ivi-SCD/project-springboot3-jpa)](https://github.com/Ivi-SCD/project-springboot3-jpa/blob/main/license)

## About the project: 
This is a project that i made during learning of Springboot, 
it consists in providing information of database according to 
the requests using and obeying the standard ORM/JPA, the project include 
([Structuring of logical layers](https://user-images.githubusercontent.com/81643916/197223088-0db19958-b94c-4695-ae07-001eb5a687a0.png), CRUD and Memory DataBase).
For requests i used the Postman!

**Here are the [Domain logical](https://user-images.githubusercontent.com/81643916/197236491-541753d5-6704-4c5a-a30e-608b33b40949.png)
and [Domain Instance](https://user-images.githubusercontent.com/81643916/197236610-b19bf714-be27-42c5-b9f9-2602399d83e2.png)**

## 💻 Technologies used: 
|Tool|Version|
---|---|
|JavaSE|17|
|SpringBoot|3.0.0-M5|
|SpringToolSuite (IDE)|v4.16.0|
|Maven|3.8.6|
|(Optional) Postman|Latest version|

### Maven Dependencies
|Dependency|Version|
---|---|
|H2 Database|2.1.214|
|Spring Boot Starter Data JPA|2.7.5|
|Spring Boot Starter Test|2.7.5|
|Spring Boot Starter Web|2.7.5|

## Execute the project:
You need to have Java and Maven installed and configured locally.

* Open a folder that you will put the project.
* Open your git bash and init your git.
* Execute the following command to clone repository: 
```bash
# Cloning repository
git clone https://github.com/Ivi-SCD/project-springboot3-jpa/
```

* Open the `springboot3-jpa` in your IDE as a Maven project and execute it as SpringBoot application.

To visualize database, open your browser and acess https://localhost:8080/h2console (H2 Default port).
To made the CRUD and Selects you can use the Postman or make in the h2console.
