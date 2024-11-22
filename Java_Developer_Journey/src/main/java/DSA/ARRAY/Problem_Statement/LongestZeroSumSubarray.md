# Longest Zero Sum Subarray

## **Problem Statement**
Ninja loves playing with numbers. His friend gives him an array of integers (both positive and negative) as a birthday gift. Ninja is now interested in finding the length of the **longest subarray** in the array whose sum equals zero.

---

## **Constraints**
- 1 ≤ T ≤ 10  — Number of test cases  
- 1 ≤ N ≤ 10  — Length of the array  
- −10^5 ≤ arr[i] ≤ 10^5 — Values of the array elements

---

## **Input Format**
1. The first line contains T: the number of test cases.  
2. For each test case:  
   - N: Size of the array  
   - N space-separated integers representing the array.

## **Output Format**
For each test case, output the length of the longest subarray whose sum is zero.

---

## **Sample Input**
```
2
5
1 3 -1 4 -4
4
1 -1 2 -2
```

## **Sample Output**
```
2
4
```

---

## **Explanation**
### Test Case 1:
- Array: `[1, 3, -1, 4, -4]`  
- Subarrays with a sum of zero:
  - `[4, -4]` (Length = 2)  
- **Longest subarray length = 2**

### Test Case 2:
- Array: `[1, -1, 2, -2]`  
- Subarrays with a sum of zero:
  - `[1, -1]` (Length = 2)  
  - `[2, -2]` (Length = 2)  
  - `[1, -1, 2, -2]` (Length = 4)  
- **Longest subarray length = 4**

---

## **Approach**
To solve this problem efficiently, we use the **prefix sum** and a **hash map**. The hash map helps store the first occurrence of each prefix sum, allowing us to calculate subarray lengths in constant time.

### Key Idea:
1. **Prefix Sum**:
   - The sum of elements from index 0 to i.
   - If a prefix sum repeats, the subarray between these occurrences has a sum of zero.
2. **Hash Map**:
   - Keys: Prefix sums
   - Values: First occurrence index of each prefix sum.

### Steps:
1. Compute the **prefix sum** while iterating through the array.
2. If the prefix sum is zero, update the length of the longest subarray to i + 1.
3. If the prefix sum already exists in the hash map:
   - Calculate the length of the subarray from the previous occurrence to the current index.
   - Update the maximum length if necessary.
4. Otherwise, store the prefix sum and its index in the hash map.

---

## **Algorithm**
### Input:
- T: Number of test cases  
- For each test case: N (size of array) and N integers (array elements)

### Output:
- Length of the longest zero-sum subarray for each test case.

### Steps:
1. Initialize a hash map to store prefix sums.
2. Traverse the array:
   - Update the prefix sum for the current element.
   - If prefix sum equals zero, set the longest subarray length to i+1.
   - If prefix sum exists in the hash map:
     - Calculate the subarray length from the last occurrence.
     - Update the maximum length.
   - Otherwise, store the prefix sum and its index.
3. Print the maximum length for each test case.

---

## **Pseudocode**
```
function longestZeroSumSubarray(arr, N):
    prefixSum = 0
    maxLength = 0
    prefixMap = {}

    for i = 0 to N-1:
        prefixSum += arr[i]

        if prefixSum == 0:
            maxLength = i + 1

        if prefixSum in prefixMap:
            maxLength = max(maxLength, i - prefixMap[prefixSum])
        else:
            prefixMap[prefixSum] = i

    return maxLength
```

---

## **Web Diagram**

```plaintext
Input Array: [1, -1, 2, -2]
| Index | Element | Prefix Sum | Hash Map       | Max Length |
|-------|---------|------------|----------------|------------|
|   0   |    1    |     1      | {1: 0}         |      0     |
|   1   |   -1    |     0      | {1: 0}         |      2     |
|   2   |    2    |     2      | {1: 0, 2: 2}   |      2     |
|   3   |   -2    |     0      | {1: 0, 2: 2}   |      4     |
```


## **Time Complexity**
- **Time**: O(N) per test case (due to hash map operations). Total O(T.N).  
- **Space**: O(N) for the hash map.

---

## **Companies Where Asked**
| Company              | Logo                                                             |
|----------------------|------------------------------------------------------------------|
| Amazon               | ![Amazon](https://logo.clearbit.com/amazon.com)                 |
| Adobe                | ![Adobe](https://logo.clearbit.com/adobe.com)                   |
| Delhivery            | ![Delhivery](https://logo.clearbit.com/delhivery.com)           |
| BNY Mellon           | ![BNY Mellon](https://logo.clearbit.com/bnymellon.com)          |
| Morgan Stanley       | ![Morgan Stanley](https://logo.clearbit.com/morganstanley.com)  |
| Genpact              | ![Genpact](https://logo.clearbit.com/genpact.com)               |
| Grab                 | ![Grab](https://logo.clearbit.com/grab.com)                     |
| Accolite             | ![Accolite](https://logo.clearbit.com/accolite.com)             |
| Airtel               | ![Airtel](https://logo.clearbit.com/airtel.in)                  |