---
tags:
  - java
  - spring
created_on: 2025-06-12
deck: Zettelkasten
modified_on: 2025-06-13 20:28:08
---

# Habit - Inherit dependencies from parent POM in Spring application

## [[cue-in-terms-of-habits|Cues]]

Inheriting dependencies from parent to child in nested Maven Spring applications.

## [[response-in-terms-of-habits|Responses]]

In the current `pom.xml` add the following:

```xml
<parent>
    <groupId>...</groupId>
    <artifactId>...</artifactId>
    <version></version>
    <relativePath>../pom.xml</relativePath>
</parent>
```

## [[reward-in-terms-of-habits|Rewards]]

## Related content

- D90 project in DVLA

## Flashcards

```anki
id: 1749841583475
deck: Zettelkasten
---
With the _habit of inheriting dependencies from the parent POM in a Spring application_, what is the **response**?
===
In the current `pom.xml` add the parent block and specify its `groupId`, `artifactId`, `version`, and `relativePath`.
```

