#!/usr/bin/env bash

rsync -a -v --delete-after ~/Documents/habits ./content
rsync -a -v --delete-after ~/Documents/recipes ./content
rsync -a -v --delete-after ~/Documents/zettelkasten ./content
rsync -a -v --delete-after ~/Documents/zettelkasten-for-work ./content
npx quartz sync
