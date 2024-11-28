# Matrix Zero Problem - Modify Rows and Columns Based on Zeros

---

## **Problem Statement**
You are given an N X M integer matrix. The task is to modify the matrix **in place** so that:
- If any cell contains the value `0`, all cells in the same **row** and **column** as that cell must also be set to `0`.

---

## **Constraints**
- 1 ≤ N, M ≤ 100
- 1 ≤ Matrix[i][j] ≤ 10^9
- Input matrix must be modified in place without using any additional matrices.

---

## **Input/Output**

### **Input**
1. Number of test cases, T .
2. For each test case:
   - Dimensions of the matrix 𝑁 × 𝑀.
   - Matrix elements in row-major order.

### **Output**
- Modified matrix for each test case after applying the rules.

---

### **Example**

#### Input
```
2
2 3
7 19 3
4 21 0
3 3
1 2 3
4 0 6
7 8 9
```

#### Output
```
7 19 0
0  0  0
1  0  3
0  0  0
7  0  9
```

#### Explanation
- **Test Case 1**: Cell `(2,3)` contains `0`. Its entire row (row 2) and column (column 3) are set to `0`.
- **Test Case 2**: Cell `(2,2)` contains `0`. The entire row 2 and column 2 are set to `0`.

---

## **Approach**

1. **Using the First Row and Column as Markers**:
   - Instead of creating extra space for flags, use the first row and column of the matrix to track rows and columns that need to be zeroed.
   
2. **Three-Step Process**:
   - **Marking Phase**: Identify rows and columns containing zero using markers in the first row/column.
   - **Update Phase**: Update the inner cells based on the markers.
   - **First Row/Column Update**: Finally, handle the first row and column separately if they originally contained zero.

---

## **Algorithm**

### Step 1: Initialization
- Use two boolean flags: `isFirstRowZero` and `isFirstColumnZero`.
- Check if the first row or column contains `0`.

### Step 2: Marking
- Traverse the matrix (excluding the first row/column).
- If any cell contains `0`, mark its row and column by setting the corresponding cell in the first row/column to `0`.

### Step 3: Update the Inner Matrix
- Traverse the matrix again (excluding the first row/column).
- If a row or column is marked, set the corresponding cell to `0`.

### Step 4: Handle the First Row/Column
- If `isFirstRowZero` is true, set the entire first row to `0`.
- If `isFirstColumnZero` is true, set the entire first column to `0`.

---

### **Pseudocode**

```
setMatrixZeroes(matrix):
    rows = matrix.length
    cols = matrix[0].length

    isFirstRowZero = false
    isFirstColumnZero = false

    // Check first row and column for zero
    for j = 0 to cols-1:
        if matrix[0][j] == 0:
            isFirstRowZero = true

    for i = 0 to rows-1:
        if matrix[i][0] == 0:
            isFirstColumnZero = true

    // Mark zeros in the first row/column
    for i = 1 to rows-1:
        for j = 1 to cols-1:
            if matrix[i][j] == 0:
                matrix[i][0] = 0
                matrix[0][j] = 0

    // Update matrix based on markers
    for i = 1 to rows-1:
        for j = 1 to cols-1:
            if matrix[i][0] == 0 or matrix[0][j] == 0:
                matrix[i][j] = 0

    // Handle the first row/column
    if isFirstRowZero:
        for j = 0 to cols-1:
            matrix[0][j] = 0

    if isFirstColumnZero:
        for i = 0 to rows-1:
            matrix[i][0] = 0
```

---

## **Diagram**

### Initial Matrix
| 7  | 19 | 3  |  
|----|----|----|  
| 4  | 21 | 0  |

### After Marking Rows and Columns
| 7  | 19 | 0  |  
| 0  | 21 | 0  |

### Final Matrix
| 7  | 19 | 0  |  
| 0  |  0 | 0  |

---

## **Complexity Analysis**
- **Time Complexity**: O(N×M)
  - One pass for marking rows and columns.
  - Another pass for updating the matrix.
- **Space Complexity**: O(1)
  - Modifies the matrix in place with no additional data structures.

---

## **Sample Code**

```java
public static void setMatrixZeroes(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean isFirstRowZero = false;
    boolean isFirstColumnZero = false;

    for (int j = 0; j < cols; j++) {
        if (matrix[0][j] == 0) isFirstRowZero = true;
    }

    for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) isFirstColumnZero = true;
    }

    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    if (isFirstRowZero) {
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = 0;
        }
    }

    if (isFirstColumnZero) {
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }
}
```

---

## **Companies Where Asked**

| **Company**          | **Logo**                     |  
|-----------------------|------------------------------|  
| Qualcomm             | ![Qualcomm](https://logo.clearbit.com/qualcomm.com) |  
| Google               | ![Google](https://logo.clearbit.com/google.com)     |  
| Amazon               | ![Amazon](https://logo.clearbit.com/amazon.com)     |  
| Dunzo                | ![Dunzo](https://logo.clearbit.com/dunzo.com)       |  
| Goldman Sachs        | ![Goldman](https://logo.clearbit.com/goldmansachs.com) |  
| Arcesium             | ![Arcesium](https://logo.clearbit.com/arcesium.com) |  
| HCL Technologies     | ![HCL](https://logo.clearbit.com/hcltech.com)       |  
| Slice                | ![Slice](https://logo.clearbit.com/slice.com)       |  
| Gartner              | ![Gartner](https://logo.clearbit.com/gartner.com)   |  
| Incedo Inc.          | ![Incedo](https://logo.clearbit.com/incedoinc.com)  |  
| Cvent                | ![Cvent](https://logo.clearbit.com/cvent.com)       |  
| ServiceNow           | ![ServiceNow](https://logo.clearbit.com/servicenow.com) |  