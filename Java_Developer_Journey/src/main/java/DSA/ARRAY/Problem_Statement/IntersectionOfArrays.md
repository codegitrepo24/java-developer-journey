
# Problem Statement: Intersection of Two Sorted Arrays

You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. Your task is to find the intersection of these two arrays.

## Problem Definition:
The intersection of two arrays is an array that contains all the common elements occurring in both arrays.

### **Note:**
1. The length of each array is greater than zero.
2. Both arrays are sorted in non-decreasing order.
3. The output should be in the order of elements that occur in the original arrays.
4. If there is no intersection, return an empty array.

### **Constraints:**
- 1 ≤ T ≤ 100
- 1 ≤ N, M ≤ 10^4
- 0 ≤ A[i], B[i] ≤ 10^5

### **Time Limit:** 
1 second

## **Sample Input and Output:**

### **Sample Input 1:**
```
2
6 4
1 2 2 2 3 4
2 2 3 3
3 2
1 2 3
3 4
```

### **Sample Output 1:**
```
2 2 3
3
```

**Explanation:**
For the first test case, the common elements between both arrays are `2 2 3`, so we print them.

For the second test case, only `3` is common between the two arrays, so the output is `3`.

---

### **Sample Input 2:**
```
2
3 3
1 4 5
3 4 5
1 1
3
6
```

### **Sample Output 2:**
```
4 5
-1
```

**Explanation:**
For the first test case, the common elements are `4 5`.

For the second test case, there is no intersection, so the output is `-1`.

---

## **Approach:**

### **Approach:**
We can solve the problem using a **two-pointer technique** to efficiently find the intersection between the two sorted arrays. 

1. Initialize two pointers `i` and `j` to traverse the two arrays.
2. Compare the elements at `arr1[i]` and `arr2[j]`.
   - If `arr1[i] < arr2[j]`, increment pointer `i`.
   - If `arr1[i] > arr2[j]`, increment pointer `j`.
   - If `arr1[i] == arr2[j]`, add the element to the result and increment both pointers.
3. Continue this process until one of the pointers goes out of bounds.
4. Return the resulting list of common elements.

---

### **Algorithm (Pseudocode):**

```
Function findArrayIntersection(arr1, arr2):
    Initialize result = []
    i = 0, j = 0
    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            i++
        else if arr1[i] > arr2[j]:
            j++
        else:
            result.append(arr1[i])
            i++
            j++
    return result

Function main():
    T = Read input number of test cases
    For each test case:
        Read arr1 and arr2
        result = findArrayIntersection(arr1, arr2)
        If result is empty:
            print "-1"
        Else:
            print result
```

---

## **Diagram Explanation:**

The following diagram explains the logic of the two-pointer technique:

```
arr1: [1, 2, 2, 2, 3, 4]
arr2: [2, 2, 3, 3]

Pointer i -> arr1[i]     arr1[i] is smaller than arr2[j] -> move pointer i
Pointer j -> arr2[j]

Step 1: i = 0, j = 0, arr1[0] < arr2[0] -> Move i to 1
Step 2: i = 1, j = 0, arr1[1] == arr2[0] -> Add arr1[1] to result, Move i to 2, j to 1
Step 3: i = 2, j = 1, arr1[2] == arr2[1] -> Add arr1[2] to result, Move i to 3, j to 2
Step 4: i = 3, j = 2, arr1[3] == arr2[2] -> Add arr1[3] to result, Move i to 4, j to 3
Step 5: i = 4, j = 3, arr1[4] == arr2[3] -> Add arr1[4] to result, Move i to 5, j to 4

Result: [2, 2, 3]
```

---

## **Companies That Asked This Question:**

| **Company**                        | **Logo**                         |
|-------------------------------------|----------------------------------|
| IBM                                 | ![IBM](https://logo.clearbit.com/ibm.com)  |
| Google                              | ![Google](https://logo.clearbit.com/google.com) |
| Facebook                            | ![Facebook](https://logo.clearbit.com/facebook.com) |
| Big Basket                          | ![Big Basket](https://logo.clearbit.com/bigbasket.com) |
| Cisco                               | ![Cisco](https://logo.clearbit.com/cisco.com) |
| Adobe                               | ![Adobe](https://logo.clearbit.com/adobe.com) |
| LinkedIn                            | ![LinkedIn](https://logo.clearbit.com/linkedin.com) |
| Antino Labs Pvt Ltd                | ![Antino Labs](https://logo.clearbit.com/antino.com) |
| JP Josh Technology Group           | ![JP Josh Technology](https://logo.clearbit.com/jpjoshtg.com) |
| DE Chegg                            | ![DE Chegg](https://logo.clearbit.com/chegg.com) |
| KPI KPIT Technologies              | ![KPIT](https://logo.clearbit.com/kpit.com) |
| Freecharge                          | ![Freecharge](https://logo.clearbit.com/freecharge.in) |
| VMware Inc                          | ![VMware](https://logo.clearbit.com/vmware.com) |
| Tower Research Capital             | ![Tower Research](https://logo.clearbit.com/towerresearch.com) |
| Accolite                            | ![Accolite](https://logo.clearbit.com/accolite.com) |
| Daffodil Software                  | ![Daffodil](https://logo.clearbit.com/daffodilsw.com) |
| Zoho Corporation                   | ![Zoho](https://logo.clearbit.com/zoho.com) |
| D.E.Shaw                            | ![D.E. Shaw](https://logo.clearbit.com/deshaw.com) |
| F5 Networks                        | ![F5 Networks](https://logo.clearbit.com/f5.com) |
| Bosch Limited                       | ![Bosch](https://logo.clearbit.com/bosch.com) |
| VMware Inc                          | ![VMware](https://logo.clearbit.com/vmware.com) |

--- 
