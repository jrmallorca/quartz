---
tags:
  - java
  - spring
created_on: 2025-06-11
deck: Zettelkasten
modified_on: 2025-06-13 20:02:40
---

# Spring Boot

Spring Boot is an extension of the [[spring-framework]] that minimises the boilerplate configuration required to set up a Spring application.

## Concrete example

- Opinionated ‘starter’ dependencies to simplify the build and application configuration.
- Embedded server to avoid complexity in application deployment.
- Metrics, Health check, and externalized configuration.
- Automatic configuration for Spring functionality – whenever possible.

### Example with starter dependencies in the `pom.xml`

With only Spring:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>5.3.5</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.5</version>
</dependency>
```

With Spring Boot:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>2.4.4</version>
</dependency>
```

## Related content

- [Baeldung](https://www.baeldung.com/spring-vs-spring-boot)

## Flashcards

```anki
id: 1749841405648
deck: Zettelkasten
---
What is **Spring Boot**?
===
An extension of Spring that minimises the boilerplate configuration required to set up a Spring application.
```
```anki
id: 1749841405698
deck: Zettelkasten
---
What are **4 examples** of how _Spring Boot_ simplifies setting up a Java application, versus _Spring_?
===
- Opinionated ‘starter’ dependencies to simplify the build and application configuration.
- Embedded server to avoid complexity in application deployment.
- Metrics, Health check, and externalized configuration.
- Automatic configuration for Spring functionality – whenever possible.
```


