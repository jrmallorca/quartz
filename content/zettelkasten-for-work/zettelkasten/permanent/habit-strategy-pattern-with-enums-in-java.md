---
tags:
  - java
  - work
created_on: "2025-02-26"
deck: Zettelkasten
modified_on: 2025-02-26 15:28:29
---

# Habit - Strategy pattern with enums in Java

The [[strategy-pattern]] can be implemented via enums in Java. This involves treating the enum almost as a class.

## [[cue-in-terms-of-habits|Cues]]

- Consideration of a large if-else block.
- Consideration of a large switch block.

## [[response-in-terms-of-habits|Responses]]

1. Create a method to distinguish between enums.

Enum types provide a `valueOf()` method that would maps a string to an Enum, as long as the string is exactly the name of the enum. For example:

```java
assertSame(Element.LI, Element.valueOf("LI"));
```

If an enum needs to be distinguished via another way, a custom `valueOf()` method can be written. Take an enum `Element` that has a `String` field "label":

```java
@RequiredArgsConstructor
public enum Element {
    H("Hydrogen"),
    HE("Helium"),
    // ...
    NE("Neon");

    private final String label;

    private static final Map<String, Element> BY_LABEL = new HashMap<>();

    static {
        for (Element e: values()) {
            BY_LABEL.put(e.label, e);
        }
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
```

2. Write an abstract method to be implemented by each enum member.

The abstract method requires each enum member to implement it. For example:
```java
enum Day {
    MONDAY() {
      @Override
      public String getNumberOfDay(){
        return "1st day of a week";
    },
    TUESDAY() {
      @Override
      public String getNumberOfDay(){
        return "2nd day of a week";
    },

  // ...

  public abstract String getNumberOfDay();
}
```
3. Call the method to distinguish between enums and its respective abstract method.

## [[reward-in-terms-of-habits|Rewards]]

- Relief of not having to write 100 switch case statements.
- Admiration of beauty.

## Related content

- [Baeldung](https://www.baeldung.com/java-enum-values)
- [GeeksForGeeks](https://www.geeksforgeeks.org/enum-in-java/)
- Mapping validation exceptions to custom exception messages for the Post Office Ten Year Renewal (PO TYR) project in DVLA.
- [[strategy-pattern]]
  - The strategy design pattern employs [[polymorphism-in-terms-of-object-oriented-programming]] in Java.

## Flashcards

With the _habit of using the strategy design pattern with enums in Java_, what is the **cue**? :: Consideration of a large if-else block or switch block.^1741007613756

With the _habit of using the strategy design pattern with enums in Java_, what is the **response**? :: Create a method to distinguish between enums, create an abstract method to be implemented by each enum member, and call the method to distinguish between enums and its respective abstract method.^1741007613769
