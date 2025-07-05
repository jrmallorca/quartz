---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language HISTOGRAM statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `HISTOGRAM` statement which retrieves a count of every instance of a selected [[adabas-database-descriptor]] in an [[zettelkasten/fleeting/work/structure/adabas-database]]. This is similar to a `SELECT COUNT` statement in SQL.

The following code excerpt demonstrates how to use it for viewing the count of each respective [[adabas-database-descriptor]] 'start-harbor':

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 START-HARBOR (A20)
end-define

histogram cruise start-harbor
    display start-harbor *number
end-histogram

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=YpbN2PbnfWE&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=2)

## Flashcards

For the _programming language Natural_, which **statement** can RETRIEVE A COUNT OF INSTANCES FOR EVERY DESCRIPTOR in an ADABAS database? :: HISTOGRAM.^1698763926354

For the _programming language Natural_, what does the **HISTOGRAM statement** do? :: Retrieve a count of every instance of each selected descriptor.^1698763926388
