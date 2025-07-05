---
tags: []
created_on: "2025-02-07"
deck: Zettelkasten
modified_on: 2025-02-07 11:12:47
---

# `sh` command can run scripts without executable permission

The `sh` command can read the commands in a file to execute it, bypassing the requirement for a file to have the executable permission.

This is unlike [[dot-slash-script-requires-file-to-have-executable-permission]].

## Analogy

## Concrete example

## Related content

- [[2025-02-06]] after attempting to figure out why a script can be called by [[sam-lloyd]] through `sh` but not [[gethyn-poulton-friend]] through `./` on Docker.
- [StackOverflow](https://stackoverflow.com/questions/22087378/difference-between-and-sh-in-unix#22087693)

## Flashcards

What **command** can _read commands in a script and execute it without needing the executable permission_? :: `sh`.^1739214186836

How can a _script be executed_ **without the executable permission**? :: `sh <SCRIPT>`.^1739214186855
