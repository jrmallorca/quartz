---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language READ statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `READ` statement which can sequentially access [[zettelkasten/fleeting/work/structure/adabas-database]].

The following code excerpt demonstrates how to use it for viewing a table of all cruises where it starts with the [[adabas-database-descriptor]] 'BAHAMAS' and ends with [[adabas-database-descriptor]] 'CADIZ':

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 CRUISE-ID (N8.0)
    2 START-DATE (N8.0)
    2 START-HARBOR (A20)
    2 DESTINATION-HARBOR (A20)
end-define

read cruise by start-harbor = 'BAHAMAS' ending at 'CADIZ'
    display cruise
end-read

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=YpbN2PbnfWE&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=2)

## Flashcards

For the _programming language Natural_, which **statement** can SEQUENTIALLY ACCESS an ADABAS database? :: READ.^1698763936552

For the _programming language Natural_, what does the **READ statement** do? :: Sequentially access an ADABAS database.^1698763936582
