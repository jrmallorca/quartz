---
tags: []
created_on: "2025-02-07"
deck: Zettelkasten
modified_on: 2025-02-07 10:17:55
---

# Convert JSON to YAML and YAML to JSON

To convert JSON to YAML and vice versa, download and use the `yq` command.

## Concrete examples

### JSON to YAML

`yq -p json -o yaml input.json`

### YAML to JSON

`yq -p yaml -o json input.yml`

## Related content

- [Baeldung](https://www.baeldung.com/linux/json-yaml-cli-conversion)

## Flashcards

What is the **command** to _convert JSON to YAML_? :: `yq -p json -o yaml input.json`^1739214027749

What is the **command** to _convert YAML to JSON_? :: `yq -p yaml -o json input.yaml`^1739214027761
