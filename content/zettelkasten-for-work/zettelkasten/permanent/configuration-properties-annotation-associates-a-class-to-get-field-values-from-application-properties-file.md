---
tags:
  - work
  - java
  - spring
created_on: "2025-03-28"
deck: Zettelkasten
modified_on: 2025-03-28 16:08:54
---

# `@ConfigurationProperties` annotation associates `@Component` or `@Bean` to get field values from `application.properties` file

The `@ConfigurationProperties` annotation associates a `@Component` or `@Bean` to get field values from `application.properties` file. This means for any fields within a [[spring-configuration-annotation]] class or [[spring-bean-annotation]] method, their values will be retrieved from the `application.properties` file.

## Analogy

## Concrete example

Configuration class:
```java
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {

    private String hostName;
    private int port;
    private String from;

    // standard getters and setters
}
```

application.properties file:

```
# Simple properties
mail.hostname=host@mail.com
mail.port=9000
mail.from=mailer@mail.com
```

## Related content

- [Baeldung](https://www.baeldung.com/configuration-properties-in-spring-boot)

## Flashcards

What is the `@ConfigurationProperties` annotation **used for**? :: An annotation to retrieve values for fields in `@Component` classes or `@Bean` methods from the `application.properties` file.^1743178198133
