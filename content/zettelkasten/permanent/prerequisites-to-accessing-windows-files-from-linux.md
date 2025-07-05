---
Created on: 2023-01-25
tags: linux
deck: Zettelkasten
---

# Prerequisites to accessing windows files from linux

Being able to read/write Windows files from Linux is possible, provided the following are true:

- [read/write permissions are enabled when mounting the Windows drive from Linux](https://forums.linuxmint.com/viewtopic.php?t=274425),
- [Windows is truly shut down; not in sleep or hibernate](https://askubuntu.com/questions/1056964/access-windows-partition-with-read-and-write-access-from-ubuntu-18),
- [fast-startup option from Windows is turned off](https://askubuntu.com/questions/1056964/access-windows-partition-with-read-and-write-access-from-ubuntu-18),
- peculiarities from editing in Windows and Linux are addressed.
  - [Linux text editors may end lines with "n", but in Windows it may be "nr".](https://libreddit.kavin.rocks/r/linux4noobs/comments/pt93oy/is_it_bad_to_edit_the_windows_file_system_from/)

## Flashcards

To access _Windows files from Linux_, which **permissions** does Linux need? :: Read/write
^1675006565397

To access _Windows files from Linux_, should Windows be in **sleep** mode? :: No.
^1675006565408

To access _Windows files from Linux_, should Windows be in **hibernate** mode? :: No.
^1675006565416

To access _Windows files from Linux_, should Windows be **fully shut down**? :: Yes.
^1675006565426

To access _Windows files from Linux_, what state should the option **fast-startup** be in Windows? :: Off.
^1675006565434

To access _Windows files from Linux_, what detail must you remember between Windows and Linux **text editors**? :: Line endings may be different.
^1675006565443
