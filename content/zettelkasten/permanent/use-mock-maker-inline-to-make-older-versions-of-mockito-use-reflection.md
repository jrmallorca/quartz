---
Created on: 2023-01-25
tags: coding java kotlin
deck: Zettelkasten
---

# Use mock-maker-inline to make older versions of Mockito use reflection

As [[newer-versions-of-mockito-creates-another-class-of-a-mocked-class-through-reflection]], you can use mock-maker-inline to prevent the [[final-classes-cannot-be-subclassed]] issue in [[older-versions-of-mockito-creates-a-subclass-of-a-mocked-class]].

## Flashcards

In **older** versions of _Mockito_, why are **final classes** an issue? :: Subclasses cannot be created from final classes.
^1675331018530

In **older** versions of _Mockito_, how could you change the behaviour to use reflection instead? :: Use mock-maker-inline.
^1675331194828
