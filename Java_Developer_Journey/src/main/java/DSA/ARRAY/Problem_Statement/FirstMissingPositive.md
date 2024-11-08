# First Missing Positive Integer Problem

## Problem Statement

You are given an integer array `ARR` of length `N`. The task is to find the first missing positive integer in linear time and constant space. In other words, find the smallest positive integer that does not exist in the array. The array can contain negative numbers as well.

**Example:**  
For an input array `[3, 4, -1, 1]`, the output should be `2`, because `2` is the smallest positive integer missing from the input array.

## Input/Output

### Input:
1. **T** (Integer): The number of test cases.
2. **N** (Integer): The size of the array for each test case.
3. **ARR** (Array of Integers): The list of integers.

### Output:
For each test case, output the smallest missing positive integer.

### Example

#### Sample Input 1:
```
1
5
3 2 -6 1 0
```

#### Sample Output 1:
```
4
```

#### Explanation:
The numbers `1`, `2`, and `3` are present in the array. The first missing positive integer is `4`.

---

## Approach

The problem requires finding the first missing positive integer in `O(n)` time and `O(1)` space. Here's a breakdown of the approach used:

1. **Checking for the Presence of `1`:**  
   - If `1` is missing in the array, the smallest positive integer missing is `1` itself. We check for this by iterating through the array.
   
2. **Replacing Invalid Values:**  
   - Any number less than `1` or greater than `N` is irrelevant to the result since the smallest missing positive integer has to be between `1` and `N+1`. These irrelevant numbers are replaced with `1`.
   
3. **Marking Elements as Visited:**  
   - For each number in the array, the value at the index corresponding to this number (considering it as `index = value - 1`) is marked as negative. This helps track which numbers between `1` and `N` are present without using extra space.
   
4. **Finding the First Missing Positive:**  
   - After marking, the first index that contains a positive value indicates that the number `index + 1` is missing. If no positive index is found, the answer is `N + 1`.

## Algorithm

1. Initialize `contains1` to `false`.
2. Traverse the array:
   - If `1` is found, set `contains1 = true`.
   - Replace all numbers ≤ `0` or > `N` with `1`.
3. If `contains1` is `false`, return `1`.
4. Traverse the array again:
   - For each element, mark the element at the corresponding index (if positive) as negative.
5. Traverse the array to find the first positive index, which gives the smallest missing positive integer.
6. If all indices are negative, return `N + 1`.


## Diagram to Explain the Logic

```plaintext
Original Array: [3, 2, -6, 1, 0]
1. Replace invalid values with 1 → [3, 2, 1, 1, 1]
2. Mark presence (index - 1) as negative → [-3, -2, -1, 1, 1]
3. Find the first positive index (index + 1) → Missing Positive = 4
```

## Companies That Asked This Question

| Logo | Company |
|------|---------|
| ![Google](https://logo.clearbit.com/google.com) | Google |
| ![Amazon](https://logo.clearbit.com/amazon.com) | Amazon |
| ![Microsoft](https://logo.clearbit.com/microsoft.com) | Microsoft |
| ![Infosys](https://logo.clearbit.com/infosys.com) | Infosys |
| ![Salesforce](https://logo.clearbit.com/salesforce.com) | Salesforce |
| ![Qualcomm](https://logo.clearbit.com/qualcomm.com) | Qualcomm |
| ![Barclays](https://logo.clearbit.com/barclays.com) | Barclays |
| ![Hike](https://logo.clearbit.com/hike.in) | Hike |
| ![Morgan Stanley](https://logo.clearbit.com/morganstanley.com) | Morgan Stanley |
| ![Walmart](https://logo.clearbit.com/walmart.com) | Walmart |
| ![Oracle](https://logo.clearbit.com/oracle.com) | Oracle |
| ![Dunzo](https://logo.clearbit.com/dunzo.com) | Dunzo |
| ![SAP Labs](https://logo.clearbit.com/sap.com) | SAP Labs |
| ![VMware](https://logo.clearbit.com/vmware.com) | VMware |
| ![Tiger Analytics](https://logo.clearbit.com/tigeranalytics.com) | Tiger Analytics |
| ![Josh Technology Group](https://logo.clearbit.com/joshtechnologygroup.com) | Josh Technology Group |
| ![PolicyBazaar](https://logo.clearbit.com/policybazaar.com) | PolicyBazaar |
| ![Reliance Jio](https://logo.clearbit.com/jio.com) | Reliance Jio |
| ![Capgemini](https://logo.clearbit.com/capgemini.com) | Capgemini |
| ![D.E. Shaw](https://logo.clearbit.com/deshaw.com) | D.E. Shaw |
| ![Mindtree](https://logo.clearbit.com/mindtree.com) | Mindtree |
| ![ADP India](https://logo.clearbit.com/adp.com) | ADP India |
