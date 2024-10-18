# **Rotate Array Left by One**  

## **Problem Statement**  
Given an array `arr` containing `n` elements, rotate this array to the left **once** and return it. Rotating the array left by one means shifting all elements by one position to the left and moving the first element to the last position in the array.

---

## **Example**  

### **Input:**  
```
n = 5  
arr = [1, 2, 3, 4, 5]
```

### **Output:**  
```
[2, 3, 4, 5, 1]
```

### **Explanation:**  
- The first element `1` is moved to the last position.
- The remaining elements are shifted to the left by one position.
- The final array is `[2, 3, 4, 5, 1]`.

---

## **Detailed Explanation (Input/Output Format, Notes)**  
### **Constraints:**  
- `1 <= n <= 10^5`  
- `1 <= arr[i] <= 10^9`  
- **Time Limit:** 1 second  

### **Sample Input 1:**  
```
4  
5 7 3 2
```

### **Sample Output 1:**  
```
7 3 2 5
```

### **Explanation of Sample Input 1:**  
- The first element `5` is moved to the last position.
- The remaining elements are shifted left by one position.
- Output: `[7, 3, 2, 5]`.

---

### **Sample Input 2:**  
```
5  
4 0 3 2 5
```

### **Sample Output 2:**  
```
0 3 2 5 4
```

---

## **Approach to Solve the Problem**  
1. Store the **first element** of the array in a temporary variable.  
2. **Shift all elements** to the left by one position using a loop.  
3. Assign the **stored element** to the last position of the array.  
4. Return or print the modified array.

---

## **Algorithm**  
1. Read the size of the array, `n`.
2. Read the elements of the array.
3. Store the first element in a temporary variable (`temp`).
4. Use a **for loop** to shift elements from index `1` to `n-1` to the left by one position.
5. Assign the `temp` variable (original first element) to the last position in the array.
6. Print or return the updated array.

---

## **Pseudocode**  
```
1. Input n  // size of the array  
2. Input arr  // elements of the array  

3. temp = arr[0]  // Store the first element  
4. For i = 1 to n-1:
       arr[i-1] = arr[i]  // Shift elements to the left  

5. arr[n-1] = temp  // Place the first element at the last position  

6. Print or return arr  // Output the modified array
```

---

## **Expected Time Complexity**  
- **Time:** O(n), where `n` is the size of the input array.  
- **Space:** O(1), as the rotation is done in place without extra space.

---

## **Conclusion**  
This problem demonstrates how to efficiently rotate an array to the left by one position. The in-place approach ensures that the solution is both time-efficient and space-efficient, making it suitable for large arrays within the given constraints.