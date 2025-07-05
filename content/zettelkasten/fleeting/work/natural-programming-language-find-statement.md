---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language FIND statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `FIND` statement which selects a set of records in an [[zettelkasten/fleeting/work/structure/adabas-database]].

The following code excerpt demonstrates how to use it for viewing a table of cruises where it finds [[adabas-database-descriptor]] 'BAHAMAS', start date is greater than 1st January 2019, and displays the [[adabas-database-internal-sequence-number-isn]]:

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 CRUISE-ID (N8.0)
    2 START-DATE (N8.0)
    2 START-HARBOR (A20)
    2 DESTINATION-HARBOR (A20)
end-define

find cruise with start-harbor = 'BAHAMAS'AND start-date > 20190101
    display cruise *isn
end-find

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=YpbN2PbnfWE&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=2)

## Flashcards

For the _programming language Natural_, which **statement** can SELECT A SET OF RECORDS in an ADABAS database? :: FIND.^1698763933316

For the _programming language Natural_, what does the **FIND statement** do? :: Select a set of records in an ADABAS database.^1698763933351
