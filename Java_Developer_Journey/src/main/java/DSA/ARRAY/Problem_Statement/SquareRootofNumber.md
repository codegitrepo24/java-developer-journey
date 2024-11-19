# Square Root Floor Value Calculation

## Problem Statement
You are given a positive integer `n`. Your task is to find and return its square root. If `n` is not a perfect square, return the floor value of the square root.

### Example:
- **Input**: `n = 7`
- **Output**: `2`
- **Explanation**: The square root of 7 lies between 2 and 3, so the floor value is 2.

---

## Input/Output Format

### Input:
1. A single integer `n` where 0 ≤ n ≤ 10^9.

### Output:
- An integer representing the floor value of the square root of `n`.

### Examples:

#### Sample Input 1:
```
6
```

#### Sample Output 1:
```
2
```

#### Explanation:
The square root of 6 lies between 2 and 3, so the floor value is 2.

#### Sample Input 2:
```
100
```

#### Sample Output 2:
```
10
```

#### Explanation:
The square root of 100 is 10.

---

## Constraints:
- 0 ≤ n ≤ 10^9
- Expected Time Complexity: O(log(n))
- Space Complexity: O(1)

---

## Approach

We use **Binary Search** to calculate the square root in an optimized way:

### Steps:
1. Define a search range from `start = 1` to `end = n`.
2. Calculate the middle element, `mid`.
3. Check:
   - If `mid * mid == n`, return `mid` (exact square root).
   - If `mid * mid < n`, store `mid` as a potential floor value and move `start` to `mid + 1`.
   - If `mid * mid > n`, move `end` to `mid - 1`.
4. Repeat until `start > end`.
5. Return the stored floor value.

---

## Algorithm

1. **Input Validation**: Check if  (n) is `0` or `1`. For these cases, the result is the input itself.
2. **Binary Search**:
   - Initialize `start = 1`, `end = n`.
   - While `start <= end`:
     - Calculate `mid = start + (end - start) / 2`.
     - Check conditions:
       - If `mid * mid == n`, return `mid`.
       - If `mid * mid < n`, store `mid` as the floor value and move `start` to `mid + 1`.
       - If `mid * mid > n`, move `end` to `mid - 1`.
3. **Return the Floor Value**: The last stored `mid` is the floor value of the square root.

---

## Pseudocode

```
FUNCTION findSquareRoot(n):
    IF n == 0 OR n == 1:
        RETURN n

    start = 1
    end = n
    result = 0

    WHILE start <= end:
        mid = start + (end - start) / 2

        IF mid * mid == n:
            RETURN mid
        ELSE IF mid * mid < n:
            result = mid
            start = mid + 1
        ELSE:
            end = mid - 1

    RETURN result
```

---

## Logic Diagram (Web Diagram)

```
Input n
   |
Check if n == 0 or n == 1
   |
No  ---->  Yes
   |         |
Start Binary Search:
   |
start = 1, end = n
   |
Calculate mid = start + (end - start) / 2
   |
Check:
   |----> mid * mid == n --> Return mid
   |----> mid * mid < n --> Store mid as result; start = mid + 1
   |----> mid * mid > n --> end = mid - 1
   |
Repeat until start > end
   |
Return result
```

---

## Companies Where This Question Is Asked
| **Company**                     | **Logo** |
|----------------------------------|----------|
| Samsung                         | ![Samsung](https://logo.clearbit.com/samsung.com) |
| Google                          | ![Google](https://logo.clearbit.com/google.com) |
| Amazon                          | ![Amazon](https://logo.clearbit.com/amazon.com) |
| Tata Consultancy Services (TCS) | ![TCS](https://logo.clearbit.com/tcs.com) |
| Microsoft                       | ![Microsoft](https://logo.clearbit.com/microsoft.com) |
| Goldman Sachs                   | ![Goldman Sachs](https://logo.clearbit.com/gs.com) |
| EnKash                          | ![EnKash](https://logo.clearbit.com/enkash.com) |
| Josh Technology Group           | ![Josh Tech](https://logo.clearbit.com/joshtechnologygroup.com) |
| Tesco                           | ![Tesco](https://logo.clearbit.com/tesco.com) |
| NetApp India Pvt Ltd            | ![NetApp](https://logo.clearbit.com/netapp.com) |
| Mindtree                        | ![Mindtree](https://logo.clearbit.com/mindtree.com) |
| Unthinkable Solutions           | ![Unthinkable](https://logo.clearbit.com/unthinkablesolutions.com) |



This approach ensures a time complexity of O(log(n)) and efficiently handles large inputs up to 10^9.