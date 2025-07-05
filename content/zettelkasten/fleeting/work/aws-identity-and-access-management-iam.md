---
Created on: 2023-11-06
tags: [work, cloud, aws, aws-cloud-practitioner]
deck: Zettelkasten
---

# AWS Identity and Access Management (IAM)

IAM enables the management of access to [[amazon-web-services]] services and resources securely.

When the AWS account is first created, the beginning identity is known as the "root user". It has complete access to all [[amazon-web-services]] services and resources.
[[aws-account-root-user]]

An [[aws-identity-and-access-management-iam]] user represents a person or application that interacts with [[amazon-web-services]] services and resources. It consists of a name and credentials.
[[aws-iam-user]]

An [[aws-iam-user]] initially will have no permissions associated with it, following the [[principle-of-least-privilege]]. They must be granted permission to perform specific actions in [[amazon-web-services]].
[[aws-iam-user-initially-has-no-permissions]]

An [[aws-identity-and-access-management-iam]] policy is a document that allows or denies permissions to [[amazon-web-services]] services and resources. [[example-aws-iam-policy]].
[[aws-iam-policy]]

Suppose that a coffee shop owner has to create an IAM user for a newly hired cashier. The cashier needs access to the receipts kept in an Amazon S3 bucket with the ID: AWSDOC-EXAMPLE-BUCKET. The following policy achieves that:

```
{
    "Version": "2012-10-17"
    "Statement": {
        "Effect": "Allow",
        "Action": "s3:ListObject",
        "Resource": "arn:aws:s3:::AWSDOC-EXAMPLE-BUCKET"
    }
}
```
[[example-aws-iam-policy]].

## Related content

## Flashcards
