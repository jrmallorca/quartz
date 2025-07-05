---
Created on: 2023-07-29
tags: [linux]
deck: Zettelkasten
---

# How to use specified keymap in Linux

Summary: Input `loadkeys uk`.

1. Find the keymap you want by inputting the command in a terminal `localectl list-keymaps | grep <ISO_3166_COUNTRY_CODE>`.
    - The country code is "uk".
2. Note the name of the keymap you want to use.
3. Load the keymap by inputting `loadkeys <KEYMAP_NAME>`.

## Related content

## Flashcards
