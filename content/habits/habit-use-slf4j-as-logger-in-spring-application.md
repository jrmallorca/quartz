---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-13 10:47:30
---

# Habit - Use `@Slf4j` as logger in Spring application

## [[cue-in-terms-of-habits|Cues]]

Logs are required for a class in a Spring application.

## [[response-in-terms-of-habits|Responses]]

1. Install the [[lombok]] dependency in the `pom.xml`.

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

2. Add the following into the `application.properties` file: `logging.level.root=ERROR`
3. Annotate a class you want logging with [[lombok-slf4j-annotation]].
4. Call the various log methods, e.g. `log.info()`.

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- [Medium](https://medium.com/@AlexanderObregon/enhancing-logging-with-log-and-slf4j-in-spring-boot-applications-f7e70c6e4cc7)

## Flashcards

```anki
id: 1749841411722
deck: Zettelkasten
---
With the _habit of using `@Slf4j as a logger in a Spring application`_, what is the **cue**?
===
Logs are required for a class in a Spring application.
```

````anki
deck: Zettelkasten
---
With the _habit of using `@Slf4j as a logger in a Spring application`_, what is the **response**?
===
1. Install the [[lombok]] dependency in the `pom.xml`.

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

2. Add the following into the `application.properties` file: `logging.level.root=ERROR`
3. Annotate a class you want logging with [[lombok-slf4j-annotation]].
4. Call the various log methods, e.g. `log.info()`.
````

