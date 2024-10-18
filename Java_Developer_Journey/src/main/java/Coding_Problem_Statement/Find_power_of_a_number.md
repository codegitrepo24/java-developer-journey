## **Find power of a number (x^n)**  

---

### **Problem Statement:**  
Write a program to calculate \(x^n\) (x raised to the power n). Take both `x` and `n` as input from the user and print the result.  

**Note:**  
- Assume that \(0^0 = 1\) for this question.  

---

### **Input Format:**  
- A single integer `x` (the base).  
- A single integer `n` (the exponent).  

---

### **Output Format:**  
- Print the value of \(x^n\).  

---

### **Constraints:**  
- 0 <= x <= 8 
- 0 <= n <= 9 

---

### **Sample Input 1:**  
```
3 4
```

### **Sample Output 1:**  
```
81
```

**Explanation:**  
\(3^4 = 3 \times 3 \times 3 \times 3 = 81\)  

---

### **Sample Input 2:**  
```
2 5
```

### **Sample Output 2:**  
```
32
```

**Explanation:**  
\(2^5 = 2 \times 2 \times 2 \times 2 \times 2 = 32\)  

---

### **Approach:**  
1. **Input Handling:**  
   - Read two integers from the user: the base `x` and the exponent `n`.  

2. **Power Calculation Logic:**  
   - If the exponent `n` is 0, directly print **1** (as \(x^0 = 1\)).  
   - If `n` is greater than 0, initialize a variable `power` with the value of `x`.  
   - Use a loop to multiply `power` by `x` for `(n - 1)` times.  

3. **Output:**  
   - Print the final result.  

---

### **Algorithm:**  
1. **Take input** for the base `x` and exponent `n`.  
2. **Check if `n` is 0**:  
   - If yes, print `1`.  
3. **If `n` is greater than 0**:  
   - Initialize `power` with the value of `x`.  
   - **For** each iteration from `1` to `(n - 1)`:  
     - Multiply `power` by `x` and update `power`.  
4. **Print** the final value of `power`.  

---

### **Pseudocode:**  
```
Input x, n
If n == 0:
    Print 1
Else:
    power = x
    For i = 1 to n - 1:
        power = power * x
    Print power
```

---

### **Time Complexity:**  
- **O(n)**: The loop runs `(n - 1)` times, where `n` is the exponent.  

---

This algorithm effectively handles edge cases (like \(0^0\)) and uses **iteration** to calculate the power for small input sizes, adhering to the problem constraints.