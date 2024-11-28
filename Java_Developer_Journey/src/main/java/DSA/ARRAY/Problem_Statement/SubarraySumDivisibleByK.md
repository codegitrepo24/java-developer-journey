# Subarray Sum Divisible by K

## Problem Statement
You are given an array `ARR` and an integer `K`. The task is to count all subarrays whose sum is divisible by \( K \). If no such subarray exists, return 0.

---

### Example
**Input:**  
`ARR` = [5, 0, 2, 3, 1], \( K = 5 \)

**Output:**  
6 subarrays have sums divisible by 5:  
- [5]  
- [0]  
- [5, 0]  
- [2, 3]  
- [5, 0, 2, 3]  
- [0, 2, 3]  

---

## Approach

The problem can be solved efficiently using the **prefix sum technique** and modular arithmetic:
1. Maintain a cumulative sum (`prefixSum`) to compute the sum of subarrays efficiently.
2. Use a **hash map** to store remainders when the cumulative sum is divided by \( K \).
   - If a remainder has been seen before, it implies that subarrays exist between those indices with sums divisible by \( K \).
3. Adjust for negative remainders by converting them into equivalent positive remainders (e.g., \( -3 \mod 5 = 2 \)).

---

## Algorithm

1. **Initialization:**
   - Create a hash map `remainderFreq` initialized with `{0: 1}` to handle subarrays starting from the beginning.
   - Initialize `prefixSum = 0` and `count = 0`.

2. **Iterate through the array:**
   - Add the current element to `prefixSum`.
   - Calculate `remainder = prefixSum % K`.
   - Adjust the remainder for negative values.
   - Add the frequency of this remainder from the hash map to `count` (indicates subarrays with sums divisible by \( K \)).
   - Update the hash map with the new remainder frequency.

3. **Return `count` at the end.**

---

## Pseudocode

```plaintext
Function countSubarrays(ARR, K):
    Initialize remainderFreq = {0: 1}
    Initialize prefixSum = 0, count = 0

    For num in ARR:
        prefixSum += num
        remainder = prefixSum % K
        If remainder < 0:
            remainder += K
        
        count += remainderFreq.get(remainder, 0)
        remainderFreq[remainder] = remainderFreq.get(remainder, 0) + 1

    Return count
```

---

## Example Walkthrough
### **ARR** = [5, 0, 2, 3, 1], \( K = 5 \)
| Index | Element | Prefix Sum | Remainder | Updated Map            | Count |
|-------|---------|------------|-----------|------------------------|-------|
| 0     | 5       | 5          | 0         | {0: 2}                | 1     |
| 1     | 0       | 5          | 0         | {0: 3}                | 3     |
| 2     | 2       | 7          | 2         | {0: 3, 2: 1}          | 3     |
| 3     | 3       | 10         | 0         | {0: 4, 2: 1}          | 6     |
| 4     | 1       | 11         | 1         | {0: 4, 2: 1, 1: 1}    | 6     |

---

## Diagram

![Subarray Sum Divisible by K](https://files.codingninjas.in/screenshot-93-6465.png)

---

## Complexity

- **Time Complexity:** \( O(N) \)  
  Each element is processed once, and hash map operations (insert and lookup) take \( O(1) \).

- **Space Complexity:** \( O(K) \)  
  The hash map stores at most \( K \) unique remainders.

---

## Sample Input and Output

### Input:
```
2
3 2
2 3 1
4 1
1 2 3 4
```

### Output:
```
3
10
```

### Explanation:
**Test Case 1:**  
- Subarrays divisible by \( K = 2 \): [2], [3, 1], [2, 3, 1]. Total = 3.

**Test Case 2:**  
- Since \( K = 1 \), all subarrays are valid. Total = 10.

---

## Companies Asking This Question

| **Company**               | **Logo**                                                                 |
|----------------------------|--------------------------------------------------------------------------|
| Microsoft                 | ![Microsoft](https://logo.clearbit.com/microsoft.com)                   |
| Snapdeal                  | ![Snapdeal](https://logo.clearbit.com/snapdeal.com)                     |
| Protium                   | ![Protium](https://logo.clearbit.com/protium.co.in)                     |
| Intuit                    | ![Intuit](https://logo.clearbit.com/intuit.com)                         |
| Dunzo                     | ![Dunzo](https://logo.clearbit.com/dunzo.com)                           |
| Directi                   | ![Directi](https://logo.clearbit.com/directi.com)                       |
| Flipkart                  | ![Flipkart](https://logo.clearbit.com/flipkart.com)                     |
| Arcesium                  | ![Arcesium](https://logo.clearbit.com/arcesium.com)                     |
| Cisco                     | ![Cisco](https://logo.clearbit.com/cisco.com)                          |
| Adobe                     | ![Adobe](https://logo.clearbit.com/adobe.com)                          |
| JP Morgan                 | ![JP Morgan](https://logo.clearbit.com/jpmorgan.com)                   |
| Netlink                   | ![Netlink](https://logo.clearbit.com/netlink.com)                      |
| Techwave Consulting       | ![Techwave](https://logo.clearbit.com/techwave.com)                     |
| Swajal Water Pvt. Ltd.    | ![Swajal Water](https://logo.clearbit.com/swajal.com)                   |
| Mindtree                  | ![Mindtree](https://logo.clearbit.com/mindtree.com)                     |
| InMobi                    | ![InMobi](https://logo.clearbit.com/inmobi.com)                        |
| Ajio                      | ![Ajio](https://logo.clearbit.com/ajio.com)                            |
| Nagarro Software          | ![Nagarro](https://logo.clearbit.com/nagarro.com)                      |
| Sprinklr                  | ![Sprinklr](https://logo.clearbit.com/sprinklr.com)                    |
| Clearwater Analytics      | ![Clearwater Analytics](https://logo.clearbit.com/clearwateranalytics.com) |
| DealShare                 | ![DealShare](https://logo.clearbit.com/dealshare.in)                   |