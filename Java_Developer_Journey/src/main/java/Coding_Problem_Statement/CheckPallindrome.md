# Palindrome String Checker – Problem Statement

## **Problem Statement**
You are given a string `S`. Your task is to **check whether the string is a palindrome** or not. For checking palindrome, **only consider alphabets and numbers**, ignoring any special symbols, spaces, and punctuation. The string comparison should be **case-insensitive**. 

### **Note:** 
- Convert all uppercase letters to lowercase for comparison.
- Ignore non-alphanumeric characters (such as `&`, `@`, spaces, etc.).

---

## **Example**
Let `S = "c1 O$d@eeD o1c"`  
After removing special characters and spaces, and converting all uppercase letters to lowercase, the string becomes:  
`"c1odeedo1c"`  
Since this transformed string is a **palindrome**, the output will be **"Yes"**.

---

## **Input/Output Format**
### **Input:**
1. First line contains an integer `T`, the number of test cases.  
2. For the next `T` lines, each line contains a string `S` which needs to be checked for palindrome properties.

### **Output:**
- For each test case, print `"Yes"` if the string is a palindrome; otherwise, print `"No"`.

---

## **Constraints**
- `1 <= T <= 100`
- `1 <= Length(S) <= 10^4`  
- **Time Limit:** 1 second per test case

---

## **Sample Input/Output**

### **Sample Input 1:**
```
2
N2 i&nJA?a& jnI2n
A1b22Ba
```

### **Sample Output 1:**
```
Yes
No
```

### **Explanation 1:**
1. For the first string `"N2 i&nJA?a& jnI2n"`, after removing special characters and spaces, and converting to lowercase:  
   `"n2injaajni2n"`. This is a **palindrome**, so the output is `"Yes"`.

2. For the second string `"A1b22Ba"`, after similar transformations:  
   `"a1b22ba"`. This is **not a palindrome**, so the output is `"No"`.

### **Sample Input 2:**
```
3
codingninjassajNiNgNidoc
5?36@6?35
aaBBa@
```

### **Sample Output 2:**
```
Yes
Yes
No
```

---

## **Approach**

1. **Remove non-alphanumeric characters** from the given string.  
2. **Convert all characters to lowercase** to ensure the comparison is case-insensitive.  
3. Use **two pointers** to compare the characters:
   - One pointer starts from the **beginning** of the cleaned string.
   - Another pointer starts from the **end**.
4. If both characters match, **move the pointers inward**. If any mismatch occurs, the string is **not a palindrome**.
5. If the pointers meet or cross each other without any mismatch, the string is a **palindrome**.

---

## **Algorithm**

1. **Input** the number of test cases `T`.
2. For each test case:
   - **Read the input string `S`.**
   - **Remove non-alphanumeric characters** from `S`.
   - **Convert all characters to lowercase**.
   - Initialize two pointers: 
     - `left = 0` (start of the string).
     - `right = length(S) - 1` (end of the string).
   - While `left < right`:
     - If `S[left]` is not equal to `S[right]`, print `"No"` and break.
     - Else, move `left++` and `right--`.
   - If all characters match, print `"Yes"`.

---

## **Pseudocode**

```
Input: T (number of test cases)
For each test case:
    Input: S (input string)
    
    Cleaned_S = Remove all non-alphanumeric characters from S
    Cleaned_S = Convert all characters of Cleaned_S to lowercase
    
    left = 0
    right = length(Cleaned_S) - 1
    
    while left < right:
        if Cleaned_S[left] != Cleaned_S[right]:
            Print "No"
            break
        left = left + 1
        right = right - 1
    
    if left >= right:
        Print "Yes"
```

---

## **Web Diagram**  
Below is a simple flow diagram to understand the logic:

```
                Start
                   |
      --------------------------------
      |                              |
  Read input T                  Loop over T test cases
                                 (For each string S)
                                      |
                          Remove non-alphanumeric characters
                          Convert to lowercase
                                      |
                  Initialize two pointers: left = 0, right = n-1
                                      |
                         Are S[left] and S[right] equal?
                          /                         \
                    Yes                              No
                     |                                |
     Move left++ and right--                   Print "No"
                     |
               Pointers crossed?
              /            \
           Yes              No
            |                |
     Print "Yes"         Continue loop
```

---

## **Summary**

This solution efficiently checks if a given string is a palindrome by:
- **Cleaning the input string** to remove irrelevant characters.
- Using **two-pointer technique** to compare characters from both ends.
- **Case-insensitive comparison** ensures accurate results.

---

## **Time Complexity**

- **Cleaning the string:** `O(n)` where `n` is the length of the string.
- **Comparing characters:** `O(n/2)` in the worst case.  
Hence, the overall time complexity per test case is **O(n)**.

This ensures that the solution is **optimal** for large inputs up to the constraint limit.