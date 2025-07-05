---
tags:
  - linux
  - backups
created_on: 2024-05-17
deck: Zettelkasten
modified_on: 2025-07-02 17:22:48
---

# Kopia restore

After initialising [[kopia]] through either [[kopia-initialise-local-storage]] or [[kopia-initialise-backblaze-b2]], we can restore data by doing the following:

```
$ su

$ kopia repository connect filesystem --path /path/to/dir

# Alternatively for the Backblaze version
$ kopia repository connect b2 \
    --bucket=YOUR_BUCKET \
    --key-id=YOUR_KEY_ID \
    --key=YOUR_APPLICATION_KEY

$ kopia snapshot list
$ kopia snapshot restore <SNAPSHOT_ID>/path/to/dir/or/file /path/to/dir/or/file
$ kopia repository disconnect
$ exit
```

This does the following:

- enters superuser
- connects our user to the created repository,
- lists the snapshots taken,
    - This is important as we require the `<SNAPSHOT_ID>` from the snapshot we want to use
- restores the directory or file from the snapshot.
- disconnects our user from the repository to prevent exposure `repository.config` files,
- exits superuser.

## Related content

- [YouTube](https://www.youtube.com/watch?v=yM7UkLaJB7g)

## Flashcards
