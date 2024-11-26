# Subsequence Check in Java

## Problem Statement
You are given two strings `STR1` and `STR2`.  
Your task is to determine if `STR1` is a subsequence of `STR2`.

### Definitions
- **Subsequence**: A new string derived from another string by deleting some (or no) characters without changing the relative order of the remaining characters.
  
### Examples:
- `'ACE'` is a subsequence of `'ABCDE'` (delete `'B'` and `'D'`).
- `'ADB'` is **not** a subsequence of `'ABCDE'` because the relative order of `'B'` and `'D'` differs.

### Constraints
1. Both strings contain only uppercase English letters.
2. `1 <= T <= 50`  
3. `1 <= N, M <= 10^4`  
   Where `N` and `M` are the lengths of `STR1` and `STR2`.

### Input Format
1. Number of test cases: `T`.
2. For each test case:
   - `STR1`
   - `STR2`

### Output Format
- Print `True` if `STR1` is a subsequence of `STR2`.
- Print `False` otherwise.

---

## Approach

### Key Idea
Use two pointers to iterate over both strings. The subsequence check boils down to matching characters in `STR1` with those in `STR2` while preserving order.

### Steps
1. Validate that both strings consist of uppercase English letters.
2. Use two pointers:
   - `i` for `STR1`
   - `j` for `STR2`
3. Traverse `STR2`:
   - If `STR1[i] == STR2[j]`, move the pointer `i`.
   - Always move the pointer `j`.
4. If `i` reaches the end of `STR1`, then `STR1` is a subsequence of `STR2`.

### Algorithm
1. Initialize pointers `i = 0` and `j = 0`.
2. Loop through `STR2` until `i == len(STR1)` or `j == len(STR2)`:
   - If `STR1[i] == STR2[j]`, increment `i`.
   - Increment `j`.
3. After the loop, check if `i == len(STR1)`. If true, print `True`, else print `False`.

---

## Pseudocode

```text
function isSubsequence(STR1, STR2):
    if not (STR1 and STR2 are uppercase): 
        return "Invalid Input"

    i = 0, j = 0
    while i < len(STR1) and j < len(STR2):
        if STR1[i] == STR2[j]:
            i += 1
        j += 1

    return i == len(STR1)
```

---

## Diagram

### Subsequence Matching

![Subsequence Diagram](https://files.codingninjas.in/screenshot-37-5844.png)  

Explanation:
1. Match characters from `STR1` (`AE`) with `STR2` (`BADE`).
2. Preserve the order of characters.

---

## Advantages of this Approach
1. **Efficient**: Linear time complexity `O(M)` for each test case.
2. **Memory-Friendly**: No additional space for data structures.
3. **Scalable**: Handles large input sizes due to its simplicity.

---

## Example Test Cases

### Input:
```
2
AE
BADE
AB
AC
```

### Output:
```
True
False
```

### Explanation:
1. Test Case 1: `'AE'` is a subsequence of `'BADE'`.
2. Test Case 2: `'AB'` is not a subsequence of `'AC'`.

---

## Companies Asking This Question

| Company                          | Logo                                                                                  |
|----------------------------------|---------------------------------------------------------------------------------------|
| **Paytm (One97 Communications)** | ![Paytm Logo](https://logo.clearbit.com/paytm.com)                                    |
| **Quadrical AI**                 | ![Quadrical AI Logo](https://logo.clearbit.com/quadrical.ai)                          |
| **Josh Technology Group**        | ![Josh Technology Group Logo](https://logo.clearbit.com/joshtechnologygroup.com)      |
| **Unthinkable Solutions**        | ![Unthinkable Solutions Logo](https://logo.clearbit.com/unthinkablesolutions.com)     |
| **Zoho Corporation**             | ![Zoho Logo](https://logo.clearbit.com/zoho.com)                                      |
| **Rootstock Software**           | ![Rootstock Software Logo](https://logo.clearbit.com/rootstock.com)                  |


