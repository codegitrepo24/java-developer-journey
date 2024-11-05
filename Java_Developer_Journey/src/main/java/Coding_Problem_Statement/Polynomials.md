
# Polynomial Multiplication Problem

## Problem Statement
You are given two polynomials represented by their coefficients in arrays \( A \) and \( B \). Your task is to multiply these polynomials and output the coefficients of the resulting polynomial.

### Example
- **Input**:  
  \( A = [1, 2, 3] \)  
  \( B = [3, 2, 1] \)

- **Expected Output**:  
  \( [3, 8, 14, 8, 3] \)

  **Explanation**:  
  - The polynomials represented by \( A \) and \( B \) are \( x^2 + 2x + 3 \) and \( 3x^2 + 2x + 1 \), respectively.
  - Multiplying these polynomials yields \( 3x^4 + 8x^3 + 14x^2 + 8x + 3 \), giving the output: \( [3, 8, 14, 8, 3] \).

## Input/Output Format
### Input
- The first integer is \( T \): the number of test cases.
- For each test case:
  - An integer \( n \): size of the first polynomial.
  - Array \( A \): coefficients of the first polynomial.
  - An integer \( m \): size of the second polynomial.
  - Array \( B \): coefficients of the second polynomial.

### Output
- For each test case, output a single line with the coefficients of the resulting polynomial after multiplication.

### Constraints
- 1 <= T <= 10
- 1 <= N <= 10^4
- 1 <= A[i] <= 500
- 1 <= B[i] <= 500  

- **Time Limit**: 1 second

## Sample Input
```plaintext
2
3
1 0 1
2 1 0
1
1
1
```

## Sample Output
```plaintext
2 1 2 1 0
1
```

### Explanation
1. **Test Case 1**:
   - First polynomial: \( x^2 + 1 \)
   - Second polynomial: \( 2x^2 + x \)
   - Result after multiplication: \( 2x^4 + x^3 + 2x^2 + x \)  
     Output: `[2, 1, 2, 1, 0]`

2. **Test Case 2**:
   - Both polynomials are \( 1 \)
   - Result after multiplication: \( 1 \)  
     Output: `[1]`

---

## Approach
1. **Initialize the Result Array**:  
   Create a result array of size \( n + m - 1 \), where \( n \) and \( m \) are the lengths of arrays \( A \) and \( B \).
   
2. **Multiply Polynomials**:  
   Use nested loops to multiply each term of \( A \) with each term of \( B \) and accumulate the results in the appropriate positions in the result array.

3. **Return the Result**:  
   For each test case, print the result array which contains the coefficients of the resulting polynomial.

---

## Algorithm
1. **Input Parsing**:  
   - Read the integer \( T \) for the number of test cases.
   - For each test case, read \( n \), the array \( A \), \( m \), and the array \( B \).
   
2. **Multiplication Logic**:
   - Initialize `result` array of size \( n + m - 1 \) with zeros.
   - For each coefficient in \( A \) (index \( i \)) and \( B \) (index \( j \)), calculate `result[i + j] += A[i] * B[j]`.

3. **Output the Result**:
   - Print each resulting polynomial's coefficients on a new line.

---

## Pseudocode
```plaintext
function multiplyPolynomials(T, cases):
    for each test case in cases:
        n, A = test case's first polynomial size and coefficients
        m, B = test case's second polynomial size and coefficients

        result = new array of size (n + m - 1) with all zeros

        for i from 0 to n-1:
            for j from 0 to m-1:
                result[i + j] += A[i] * B[j]

        print result
```

---

## Web Diagram
```plaintext
                +------------------------+
                |      Start Program     |
                +-----------+------------+
                            |
                            v
                +-----------+------------+
                |  Read T (number of     |
                |  test cases)           |
                +-----------+------------+
                            |
                            v
                +-----------+------------+
                | For each test case:    |
                +-----------+------------+
                            |
                            v
            +---------------+---------------+
            |   Read n, array A             |
            +---------------+---------------+
                            |
                            v
            +---------------+---------------+
            |   Read m, array B             |
            +---------------+---------------+
                            |
                            v
            +---------------+---------------+
            |   Initialize result array     |
            +---------------+---------------+
                            |
                            v
            +---------------+---------------+
            | For each element in A and B,  |
            | multiply and add to result    |
            +---------------+---------------+
                            |
                            v
            +---------------+---------------+
            |    Print result array         |
            +---------------+---------------+
                            |
                            v
                +-----------+------------+
                |        End Program      |
                +-------------------------+
```

---

## Company Where This Question Was Asked
- ![Codenation](https://logo.clearbit.com/codenation.com) Codenation
```