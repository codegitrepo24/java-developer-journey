# Move Zeroes to End of Array

## Problem Statement

Given an unsorted array of integers, rearrange the array such that:
- All zeroes are transferred to the end.
- All non-zero elements are moved to the front, maintaining their order of appearance.

**Example**:  
Input: `[0, 1, -2, 3, 4, 0, 5, -27, 9, 0]`  
Output: `[1, -2, 3, 4, 5, -27, 9, 0, 0, 0]`  

### Expected Complexity
- **Time Complexity**: O(n)  
- **Space Complexity**: O(1)

---

## Input/Output

### **Input**
1. `T` (Number of test cases)
2. For each test case:
   - `n` (Size of the array)
   - Array of integers of size `n`

### **Output**
For each test case, output the array with zeroes moved to the end.

---

### **Sample Input/Output**

**Input 1**:
```
2
7
2 0 4 1 3 0 28
5
0 0 0 0 1
```

**Output 1**:
```
2 4 1 3 28 0 0
1 0 0 0 0
```

**Explanation**:  
- For the first test case, zeros are moved to the end: `[2, 4, 1, 3, 28, 0, 0]`.  
- For the second test case, only the non-zero element remains at the front: `[1, 0, 0, 0, 0]`.

**Input 2**:
```
2
5
0 3 0 2 0
4
0 0 0 0
```

**Output 2**:
```
3 2 0 0 0
0 0 0 0
```

---

## Approach

1. **Two-Pointer Technique**:
   - Maintain one pointer (`nonZeroIndex`) for the position to place non-zero elements.
   - Traverse the array, and whenever a non-zero element is encountered, move it to the position indicated by `nonZeroIndex`.
   - After processing all elements, fill the remaining positions with zeroes.

2. **Key Observations**:
   - Non-zero elements maintain their relative order.
   - Only a single traversal is needed for optimal time complexity.

---

## Algorithm

1. Initialize a pointer `nonZeroIndex = 0`.
2. Traverse the array:
   - If the current element is non-zero, move it to the position at `nonZeroIndex` and increment `nonZeroIndex`.
3. After the traversal:
   - Set all remaining positions (from `nonZeroIndex` to the end) to zero.

---

## Pseudocode

```
function moveZeroesToEnd(arr):
    nonZeroIndex = 0
    for i from 0 to len(arr) - 1:
        if arr[i] != 0:
            arr[nonZeroIndex] = arr[i]
            nonZeroIndex += 1
    for i from nonZeroIndex to len(arr) - 1:
        arr[i] = 0
```

---

## Explanation Diagram

```plaintext
Input Array: [0, 1, -2, 3, 4, 0, 5, -27, 9, 0]
nonZeroIndex -> 0

Pass 1: [1, 1, -2, 3, 4, 0, 5, -27, 9, 0]  -> nonZeroIndex = 1
Pass 2: [1, -2, -2, 3, 4, 0, 5, -27, 9, 0] -> nonZeroIndex = 2
Pass 3: [1, -2, 3, 3, 4, 0, 5, -27, 9, 0]  -> nonZeroIndex = 3
Pass 4: [1, -2, 3, 4, 4, 0, 5, -27, 9, 0]  -> nonZeroIndex = 4
Pass 5: [1, -2, 3, 4, 5, 0, 5, -27, 9, 0]  -> nonZeroIndex = 5
Pass 6: [1, -2, 3, 4, 5, -27, 5, -27, 9, 0] -> nonZeroIndex = 6
Pass 7: [1, -2, 3, 4, 5, -27, 9, -27, 9, 0] -> nonZeroIndex = 7

Fill remaining: [1, -2, 3, 4, 5, -27, 9, 0, 0, 0]
```

---

## Companies Where Asked

| Company                                  | Logo                                                                                                                                 |
|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| Infosys                                  | ![Infosys](https://logo.clearbit.com/infosys.com)                                                                                   |
| ThoughtWorks                             | ![ThoughtWorks](https://logo.clearbit.com/thoughtworks.com)                                                                         |
| Facebook                                 | ![Facebook](https://logo.clearbit.com/facebook.com)                                                                                 |
| Amazon                                   | ![Amazon](https://logo.clearbit.com/amazon.com)                                                                                     |
| SAP Labs                                 | ![SAP Labs](https://logo.clearbit.com/sap.com)                                                                                      |
| Microsoft                                | ![Microsoft](https://logo.clearbit.com/microsoft.com)                                                                               |
| Harman International                     | ![Harman](https://logo.clearbit.com/harman.com)                                                                                     |
| GlobalLogic                              | ![GlobalLogic](https://logo.clearbit.com/globallogic.com)                                                                           |
| Cognizant                                | ![Cognizant](https://logo.clearbit.com/cognizant.com)                                                                               |
| Quizizz Inc                              | ![Quizizz](https://logo.clearbit.com/quizizz.com)                                                                                   |
| Credit Suisse                            | ![Credit Suisse](https://logo.clearbit.com/credit-suisse.com)                                                                       |
| Apisera                                  | ![Apisera](https://logo.clearbit.com/apisera.com)                                                                                   |
| BOSCH Limited                            | ![BOSCH](https://logo.clearbit.com/bosch.com)                                                                                       |
| Cvent                                    | ![Cvent](https://logo.clearbit.com/cvent.com)                                                                                       |
| Reliance Jio                             | ![Reliance Jio](https://logo.clearbit.com/jio.com)                                                                                  |
| BlueStacks                               | ![BlueStacks](https://logo.clearbit.com/bluestacks.com)                                                                             |
| VMware Software India Pvt. Ltd.          | ![VMware](https://logo.clearbit.com/vmware.com)                                                                                     |
| Nagarro                                  | ![Nagarro](https://logo.clearbit.com/nagarro.com)                                                                                   |