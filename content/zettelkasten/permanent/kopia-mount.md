---
Created on: 2024-05-21
tags: [linux, backups]
deck: Zettelkasten
---

# Kopia mount

After initialising [[kopia]] through either [[kopia-initialise-local-storage]] or [[kopia-initialise-backblaze-b2]], we can mount the snapshot into a drive we specify. This is an alternative to [[kopia-restore]].

We can mount the snapshot by doing the following:

```
$ sudo su

$ kopia repository connect filesystem --path /path/to/dir

# Alternatively for the Backblaze version
$ kopia repository connect b2 \
    --bucket=YOUR_BUCKET \
    --key-id=YOUR_KEY_ID \
    --key=YOUR_APPLICATION_KEY

$ kopia snapshot list
$ mkdir /tmp/kopia-restore
$ kopia mount SNAPSHOT_ID /tmp/kopia-restore &
$ ls /tmp/kopia-restore/
$ cp -a /tmp/kopia-restore/path/to/dir/or/file /path/to/dir/or/file

# don't forget to unmount before leaving your shell
fg
Ctrl-C
```

## Related content

- [cubieserver.de blog](https://blog.cubieserver.de/2022/getting-started-with-kopia-and-backblaze/)

## Flashcards
