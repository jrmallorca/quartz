---
Created on: 2024-01-02
tags: []
deck: Zettelkasten
---

# Remove Apple cannot check it for malicious software error

If you get an error from a MacOS machine saying "Apple can't check it for malicious software", and the usual steps to alleviate it doesn't work, do the following:

`xattr -d com.apple.quarantine path/to/application`

## Related content

- [iBoySoft](https://iboysoft.com/howto/apple-cannot-check-it-for-malicious-software.html)

## Flashcards

If the usual methods to _resolve the "Apple can't check it for malicious software" error don't work_, what **command can you run in the terminal** to RESOLVE it? :: `xattr -d com.apple.quarantine path/to/application`^1704223240932
