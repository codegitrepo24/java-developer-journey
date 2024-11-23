# Sorting 0s, 1s, and 2s in a Single Scan

## **Problem Statement**
You are given an integer array/list (ARR) of size 'N', which contains only `0s`, `1s`, and `2s`. Your task is to sort the array in non-decreasing order using a single scan of the array.

---

### **Constraints**
- `1 <= T <= 10` (Number of test cases)
- `1 <= N <= 5 * (10^5)` (Size of the array)
- `0 <= ARR[i] <= 2`

### **Time Limit**: 1 second

---

### **Input/Output Format**

#### **Input**
1. First line contains `T`, the number of test cases.
2. For each test case:
   - First line contains `N`, the size of the array.
   - Second line contains `N` space-separated integers: the elements of the array.

#### **Output**
For each test case:
- A single line of sorted array elements.

---

### **Sample Input 1**
```
2
6
0 1 2 2 1 0
7
0 1 2 1 2 1 2
```

### **Sample Output 1**
```
0 0 1 1 2 2
0 1 1 1 2 2 2
```

---

### **Approach**
This problem is a classic **Dutch National Flag Algorithm** problem, where the goal is to sort the array into three segments: `0s`, `1s`, and `2s`. It works in a single scan of the array and utilizes three pointers:
1. **Low Pointer**: Tracks the position of `0s`.
2. **Mid Pointer**: Tracks the current element being processed.
3. **High Pointer**: Tracks the position of `2s`.

#### **Key Idea**
- Move all `0s` to the start of the array.
- Move all `2s` to the end of the array.
- Leave `1s` in the middle.

---

### **Algorithm**
1. Initialize three pointers: `low = 0`, `mid = 0`, and `high = n - 1`.
2. Loop until `mid <= high`:
   - If the current element (`arr[mid]`) is `0`:
     - Swap `arr[mid]` with `arr[low]`.
     - Increment both `low` and `mid`.
   - If `arr[mid]` is `1`:
     - Move `mid` forward.
   - If `arr[mid]` is `2`:
     - Swap `arr[mid]` with `arr[high]`.
     - Decrement `high`.
3. End loop when `mid > high`.
4. Return the sorted array.

---

### **Pseudocode**
```plaintext
function sortArray(arr, n):
    low = 0, mid = 0, high = n - 1
    while mid <= high:
        if arr[mid] == 0:
            swap(arr[low], arr[mid])
            low++, mid++
        else if arr[mid] == 1:
            mid++
        else:
            swap(arr[mid], arr[high])
            high--
    return arr
```

---

### **Advantages of the Algorithm**
1. **Efficient**: 
   - Time Complexity: **O(N)** (Processes each element only once).
   - Space Complexity: **O(1)** (No additional space used).
2. **Simple**: Easy to implement with three pointers.
3. **Scalable**: Handles large arrays efficiently due to linear time complexity.

---

### **Web Diagram**
```plaintext
Initial Array: [0, 1, 2, 2, 1, 0]
Pointers: Low = 0, Mid = 0, High = 5

Step 1: (Mid = 0 -> arr[mid] = 0) 
  Swap(arr[low], arr[mid]) → [0, 1, 2, 2, 1, 0]
  Low++, Mid++ → Low = 1, Mid = 1

Step 2: (Mid = 1 -> arr[mid] = 1)
  Mid++ → [0, 1, 2, 2, 1, 0]
  Low = 1, Mid = 2

Step 3: (Mid = 2 -> arr[mid] = 2)
  Swap(arr[mid], arr[high]) → [0, 1, 0, 2, 1, 2]
  High-- → High = 4

Repeat until Mid > High → Final Array: [0, 0, 1, 1, 2, 2]
```


### **Companies Asking This Question**
| **Company**                  | **Logo**                                                                 |
|-------------------------------|--------------------------------------------------------------------------|
| HCL Technologies             | ![HCL Logo](https://logo.clearbit.com/hcltech.com)                      |
| Walmart                      | ![Walmart Logo](https://logo.clearbit.com/walmart.com)                  |
| Flipkart                     | ![Flipkart Logo](https://logo.clearbit.com/flipkart.com)                |
| Amazon                       | ![Amazon Logo](https://logo.clearbit.com/amazon.com)                    |
| Microsoft                    | ![Microsoft Logo](https://logo.clearbit.com/microsoft.com)              |
| Infosys                      | ![Infosys Logo](https://logo.clearbit.com/infosys.com)                  |
| Tata Consultancy Services    | ![TCS Logo](https://logo.clearbit.com/tcs.com)                         |
| Adobe                        | ![Adobe Logo](https://logo.clearbit.com/adobe.com)                      |
| SAP Labs                     | ![SAP Logo](https://logo.clearbit.com/sap.com)                         |
| Paytm (One97 Communications) | ![Paytm Logo](https://logo.clearbit.com/paytm.com)                      |

---

This algorithm is widely used in coding interviews as it demonstrates proficiency in array manipulation and pointer-based algorithms.