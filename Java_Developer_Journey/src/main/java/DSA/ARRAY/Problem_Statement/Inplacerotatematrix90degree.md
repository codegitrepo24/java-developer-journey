# Rotate Matrix 90 Degrees Anti-Clockwise (In-Place)

## Problem Statement
You are given a square matrix of non-negative integers of size **N x N**. Your task is to rotate the matrix by 90 degrees in an anti-clockwise direction without using any extra space.

### Example
#### Input:
Matrix:  
```
[ [ 1,  2,  3 ],
  [ 4,  5,  6 ],
  [ 7,  8,  9 ] ]
```

#### Output:
Matrix after rotation:  
```
[ [ 3,  6,  9 ],
  [ 2,  5,  8 ],
  [ 1,  4,  7 ] ]
```

### Constraints:
- **1 ≤ T ≤ 50** (Number of test cases)
- **1 ≤ N ≤ 100** (Matrix dimensions)
- **1 ≤ ARR[i][j] ≤ 10^9** (Matrix values)

---

## Approach
The rotation can be achieved in-place by moving elements layer by layer. The matrix is divided into concentric square rings, and elements are rotated cyclically within these layers.

### Key Observations:
- **Row Index Transformation:** Top to bottom (using `N-1-i`).
- **Column Index Transformation:** Left to right (using `N-1-j`).

### Steps to Rotate:
1. Process layers of the matrix from outermost to innermost.
2. For each layer:
   - Swap four elements at a time to achieve a cyclic rotation.
3. This is done by iterating over the top row and swapping corresponding elements from the other sides of the square.

---

## Algorithm
1. Iterate over the layers of the matrix using the variable `i` (outermost layer is `i = 0`).
2. For each layer, iterate over the elements in the current row using `j`.
3. Swap elements cyclically:
   - **Top → Right**: `arr[i][j] → arr[j][N-1-i]`
   - **Right → Bottom**: `arr[j][N-1-i] → arr[N-1-i][N-1-j]`
   - **Bottom → Left**: `arr[N-1-i][N-1-j] → arr[N-1-j][i]`
   - **Left → Top**: `arr[N-1-j][i] → arr[i][j]`
4. Repeat for all layers and rows.

---

## Pseudocode
```
rotateMatrix(matrix, N):
    for i = 0 to N/2:
        for j = i to N-1-i:
            temp = matrix[i][j]
            matrix[i][j] = matrix[j][N-1-i]
            matrix[j][N-1-i] = matrix[N-1-i][N-1-j]
            matrix[N-1-i][N-1-j] = matrix[N-1-j][i]
            matrix[N-1-j][i] = temp
```

---

## Diagram
### Example Matrix:
Initial Matrix:
```
1  2  3
4  5  6
7  8  9
```

#### Step 1:
Rotate elements of the first layer:
- Top-left → Bottom-left  
- Top-middle → Left-middle  
- Top-right → Top-left  
And so on.

Resulting Matrix:
```
3  6  9
2  5  8
1  4  7
```



## Companies Where This Problem Is Asked
| Company                            | Logo                                                                                      |
|------------------------------------|-------------------------------------------------------------------------------------------|
| **OLX Group**                      | ![OLX Logo](https://logo.clearbit.com/olxgroup.com)                                       |
| **Oracle**                         | ![Oracle Logo](https://logo.clearbit.com/oracle.com)                                      |
| **Apple**                          | ![Apple Logo](https://logo.clearbit.com/apple.com)                                        |
| **Google**                         | ![Google Logo](https://logo.clearbit.com/google.com)                                      |
| **Facebook**                       | ![Facebook Logo](https://logo.clearbit.com/facebook.com)                                  |
| **Samsung**                        | ![Samsung Logo](https://logo.clearbit.com/samsung.com)                                    |
| **Amazon**                         | ![Amazon Logo](https://logo.clearbit.com/amazon.com)                                      |
| **Intuit**                         | ![Intuit Logo](https://logo.clearbit.com/intuit.com)                                      |
| **SAP Labs**                       | ![SAP Logo](https://logo.clearbit.com/sap.com)                                           |
| **Salesforce**                     | ![Salesforce Logo](https://logo.clearbit.com/salesforce.com)                              |
| **Urban Company**                  | ![Urban Company Logo](https://logo.clearbit.com/urbancompany.com)                         |
| **Tata Consultancy Services (TCS)**| ![TCS Logo](https://logo.clearbit.com/tcs.com)                                           |
| **Nagarro Software**               | ![Nagarro Logo](https://logo.clearbit.com/nagarro.com)                                   |
| **LTI (Larsen & Toubro Infotech)** | ![LTI Logo](https://logo.clearbit.com/lntinfotech.com)                                   |
| **Cvent**                          | ![Cvent Logo](https://logo.clearbit.com/cvent.com)                                       |
| **Jaguar Land Rover**              | ![Jaguar Land Rover Logo](https://logo.clearbit.com/jaguarlandrover.com)                 |
| **Gainsight**                      | ![Gainsight Logo](https://logo.clearbit.com/gainsight.com)                               |
| **D.E. Shaw**                      | ![D.E. Shaw Logo](https://logo.clearbit.com.deshaw.com)                                  |
| **Commvault**                      | ![Commvault Logo](https://logo.clearbit.com/commvault.com)                               |
| **Amdocs**                         | ![Amdocs Logo](https://logo.clearbit.com/amdocs.com)                                     |
