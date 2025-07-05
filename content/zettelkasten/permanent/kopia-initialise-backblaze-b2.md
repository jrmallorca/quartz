---
Created on: 2024-05-21
tags: [linux, backups]
deck: Zettelkasten
---

# Kopia initialise Backblaze B2

To initialise [[kopia]] in Backblaze B2, do the following:

```
$ sudo su
$ kopia repository create b2 \
    --bucket=YOUR_BUCKET \
    --key-id=YOUR_KEY_ID \
    --key=YOUR_APPLICATION_KEY
$ kopia repository validate-provider
$ kopia policy set --global --keep-annual 0 --keep-monthly 3 --keep-weekly 4 --keep-daily 7 --keep-hourly 0 --keep-latest 20 --compression=s2-default
$ kopia repository connect b2 \
    --bucket=YOUR_BUCKET \
    --key-id=YOUR_KEY_ID \
    --key=YOUR_APPLICATION_KEY
$ kopia snapshot create /home/jon
$ kopia repository disconnect
$ exit
```

This does the following:

- enters superuser
    - It is important to [[use-superuser-in-backups]]. Doing this will create the `repository.config` file in the `/root/.config/kopia/` directory.
- create a Backblaze B2 storage repository in the specified bucket,
- validate that Backblaze B2 can store the data.
- set policies regarding retention and sets compression to `s2-default`,
- connects our user to the created repository,
- creates a snapshot of a specified directory in the repository,
- disconnects our user from the repository to prevent exposure `repository.config` files,
- exits superuser.


## Related content

- [cubieserver.de blog](https://blog.cubieserver.de/2022/getting-started-with-kopia-and-backblaze/)

## Flashcards
