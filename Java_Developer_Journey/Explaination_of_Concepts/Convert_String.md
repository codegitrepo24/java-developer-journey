# Convert First Alphabet of Each Word to Uppercase

## Problem Statement  
You are given a string `STR`. Your task is to convert the **first letter of each word** in the given string to **uppercase**.

### **Example**:  
If the input string is:  
```
I am a student of the third year
```
The transformed string will be:  
```
I Am A Student Of The Third Year
```

### **Note**:
- `STR` will contain **only spaces and alphabets** (both uppercase and lowercase).
- The words are separated by **a single space**.
  
---

## Constraints  
- **1 <= T <= 10** (Number of test cases)  
- **1 <= |STR| <= 10^5** (Length of the input string)  
- **Time Limit:** 1 second  

---

## Input/Output Format  

### **Input:**
- First line: An integer `T` (number of test cases).  
- For each test case: A string `STR`.  

### **Output:**  
- For each test case, print the transformed string where the first letter of each word is converted to uppercase.

---

## Sample Input/Output  

**Sample Input 1:**
```
3
I love programming
they are playing cricket
good to see you
```

**Sample Output 1:**
```
I Love Programming
They Are Playing Cricket
Good To See You
```

**Explanation for Sample Input 1:**
1. **First test case:** `"I love programming"` becomes `"I Love Programming"`.  
2. **Second test case:** `"they are playing cricket"` becomes `"They Are Playing Cricket"`.  
3. **Third test case:** `"good to see you"` becomes `"Good To See You"`.

---

**Sample Input 2:**
```
3
why you are confused
Its a good day to be here
go and do your work
```

**Sample Output 2:**
```
Why You Are Confused
Its A Good Day To Be Here
Go And Do Your Work
```

---

## Approach  

1. **Trim** any leading or trailing spaces from the input string to handle extra spaces.  
2. **Split** the string by spaces to get each word in an array.  
3. **Iterate** over the words, and for each word:
   - Convert the **first letter** to uppercase.
   - Append the **remaining part** of the word as it is.  
4. **Join** the transformed words back into a string using spaces as the delimiter.  
5. **Repeat** the above process for every test case.

---

## Algorithm  

1. **Read the input value for T** (number of test cases).  
2. **For each test case**:  
   a. Read the input string `STR`.  
   b. Split the string into an **array of words** using `" "` (space) as the delimiter.  
   c. For each word in the array:
      - Convert the first character to **uppercase**.
      - Concatenate it with the **remaining characters** of the word.  
   d. Join the modified words back into a **single string** with spaces separating them.  
   e. Print the result.  

---

## Time Complexity  
- **Splitting the string:** `O(n)`, where `n` is the length of the string.
- **Iterating over words and transforming:** `O(n)` in total.
- **Joining words back into a string:** `O(n)`.

Thus, the **overall time complexity** for each test case is **O(n)**.

---

This approach ensures that the program handles **multiple test cases** efficiently, even for **large input sizes**, as each operation on the string is performed in **linear time**.