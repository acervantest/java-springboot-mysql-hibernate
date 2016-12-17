
## Java Web Service using Spring Boot, MySQL, and Hibernate
Basic CRUD Java Web Service template using Spring Boot and persisting data using Hibernate

### Build and run
#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

#### Prerequisites

- Java 7
- Maven 3

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

### Run

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the database:
    * `http://localhost:8080/admin/save/?name=[name]&lastname=[lastname]&age=[age]&profession=[profession]`: create a new person.
    
    * `http://localhost:8080/person/[id]`:  get person by id.
    
    * `http://localhost:8080/person/all`:  get a list of people.
    
   
    
