# spring-boot-data-rest-application

This is a simple data rest application developed using Spring boot. 

## Build



```bash
mvn clean install
```

## Description
I made use of below annotations for customizing the default behaviour of the spring data rest. You can find more details about those here [spring-boot-data-rest](https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference)

```java
@RepositoryRestResource(path="/<path>")
```

```java
@RestResource(exported = false)
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
