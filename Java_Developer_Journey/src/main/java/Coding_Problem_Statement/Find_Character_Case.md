
# Find Character Case

## Problem Statement

Write a program that takes a character as input and prints:
- `1` if the character is an uppercase alphabet (A - Z).
- `0` if the character is a lowercase alphabet (a - z).
- `-1` if the character is not an alphabet.

## Input/Output Format

- **Input**: A single character.
- **Output**: An integer value (1, 0, or -1) based on the type of the input character.

## Example

### Sample Input 1:
```
v
```
### Sample Output 1:
```
0
```
**Explanation**: The input character is lowercase, so our answer is `0`.

### Sample Input 2:
```
V
```
### Sample Output 2:
```
1
```
**Explanation**: The input character is uppercase, so our answer is `1`.

### Sample Input 3:
```
#
```
### Sample Output 3:
```
-1
```
**Explanation**: The input character is not an alphabet, so our answer is `-1`.

## Detailed Explanation

To determine the case of the input character, you can utilize the ASCII values of the characters:
- Uppercase letters (A-Z) have ASCII values ranging from 65 to 90.
- Lowercase letters (a-z) have ASCII values ranging from 97 to 122.
- Any character outside these ranges can be considered as not an alphabet.

### Constraints
- The input can be any single character.

### Hint
Can you check in which range of characters `CH` lie to check its type?



