
# Minimum Elements to Remove to Make Array Distinct

## Problem Statement

You are given an array `ARR` of size `N`. You need to determine the minimum number of elements that need to be removed such that the array contains all distinct elements. Specifically, there should be no two indices `I` and `J` where `I != J` and `ARR[I] == ARR[J]`.

### Example:

For `N = 4`,  
`ARR = {1, 2, 1, 2}`  
The answer is `2` because the elements `1` and `2` are repeated once each. Therefore, we need to remove 2 elements to make the array distinct.

### Constraints:

- `1 <= T <= 10`
- `1 <= N <= 5000`
- `0 <= ARR[i] <= 10^6`
- Time Limit: 1 second

### Input/Output Format

**Input:**

- First, the number of test cases `T`.
- For each test case:
  - The size of the array `N`.
  - The array `ARR` of size `N`.

**Output:**

- For each test case, output the minimum number of elements that need to be removed to make the array contain distinct elements.

---

## Approach

To solve this problem, we can use a **HashSet** to track unique elements in the array. The process involves the following steps:

1. **Insert elements into a HashSet**: A `HashSet` only allows unique elements. As you iterate over the array, insert each element into the `HashSet`. 
   
2. **Count Duplicates**: If an element is already in the set, it is a duplicate and needs to be removed. The number of elements that need to be removed will be the difference between the size of the original array and the size of the `HashSet` after processing all elements.

3. **Output the result**: For each test case, the result will be the number of elements in the original array that were duplicates (i.e., the difference between the original size and the set size).

### Algorithm:
1. Initialize a `HashSet`.
2. Iterate through the array and add each element to the `HashSet`.
3. The minimum number of elements to remove is the difference between the length of the original array and the size of the `HashSet`.

### Web-Diagram:

```plaintext
   +----------------------+
   |    Input Array       |
   |    ARR = {1, 2, 1, 2}|
   +----------------------+
             |
    +--------+--------+
    |                 |
+--------+       +--------+
| Add to Set |     | Duplicate |
| (Unique)  |     | Detected  |
+--------+       +--------+
             |
   +----------------------+
   |   HashSet = {1, 2}   |
   +----------------------+
             |
    +--------+--------+
    |                 |
+-------------------+ 
|   Output = 2      |
+-------------------+
```

---

## Sample Input/Output

**Sample Input 1:**

```
2
4
1 2 1 2
5
3 6 7 12 13
```

**Sample Output 1:**

```
2
0
```

**Explanation:**
- In the first test case, the array has repeated elements: `1` and `2`. Therefore, 2 elements need to be removed to make the array distinct.
- In the second test case, all elements are unique, so no removal is needed.

**Sample Input 2:**

```
2
4
1 1 1 1
5
1 2 3 1 2
```

**Sample Output 2:**

```
3
2
```

---

## Companies Where This Question is Asked

| Company | Logo |
|---------|------|
| Infosys | ![Infosys](https://logo.clearbit.com/infosys.com) |
| Codenation | ![Codenation](https://logo.clearbit.com/codenation.io) |
| Nagaaro | ![Nagaaro](https://logo.clearbit.com/nagaaro.com) |
| Google  | ![Google](https://logo.clearbit.com/google.com) |
| Accenture | ![Accenture](https://logo.clearbit.com/accenture.com) |
| Amazon  | ![Amazon](https://logo.clearbit.com/amazon.com) |
| Walmart | ![Walmart](https://logo.clearbit.com/walmart.com) |
| Adobe   | ![Adobe](https://logo.clearbit.com/adobe.com) |
| Acko    | ![Acko](https://logo.clearbit.com/acko.com) |
| Siemens | ![Siemens](https://logo.clearbit.com/siemens.com) |
| Gartner | ![Gartner](https://logo.clearbit.com/gartner.com) |
| RIVIGO  | ![RIVIGO](https://logo.clearbit.com/rivigo.com) |
| Expedia Group | ![Expedia Group](https://logo.clearbit.com/expediagroup.com) |
| Goldman Sachs | ![Goldman Sachs](https://logo.clearbit.com/goldmansachs.com) |
| AdPushup | ![AdPushup](https://logo.clearbit.com/adpushup.com) |
| Pegasystems | ![Pegasystems](https://logo.clearbit.com/pegasystems.com) |
| UHG     | ![UHG](https://logo.clearbit.com/uhg.com) |
| Grappus | ![Grappus](https://logo.clearbit.com/grappus.com) |
| MAD MAQ Software | ![MAD MAQ Software](https://logo.clearbit.com/madmaq.com) |
| Cargoflash | ![Cargoflash](https://logo.clearbit.com/cargoflash.com) |
| NCR Corporation | ![NCR Corporation](https://logo.clearbit.com/ncr.com) |
| Hashedin | ![Hashedin](https://logo.clearbit.com/hashedin.com) |
| Chegg   | ![Chegg](https://logo.clearbit.com/chegg.com) |
| Coforge | ![Coforge](https://logo.clearbit.com/coforge.com) |
| Coinbase | ![Coinbase](https://logo.clearbit.com/coinbase.com) |
| AND Ajio | ![AND Ajio](https://logo.clearbit.com/ajio.com) |
| Rootstock Software | ![Rootstock Software](https://logo.clearbit.com/rootstock.com) |
| ValueLabs | ![ValueLabs](https://logo.clearbit.com/valuelabs.com) |
| Capgemini Consulting India | ![Capgemini](https://logo.clearbit.com/capgemini.com) |


