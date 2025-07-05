---
tags: []
created_on: "2025-02-07"
deck: Zettelkasten
modified_on: 2025-02-07 11:12:44
---

# ./\<SCRIPT\> requires file to have executable permission

To run a script through `./<SCRIPT>`, the executable permission is required. This can be achieved through `chown +x`.

This is unlike [[sh-command-can-run-scripts-without-executable-permission]].

## Analogy

## Concrete example

## Related content

- [[2025-02-06]] after attempting to figure out why a script can be called by [[sam-lloyd]] through `sh` but not [[gethyn-poulton-friend]] through `./` on Docker.
- [StackOverflow](https://stackoverflow.com/questions/22087378/difference-between-and-sh-in-unix#22087693)

## Flashcards

When _executing a script through `./`_, what **permission is required**? :: Executable permission.^1739214027824
