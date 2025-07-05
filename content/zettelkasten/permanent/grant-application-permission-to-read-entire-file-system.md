---
Created on: 2024-05-21
tags: [linux]
deck: Zettelkasten
---

# Grant application permission to read entire file system

To give applications the capability to read the entire file system, use the following command:

`sudo setcap cap_dac_read_search=+ep <PATH_TO_APPLICATION>`

## Related content

- [Comment in YouTube](https://www.youtube.com/watch?v=Q8kplYWRysA)

## Flashcards

In _Linux_, how do you **give applications permission** to READ THE ENTIRE FILE SYSTEM? :: `sudo setcap cap_dac_read_search=+ep <PATH_TO_APPLICATION>`^1716375325842
