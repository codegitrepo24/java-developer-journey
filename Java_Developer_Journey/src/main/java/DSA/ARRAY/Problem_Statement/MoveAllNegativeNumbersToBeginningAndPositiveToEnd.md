## **Problem Analysis**

We are tasked to rearrange an array `ARR` such that all negative numbers appear before all positive numbers. The **order of elements is not important**, which allows us to use an efficient approach.

---

## **Approach**

To solve this problem efficiently in O(N) per test case, we use the **two-pointer technique**. This technique swaps negative numbers to the left and positive numbers to the right without additional space.

---

### **Algorithm**

1. **Initialize Pointers**:
   - Use two pointers: `low` at the beginning of the array and `high` at the end.
   
2. **Rearrange Elements**:
   - While `low < high`:
     - If `ARR[low]` is negative, increment `low`.
     - If `ARR[high]` is positive, decrement `high`.
     - If `ARR[low]` is positive and `ARR[high]` is negative, swap them.
     
3. **Repeat for All Test Cases**:
   - Apply the above steps to each test case independently.

---

### **Pseudocode**

```
function rearrangeArray(ARR):
    low = 0
    high = ARR.length - 1
    
    while low < high:
        if ARR[low] < 0:
            low++
        else if ARR[high] > 0:
            high--
        else:
            swap(ARR[low], ARR[high])
            low++
            high--
```



### **Diagram**

Here’s how the two-pointer technique works on an example input:

#### Input Array:
`[1, -4, -2, 5, 3]`

#### Steps:
1. **Initial State**:
   - `low = 0`, `high = 4`
   - Array: `[1, -4, -2, 5, 3]`
2. **Swap `ARR[low]` and `ARR[high]`**:
   - After swapping: `[3, -4, -2, 5, 1]`
   - `low = 1`, `high = 3`
3. **Increment `low`, Decrement `high`**:
   - No swap needed: `[-4, 3, -2, 5, 1]`
   - `low = 2`, `high = 2`
4. **Final Rearranged Array**:
   - `[-4, -2, 3, 5, 1]`

---

### **Time and Space Complexity**

- **Time Complexity**: O(N) per test case, where N is the size of the array.
- **Space Complexity**: O(1), as we modify the array in place.

---

### **Output**

#### Sample Input:
```
2
5
1 -4 -2 5 3
2
2 1
```

#### Sample Output:
```
Rearranged array:
-4 -2 1 5 3 
Yes
Rearranged array:
2 1 
Yes
```

---

### **Companies Where Asked**

| **Company**                   | **Logo**                                                                 |
|-------------------------------|--------------------------------------------------------------------------|
| SAP Labs                      | ![SAP Labs Logo](https://logo.clearbit.com/sap.com)                     |
| Paytm (One97 Communications)  | ![Paytm Logo](https://logo.clearbit.com/paytm.com)                      |
| Myntra                        | ![Myntra Logo](https://logo.clearbit.com/myntra.com)                    |
| Samsung                       | ![Samsung Logo](https://logo.clearbit.com/samsung.com)                  |
| Barclays                      | ![Barclays Logo](https://logo.clearbit.com/barclays.com)                |
| Dunzo                         | ![Dunzo Logo](https://logo.clearbit.com/dunzo.com)                      |
| Cognizant                     | ![Cognizant Logo](https://logo.clearbit.com/cognizant.com)              |
| Hashedin                      | ![Hashedin Logo](https://logo.clearbit.com/hashedin.com)                |
| Spinny                        | ![Spinny Logo](https://logo.clearbit.com/spinny.com)                    |
| Nagarro                       | ![Nagarro Logo](https://logo.clearbit.com/nagarro.com)                  |

This problem is frequently asked in interviews to test array manipulation and pointer-based logic skills.

