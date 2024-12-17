# Minimum Parentheses to Make a String Valid

## Problem Statement

You are given a string `pattern` containing only two types of characters: **`(`** and **`)`**.  
Your task is to determine the **minimum number of parentheses** (either **`(`** or **`)`**) that must be added to make the string valid.

### **Conditions for a Valid String**:
1. Every opening parenthesis **`(`** must have a corresponding closing parenthesis **`)`**.
2. Valid examples:  
   - `(()(()))`
   - `()()()`
   - `((()))`
3. Invalid examples:  
   - `(((`, `(()`, `)(())`

### Constraints:
- 1 ≤ T ≤ 50: Number of test cases.
- 1 ≤ N ≤ 10^4: Length of the string `pattern`.

### Input Format:
- First line: Number of test cases (T).
- Next (T) lines: Each line contains the string (pattern).

### Output Format:
- For each test case, return the **minimum number of parentheses** required to make the string valid.

---

## Sample Input:
```
2
)((()
((
```

## Sample Output:
```
3
2
```

---

## Explanation:

### Test Case 1:
**Input:** `)((()`  
1. At indices 0 and 1, we have unmatched `)`.  
2. At index 2, we have an unmatched `(`.  
3. Indices 3 and 4 are already valid.

To make the string valid:
- Add 1 `(` at the start.
- Add 2 `)` after index 2.

**Output:** `3`

### Test Case 2:
**Input:** `((`  
1. Both `(` are unmatched.  
2. Add 2 `)` to balance.

**Output:** `2`

---

## Approach

### **Concept**
We traverse the string and keep track of:
1. **Unmatched Opening Parentheses (`open`)**: Increment when encountering `(`.
2. **Unmatched Closing Parentheses (`close`)**: Increment when encountering `)` without a matching `(`.

At the end:
- The total parentheses required is (open + close).

---

### Algorithm
1. Initialize two counters:  
   - `open = 0` for unmatched opening parentheses.  
   - `close = 0` for unmatched closing parentheses.

2. For each character in the string:
   - If it’s `(`, increment `open`.
   - If it’s `)`:
     - If `open > 0`, decrement `open` (a `)` matches an existing `(`).
     - Otherwise, increment `close` (this `)` is unmatched).

3. After traversing the string, the total parentheses required are \(open + close\).

4. Repeat for all test cases.

---

### Pseudocode
```
FUNCTION minAddToMakeValid(pattern):
    open = 0
    close = 0

    FOR char IN pattern:
        IF char == '(':
            open += 1
        ELSE IF open > 0:
            open -= 1
        ELSE:
            close += 1

    RETURN open + close

READ T
FOR EACH test case:
    READ pattern
    PRINT minAddToMakeValid(pattern)
```

---

## Web Diagram Explanation

### Key Observations:
- **Starting State:** Begin with `open = 0` and `close = 0`.  
- **When Encountering `(`:** Increment `open`.  
- **When Encountering `)` and `open > 0`:** Decrement `open`.  
- **When Encountering `)` and `open == 0`:** Increment `close`.  

### Diagram
![Web Diagram](https://files.codingninjas.in/screenshot-161-_li-6989.jpg)

- **Red Nodes:** Represent unmatched parentheses.
- **Green Nodes:** Represent valid matches.

---

## Companies Asking This Question

| **Company**                    | **Logo**                                                                                                                                                       |
|--------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Google**                     | ![Google](https://logo.clearbit.com/google.com)                                                                                                                |
| **HSBC**                       | ![HSBC](https://logo.clearbit.com/hsbc.com)                                                                                                                    |
| **Disney + Hotstar**           | ![Hotstar](https://logo.clearbit.com/hotstar.com)                                                                                                              |
| **Infosys**                    | ![Infosys](https://logo.clearbit.com/infosys.com)                                                                                                              |
| **Info Edge India (Naukri.com)** | ![Naukri](https://logo.clearbit.com/naukri.com)                                                                                                              |
| **Microsoft**                  | ![Microsoft](https://logo.clearbit.com/microsoft.com)                                                                                                          |
| **Myntra**                     | ![Myntra](https://logo.clearbit.com/myntra.com)                                                                                                                |
| **Amazon**                     | ![Amazon](https://logo.clearbit.com/amazon.com)                                                                                                                |
| **Norsk Hydro**                | ![Norsk Hydro](https://logo.clearbit.com/hydro.com)                                                                                                            |

---

## Complexity Analysis
### **Time Complexity**:
- O(N)per test case, where (N) is the length of the string.

### **Space Complexity**:
- O(1), as only two counters (`open` and `close`) are used.