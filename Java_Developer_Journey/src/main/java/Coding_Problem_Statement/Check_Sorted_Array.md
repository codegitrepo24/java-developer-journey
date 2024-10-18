# **Check if Array is Sorted in Non-Decreasing Order**  

## **Problem Statement**  
You have been given an array `a` of `n` non-negative integers. You need to check whether the given array is sorted in **non-decreasing order** or not.  

- Your task is to **return 1** if the array is sorted in non-decreasing order, else **return 0**.

### **Example 1**  
**Input:**  
```
n = 5  
a = [1, 2, 3, 4, 5]
```
**Output:**  
```
1
```
**Explanation:**  
The array is sorted in non-decreasing order, so the answer is 1.

---

### **Example 2**  
**Input:**  
```
4  
0 0 0 1
```
**Output:**  
```
1
```
**Explanation:**  
The array `[0, 0, 0, 1]` is sorted in non-decreasing order, so the answer is 1.

---

### **Example 3**  
**Input:**  
```
5  
4 5 4 4 4
```
**Output:**  
```
0
```
**Explanation:**  
The array is **not sorted** in non-decreasing order, so the answer is 0.

---

## **Constraints:**  
- \(1 \leq n \leq 5 \times 10^6\)  
- \(0 \leq a[i] \leq 10^9\)  
- **Time Limit:** 1 second  

---

## **Approach to Solve the Problem**  
1. **Iterate through the array** from the first to the second-last element.
2. **Compare each element with the next element**. If any element is found to be **greater than** the next element, the array is not sorted.
3. **Return 0** if the array is found to be unsorted at any point.
4. If the loop completes without finding any out-of-order element, **return 1**.

This approach ensures that we efficiently determine if the array is sorted in **O(n)** time complexity, where `n` is the size of the array.

---

## **Algorithm:**  
1. **Input the size** of the array `n`.
2. **Input the elements** of the array `a` from the user.
3. **Initialize a loop** that runs from `0` to `n - 2`:
   - Compare `a[i]` with `a[i + 1]`.
   - If `a[i] > a[i + 1]`, return `0` (array is not sorted).
4. If no such element is found, return `1` (array is sorted).
5. **Print the result**.

---

## **Input/Output Format:**  
- **Input:**  
  - An integer `n`, representing the size of the array.  
  - `n` space-separated non-negative integers representing the elements of the array.  
- **Output:**  
  - `1` if the array is sorted in non-decreasing order, else `0`.

---

## **Sample Input/Output:**  

### **Sample Input 1:**  
```
4  
0 0 0 1
```
**Sample Output 1:**  
```
1
```

### **Sample Input 2:**  
```
5  
4 5 4 4 4
```
**Sample Output 2:**  
```
0
```

---

## **Time Complexity:**  
- **O(n)**: The loop iterates through the array once.
- **Space Complexity:** O(1), as we are only using a few extra variables regardless of the input size.

---

This solution efficiently checks whether the given array is sorted using a **single pass** through the array, making it optimal for large inputs.