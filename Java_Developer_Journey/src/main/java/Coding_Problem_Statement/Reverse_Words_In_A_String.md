
# **Reverse Words in a String - Problem Statement**  

## **Problem Statement**  
You are given a string `str` of length `N`. Your task is to **reverse the original string word by word**.  

- **Output Requirements:**
  1. Only **one space** should exist between two words.
  2. There should be **no leading or trailing spaces** in the output.
  3. **Multiple spaces** between words in the input should be **ignored**.

---

### **Example:**

**Input 1:**  
`"Welcome to Coding Ninjas"`  
**Output 1:**  
`"Ninjas Coding to Welcome"`

**Explanation:**  
The words in the string are reversed, with **no extra spaces** between them and **no leading/trailing spaces**.

---

### **Constraints**:
- `0 <= N <= 10^5`  
- **Time Limit:** 1 second  

---

## **Optimized Approach**  

To efficiently reverse the words, we need to handle **spaces properly** and **reverse only the words** (not individual characters).  

---

### **Algorithm**

1. **Trim** leading or trailing spaces.
2. **Split** the input by one or more spaces to get the words.
3. **Reverse** the list of words.
4. **Join** them with a **single space** between each word.
5. **Return** the result.

---

## **Pseudocode**  

``` 
function reverseWords(str):
    # Step 1: Remove leading/trailing spaces
    str = str.trim()

    # Step 2: Split by spaces
    words = str.split("\\s+")

    # Step 3: Reverse the list
    reversedWords = reverse(words)

    # Step 4: Join with single space
    result = join(reversedWords, " ")

    return result
```

---

## **Web Diagram**

```plaintext
                       Start
                          |
                 Input string 'str'
                          |
         Trim leading/trailing spaces (if any)
                          |
              Split by multiple spaces ("\\s+")
                          |
               Reverse the list of words
                          |
            Join with single space between words
                          |
               Print the reversed string
                          |
                        End
```

---

## **Time and Space Complexity**

- **Time Complexity:** O(N)  
  - Splitting and joining take linear time.  
- **Space Complexity:** O(N)  
  - Can be optimized to **O(1)** with in-place reversal if the language supports it.

---

## **Sample Input and Output**  

**Sample Input 1:**  
```
Welcome to Coding Ninjas
```

**Sample Output 1:**  
```
Ninjas Coding to Welcome
```

**Sample Input 2:**  
```
  I   am   a star   
```

**Sample Output 2:**  
```
star a am I
```

---

## **Companies Where This Problem Was Asked**

Here is the list of companies that have asked similar **string manipulation problems** in interviews:

1. **IndiaMart**  
   ![IndiaMart](https://logo.clearbit.com/indiamart.com)  
2. **Tata Consultancy Services (TCS)**  
   ![TCS](https://logo.clearbit.com/tcs.com)  
3. **Optum**  
   ![Optum](https://logo.clearbit.com/optum.com)  
4. **Cognizant**  
   ![Cognizant](https://logo.clearbit.com/cognizant.com)  
5. **Facebook (Meta)**  
   ![Meta](https://logo.clearbit.com/meta.com)  
6. **Paytm (One97 Communications)**  
   ![Paytm](https://logo.clearbit.com/paytm.com)  
7. **Amazon**  
   ![Amazon](https://logo.clearbit.com/amazon.com)  
8. **HCL Technologies**  
   ![HCL](https://logo.clearbit.com/hcltech.com)  
9. **Microsoft**  
   ![Microsoft](https://logo.clearbit.com/microsoft.com)  
10. **Salesforce**  
   ![Salesforce](https://logo.clearbit.com/salesforce.com)  
11. **Cisco**  
   ![Cisco](https://logo.clearbit.com/cisco.com)  
12. **Accenture**  
   ![Accenture](https://logo.clearbit.com/accenture.com)  
13. **Oracle**  
   ![Oracle](https://logo.clearbit.com/oracle.com)  
14. **Acko**  
   ![Acko](https://logo.clearbit.com/acko.com)  
15. **JP Morgan**  
   ![JP Morgan](https://logo.clearbit.com/jpmorgan.com)  
16. **Unacademy**  
   ![Unacademy](https://logo.clearbit.com/unacademy.com)  
17. **Infosys**  
   ![Infosys](https://logo.clearbit.com/infosys.com)  
18. **Tech Mahindra**  
   ![Tech Mahindra](https://logo.clearbit.com/techmahindra.com)  
19. **Wipro**  
   ![Wipro](https://logo.clearbit.com/wipro.com)  
20. **Deloitte**  
   ![Deloitte](https://logo.clearbit.com/deloitte.com)  
21. **Teradata**  
   ![Teradata](https://logo.clearbit.com/teradata.com)  
22. **IBM**  
   ![IBM](https://logo.clearbit.com/ibm.com)  
23. **RedBus**  
   ![RedBus](https://logo.clearbit.com/redbus.in)  
24. **Airtel**  
   ![Airtel](https://logo.clearbit.com/airtel.in)  
25. **BYJUS**  
   ![BYJUS](https://logo.clearbit.com/byjus.com)  

---

## **Conclusion**  

This solution provides an **efficient approach** to handle string reversal, managing spaces correctly and working within **linear time**. This problem is commonly asked in interviews across **various companies** as listed above, making it important to master **string manipulation and optimization techniques**.

