# Reverse String Word-Wise

## Problem Statement
Reverse the given string word-wise. The last word in the given string should come at the 1st place, the last-second word at the 2nd place, and so on. Individual words should remain as they are.

---

## Constraints
- 0 <= |S| <= 10^5 , where |S| represents the length of the string S.

---

## Sample Input and Output

### Input 1
```text
Welcome to Coding Ninjas
```

### Output 1
```text
Ninjas Coding to Welcome
```

### Input 2
```text
Always indent your code
```

### Output 2
```text
code your indent Always
```

---

## Approach
To reverse the string word-wise:
1. **Trim Leading/Trailing Spaces**: Ensure no unnecessary spaces interfere.
2. **Split the String**: Break the input into words based on spaces.
3. **Reverse the Words**: Traverse the split words in reverse order.
4. **Rebuild the Output**: Concatenate the words into a single reversed string with spaces.

---

## Algorithm

1. **Input Handling**:
   - Read the string.
   - Remove leading and trailing spaces using `trim()`.

2. **Split Words**:
   - Use `split("\\s+")` to handle multiple spaces effectively.

3. **Reverse and Join**:
   - Traverse the word array from the last index to the first.
   - Append each word to a `StringBuilder`.
   - Add spaces as needed.

4. **Return Result**:
   - Convert `StringBuilder` to a string.

---

## Pseudocode
```plaintext
function reverseWords(String str):
    str = str.trim()
    words = str.split("\\s+")
    reversedString = new StringBuilder()

    for i = length(words) - 1 to 0:
        reversedString.append(words[i])
        if i > 0:
            reversedString.append(" ")

    return reversedString.toString()
```

---

**Steps in the Diagram:**
1. **Split the Input**: `"Welcome to Coding Ninjas"` becomes `["Welcome", "to", "Coding", "Ninjas"]`.
2. **Reverse Traverse**: Iterate through the list from last to first.
3. **Concatenate in Order**: `["Ninjas", "Coding", "to", "Welcome"]`.
4. **Result**: `"Ninjas Coding to Welcome"`.

---

## Companies Asking This Question
| Company                          | Logo                                                                                 |
|----------------------------------|-------------------------------------------------------------------------------------|
| Tata Consultancy Services (TCS) | ![TCS Logo](https://logo.clearbit.com/tcs.com)                                       |
| Amazon                          | ![Amazon Logo](https://logo.clearbit.com/amazon.com)                                 |
| Innovaccer                      | ![Innovaccer Logo](https://logo.clearbit.com/innovaccer.com)                         |
| Barclays                        | ![Barclays Logo](https://logo.clearbit.com/home.barclays)                            |
| Info Edge India                 | ![Info Edge Logo](https://logo.clearbit.com/naukri.com)                              |
| Xiaomi                          | ![Xiaomi Logo](https://logo.clearbit.com/xiaomi.com)                                 |
| Virtusa                         | ![Virtusa Logo](https://logo.clearbit.com/virtusa.com)                               |
| Nagarro Software                | ![Nagarro Logo](https://logo.clearbit.com/nagarro.com)                               |
| Boston Consulting Group (BCG)   | ![BCG Logo](https://logo.clearbit.com/bcg.com)                                      |
| Mindtree                        | ![Mindtree Logo](https://logo.clearbit.com/mindtree.com)                             |

--- 

## Time Complexity
1. **Split**: O(n), where n is the length of the string.
2. **Traversal**: O(k), where k is the number of words.
3. **Concatenation**:O(k).

**Overall**: O(n).

---

## Space Complexity
1. **Words Array**: O(k) , where (k) is the number of words.
2. **StringBuilder**: O(n).

**Overall**: O(n).