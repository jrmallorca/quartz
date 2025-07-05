---
Created on: 2023-06-29
tags: [linux]
deck: Zettelkasten
---

# How to access Arch Linux drive to fix it

1. Get a live USB of an Arch distro.
2. Access Arch in the Live USB.
3. Follow [[how-to-connect-to-wifi-through-command-line-in-linux]].
3. Set up networking by going into `iwctl`
4. Install reflector while refreshing the servers by `pacman -Syy reflector`
5. Get mirrorlist of United Kingdom of age 6 hours, sort by speed, and save it by `reflector -c "United Kingdom" -a 6 --sort rate --save /etc/pacman.d/mirrorlist`
6. Refresh servers again by `pacman -Syy`
7. Run `fdisk -l | less` to find the drive where arch is installed (/dev/sdb)
8. If the drive is encrypted with LUKS, run `cryptsetup open /dev/sdb<number> <some_name>`. Use the `/dev/sdb<number>` where it says `Linux filesystem` (which is /dev/sdb3)
9. Input the prompted encryption password and it will open it in `/dev/mapper/<some_name>`.
10. Mount this through `mount /dev/mapper/<some_name> /mnt`
11. Next mount the boot, the EFI which is likely sdb2, `mount /dev/sdb<number> /mnt/boot # or /mnt/boot/efi`
12. Then chroot in `arch-chroot /mnt`

## Flashcards

What _note_ is in this Zettelkasten that will help with **accessing the Arch Linux drive** to fix it? :: The source below.^1714905558406
