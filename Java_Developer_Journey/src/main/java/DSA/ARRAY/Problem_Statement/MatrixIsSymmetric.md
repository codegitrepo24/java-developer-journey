
# Symmetric Matrix Checker

## Problem Statement
You are given a square matrix. Return `true` if the matrix is symmetric; otherwise, return `false`.

### Definition of Symmetric Matrix
A symmetric matrix is a square matrix that is equal to its transpose. In other words, the matrix elements are symmetric along its diagonal, so for every element at position `(i, j)`, it must be equal to the element at position `(j, i)`.

### Constraints
- `1 <= T <= 10`
- `1 <= N <= 10^2`
- `-10^9 <= data <= 10^9` (where `data` denotes the element in the given matrix)
- **Time Limit**: 1 second

### Input/Output Format
#### Input
- The first line contains an integer `T`, the number of test cases.
- For each test case:
  - An integer `N`, the size of the matrix.
  - Followed by `N x N` elements of the matrix.

#### Output
- For each test case, print `Yes` if the matrix is symmetric, otherwise `No`.

### Sample Input
```
1
3
1 2 3
2 4 5
3 5 8
```

### Sample Output
```
Yes
```

### Explanation of Sample Output
The given matrix is symmetric because it is equal to its transpose:

```
Matrix:           Transpose:
1 2 3            1 2 3
2 4 5   ==       2 4 5
3 5 8            3 5 8
```

---

## Explanation of the Transpose Matrix Concept

A transpose of a matrix is obtained by swapping its rows with columns. For a matrix `A` with element `A[i][j]`, the transpose `A^T` will have the element `A[j][i]`. If `A == A^T`, then `A` is symmetric.

### Examples of Symmetric and Non-Symmetric Matrices

#### Symmetric Matrix
![Symmetric Matrix Example](https://files.codingninjas.in/image1-5218.png)

#### Non-Symmetric Matrix
![Non-Symmetric Matrix Example](https://files.codingninjas.in/image2-5219.png)

---

## Approach

1. **Check Matrix Symmetry**:
   - A matrix is symmetric if `matrix[i][j] == matrix[j][i]` for all `i` and `j`.
   - This means we only need to check elements above the diagonal, i.e., for `i < j`.

2. **Algorithm**:
   - For each test case, read the matrix and check symmetry by comparing elements at `(i, j)` and `(j, i)`.
   - If all such pairs are equal, the matrix is symmetric; otherwise, it is not.

## Algorithm

1. Loop through each test case.
2. For each test case:
   - Initialize the matrix with input values.
   - Loop through each element in the upper triangular part of the matrix (where `i < j`).
   - If `matrix[i][j] != matrix[j][i]`, the matrix is not symmetric, and return `false`.
   - If all checks pass, return `true`.
3. Print "Yes" for symmetric and "No" for non-symmetric matrices.

## Pseudocode

```plaintext
function isSymmetric(matrix, n):
    for i from 0 to n-1:
        for j from i+1 to n-1:
            if matrix[i][j] != matrix[j][i]:
                return false
    return true

main:
    read T
    for each test case:
        read n
        read matrix elements
        if isSymmetric(matrix, n):
            print "Yes"
        else:
            print "No"
```


## Companies That Ask This Question

| Company                         | Logo                                                                                                           |
|---------------------------------|----------------------------------------------------------------------------------------------------------------|
| Josh Technology Group           | ![Josh Technology Group Logo](https://logo.clearbit.com/joshtechnologygroup.com)                               |
| Symphony Talent, LLC            | ![Symphony Talent Logo](https://logo.clearbit.com/symphonytalent.com)                                          |
| Persistent Systems              | ![Persistent Systems Logo](https://logo.clearbit.com/persistent.com)                                           |
| Quest Global Private Limited    | ![Quest Global Logo](https://logo.clearbit.com/quest-global.com)                                               |

