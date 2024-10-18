# **Linear Search in an Array/List**  

---

## **Problem Statement**  
You have been given a random integer array/list (ARR) of size `N`, and an integer `X`. You need to search for the integer `X` in the given array/list using **Linear Search**.

- You are required to **return the index** where `X` is present in the array/list.
- If `X` has **multiple occurrences**, return the **index of its first occurrence**.  
- If `X` is not present in the array/list, return `-1`.

### **Explanation of Linear Search:**  
Linear Search is a simple searching technique that **checks elements sequentially**, one by one, until a match is found or the entire array/list is traversed.  

---

## **Constraints:**  
- `1 ≤ t ≤ 10^2` (Number of test cases)  
- `0 ≤ N ≤ 10^5` (Size of array/list)  
- `-2^31 ≤ X ≤ (2^31) - 1`  
- **Time Limit:** 1 sec  

---

## **Sample Inputs and Outputs:**  

**Sample Input 1:**  
```
1  
7  
2 13 4 1 3 6 28  
3  
```
**Sample Output 1:**  
```
4
```

**Explanation:**  
The element `3` is found at **index 4** in the given array.

---

**Sample Input 2:**  
```
2  
7  
2 13 4 1 3 6 28  
9  
5  
7 8 5 9 5  
5  
```

**Sample Output 2:**  
```
-1  
2  
```

**Explanation:**  
- In the **first case**, the element `9` is not present in the array, so the output is `-1`.  
- In the **second case**, the element `5` appears multiple times, but the first occurrence is at **index 2**.

---

## **Approach to Solve the Problem:**  
1. **Iterate over the array:**  
   Traverse the array/list from the **first element to the last**.
2. **Compare each element with X:**  
   If you find an element equal to `X`, **return its index immediately**.
3. **Continue searching until the end:**  
   If you reach the end of the array without finding `X`, **return -1**.

---

## **Algorithm:**  
1. Take input for the number of test cases, `t`.
2. For each test case:
   - Input the size of the array `n`.
   - Input the elements of the array.
   - Input the element to search for, `X`.
3. Iterate through the array:
   - If the element at the current index matches `X`, return that index.
   - If no match is found by the end of the array, return `-1`.

---

## **Pseudocode:**  
```
function linearSearch(arr, n, x):
    for i = 0 to n - 1:
        if arr[i] == x:
            return i
    return -1

main():
    t = input()  // Number of test cases
    while t > 0:
        n = input()  // Size of array
        arr = input_array()  // Array elements
        x = input()  // Element to search
        result = linearSearch(arr, n, x)
        print(result)
        t = t - 1
```

---

## **Expected Time Complexity:**  
- **O(n)** for each test case, where `n` is the size of the array.

---

## **Companies Where This Question Was Asked:**  
This problem is commonly asked in coding interviews at:  

| **Company** | **Logo** |  
| ------------| -------- |  
| Qualcomm    | ![Qualcomm](https://upload.wikimedia.org/wikipedia/commons/9/90/Qualcomm_Logo_2018.png) |  
| Deloitte    | ![Deloitte](https://upload.wikimedia.org/wikipedia/commons/6/6d/Deloitte.svg) |  
| Wipro       | ![Wipro](https://upload.wikimedia.org/wikipedia/commons/f/f6/Wipro_Primary_Logo_Color_RGB.svg) |  
| AVL India Pvt. Ltd. | ![AVL](https://upload.wikimedia.org/wikipedia/commons/1/1c/AVL_Logo.jpg) |  

---

## **How to Run the Code:**  
1. Compile the program using `javac Solution.java`.  
2. Run the program with `java Solution`.  
3. Enter the input as specified in the examples.

---

This problem helps you understand **Linear Search**, which is a fundamental search technique used in various real-world applications. Mastering this problem will also prepare you for coding interviews with top companies.