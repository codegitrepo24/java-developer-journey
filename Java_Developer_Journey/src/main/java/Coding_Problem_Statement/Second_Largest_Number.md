
# **Find the Second Largest and Second Smallest Element from an Array**  

## **Problem Statement**  
You have been given an array `a` of size `n` consisting of unique non-negative integers.  

**Task:**  
Find the **second largest** and **second smallest** elements from the array and return them as a new array of size 2.  

---

## **Example**  
### Input:  
```
n = 5  
a = [1, 2, 3, 4, 5]  
```

### Output:  
```
[4, 2]
```

### Explanation:  
- The **largest element** is 5, so the **second largest** element is 4.  
- The **smallest element** is 1, so the **second smallest** element is 2.

---

## **Input/Output Format**  
### **Input:**  
- `n`: Integer, the size of the array (2 ≤ `n` ≤ 10^5)  
- `a`: List of `n` unique non-negative integers (0 ≤ `a[i]` ≤ 10^9)  

### **Output:**  
- An array of size 2 containing the second largest and second smallest elements.

---

## **Sample Input/Output**  
### **Sample Input 1:**  
```
4  
3 4 5 2  
```
### **Sample Output 1:**  
```
4 3  
```
**Explanation:**  
- The largest element is 5, so the second largest is 4.  
- The smallest element is 2, so the second smallest is 3.  

### **Sample Input 2:**  
```
5  
4 5 3 6 7  
```
### **Sample Output 2:**  
```
6 4  
```

---

## **Constraints**  
- 2 ≤ `n` ≤ 10^5  
- 0 ≤ `a[i]` ≤ 10^9  
- **Time Limit:** 1 second  

---

## **Approach**  
The goal is to efficiently find the **second largest** and **second smallest** elements from the array without sorting it. Sorting would take **O(n log n)** time, which is not suitable for large inputs. We can achieve the solution with a **single pass through the array** in **O(n)** time.  

---

## **Steps for the Approach:**  
1. Initialize variables:
   - Set both `largest` and `smallest` to the first element of the array.
   - Initialize placeholders for `secondLargest` and `secondSmallest`.  

2. **Traverse the array once** to find the required elements:
   - Compare each element with the **largest** and update both `largest` and `secondLargest` as needed.
   - Similarly, compare each element with the **smallest** and update both `smallest` and `secondSmallest`.

3. **Return the second largest and second smallest elements** as a new array of size 2.

---

## **Algorithm**  
1. **Initialize variables:**  
   - `largest = smallest = arr[0]`  
   - `secondLargest = secondSmallest = -1`  

2. **Loop through the array:**  
   - If the current element is greater than `largest`, update:
     - `secondLargest = largest`
     - `largest = current element`  
   - If the current element is greater than `secondLargest` but not equal to `largest`, update `secondLargest`.  

   - If the current element is smaller than `smallest`, update:
     - `secondSmallest = smallest`
     - `smallest = current element`  
   - If the current element is smaller than `secondSmallest` but not equal to `smallest`, update `secondSmallest`.  

3. **Return an array** with the values of `secondLargest` and `secondSmallest`.  

---

## **Pseudocode**  
```
function findSecondOrderElements(arr, n):
    largest = smallest = arr[0]
    secondLargest = secondSmallest = -1

    for i from 1 to n-1:
        if arr[i] > largest:
            secondLargest = largest
            largest = arr[i]
        else if arr[i] > secondLargest and arr[i] != largest:
            secondLargest = arr[i]

        if arr[i] < smallest:
            secondSmallest = smallest
            smallest = arr[i]
        else if arr[i] < secondSmallest and arr[i] != smallest:
            secondSmallest = arr[i]

    return [secondLargest, secondSmallest]
```

---

## **Web Diagram**  
```  
Start  
   ↓  
Input Array → Traverse Array → Track largest, second largest, smallest, second smallest  
   ↓  
Store second largest and second smallest  
   ↓  
Output Result  
   ↓  
End  
```

---

## **Time Complexity Analysis**  
- **Time Complexity:** O(n), where n is the size of the array.  
- **Space Complexity:** O(1), since only a few variables are used.

---

## **Hints:**  
1. Sorting the array and returning the second largest and smallest elements can work but is not optimal for large inputs.  
2. Using a **single pass approach** ensures the solution remains efficient.  

---

## **Use Cases in Interviews**  
This problem tests the candidate's ability to **efficiently traverse arrays** and **manage multiple variables**, which are crucial skills for solving optimization problems.

---

## **Companies That Asked This Problem:**  
- **Samsung**  
![Samsung Logo](https://upload.wikimedia.org/wikipedia/commons/2/24/Samsung_Logo.svg)  