---
Created on: 2023-11-30
tags: []
deck: Zettelkasten
---

# Maven BOM stores common dependencies and versions between projects

The [[maven-bill-of-materials-bom]] is typically used as a central store of common dependencies and its respective versions between its children projects. Defining and/or updating dependencies in the BOM will propagate the changes to its children projects.

## Related content

- [Baeldung](https://www.baeldung.com/spring-maven-bom)

## Flashcards

What is the _Maven BOM_ **used for**? :: A central store of common dependencies and its respective versions between children projects.^1701769366833

What will happen to the **dependencies** of a _Maven project_ if its BOM is UPDATED? :: Any updates will propagate to the project.^1701769366869
