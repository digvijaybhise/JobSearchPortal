# JobSearchPortal
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Job Search system built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The Job model is defined in the Job class, which has the following attributes:
```
id;
title;
description;
location;
salary;companyName;
employerName;
jobType; 
appliedDate;
```

---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---
## Functions used :-

### API Endpoints :-

#### CRUD Operations
* PostMapping: /job/
```
In database we add a new user given through API.
```

* GetMapping: /job/
```
This endpoint gives us the data of all users stored in our data baase
```
* PutMapping: /{id}
```
In database we update a user by jobID given through API.
```

* DeleteMapping: /{id}
```
In database we delete a user by jobId given through API.
```

#### Custom Finders
* GetMapping("/get/jobType/{jobType}/and/salary/{salary}")
```
Find list of jobs by jobType & salary greater than
```

* GetMapping("/get/location/{location}")
```
find jobs by Location
```

* GetMapping("/get/jobType/{jobType}/and/location/{location}")
```
Find list of jobs by jobType & salary greater than
```

* GetMapping("/get/employerName/{employerName}")
```
find jobs by Employer Name
```

#### Custom Queries
* GetMapping("/salaryAbove/{salary}")
```
Gives the list of salaries above the users requirement 
```

* PutMapping("/location/{location}/id/{id}")
```
Update the location of the Job by ID
```

* PutMapping("/salary/{salary}/id/{id}")
```
update the Job salari by ID
```

* DeleteMapping("/companyName/{companyName}")
```
Delete the Job profile by Emoployer Name
```
---
## Data Base Used
* H2-DataBase
```
We have used H2 in memory database as a database to implement Operations 
```
---
## Project Summary

The Job Search Portal is a Spring Boot project written in Java that enables basic functionality for managing Job profiles. This project is built using the Spring Boot framework. The project uses H2 databse to store and manage data.
I've used H2 database to store the Job profiles. I've done basic CRUD operations, uses some custom finders, and custom queries as well. 
