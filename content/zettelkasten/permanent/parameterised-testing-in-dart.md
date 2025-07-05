---
Created on: 2024-01-14
tags: [dart, flutter]
deck: Zettelkasten
---

# Parameterised testing in Dart

Dart can include parameterised testing as `test()` is literally just a function to call. This means that for a test, given a variety of input should expect the same result, it can be subject to a `for-each` loop or wrapped into another function.

Consider the following example:

```
group('Getting all exercise templates', () {
void testGetAllTemplates(List<ExerciseTemplate> expected) {
  test('$expected', () {
    when(() => mock.getAll()).thenAnswer((_) => expected);

    List<ExerciseTemplate> actual =
        localDataSource.getAllExerciseTemplates();

    expect(actual, expected);
  });
}

ExerciseTemplate template = ExerciseTemplate(
  id: 1,
  name: 'Test',
  isTargetingWeight: true,
  isTargetingTime: true,
  isTargetingDistance: true,
);

testGetAllTemplates([]);
testGetAllTemplates([template]);
testGetAllTemplates(
    [template, template.copyWith(id: 2), template.copyWith(id: 3)]);
});
```

## Related content

- [StackOverflow](https://stackoverflow.com/questions/53103300/does-dart-support-parameterized-unit-tests)

## Flashcards

In _Dart programming language_, how can you **create a parameterised test**? :: Wrap the `test()` function in a `for-each` loop or another function to be called multiple times with different inputs.^1710925635221
