## Fahrenheit to Celsius Conversion Table  

### Problem Statement:
Given three values:  
- **Start Fahrenheit Value (S)**  
- **End Fahrenheit Value (E)**  
- **Step Size (W)**  

You need to convert all Fahrenheit values from `S` to `E` (inclusive) at the interval of `W` into their corresponding Celsius values and print the table.  

### **Note:**
- Print the **floor value** of the Celsius conversion if it is non-negative.
- Print the **ceil value** if the Celsius value is negative.  

---

### **Formula for Conversion:**
\[
C = \frac{(F - 32) \times 5}{9}
\]
Where:
- **F** is the temperature in Fahrenheit.
- **C** is the corresponding temperature in Celsius.  

---

### **Input Format:**
1. A single integer `S` (Start Fahrenheit Value).  
2. A single integer `E` (End Fahrenheit Value).  
3. A single integer `W` (Step Size).  

### **Output Format:**
- For each temperature in the range `[S, E]` with a step size of `W`, print the Fahrenheit and Celsius values as:  
  ```
  <Fahrenheit Value> <tab> <Celsius Value>
  ```

---

### **Constraints:**
 - 0 <= S <= 80
 - S <= E <=  900
 - 0 <= W <= 40  

---

### **Sample Input 1:**
```
0
100
20
```

### **Sample Output 1:**
```
0   -17
20  -6
40  4
60  15
80  26
100 37
```

---

### **Sample Input 2:**
```
20
119
13
```

### **Sample Output 2:**
```
20  -6
33  0
46  7
59  15
72  22
85  29
98  36
111 43
```

---

### **Explanation for Sample Input 2:**
- Start from 20°F (the given start value).  
- For each step size of 13°F, compute the corresponding Celsius value and print the pair.  
- Continue until you reach or exceed the end value, 119°F in this case.  

---

### **Approach:**
1. **Iterate** from `S` to `E` (inclusive) with an increment of `W` in each step.
2. **Convert** each Fahrenheit value to Celsius using the formula:
   \[
   C = \frac{(F - 32) \times 5}{9}
   \]
3. **Floor or Ceil** the Celsius value:
   - Use **floor** if the Celsius value is non-negative.
   - Use **ceil** if the Celsius value is negative.
4. **Print** each Fahrenheit-Celsius pair with a tab space in between.

---

### **Time Complexity:**
- **O((E - S) / W)**: The loop runs approximately `(E - S) / W` times.  

---

This problem tests your understanding of **loops**, **arithmetic operations**, and **conditional formatting** in Java.