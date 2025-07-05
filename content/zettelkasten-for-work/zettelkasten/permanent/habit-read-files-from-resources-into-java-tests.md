---
tags:
  - java
  - work
created_on: 2025-02-26
deck: Zettelkasten
modified_on: 2025-06-27 21:59:07
---

# Habit - Read files from resources into Java tests

## [[cue-in-terms-of-habits|Cues]]

- Writing stubs for Java tests.

## [[response-in-terms-of-habits|Responses]]

1. Save the files into `/src/test/resources/`.
2. `InputStream is = getClass().getClassLoader().getResourceAsStream("some-file.txt")`
3. Read the stream through a reader

## [[reward-in-terms-of-habits|Rewards]]

## References

- [StackOverflow](https://stackoverflow.com/questions/309424/how-do-i-read-convert-an-inputstream-into-a-string-in-java)

## Flashcards

```anki
id: 1751103888956
deck: Zettelkasten
---
With the _habit of reading files from resources into Java tests_, what is the **cue**?
===
Writing stubs for Java tests.
```
```anki
id: 1751103889572
deck: Zettelkasten
---
With the _habit of reading files from resources into Java tests_, what is the **response**?
===
1. Save the files into `/src/test/resources/`.
2. `InputStream is = getClass().getClassLoader().getResourceAsStream("some-file.txt")`
3. Read the stream through a reader.
```


