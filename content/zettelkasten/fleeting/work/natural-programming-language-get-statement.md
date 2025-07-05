---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language GET statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `GET` statement which retrieves a single record in an [[zettelkasten/fleeting/work/structure/adabas-database]].

The following code excerpt demonstrates how to use it for viewing a record of a cruise with [[adabas-database-internal-sequence-number-isn]] '2050':

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 CRUISE-ID (N8.0)
    2 START-DATE (N8.0)
    2 START-HARBOR (A20)
    2 DESTINATION-HARBOR (A20)
end-define

get cruise 2050
    display cruise *isn

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=YpbN2PbnfWE&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=2)

## Flashcards

For the _programming language Natural_, which **statement** can RETRIEVE A SINGLE RECORD in an ADABAS database? :: GET.^1698763929765

For the _programming language Natural_, what does the **GET statement** do? :: Retrieve a single record in an ADABAS database.^1698763929802
