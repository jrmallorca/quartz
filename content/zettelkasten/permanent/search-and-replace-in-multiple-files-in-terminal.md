---
Created on: 2024-11-21
tags: []
deck: Zettelkasten
---

# Search and replace in multiple files in terminal

To search and replace in multiple files through the terminal, use `grep` and `sed` in combination.

The command is:

`grep -l "<SEARCH>" <PATH_TO_FILES> | xargs sed "s/<SEARCH>/<REPLACE>/g"`

To account for new lines, use the following flags instead:

`grep -Ul "<SEARCH>" <PATH_TO_FILES> | xargs sed -z "s/<SEARCH>/<REPLACE>/g"`

## Related content

- [StackOverflow](https://stackoverflow.com/questions/1585170/how-to-find-and-replace-all-occurrences-of-a-string-recursively-in-a-directory-t)
- [StackOverflow](https://unix.stackexchange.com/questions/114943/can-sed-replace-new-line-characters)

## Flashcards

To _search and replace within multiple files from the terminal_, what **commands should be input**? :: `grep -l "<SEARCH>" <PATH_TO_FILES> | xargs sed "s/<SEARCH>/<REPLACE>/g"`^1732209285105

To _search and replace within multiple files from the terminal_ **with new lines**, what **commands should be input**? :: `grep -Ul "<SEARCH>" <PATH_TO_FILES> | xargs sed -z "s/<SEARCH>/<REPLACE>/g"`^1732209285115
