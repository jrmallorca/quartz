---
Created on: 2023-10-31
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language DELETE statement

[[zettelkasten/fleeting/work/structure/natural-programming-language]] has a `DELETE` statement which deletes a record in an [[zettelkasten/fleeting/work/structure/adabas-database]].

The following code excerpt demonstrates how to use it for deleting a record in a table of cruises and committing the transaction, unless the record is not found:

```
define data local
1 cruise VIEW OF SAG-TOURS-E-CRUISE
    2 CRUISE-ID (N8.0)
    2 START-DATE (N8.0)
    2 START-HARBOR (A20)
    2 DESTINATION-HARBOR (A20)
end-define

find cruise with cruise-id = 5202
    if no records found
        write 'cruise-id' cruise-id 'not found'
    end-norec
    display cruise *isn
    update
end-find
end transaction

END
```

## Related content

- [YouTube](https://www.youtube.com/watch?v=YpbN2PbnfWE&list=PL3HwmrSYjxiMpv3snBtyGqF1-n1Fn7-5j&index=2)

## Flashcards

For the _programming language Natural_, which **statement** can DELETE A RECORD in an ADABAS database? :: DELETE.^1698763921263

For the _programming language Natural_, what does the **DELETE statement** do? :: Delete a record in an ADABAS database.^1698763921296
