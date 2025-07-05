---
Created on: 2023-07-29
tags: [linux]
---

# How to connect to WiFi through command line in Linux

Summary: Connect through
```
iwctl
station wlan0 connect XYQ1G2WORLD
```

1. Input into terminal `iwctl`.
2. List the WiFi adapters by inputting `device list`.
3. Scan for WiFi networks by inputting `station <WIFI_ADAPTER> scan`.
    - It is most likely "wlan0".
4. List the WiFi networks by inputting `station <WIFI_ADAPTER> get-networks`.
5. Note the network you want to connect to.
    - It is most likely "XYQ1G2WORLD"
6. Connect to the network by inputting `station <WIFI_ADAPTER> connect <WIFI_NETWORK>`.
7. Enter the passphrase of the WiFi network.
8. Exit out by inputting `exit`.

## Related content

-

## Flashcards
