## Run-Length Encoding Problem Statement

### Problem Statement
You have been given a text message, and your task is to return the **Run-Length Encoding** of the given message.

**Run-length encoding** is a simple and fast method of compressing strings by representing repeated successive characters as the character followed by its count.  
For example:  
Input: `"aaaabbbccdaa"`  
Output: `"a4b3c2d1a2"`

### Input Format
- The first line contains an integer (T) — the number of test cases.
- For each test case, there is a single line containing a string (N), the message to encode.

### Output Format
- For each test case, output the Run-Length Encoded string.

### Constraints
- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 100,000
- where 𝑁 is the length of the message string

### Time Limit
- **1 second**

---

### Sample Input 1
```
3
aabbc
abcd
abbdcaas
```

### Sample Output 1
```
a2b2c1
a1b1c1d1
a1b2d1c1a2s1
```

#### Explanation:
1. Test Case 1: The string `"aabbc"` has:
   - 2 consecutive `a`s
   - 2 consecutive `b`s
   - 1 `c`  
   Output: `"a2b2c1"`

2. Test Case 2: The string `"abcd"` has:
   - 1 `a`, 1 `b`, 1 `c`, and 1 `d`  
   Output: `"a1b1c1d1"`

3. Test Case 3: The string `"abbdcaas"` has:
   - 1 `a`, 2 `b`s, 1 `d`, 1 `c`, 2 `a`s, and 1 `s`  
   Output: `"a1b2d1c1a2s1"`

---

### Companies Where This Question Was Asked

| Company                        | Logo                                                                                  |
|--------------------------------|---------------------------------------------------------------------------------------|
| **Microsoft**                  | ![Microsoft Logo](https://upload.wikimedia.org/wikipedia/commons/4/44/Microsoft_logo.svg) |
| **Amazon**                     | ![Amazon Logo](https://upload.wikimedia.org/wikipedia/commons/a/a9/Amazon_logo.svg)      |
| **Walmart**                    | ![Walmart Logo](https://upload.wikimedia.org/wikipedia/commons/0/06/Walmart_logo.svg)    |
| **Tata Consultancy Services**  | ![TCS Logo](https://upload.wikimedia.org/wikipedia/en/6/6d/Tata_Consultancy_Services_Logo.svg) |
| **Expedia Group**              | ![Expedia Group Logo](https://upload.wikimedia.org/wikipedia/commons/e/e3/Expedia_logo.svg) |
| **Morgan Stanley**             | ![Morgan Stanley Logo](https://upload.wikimedia.org/wikipedia/commons/3/34/Morgan_Stanley_Logo.svg) |
| **Cognizant**                  | ![Cognizant Logo](https://upload.wikimedia.org/wikipedia/commons/3/36/Cognizant%27s_logo.svg) |
| **Google**                     | ![Google Logo](https://upload.wikimedia.org/wikipedia/commons/2/2f/Google_2015_logo.svg) |
| **Delhivery**                  | ![Delhivery Logo](https://upload.wikimedia.org/wikipedia/commons/8/8c/Delhivery_logo.svg) |
| **Grob Grab**                  | *(Logo not available)*                                                                |
| **Chegg**                      | ![Chegg Logo](https://upload.wikimedia.org/wikipedia/commons/d/d5/Chegg_logo.svg)        |
| **Mahindra Comviva**           | ![Mahindra Comviva Logo](https://upload.wikimedia.org/wikipedia/commons/4/4d/Mahindra_Comviva_logo.svg) |

---

### Notes:
- The algorithm efficiently processes strings with a time complexity of O(N) for each test case.
- This problem is frequently asked in coding interviews to test string manipulation and optimization skills.