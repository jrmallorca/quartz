---
Created on: 2024-05-17
tags: [linux, backups]
deck: Zettelkasten
---

# Use superuser in backups

Creating backups as a normal user can risk exposure if anyone knows how to access it. This could be through the following:

- Someone knowing both your Linux encryption password and normal user login.
- Someone managing to access your Linux laptop in an open state.

By using superuser in our backups, we provide an extra layer of protection. This provides us the following benefits:

- Storage of secrets in /root.
- Running automated backup scripts with secrets only as superuser.
- Read/write restriction of backups to anyone who doesn't know how to become the superuser.
- Backup CLI tool having access to all files in system.

## Related content

- [YouTube](https://www.youtube.com/watch?v=yM7UkLaJB7g)

## Flashcards

When _creating backups_, why should we USE **superuser**? :: It provides an extra layer of protection to our backups and anything related to it.^1716375326049
