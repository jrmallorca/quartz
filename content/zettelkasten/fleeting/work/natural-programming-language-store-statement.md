---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language STORE statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `STORE` statement which can add data into [[zettelkasten/fleeting/work/structure/adabas-database]].

The following code excerpt demonstrates how to use it for adding a new record to a table of cruises and committing the transaction:

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 CRUISE-ID (N8.0)
    2 START-DATE (N8.0)
    2 START-HARBOR (A20)
    2 DESTINATION-HARBOR (A20)
end-define

CRUISE-ID          := 5202
START-DATE         := 20190520
START-HARBOR       := 'BAHAMAS'
DESTINATION-HARBOR := 'ADABAS'

store cruise
end transaction

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=zFF7QX_tJAs&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=3)

## Flashcards

For the _programming language Natural_, which **statement** can ADD A NEW RECORD on an ADABAS database? :: STORE.^1698763946839

For the _programming language Natural_, what does the **STORE statement** do? :: Add a new record on an ADABAS database.^1698763946870
