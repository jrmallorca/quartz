---
tags:
  - linux
  - backups
created_on: 2024-05-17
deck: Zettelkasten
modified_on: 2025-07-02 17:37:16
---

# Kopia initialise local storage

To initialise [[kopia]] in local storage drives, do the following:

```
$ su
$ kopia repository create filesystem --path /path/to/dir
$ kopia policy set --global --keep-annual 0 --keep-monthly 3 --keep-weekly 4 --keep-daily 7 --keep-hourly 0 --keep-latest 20 --compression=s2-default
$ kopia repository connect filesystem --path /path/to/dir
$ kopia snapshot create /path/to/backup
$ kopia repository disconnect
$ exit
```

This does the following:

- enters superuser
    - It is important to [[use-superuser-in-backups]]. Doing this will create the `repository.config` file in the `/root/.config/kopia/` directory.
- create a local storage repository in the specified directory,
- set policies regarding retention and sets compression to `s2-default`,
- connects our user to the created repository,
- creates a snapshot of a specified directory in the repository,
- disconnects our user from the repository to prevent exposure `repository.config` files,
- exits superuser.

## Related content

- [YouTube](https://www.youtube.com/watch?v=yM7UkLaJB7g)

## Flashcards
