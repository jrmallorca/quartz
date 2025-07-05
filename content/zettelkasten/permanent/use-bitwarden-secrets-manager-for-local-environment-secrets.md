---
Created on: 2024-05-21
tags: []
deck: Zettelkasten
---

# Use Bitwarden Secrets Manager for local environment secrets

To protect local environment secrets in places such as scripts, we can use BitWarden Secrets Manager.

Along with [[use-superuser-in-backups]], the `BWS_ACCESS_TOKEN` environment variable should be set in the `/root/.bashrc` which will only allow the root user to have access to the secrets from Bitwarden Secrets Manager.

Using the automated Kopia backup scripts and `systemd` services as an example, the relevant Kopia repository passwords and Backblaze B2 keys can be stored in and retrieved from Bitwarden Secrets Manager. This allows the script to be viewed by anyone while restricting execution permission to those with the `BWS_ACCESS_TOKEN` environment variable.

## Related content

- [StackOverflow](https://stackoverflow.com/questions/13046624/how-can-i-permanently-export-a-variable-in-linux)
- [StackOverflow](https://stackoverflow.com/questions/4651437/how-do-i-set-a-variable-to-the-output-of-a-command-in-bash)
- [BitWarden Secrets Manager Documentation](https://bitwarden.com/help/secrets-manager-cli/)
- [BitWarden Secrets Documentation](https://bitwarden.com/help/secrets/)

## Flashcards

 What could **Bitwarden Secrets Manager** be USED for? :: Protecting local environment secrets.^1716375249487
