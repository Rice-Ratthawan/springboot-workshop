# Springboot

### Install
* Java Framework for RESTful: [Spring Initializr](https://start.spring.io/)
* Dependencies: 
    - Spring Web
    - Spring Data JPA
    - H2 Database
* Extract file in folder that not has .git folder
* `gradlew`
* check compiler: `set javac = <path java folder>` 
* set java location: `set JAVA_HOME = <path java folder>`
* **ALWAYS RUN** when open project for test is project working first: `gradlew test` 
### Run in Dev. Mode
* start: `gradlew bootRun`
* open url: http://localhost:8080/ in a web browser
### Run in Production Mode
* test project: `gradlew test`
* start: `gradlew bootRun`
* open url: http://localhost:8080/ in a web browser

## Step RESTful
* Controller
    - GET
    - POST
    - Test with Postman
* Repository
    - Table
    - Insert: create repository interface
    - Controller call insert from repository
    - Test with Postman

## Pagination 
* pagination with Spring Data JPA
```
//Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    Page<User> findAll(Pageable pageable);
}

//Controller
Pageable pageable = PageRequest.of(page, itemPerPage);
Iterable<User> users = userRepository.findAll(pageable);
```
* POST data by Postman
* Test
    - open url: http://localhost:8080/users?page=1&item_per_page=5  => page1 will show 5 items(1-5)
    - if change http://localhost:8080/users?page=2&item_per_page=5  => page2 will show 5 items(6-10)
    
## Resource
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)