# Pair Sum Problem

## Problem Statement
You are given an array/list `ARR` consisting of `N` distinct integers arranged in ascending order. You are also given an integer `TARGET`. Your task is to count all the distinct pairs in `ARR` such that their sum is equal to `TARGET`.

**Note:**
1. Pair `(x, y)` and Pair `(y, x)` are considered the same pair.
2. If there exists no such pair with a sum equal to `TARGET`, return `-1`.

### Example:
- Input:
    ```
    ARR = [1, 2, 3]
    TARGET = 4
    ```
- Output:
    ```
    Number of pairs: 1 (Pair: (1, 3))
    ```

### Constraints:
- 1 ≤ `T` ≤ 100
- 2 ≤ `N` ≤ 5000
- 1 ≤ `ARR[i]`, `TARGET` ≤ 10^5

## Sample Input and Output

**Sample Input 1:**
```
2
5 6
1 2 3 4 5
6 7
1 2 3 4 5 6
```

**Sample Output 1:**
```
2
3
```

**Sample Input 2:**
```
2
4 10
1 3 5 6
5 12
1 3 6 9 11
```

**Sample Output 2:**
```
-1
2
```

### Explanation:
- In the first test case, there are two pairs with a sum equal to `TARGET` (6): `(1, 5)` and `(2, 4)`.
- In the second test case, three pairs have a sum equal to `TARGET` (7): `(1, 6)`, `(2, 5)`, and `(3, 4)`.

---

## Approach
We use the **two-pointer technique** to find pairs that sum up to the `TARGET`. The array is sorted, so we can start with two pointers at both ends of the array and move them towards each other until they meet.

### Steps:
1. Sort the array (if not already sorted).
2. Initialize two pointers:
    - `i` at the start of the array (`i = 0`)
    - `j` at the end of the array (`j = n - 1`)
3. Calculate the sum of elements at the two pointers:
    - If `arr[i] + arr[j]` equals `TARGET`, count the pair, increment `i`, and decrement `j`.
    - If the sum is less than `TARGET`, increment `i`.
    - If the sum is greater than `TARGET`, decrement `j`.
4. Continue until `i < j`.
5. Return the count of pairs or `-1` if no pairs are found.

### Algorithm
```java
public static int pairSum(int[] arr, int target) {
    Arrays.sort(arr);  // Sort the array if not already sorted
    int i = 0, j = arr.length - 1, count = 0;

    // Two-pointer approach
    while (i < j) {
        int sum = arr[i] + arr[j];
        if (sum == target) {
            count++;
            i++;
            j--;
        } else if (sum < target) {
            i++;
        } else {
            j--;
        }
    }
    return count == 0 ? -1 : count;
}
```

### Pseudocode
```
1. Sort the array (if not sorted)
2. Initialize count = 0, i = 0, j = n - 1
3. WHILE i < j DO
     a. IF arr[i] + arr[j] == target THEN
            count++
            i++
            j--
     b. ELSE IF arr[i] + arr[j] < target THEN
            i++
     c. ELSE
            j--
   END WHILE
4. IF count == 0 THEN
        RETURN -1
   ELSE
        RETURN count
```

---

## Diagram

```
Array: [1, 2, 3, 4, 5], Target: 6

      i              j
     arr[i] + arr[j] = 1 + 5 = 6 --> Count = 1, Move i right and j left

         i        j
     arr[i] + arr[j] = 2 + 4 = 6 --> Count = 2, Move i right and j left

             i  j
     i >= j --> End

Final Count = 2 pairs
```

---

## Companies that Ask this Problem

| Company              | Logo                                       |
|----------------------|--------------------------------------------|
| Adobe                | ![Adobe](https://logo.clearbit.com/adobe.com) |
| Goldman Sachs        | ![Goldman Sachs](https://logo.clearbit.com/goldmansachs.com) |
| Facebook             | ![Facebook](https://logo.clearbit.com/facebook.com) |
| Quikr                | ![Quikr](https://logo.clearbit.com/quikr.com) |
| Unacademy            | ![Unacademy](https://logo.clearbit.com/unacademy.com) |
| MakeMyTrip           | ![MakeMyTrip](https://logo.clearbit.com/makemytrip.com) |
| EX Squared Solutions | ![EX Squared Solutions](https://logo.clearbit.com/exsquared.com) |
| Deloitte             | ![Deloitte](https://logo.clearbit.com/deloitte.com) |
| Nesh                 | ![Nesh](https://logo.clearbit.com/nesh.tech) |
| Nosh Technologies    | ![Nosh Technologies](https://logo.clearbit.com/noshtechnologies.com) |
| CodeQuotient         | ![CodeQuotient](https://logo.clearbit.com/codequotient.com) |
| MAQ Software         | ![MAQ Software](https://logo.clearbit.com/maqsoftware.com) |
| Turing               | ![Turing](https://logo.clearbit.com/turing.com) |
| HashedIn             | ![HashedIn](https://logo.clearbit.com/hashedin.com) |
| Nagarro              | ![Nagarro](https://logo.clearbit.com/nagarro.com) |

