# Maximum Subarray Sum Problem

### **Problem Statement**
You are given an array `arr` of length `n`, consisting of integers. A **subarray** is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning and/or the end of an array.

Your task is to find the **sum of the subarray (including empty subarray)** having the maximum sum among all subarrays.  
- The sum of an empty subarray is `0`.

---

### **Example**
#### Input:
```plaintext
arr = [1, 2, 7, -4, 3, 2, -10, 9, 1]
```

#### Output:
```plaintext
11
```

#### Explanation:
The subarray yielding the maximum sum is `[1, 2, 7, -4, 3, 2]`.

---

## **Approach: Kadane's Algorithm**

**Kadane's Algorithm** is an efficient method to solve this problem in **O(n)** time complexity.  
The algorithm dynamically determines whether to:
1. Add the current element to the existing subarray sum.
2. Start a new subarray starting from the current element.

By tracking both the **current subarray sum** and the **maximum sum so far**, we find the solution efficiently.

---

### **Key Concepts**
1. **Dynamic Programming:**  
   - Maintain a running sum (`currentSum`) of the subarray.  
   - Reset `currentSum` to 0 if it becomes negative.  

2. **Initialization:**  
   - Set `currentSum = 0` (an empty subarray sum).  
   - Set `maxSum = 0` (track the maximum sum encountered).  

3. **Updating:**  
   - At each element, calculate:  
     currentSum=max(current element,currentSum+current element)
   - Update `maxSum` as the maximum of itself and `currentSum`.

---

### **Algorithm**
1. Initialize `currentSum` to 0 and `maxSum` to 0.
2. Iterate through each element of the array:
   - Update `currentSum` to include the current element.
   - If `currentSum` becomes negative, reset it to 0.
   - Update `maxSum` with the maximum of itself and `currentSum`.
3. Return `maxSum`.

---

### **Pseudocode**
```plaintext
function findMaxSubarraySum(arr):
    currentSum = 0
    maxSum = 0

    for element in arr:
        currentSum = currentSum + element
        if currentSum < 0:
            currentSum = 0
        maxSum = max(maxSum, currentSum)

    return maxSum
```

---

### **Web Diagram: Kadane's Algorithm**

```plaintext
          Array: [1, 2, 7, -4, 3, 2, -10, 9, 1]

Step 1: Initialize:
        currentSum = 0, maxSum = 0

Step 2: Traverse the array and update:
        currentSum += arr[i]
        if currentSum < 0 --> reset to 0
        maxSum = max(maxSum, currentSum)

Visualization:

Index | Element | currentSum | maxSum | Reset to 0?
---------------------------------------------------
  0   |    1    |     1      |    1   |    No
  1   |    2    |     3      |    3   |    No
  2   |    7    |    10      |   10   |    No
  3   |   -4    |     6      |   10   |    No
  4   |    3    |     9      |   10   |    No
  5   |    2    |    11      |   11   |    No
  6   |   -10   |     1      |   11   |    No
  7   |    9    |    10      |   11   |    No
  8   |    1    |    11      |   11   |    No
```

### **Companies Asking this Question**

| Company                       | Logo                                                                                 |
|-------------------------------|--------------------------------------------------------------------------------------|
| Microsoft                     | ![Microsoft](https://logo.clearbit.com/microsoft.com)                                |
| Amazon                        | ![Amazon](https://logo.clearbit.com/amazon.com)                                      |
| Accenture                     | ![Accenture](https://logo.clearbit.com/accenture.com)                                |
| Infosys                       | ![Infosys](https://logo.clearbit.com/infosys.com)                                    |
| Flipkart                      | ![Flipkart](https://logo.clearbit.com/flipkart.com)                                  |
| Facebook                      | ![Facebook](https://logo.clearbit.com/facebook.com)                                  |
| SAP Labs                      | ![SAP](https://logo.clearbit.com/sap.com)                                           |
| Tata Consultancy Services     | ![TCS](https://logo.clearbit.com/tcs.com)                                           |
| Goldman Sachs                 | ![Goldman Sachs](https://logo.clearbit.com/goldmansachs.com)                         |
| Oracle                        | ![Oracle](https://logo.clearbit.com/oracle.com)                                      |

---

### **Conclusion**
Kadane's Algorithm is an efficient approach to solve the **Maximum Subarray Sum** problem in linear time. Its simplicity and robustness make it a fundamental algorithm in the field of dynamic programming, widely used in competitive programming and coding interviews.