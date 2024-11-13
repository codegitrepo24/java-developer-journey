
# Sum of Coverage of Zeros in a Binary Matrix

## Problem Statement

You are given a binary matrix of dimensions `N * M`, containing only `0`s and `1`s. The task is to find and return the sum of coverages of all `0`s in the matrix.

### Definition of Coverage
For a particular `0`, **coverage** is the total number of `1`s around it (i.e., immediate left, right, up, and down positions).

### Constraints
- 1 ≤ T ≤ 10
- 1 ≤ N,M ≤ 10^3
- **Time Limit**: 1 second

### Input/Output Format
- **Input**:
  - The first line contains the integer `T`, the number of test cases.
  - For each test case:
    - The first line contains two integers, `N` (rows) and `M` (columns).
    - The next `N` lines contain `M` integers, representing the binary matrix.

- **Output**:
  - For each test case, output the sum of coverages of all `0`s.

### Example

**Sample Input 1**:
```
1
2 2
1 0
0 1
```

**Sample Output 1**:
```
4
```

**Explanation**:
1. For the `0` at position (0,1), the coverage is `2` (one `1` above and one `1` to the right).
2. For the `0` at position (1,0), the coverage is `2` (one `1` above and one `1` to the right).

The total coverage sum is `2 + 2 = 4`.

**Sample Input 2**:
```
1
2 3
0 0 0
0 0 0
```

**Sample Output 2**:
```
0
```

---

## Companies Asking This Question

| Company       | Logo                                                      |
|---------------|------------------------------------------------------------|
| RIVIGO        | ![RIVIGO Logo](https://logo.clearbit.com/rivigo.com)       |
| Cognizant     | ![Cognizant Logo](https://logo.clearbit.com/cognizant.com) |
| Sprinklr      | ![Sprinklr Logo](https://logo.clearbit.com/sprinklr.com)   |
| Compass Group | ![Compass Group Logo](https://logo.clearbit.com/compass-group.com) |

---

## Approach

1. **Traverse the Matrix**: Iterate through each element of the matrix.
2. **Identify Zeros**: For each `0` encountered, calculate its coverage by counting adjacent `1`s.
3. **Add Coverage**: Sum up the coverage of all `0`s to get the final result for each test case.

### Edge Cases
- **All `0`s**: If the matrix has only `0`s, the coverage is `0`.
- **All `1`s**: No `0`s to cover, so coverage is `0`.
- **Single Row or Column**: Handle boundary conditions when accessing neighbors.

---

## Algorithm

1. For each test case:
    - Initialize `totalCoverage` to `0`.
    - Traverse each element in the `N x M` matrix.
    - If the element is `0`, check its neighbors (left, right, up, down).
    - For each neighbor that is `1`, increase the coverage count.
    - Add the coverage count of the `0` to `totalCoverage`.
2. Print the `totalCoverage` for each test case.

### Complexity Analysis
- **Time Complexity**: \(O(N \times M)\) for each test case.
- **Space Complexity**: \(O(1)\), as we use a constant amount of extra space.

---

## Pseudocode

```
function getTotalCoverage(matrix, N, M):
    directions = [(−1,0), (1,0), (0,−1), (0,1)]
    totalCoverage = 0

    for i = 0 to N-1:
        for j = 0 to M-1:
            if matrix[i][j] == 0:
                coverage = 0
                for each direction (di, dj) in directions:
                    ni = i + di
                    nj = j + dj
                    if 0 <= ni < N and 0 <= nj < M and matrix[ni][nj] == 1:
                        coverage += 1
                totalCoverage += coverage
                
    return totalCoverage

main:
    T = input()
    for each test case:
        N, M = input()
        matrix = readMatrix(N, M)
        result = getTotalCoverage(matrix, N, M)
        print(result)
```

---

## Web Diagram

Here’s a diagram illustrating the coverage check for a `0` in the matrix:

```plaintext
+-----+-----+-----+
|     |  1  |     |
+-----+-----+-----+
|  1  |  0  |  1  |
+-----+-----+-----+
|     |  1  |     |
+-----+-----+-----+
```

In this example, the `0` at the center has a coverage of `4` because it has `1`s on all four sides.

