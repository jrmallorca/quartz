---
tags:
  - programming
created_on: "2024-05-29"
deck: Zettelkasten
modified_on: 2025-04-02 08:54:45
---

# Consider standardisation of common functionality in the abstraction of the `Command` pattern when there are multiple commands that operate similarly

In DVLA, we created a toolbox for automating Natural code (legacy) modifications. The toolbox consisted of multiple operations, like how we create use cases in Flutter, that all roughly do the following:

1. Select the files to run for the operation.
2. Run the operation through the selected files.
3. Write the output somewhere.

In conclusion, consider standardisation of the abstraction of the [[command-pattern]] when a program will have multiple commands that operate similarly. Abstract the identified common functionality into methods within the abstraction.

For example, we can use this in our own `interface Usecase` that we incorporate into our own Flutter projects. While we already abstract the use-case, creating these methods may simplify the actual functionality of the use-case and standardise it.

## Concrete example

Sam Lloyd created an abstraction of the above operations that does the following:

- Contains a `void beforeAll()` method.
  - This method is overridden by the developer if these should be any setup pre-operation.
  - This could involve saving another set of files for editing into a variable in the operation.
    - Think of the unused DDM operation.
- Contains a `void selectFiles()` method.
  - This method is overridden by the developer to select the files for the operation.
- Contains a `void run(NaturalFileHolder holder)` method.
  - This method is overridden by the developer to create the functionality of the operation.
- Contains a `void run()` method.
  - This is the main method that is called from the consumer.
  - This method calls `beforeAll()`, `selectFiles()`, `run(NaturalFileHolder holder)`, and `afterAll()`.
- Contains a `void afterAll()` method.
  - This method is overridden by the developer for anything that should be run post-operation.
  - Typically, this method is used to write the output into either a file or into the console.

As the `run()` method is `void`, it allows every operation to be common and therefore allows a `switch expression` for every operation.

## Related content

- Experience in DVLA

## Flashcards

When using the _command pattern_ with **multiple commands that contain common functionality**, what should you CONSIDER? :: Standardisation of common functionality in the abstraction of the commands.^1719472882101
