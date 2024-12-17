# Make Binary String Beautiful - Problem Statement

## Problem Description

Ninja has been given a binary string `STR` containing only `'0'` or `'1'`. A binary string is called **beautiful** if it alternates between `0` and `1`. 

**Examples of beautiful strings**:  
`"0101"`, `"1010"`, `"101"`, `"010"`

Ninja wants to convert `STR` into a beautiful string with the **minimum number of operations**. In one operation, Ninja can convert a `'0'` into a `'1'` or vice versa.

### Constraints
- 1 ≤ T ≤ 100
- 2≤∣STR∣≤10^5
- STR[i]∈{′0′,′1′}

---

## Examples

### Input
```
2
0000
1010
```

### Output
```
2
0
```

### Explanation
1. **For `0000`:**  
   - Convert to `"0101"`: Replace the 2nd and 4th characters (`2 operations`).
   - Convert to `"1010"`: Replace the 1st and 3rd characters (`2 operations`).  
   - **Minimum operations required = 2**.

2. **For `1010`:**  
   - The string is already beautiful.  
   - **Operations required = 0**.

---

## Approach

1. **Patterns for a Beautiful String**:
   - Pattern 1: Alternating as `"010101..."`
   - Pattern 2: Alternating as `"101010..."`

2. **Logic**:
   - Count the mismatches for both patterns.
   - Return the **minimum** of the two mismatch counts.

3. **Steps**:
   - For each character, compare it to the expected character for both patterns.
   - Maintain two counters (`opsPattern1`, `opsPattern2`) for the mismatches.
   - Return the smaller counter as the result.

---

## Algorithm

### Steps:
1. Initialize two counters:  
   - `opsPattern1` for mismatches with `"010101..."`.
   - `opsPattern2` for mismatches with `"101010..."`.

2. Traverse the string:
   - If the current index is even:
     - Expected: `'0'` for `opsPattern1`, `'1'` for `opsPattern2`.
   - If the current index is odd:
     - Expected: `'1'` for `opsPattern1`, `'0'` for `opsPattern2`.
   - Compare the character and increment the respective counters if there's a mismatch.

3. Return the minimum of `opsPattern1` and `opsPattern2`.

---

## Pseudocode

```
function minOperationsToMakeBeautiful(str):
    opsPattern1 = 0
    opsPattern2 = 0

    for i from 0 to length(str) - 1:
        if i % 2 == 0:
            if str[i] != '0': opsPattern1++
            if str[i] != '1': opsPattern2++
        else:
            if str[i] != '1': opsPattern1++
            if str[i] != '0': opsPattern2++

    return min(opsPattern1, opsPattern2)
```

---

## Web Diagram

### Explanation of Logic

Here is a simplified web-diagram to visualize the transformation process:

1. **Input String**: `0000`
2. **Two Target Patterns**:  
   - Pattern 1: `"0101"`
   - Pattern 2: `"1010"`

| Step | Current Index | Current Character | Expected (Pattern 1) | Expected (Pattern 2) | Ops for Pattern 1 | Ops for Pattern 2 |
|------|---------------|-------------------|-----------------------|-----------------------|-------------------|-------------------|
| 1    | 0             | `0`               | `0`                   | `1`                   | 0                 | 1                 |
| 2    | 1             | `0`               | `1`                   | `0`                   | 1                 | 1                 |
| 3    | 2             | `0`               | `0`                   | `1`                   | 0                 | 2                 |
| 4    | 3             | `0`               | `1`                   | `0`                   | 1                 | 2                 |

**Result**: Minimum operations = 2.

---

## Company Mentions

| **Company**      | **Logo**                                                                 |
|-------------------|--------------------------------------------------------------------------|
| Microsoft         | ![Microsoft Logo](https://logo.clearbit.com/microsoft.com)              |
| Intuit            | ![Intuit Logo](https://logo.clearbit.com/intuit.com)                    |
| Adobe             | ![Adobe Logo](https://logo.clearbit.com/adobe.com)                      |
| Gojek             | ![Gojek Logo](https://logo.clearbit.com/gojek.com)                      |
| Bank Of America   | ![Bank Of America Logo](https://logo.clearbit.com/bankofamerica.com)    |
| GreenClouds       | ![GreenClouds Logo](https://logo.clearbit.com/greenclouds.com)          |