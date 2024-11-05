# Second Largest Element in an Array

## Problem Statement
You are given an array/list `ARR` of integers. Your task is to find the second-largest element present in `ARR`.

### Notes:
1. Duplicate elements may be present.
2. If no such element is present (e.g., all elements are the same), return `-1`.

### Example:
**Input:**  
Given a sequence of five numbers: `2, 4, 5, 6, 8`

**Output:**  
`6`

**Explanation:**  
In the given sequence, `8` is the largest element, followed by `6` as the second-largest element. Hence, the output is `6`.

### Constraints:
- **1 ≤ T ≤ 100**: Total number of test cases
- **1 ≤ N ≤ 5000**: Number of elements in each array
- **-10^9 ≤ ARR[i] ≤ 10^9**: Range of elements in the array

### Sample Input:
```
2
6
12 1 35 10 34 1
5
10 10 10 10 10
```

### Sample Output:
```
34
-1
```

### Explanation:
1. **Test Case 1**: The largest number is `35`, and the second largest is `34`.
2. **Test Case 2**: All elements are the same (`10`), so there's no second-largest element, returning `-1`.

---

## Approach

1. **Single Traversal**:
   - Initialize two variables, `largest` and `secondLargest`, to store the largest and second-largest values.
   - Traverse through the array once:
     - If an element is greater than `largest`, update `secondLargest` to `largest` and `largest` to the current element.
     - If an element is different from `largest` but greater than `secondLargest`, update `secondLargest`.
2. **Handling Duplicates**:
   - By comparing each element, duplicates are naturally handled since only unique values update `largest` and `secondLargest`.

---

## Algorithm

1. Initialize `largest` to the smallest possible integer (`Integer.MIN_VALUE`).
2. Set `secondLargest` to the same initial value.
3. For each element in `ARR`:
   - If the element is greater than `largest`:
     - Update `secondLargest` to `largest`.
     - Set `largest` to the current element.
   - Else if the element is greater than `secondLargest` and different from `largest`:
     - Update `secondLargest`.
4. After the loop, if `secondLargest` remains `Integer.MIN_VALUE`, return `-1`.
5. Otherwise, return `secondLargest`.

---

## Pseudocode
```plaintext
function findSecondLargest(arr):
    largest = Integer.MIN_VALUE
    secondLargest = Integer.MIN_VALUE

    for each number in arr:
        if number > largest:
            secondLargest = largest
            largest = number
        else if number > secondLargest and number != largest:
            secondLargest = number

    if secondLargest == Integer.MIN_VALUE:
        return -1
    else:
        return secondLargest
```

---


## Explanation Diagram

```plaintext
Given Array: 12 1 35 10 34 1

Step 1: Initialize largest = -∞, secondLargest = -∞

Step 2: Traverse through each element:
  - 12: largest = 12, secondLargest = -∞
  - 1:  No change
  - 35: largest = 35, secondLargest = 12
  - 10: No change
  - 34: secondLargest = 34
  - 1:  No change

Result: secondLargest = 34
```

---

## Companies That Asked This Question

- ![Oracle](https://logo.clearbit.com/oracle.com) Oracle
- ![Tech Mahindra](https://logo.clearbit.com/techmahindra.com) Tech Mahindra
- ![Amazon](https://logo.clearbit.com/amazon.com) Amazon
- ![Info Edge India (Naukri.com)](https://logo.clearbit.com/infoedge.in) Info Edge India (Naukri.com)
- ![HCL Technologies](https://logo.clearbit.com/hcltech.com) HCL Technologies
- ![Morgan Stanley](https://logo.clearbit.com/morganstanley.com) Morgan Stanley
- ![Adobe](https://logo.clearbit.com/adobe.com) Adobe
- ![BOLD](https://logo.clearbit.com/bold.com) BOLD
- ![Liberin Technologies](https://logo.clearbit.com/liberintech.com) Liberin Technologies
- ![Optum](https://logo.clearbit.com/optum.com) Optum
- ![Samsung](https://logo.clearbit.com/samsung.com) Samsung
- ![Tata Consultancy Services (TCS)](https://logo.clearbit.com/tcs.com) TCS
- ![HCODE Technologies](https://logo.clearbit.com/hcode.com) HCODE Technologies
- ![Wipro](https://logo.clearbit.com/wipro.com) Wipro
- ![PayU](https://logo.clearbit.com/payu.com) PayU
- ![Accenture](https://logo.clearbit.com/accenture.com) Accenture
- ![MathWorks](https://logo.clearbit.com/mathworks.com) MathWorks
- ![Swiggy](https://logo.clearbit.com/swiggy.com) Swiggy
- ![Infosys](https://logo.clearbit.com/infosys.com) Infosys
- ![Cognizant](https://logo.clearbit.com/cognizant.com) Cognizant
- ![SAP Labs](https://logo.clearbit.com/sap.com) SAP Labs
- ![Aricent Technologies](https://logo.clearbit.com/aricent.com) Aricent Technologies
- ![Unthinkable Solutions](https://logo.clearbit.com/unthinkable.co) Unthinkable Solutions
- ![Fidelity International](https://logo.clearbit.com/fidelity.com) Fidelity International
- ![Amdocs](https://logo.clearbit.com/amdocs.com) Amdocs
- ![MAQ Software](https://logo.clearbit.com/maqsoftware.com) MAQ Software
- ![Trell](https://logo.clearbit.com/trell.co) Trell
- ![Jio Platforms](https://logo.clearbit.com/jio.com) Jio Platforms
- ![Indegene](https://logo.clearbit.com/indegene.com) Indegene
- ![Betsol](https://logo.clearbit.com/betsol.com) Betsol
- ![Daffodil Software](https://logo.clearbit.com/daffodilsw.com) Daffodil Software
- ![Pristyn Care](https://logo.clearbit.com/pristyncare.com) Pristyn Care
- ![GlobalLogic](https://logo.clearbit.com/globallogic.com) GlobalLogic
- ![Quantiphi](https://logo.clearbit.com/quantiphi.com) Quantiphi
- ![Osmosys](https://logo.clearbit.com/osmosys.asia) Osmosys
- ![Dassault Systèmes](https://logo.clearbit.com/3ds.com) Dassault Systèmes
- ![Cvent](https://logo.clearbit.com/cvent.com) Cvent
- ![FLYBUNCH Ventures](https://logo.clearbit.com/flybunch.com) FLYBUNCH Ventures
- ![Josh Technology Group](https://logo.clearbit.com/joshtechnologygroup.com) Josh Technology Group
- ![Virtusa](https://logo.clearbit.com/virtusa.com) Virtusa
- ![Standard Chartered Bank](https://logo.clearbit.com/sc.com) Standard Chartered Bank
- ![Datametica Solutions](https://logo.clearbit.com/datametica.com) Datametica Solutions
- ![Capgemini Consulting](https://logo.clearbit.com/capgemini.com) Capgemini Consulting
- ![MetricStream](https://logo.clearbit.com/metricstream.com) MetricStream
- ![Antino Labs](https://logo.clearbit.com/antino.io) Antino Labs
- ![Mercedes-Benz Research & Development India](https://logo.clearbit.com/daimler.com) Mercedes-Benz Research & Development India
- ![Nagarro](https://logo.clearbit.com/nagarro.com) Nagarro
- ![Royal Bank of Scotland](https://logo.clearbit.com.rbs.com) Royal Bank of Scotland

... and many more.

---

## Complexity Analysis
- **Time Complexity**: \(O(N)\) for each test case, where \(N\) is the number of elements in the array. This is because we iterate through each element once.
- **Space Complexity**: \(O(1)\), as we only use a fixed amount of extra space.

---

## Conclusion
This problem requires understanding of arrays and finding the largest and second-largest values with optimal efficiency. The code handles edge cases, including arrays with duplicates and cases where all elements are identical.