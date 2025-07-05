---
Created on: 2024-05-15
tags: [linux]
deck: Zettelkasten
---

# Use `df -h` command to see file system disk usage

The command `df -h` outputs the file system disk usage.

Example usage:

```
$ df -h
Filesystem        Size  Used Avail Use% Mounted on
dev               7.5G     0  7.5G   0% /dev
run               7.5G  1.5M  7.5G   1% /run
efivarfs          154K   44K  106K  30% /sys/firmware/efi/efivars
/dev/mapper/root  477G   95G  381G  20% /
tmpfs             7.5G  688K  7.5G   1% /dev/shm
/dev/mapper/root  477G   95G  381G  20% /.snapshots
/dev/mapper/root  477G   95G  381G  20% /home
/dev/mapper/root  477G   95G  381G  20% /var/cache/pacman/pkg
/dev/mapper/root  477G   95G  381G  20% /var/log
/dev/nvme0n1p1    511M  142M  370M  28% /boot
tmpfs             7.5G   92K  7.5G   1% /tmp
tmpfs             1.5G  8.0M  1.5G   1% /run/user/1000
```

## Related content

- [StackExchange](https://askubuntu.com/a/5447)

## Flashcards

What does the _command_ `df -h` DO? :: Output file system disk usage.^1716375249432
