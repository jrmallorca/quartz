---
Created on: 2023-07-23
tags: [linux]
---

# Install Arch Linux manually on USB with encrypted UEFI and BIOS

1. Format and install another USB with a portable Arch Linux.
    - [Rufus](https://rufus.ie/en/) on Windows (Refer to 1st reference)
2. Follow [[how-to-use-specified-keymap-in-linux]].
3. Follow [[how-to-connect-to-wifi-through-command-line-in-linux]].
4. Install "reflector" `pacman -Syy reflector`.
5. Input `reflector -c 'United Kingdom' -a 6 --sort rate --save /etc/pacman.d/mirrorlist`.
6. Refresh servers by inputting `pacman -Syy`.
7. List the block devices by inputting `lsblk`.
8. Note the device you will be installing Linux on (IMPORTANT!).
9. Start partitioning the device by inputting `gdisk /dev/<BLOCK_DEVICE>`.
    - It is most likely "sdb".
10. Delete all partitions by inputting `o`.
11. Create BIOS boot partition by inputting `n`.
    1. Proceed with default value for partition number.
        - E.g., sdb1
    2. Proceed with default value for the first sector.
    3. As we don't need much storage for the BIOS partition, input `+10M`.
    4. Input BIOS boot partition code `ef02`.
12. Create EFI boot partition by inputting `n`.
    1. Proceed with default value for partition number.
    2. Proceed with default value for the first sector.
    3. Input storage amount `+250M`.
    4. Input EFI system partition code `ef00`.
13. Create Linux partition by inputting `n`.
    1. Proceed with default value for partition number.
    2. Proceed with default value for the first sector.
    3. Proceed with default value for the last sector.
    4. Proceed with default value for the type of partition.
14. Save the settings by inputting `w`.
15. Proceed by inputting `Y`.
16. List the block devices by inputting `lsblk`.
16. Format EFI partition to FAT32 file system by inputting `mkfs.fat -F32 /dev/<BLOCK_DEVICE_EFI_PARTITION>`.
    - This is likely "sdb2".
17. Create encrypted root
    1. Input `cryptsetup luksFormat /dev/<BLOCK_DEVICE_LINUX_PARTITION>`.
    2. Confirm overwrite by inputting `YES`.
    3. Input passphrase of encryption.
    4. Input passphrase of encryption again.
18. Unlock encrypted root
    1. Input `cryptsetup open /dev/<BLOCK_DEVICE_LINUX_PARTITION> cryptroot`.
    2. Input passphrase of encryption.
19. Format Linux partition to EXT4 by inputting `mkfs.ext4 /dev/mapper/cryptroot`.
20. Mount Linux partition by inputting `mount /dev/mapper/cryptroot /mnt`.
21. Create boot directory by inputting `mkdir /mnt/boot`.
22. Mount EFI partition by inputting `mount /dev/<BLOCK_DEVICE_EFI_PARTITION> /mnt/boot`.
23. Install base packages to Linux partition by inputting `pacstrap /mnt base linux linux-firmware vim`.
24. Generate file system table by inputting `genfstab -U /mnt >> /mnt/etc/fstab`.
25. Access the Linux partition by inputting `arch-chroot /mnt`.
26. Configure correct timezone
    1. (DOESN'T WORK IN CHROOT) Find timezone by inputting `timedatectl list-timezones | grep <CITY>`
        - It is most likely "Europe/London"
    2. Note the result.
    3. Create symbolic link by inputting `ln -sf /usr/share/zoneinfo/<TIMEZONE> /etc/localtime`.
    4. Sync hardware clock to system clock by inputting `hwclock --systohc`.
27. Edit "locale.gen" file by inputting `vim /etc/locale.gen`.
28. Uncomment the locale you want with UTF-8.
    - It is likely the line with "en_GB.UTF-8".
29. Save the file and exit the editor.
30. Generate locale by inputting `locale-gen`.
31. Edit "locale.conf" file by inputting  `vim /etc/locale.conf`.
32. Type `LANG=<LOCALE>`.
33. Save the file and exit the editor.
34. Edit "vconsole.conf" file by inputting  `vim /etc/vconsole.conf`.
35. Type `KEYMAP=<KEYMAP>`.
    - It is likely "uk" from step 2.
36. Save the file and exit the editor.
37. Edit "hostname" file by inputting  `vim /etc/hostname`.
38. Type the hostname you want.
    - This can be "archssd".
39. Save the file and exit the editor.
40. Edit "hosts" file by inputting  `vim /etc/hosts`.
41. Type the following:
    ```
    127.0.0.1        localhost
    ::1              localhost
    127.0.0.1        <HOSTNAME>.localdomain    <HOSTNAME>
    ```
42. Save the file and exit the editor.
43. Create password of root user
    1. Input `passwd`.
    2. Input passphrase.
    3. Input passphrase again.
44. Install packages for installation by inputting
```
pacman -S grub efibootmgr networkmanager network-manager-applet dialog mtools dosfstools base-devel linux-headers bluez bluez-utils cups git reflector xdg-utils xdg-user-dirs acpi
```
45. Edit "mkinitcpio.conf" file by inputting  `vim /etc/mkinitcpio.conf`.
46. Navigate to line with "HOOKS=".
47. Change the line to
```
HOOKS=(base udev block encrypt filesystems keyboard fsck)
```
48. Save the file and exit the editor.
49. Regenerate the image by inputting `mkinitcpio -p linux`.
50. Install GRUB for BIOS by inputting `grub-install --target=i386-pc --boot-directory=/boot /dev/<BLOCK_DEVICE>`.
51. Install GRUB for EFI by inputting `grub-install --target=x86_64-efi --efi-directory=/boot --boot-directory=/boot --removable --recheck`.
52. Find UUID of Linux partition.
    1. Input `blkid | tee -a uuid`.
    2. Edit "uuid" file by inputting `vim uuid`.
    3. Copy value of Linux partition UUID.
52. Edit GRUB bootloader configuration file.
    1. Input `vim /etc/default/grub`.
    2. Navigate to the line with "GRUB_CMDLINE_LINUX_DEFAULT=".
    3. Edit the line to the following
       ```
       GRUB_CMDLINE_LINUX_DEFAULT="loglevel=3 quiet cryptdevice=UUID=<UUID>:cryptroot root=/dev/mapper/cryptroot"
       ```
    4. Save the file and exit the editor.
53. Generate GRUB configuration file by inputting `grub-mkconfig -o /boot/grub/grub.cfg`.
54. Input `systemctl enable NetworkManager`.
55. Input `systemctl enable bluetooth`.
56. (CAN REMOVE AS WELL AS UNINSTALL) Input `systemctl enable org.cups.cupsd`.
57. Create non-root user by inputting `useradd -mG wheel <USERNAME>`.
58. Create password for non-root user.
    1. Input `passwd <USERNAME>`.
    2. Input passphrase.
    3. Input passphrase again.
59. Edit "sudoers" file by inputting `EDITOR=vim visudo`.
60. Uncomment line with
    ```
    %wheel ALL=(ALL:ALL) ALL
    ```
61. Save the file and exit the editor.
62. Exit the USB by inputting `exit`.
63. Unmount the USB by inputting `umount -a`.
64. Shut down the system and boot into the USB.
65. Login.
66. Switch to root user by inputting `sudo su`.
67. Clone dotfiles repository.
68. Navigate to ~/dotfiles/unix/os/linux/arch.
69. Input `make init`.

## Related content

1. [SuperUser](https://superuser.com/questions/1699345/how-to-format-an-usb-drive-having-multiple-partitions-under-windows-11)

## Flashcards
