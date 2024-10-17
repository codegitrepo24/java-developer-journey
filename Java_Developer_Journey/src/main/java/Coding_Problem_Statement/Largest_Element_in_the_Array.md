Here’s the **Markdown (.md) file** for the problem statement:

---

## Find the Largest Element in an Array

### Problem Statement:
Given an array `arr` of size `n`, find the largest element in the array.

---

### Example:
#### Input:
```
n = 5  
arr = [1, 2, 3, 4, 5]
```
#### Output:
```
5
```
#### Explanation:
From the array `{1, 2, 3, 4, 5}`, the largest element is `5`.

---

### Sample Input/Output:
#### Sample Input 1:
```
6
4 7 8 6 7 6
```
#### Sample Output 1:
```
8
```
**Explanation:**  
From `{4, 7, 8, 6, 7, 6}`, the largest element is `8`.

#### Sample Input 2:
```
8
5 9 3 4 8 4 3 10
```
#### Sample Output 2:
```
10
```
**Explanation:**  
From `{5, 9, 3, 4, 8, 4, 3, 10}`, the largest element is `10`.

---

### Constraints:
- 1 <= 'n' <= 10^5
- 1 <= 'arr[i]' <= 10^9 

**Time Limit:** 1 second

---

### Expected Time Complexity:
- **O(n)**, where `n` is the size of the input array.

---

### Notes:
- The array may contain duplicate values, but the output should only be the **largest unique value**.
- The solution should be efficient to handle large input sizes within the given time limit.

