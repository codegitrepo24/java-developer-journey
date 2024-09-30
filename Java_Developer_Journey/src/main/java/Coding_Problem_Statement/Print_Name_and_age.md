# Print Name and Age

## Problem Statement

Create a class named `Person` with:
- A string variable `name`
- An integer variable `age`

These variables should **not** be accessible outside the class. Implement methods to initialize the variables and print their values.

### Functions

1. **`setValue`**: A method to set the values of `name` and `age`.
2. **`getValue`**: A method to print the values of `name` and `age`.

## Detailed Explanation

### Input Format

- The first input line will contain a string representing the person's `name`.
- The second input line will contain an integer representing the person's `age`.

### Output Format

- The output should print the following message:
  The name of the person is <name> and the age is <age>.


### Constraints

- The `name` should be a valid string.
- The `age` should be a valid integer.

## Examples

### Sample Input 1:
  Afzal 67


### Sample Output 1:
  The name of the person is Afzal and the age is 67.


### Sample Input 2:
Ali 30


### Sample Output 2:
The name of the person is Ali and the age is 30.


### Explanation

In **Sample Input 1**, the input name is `Afzal` and the input age is `67`. The output is formatted as:

The name of the person is Afzal and the age is 67.


In **Sample Input 2**, the input name is `Ali` and the input age is `30`. The output is:

The name of the person is Ali and the age is 30.


### Notes

- The variables `name` and `age` must be private members of the class, ensuring they are not directly accessible from outside the class.
- Use the `setValue` method to initialize these variables and the `getValue` method to retrieve and print the formatted output.
