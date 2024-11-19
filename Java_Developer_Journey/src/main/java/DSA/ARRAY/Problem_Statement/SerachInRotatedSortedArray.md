# Search in Rotated Sorted Array

## Problem Statement

Aahad and Harshit always have fun by solving problems. Harshit took a sorted array consisting of distinct integers and rotated it clockwise by an unknown amount. For example, he took a sorted array = `[1, 2, 3, 4, 5]` and if he rotates it by 2, the array becomes: `[4, 5, 1, 2, 3]`.

After rotating the sorted array, Aahad needs to answer **Q** queries asked by Harshit. Each query contains an integer **Q[i]**, and for each query, Aahad needs to determine the index of the number in the array. If the number does not exist, return **-1**.

---

## Constraints

- 1 <= N <= 10^6
- -10^9 <= A[i] <= 10^9
- 1 <= Q <= 10^5
- -10^9 <= Q[i] <= 10^9

**Time Limit:** 1 second  
**Expected Complexity:** O(log N)

---

## Examples

### Sample Input 1
```
4
2 5 -3 0
2
5
1
```

### Sample Output 1
```
1
-1
```

**Explanation:**  
- In the 1st query, `5` is at index `1`.  
- In the 2nd query, `1` is not found, so the result is `-1`.

### Sample Input 2
```
5
100 -2 6 10 11
2
100
6
```

### Sample Output 2
```
0
2
```

**Explanation:**  
- In the 1st query, `100` is at index `0`.  
- In the 2nd query, `6` is at index `2`.

---

## Approach

To solve this problem efficiently, we use a **binary search** method. The rotated sorted array has two sorted halves due to the rotation. By identifying the sorted half at each step, we can decide where to search next.

### Algorithm
1. **Initialize**:
   - `low = 0`, `high = n-1`.

2. **Binary Search**:
   - Compute the middle index `m = (low + high) / 2`.
   - Check if `arr[m] == key`. If true, return `m`.
   - Determine whether the left half (`arr[low]` to `arr[m]`) is sorted:
     - If the key lies within this range, adjust `high = m-1`.
     - Otherwise, adjust `low = m+1`.
   - If the left half is not sorted, the right half must be sorted:
     - If the key lies within this range, adjust `low = m+1`.
     - Otherwise, adjust `high = m-1`.

3. **Return -1**:
   - If the key is not found, return `-1`.

### Time Complexity
- **Binary Search**: O(log N) for a single query.  
- **Total Complexity**: O(Q⋅logN) for 𝑄 queries.

---

## Pseudocode

```
FUNCTION search(arr, key):
    low = 0, high = arr.length - 1
    WHILE low <= high:
        mid = (low + high) / 2
        IF arr[mid] == key:
            RETURN mid
        IF arr[low] <= arr[mid]:  // Left half is sorted
            IF key >= arr[low] AND key < arr[mid]:
                high = mid - 1
            ELSE:
                low = mid + 1
        ELSE:  // Right half is sorted
            IF key > arr[mid] AND key <= arr[high]:
                low = mid + 1
            ELSE:
                high = mid - 1
    RETURN -1
```


---

## Diagram

```plaintext
Input: [4, 5, 1, 2, 3], key = 5

Step 1:
low = 0, high = 4, mid = 2
arr[mid] = 1 ≠ key

Step 2:
Left half is not sorted, so move to right.
low = 0, high = 1, mid = 0
arr[mid] = 4 ≠ key

Step 3:
Check right half.
low = 1, high = 1, mid = 1
arr[mid] = 5 == key -> Return 1
```

---

## Companies Asking This Question

| **Company**           | **Logo**                                                                 |
|------------------------|--------------------------------------------------------------------------|
| Tata 1mg              | ![Tata 1mg](https://logo.clearbit.com/1mg.com)                          |
| Walmart               | ![Walmart](https://logo.clearbit.com/walmart.com)                       |
| Delhivery             | ![Delhivery](https://logo.clearbit.com/delhivery.com)                   |
| Flipkart              | ![Flipkart](https://logo.clearbit.com/flipkart.com)                     |
| Amazon                | ![Amazon](https://logo.clearbit.com/amazon.com)                         |
| Google                | ![Google](https://logo.clearbit.com/google.com)                         |
| Microsoft             | ![Microsoft](https://logo.clearbit.com/microsoft.com)                   |
| Goldman Sachs         | ![Goldman Sachs](https://logo.clearbit.com/gs.com)                      |
| Salesforce            | ![Salesforce](https://logo.clearbit.com/salesforce.com)                 |
| Adobe                 | ![Adobe](https://logo.clearbit.com/adobe.com)                           |

---

## Summary

This problem demonstrates the efficient use of **binary search** to handle queries in a rotated sorted array. By identifying the sorted half at each step, we maintain logarithmic time complexity, making it well-suited for large datasets.