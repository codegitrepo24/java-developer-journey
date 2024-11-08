
# Equilibrium Index of an Array

## Problem Statement

You are given an array `Arr` consisting of `N` integers. You need to find the **equilibrium index** of the array.

An index is considered an **equilibrium index** if the sum of elements of the array to the left of that index is equal to the sum of elements to the right of it.

### Conditions
1. The array follows **0-based indexing**, so you need to return the **0-based index** of the element.
2. Note that the element at the equilibrium index won’t be considered for either left sum or right sum.
3. If there are multiple indices which satisfy the given condition, return the **left-most index**. That is, if there are indices `i, j, k...` which are equilibrium indices, return the **smallest** among them.
4. If no such index is present in the array, return `-1`.

## Detailed Explanation

### Constraints
- `1 <= T <= 50` (Number of test cases)
- `1 <= N <= 10^5` (Array length)
- `-10^4 <= Arr[i] <= 10^4` (Array elements)
- **Time Limit**: 1 second per test case.

### Sample Input/Output

#### Input 1:
```
1
6
1 7 3 6 5 6
```

#### Output 1:
```
3
```

#### Explanation:
For the array `[1, 7, 3, 6, 5, 6]`, the sum of elements to the left of `arr[3]` (i.e., `1 + 7 + 3 = 11`) is equal to the sum of elements to the right of `arr[3]` (i.e., `5 + 6 = 11`).

Hence, the equilibrium index is `3`.

#### Input 2:
```
2
6
1 2 2 9 3 2
4
1 2 3 4
```

#### Output 2:
```
3
-1
```

#### Explanation:
For the first test case, the sum of elements on the left of index `3` (i.e., `1 + 2 + 2 = 5`) is equal to the sum of elements on the right of index `3` (i.e., `3 + 2 = 5`), so the equilibrium index is `3`.

For the second test case, no equilibrium index exists, so the result is `-1`.

---

## Approach

1. **Initial Considerations**:
   - A brute force solution where we calculate the left and right sums for each index will have a time complexity of `O(N^2)`, which is inefficient for large arrays (up to `10^5` elements).
   
2. **Optimal Solution**:
   - We can use a more efficient approach by maintaining the **total sum** of the array and iterating through it to find the equilibrium index:
     - Calculate the **total sum** of the array.
     - Use two variables: `leftSum` (sum of elements before the current index) and `rightSum` (calculated dynamically by subtracting `leftSum` and the current element from `totalSum`).
     - Compare `leftSum` and `rightSum` for each index.
     - If they are equal, return the index as the equilibrium index.
     - Otherwise, update `leftSum += arr[i]`.
   
3. **Algorithm**:
   1. Calculate the **total sum** of the array.
   2. Initialize `leftSum` as `0`.
   3. Traverse the array:
      - Calculate `rightSum = totalSum - leftSum - arr[i]`.
      - If `leftSum == rightSum`, return the current index as the equilibrium index.
      - Otherwise, update `leftSum += arr[i]`.
   4. If no equilibrium index is found, return `-1`.


## Companies That Have Asked This Question

| Company                            | Logo  |
|------------------------------------|-------|
| Google                             | ![Google Logo](https://logo.clearbit.com/google.com) |
| Accenture                          | ![Accenture Logo](https://logo.clearbit.com/accenture.com) |
| Amazon                             | ![Amazon Logo](https://logo.clearbit.com/amazon.com) |
| Walmart                            | ![Walmart Logo](https://logo.clearbit.com/walmart.com) |
| Adobe                              | ![Adobe Logo](https://logo.clearbit.com/adobe.com) |
| Acko                               | ![Acko Logo](https://logo.clearbit.com/acko.com) |
| Siemens                            | ![Siemens Logo](https://logo.clearbit.com/siemens.com) |
| Gartner                            | ![Gartner Logo](https://logo.clearbit.com/gartner.com) |
| RIVIGO                             | ![RIVIGO Logo](https://logo.clearbit.com/rivigo.com) |
| Expedia Group                      | ![Expedia Group Logo](https://logo.clearbit.com/expediagroup.com) |
| Goldman Sachs                      | ![Goldman Sachs Logo](https://logo.clearbit.com/goldmansachs.com) |
| AdPushup                           | ![AdPushup Logo](https://logo.clearbit.com/adpushup.com) |
| Pegasystems                        | ![Pegasystems Logo](https://logo.clearbit.com/pegasystems.com) |
| UHG                                | ![UHG Logo](https://logo.clearbit.com/uhg.com) |
| Grappus                            | ![Grappus Logo](https://logo.clearbit.com/grappus.com) |
| MAD MAQ Software                   | ![MAD MAQ Logo](https://logo.clearbit.com/madmaq.com) |
| Cargoflash                         | ![Cargoflash Logo](https://logo.clearbit.com/cargoflash.com) |
| NCR Corporation                    | ![NCR Logo](https://logo.clearbit.com/ncr.com) |
| Hashedin                           | ![Hashedin Logo](https://logo.clearbit.com/hashedin.com) |
| Chegg                              | ![Chegg Logo](https://logo.clearbit.com/chegg.com) |
| Coforge                            | ![Coforge Logo](https://logo.clearbit.com/coforge.com) |
| Coinbase                           | ![Coinbase Logo](https://logo.clearbit.com/coinbase.com) |
| AND Ajio                            | ![AND Ajio Logo](https://logo.clearbit.com/ajio.com) |
| Rootstock Software                 | ![Rootstock Logo](https://logo.clearbit.com/rootstock.com) |
| ValueLabs                          | ![ValueLabs Logo](https://logo.clearbit.com/valuelabs.com) |
| Capegemini Consulting India Pvt. Ltd | ![Capgemini Logo](https://logo.clearbit.com/capgemini.com) |
