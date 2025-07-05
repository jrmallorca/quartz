---
Created on: 2024-07-23
tags: [linux]
deck: Zettelkasten
---

# Hibernation in Linux cannot happen on zram.

Swap space can be dedicated on zram, the actual physical RAM itself. While hibernation in Linux stores its state in the swap space, it cannot do so if it's in zram. It wouldn't make sense to store the state into RAM, which needs to be continuously powered to work, when hibernating powers off the machine.

Instead of zram, the swap partition or swap file must be within a block device (i.e., in storage and not RAM).

## Related content

- [GitHub - zram-hibernate](https://github.com/gissf1/zram-hibernate?tab=readme-ov-file)
- [AskUbuntu](https://askubuntu.com/a/3370)

## Flashcards

On *Linux*, why is it not possible to **hibernate when zram is used for swap**? :: zram, the actual RAM of the machine, requires continuous power to function; however, hibernation powers off the machine.^1725654616098
