
# Check if Array Can Become Non-Decreasing by Modifying At Most One Element

## Problem Statement
You have been given an integer array/list `ARR` of size `N`. Your task is to determine if the array can become non-decreasing by modifying at most one element.

### Definition of Non-Decreasing Array:
An array is considered non-decreasing if `ARR[i] <= ARR[i + 1]` holds for every `i` (0-based) such that `0 <= i <= N - 2`.

### Constraints
- `1 <= T <= 50`
- `1 <= N <= 10^4`
- `-10^9 <= ARR[i] <= 10^9`

Where:
- `T` is the number of test cases.
- `N` is the size of the given array/list.
- `ARR[i]` denotes the i-th element in the array/list `ARR`.

### Time Limit: 
1 second.

### Sample Input
```plaintext
2
3
8 4 6
3
8 4 2
```

### Sample Output
```plaintext
true
false
```

### Explanation
1. **Test Case 1**: The array `[8, 4, 6]` can become non-decreasing by modifying the first element to 4, resulting in `[4, 4, 6]`. Therefore, the output is `true`.
2. **Test Case 2**: The array `[8, 4, 2]` cannot become non-decreasing by modifying only one element, so the output is `false`.

## Approach
1. **Count Violations**: Traverse through the array and identify the positions where `ARR[i] > ARR[i + 1]` (violations of the non-decreasing property). Keep track of the number of violations.
2. **Early Exit**: If there are more than one violation, return `false` since more than one modification is required.
3. **Modify Only One Element**: If exactly one violation is found, attempt to resolve it by modifying `ARR[i]` or `ARR[i + 1]`.
4. **Modification Decision**:
   - If `i == 0` or `ARR[i - 1] <= ARR[i + 1]`, modify `ARR[i]` to match `ARR[i + 1]`.
   - Otherwise, modify `ARR[i + 1]` to match `ARR[i]`.

## Algorithm
1. Initialize `violations` counter to 0.
2. Traverse through the array:
   - For each `i`, check if `ARR[i] > ARR[i + 1]`:
     - Increment `violations`.
     - If `violations > 1`, return `false`.
     - Otherwise, check the neighboring elements to decide which element to modify.
3. If `violations` is 0 or 1 by the end of traversal, return `true`.

## Pseudocode
```
function canBeNonDecreasing(arr):
    violations = 0
    for i from 0 to N-2:
        if arr[i] > arr[i + 1]:
            violations += 1
            if violations > 1:
                return false
            
            if i == 0 or arr[i - 1] <= arr[i + 1]:
                arr[i] = arr[i + 1]
            else:
                arr[i + 1] = arr[i]
    
    return true
```

## Web Diagram
```
                             ┌────────────────────────────┐
                             │       Start                │
                             └──────────────┬─────────────┘
                                            │
                                            │
                                  ┌─────────▼─────────────┐
                                  │ Initialize violations │
                                  │ to 0                 │
                                  └─────────┬─────────────┘
                                            │
                                            │
                                  ┌─────────▼─────────────┐
                                  │ Traverse the array    │
                                  │ (from i = 0 to N-2)   │
                                  └─────────┬─────────────┘
                                            │
                           ┌────────────────▼────────────────┐
                           │ Check if ARR[i] > ARR[i+1]      │
                           └────────────────┬────────────────┘
                                            │ Yes
                                            │
                              ┌─────────────▼───────────────┐
                              │ Increment violations        │
                              │ if violations > 1, return   │
                              │ false                       │
                              └─────────────┬───────────────┘
                                            │
                               ┌────────────▼─────────────┐
                               │ Modify ARR[i] or ARR[i+1]│
                               │ based on neighboring     │
                               │ elements                 │
                               └─────────────┬─────────────┘
                                            │
                                            │
                                  ┌─────────▼──────────────┐
                                  │ After traversal,       │
                                  │ return true            │
                                  └────────────────────────┘
```


## Explanation of Sample Input/Output
- **Sample Input**:
  - Test Case 1: `[8, 4, 6]` becomes non-decreasing by modifying `8` to `4`.
  - Test Case 2: `[8, 4, 2]` cannot be made non-decreasing with just one modification.
- **Sample Output**:
  - Test Case 1: `true`
  - Test Case 2: `false`

---

### Companies Where This Problem is Asked
- ![Microsoft](https://logo.clearbit.com/microsoft.com) Microsoft
- ![American Express](https://logo.clearbit.com/americanexpress.com) American Express
- ![Optum](https://logo.clearbit.com/optum.com) Optum
- ![Infosys](https://logo.clearbit.com/infosys.com) Infosys
- ![Tata 1mg](https://logo.clearbit.com/1mg.com) Tata 1mg
- ![BNY Mellon](https://logo.clearbit.com/bnymellon.com) BNY Mellon
- ![Dell Technologies](https://logo.clearbit.com/dell.com) Dell Technologies
- ![Citi Bank](https://logo.clearbit.com/citi.com) Citi Bank
- ![Accenture](https://logo.clearbit.com/accenture.com) Accenture
- ![ThoughtWorks](https://logo.clearbit.com/thoughtworks.com) ThoughtWorks
- ![Capgemini](https://logo.clearbit.com/capgemini.com) Capgemini
- ![Raja Software Labs](https://logo.clearbit.com/rajasoftwarelabs.com) Raja Software Labs (RSL)
- ![Josh Technology Group](https://logo.clearbit.com/joshtechnologygroup.com) Josh Technology Group
- ![Zoho Corporation](https://logo.clearbit.com/zoho.com) Zoho Corporation
- ![Xoriant](https://logo.clearbit.com/xoriant.com) Xoriant
- ![Nagarro](https://logo.clearbit.com/nagarro.com) Nagarro
