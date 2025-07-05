---
Created on: 2023-10-30
tags: [work, programming]
deck: Zettelkasten
---

# Natural programming language variable definition

Define variables in [[zettelkasten/fleeting/work/structure/natural-programming-language]] by putting variables within a data block. The following example demonstrates defining an `employee` variable:

```
define data local   /* Define variables within the data block and clarify it's for local usage
1 employee          /* Assign 'employee' as level 1 as a group for the following data with higher levels
    2 name (A30)    /* Assign 'name' into 'employee' as a fixed length of 30 characters.
    2 age (I2)      /* Assign 'age' into 'employee' as a 2 byte integer.
    2 salary (N7.2) /* Assign 'salary' into 'employee' as a numeric value with 7 digits and 2 decimal places.
end-define          /* End data block definition
```

## Related content

- [SoftwareAG](https://documentation.softwareag.com/naturalONE/natONE912/natov/sm/defineda_lda.htm#lda_data_definition)
- [SoftwareAG](https://documentation.softwareag.com/naturalONE/natONE912/natov/pg/pg_obj_darea.htm#Local_Data_Area)
- [YouTube](https://www.youtube.com/watch?v=DB1xbn3ys_c&list=PL3HwmrSYjxiMMdwFS8MmmG8XL_HI7plpB&index=2)

## Flashcards

For the _programming language Natural_, where should **variables** be DEFINED? :: Inside a `define data end-define` block.

For the _programming language Natural_, how is a **group structure** DEFINED? :: Create a variable with a level `n` to group variables of level `n + 1`.

For the _programming language Natural_, how do you SPECIFY for **variables to be local**? :: Ensure `local` is just below the `define data`.
