# Spiral Matrix Traversal Problem

## Problem Statement

For a given two-dimensional integer array/list of size N X M, print the matrix elements in **spiral order**. The spiral traversal proceeds in the following sequence for each iteration:

1. **First Row** (Left to Right)
2. **Last Column** (Top to Bottom)
3. **Last Row** (Right to Left)
4. **First Column** (Bottom to Top)

Each matrix element should be printed **exactly once**.

### Constraints:
- 1 ≤ t ≤ 100 (Number of test cases)
- 0 ≤ N, M ≤ 1000  (Matrix dimensions)
- **Time Limit:** 1 second.

### Example Inputs and Outputs

#### Sample Input 1:
```
1
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
```

#### Sample Output 1:
```
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
```

#### Sample Input 2:
```
2
3 3
1 2 3
4 5 6
7 8 9
3 1
10
20
30
```

#### Sample Output 2:
```
1 2 3 6 9 8 7 4 5
10 20 30
```

---

## Approach

### Key Observations
1. **Boundaries:** Maintain four boundaries (`top`, `bottom`, `left`, and `right`) to track which part of the matrix has been traversed.
2. **Sequential Traversal:** Move in a specific order:
   - Left to right across the **top row**.
   - Top to bottom along the **rightmost column**.
   - Right to left across the **bottom row** (if applicable).
   - Bottom to top along the **leftmost column** (if applicable).
3. **Boundary Adjustment:** After each traversal:
   - Increment `top` (move the top boundary down).
   - Decrement `right` (move the right boundary left).
   - Decrement `bottom` (move the bottom boundary up).
   - Increment `left` (move the left boundary right).

### Algorithm
1. Read the input matrix and initialize boundaries.
2. While top <= bottom and left <= right:
   - Traverse the **top row** from `left` to `right`.
   - Traverse the **rightmost column** from `top` to `bottom`.
   - Traverse the **bottom row** from `right` to `left` (only if `top <= bottom`).
   - Traverse the **leftmost column** from `bottom` to `top` (only if `left <= right`).
3. Print the elements in the order visited.

---

## Pseudocode

```plaintext
function spiralTraversal(matrix, rows, cols):
    Initialize: top = 0, bottom = rows - 1
                left = 0, right = cols - 1
                result = []
    
    while top <= bottom and left <= right:
        // Traverse top row
        for i = left to right:
            result.add(matrix[top][i])
        top++
        
        // Traverse right column
        for i = top to bottom:
            result.add(matrix[i][right])
        right--
        
        // Traverse bottom row (if applicable)
        if top <= bottom:
            for i = right to left:
                result.add(matrix[bottom][i])
            bottom--
        
        // Traverse left column (if applicable)
        if left <= right:
            for i = bottom to top:
                result.add(matrix[i][left])
            left++
    
    return result
```

---

## Diagram to Explain Logic

### Matrix Spiral Traversal (Example)

#### Input Matrix:
```
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
```

**Traversal Order:**

1. First row → `1 2 3 4`
2. Last column ↓ `8 12 16`
3. Last row ← `15 14 13`
4. First column ↑ `9 5`
5. Remaining spiral: `6 7 11 10`

#### Web Diagram:
![Spiral Traversal](https://files.codingninjas.in/0000000000004006.jpeg)

---

## Detailed Explanation with Web Diagram

1. **Initialize boundaries:**
   - `top = 0`, `bottom = 3`, `left = 0`, `right = 3`.

2. **Start Spiral Traversal:**
   - **Step 1 (First Row):** Traverse from `1 → 4`, then increment `top` to 1.
   - **Step 2 (Last Column):** Traverse from `8 → 16`, then decrement `right` to 2.
   - **Step 3 (Last Row):** Traverse `15 → 13` (reverse), then decrement `bottom` to 2.
   - **Step 4 (First Column):** Traverse `9 → 5` (reverse), then increment `left` to 1.

3. **Continue inner spiral:**
   - **Step 5:** Traverse `6 → 7` from the second row.
   - **Step 6:** Traverse `11 → 10` from the second column.

4. **End Condition:** All boundaries meet, and the spiral traversal is complete.

---

## Companies Using This Problem (with Logos)

| Company                           | Logo                                                                                          |
|-----------------------------------|-----------------------------------------------------------------------------------------------|
| **MakeMyTrip**                    | ![MakeMyTrip](https://logo.clearbit.com/makemytrip.com)                                       |
| **Microsoft**                     | ![Microsoft](https://logo.clearbit.com/microsoft.com)                                         |
| **Amazon**                        | ![Amazon](https://logo.clearbit.com/amazon.com)                                               |
| **UP Josh Technology Group**      | ![Josh Technology](https://logo.clearbit.com/joshtalks.com)                                   |
| **BrowserStack**                  | ![BrowserStack](https://logo.clearbit.com/browserstack.com)                                   |

---

This explanation ensures you understand the spiral traversal of a matrix and provides code, pseudocode, diagrams, and real-world applications to reinforce the concept.