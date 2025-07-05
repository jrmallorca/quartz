---
tags:
  - java
  - work
created_on: 2025-02-26
deck: Zettelkasten
modified_on: 2025-06-27 21:58:52
---

# Habit - Read JSON files from resources into Java tests

The Jackson plugin allows us to read/write JSON within Java.

## [[cue-in-terms-of-habits|Cues]]

- Writing JSON stubs for Java tests.

## [[response-in-terms-of-habits|Responses]]

1. Save the files into `/src/test/resources/`.
2. Instantiate the `ObjectMapper mapper` field.
3. `InputStream is = getClass().getClassLoader().getResourceAsStream("some-file.txt")`
4. `JsonNode value = mapper.readTree(is)`

## [[reward-in-terms-of-habits|Rewards]]

## References

- [Baeldung](https://www.baeldung.com/jackson-object-mapper-tutorial)

## Flashcards

```anki
id: 1751103895218
deck: Zettelkasten
---
With the _habit of reading JSON files from resources into Java tests_, what is the **cue**?
===
Writing JSON stubs for Java tests.
```
```anki
id: 1751103895795
deck: Zettelkasten
---
With the _habit of reading JSON files from resources into Java tests_, what is the **response**?
===
1. Save the files into `/src/test/resources/`.
2. Instantiate the `ObjectMapper mapper` field.
3. `InputStream is = getClass().getClassLoader().getResourceAsStream("some-file.txt")`
4. `JsonNode value = mapper.readTree(is)`
```


