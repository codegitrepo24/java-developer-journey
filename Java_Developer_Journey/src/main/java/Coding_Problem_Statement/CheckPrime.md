# Check Prime Number

## Problem Statement  
A **prime number** is a positive integer divisible by exactly **two integers**, 1 and the number itself.

Given a number `'n'`, determine whether it is a **prime number** or not.

---

## Example  
### Input:  
```
n = 5
```

### Output:  
```
YES
```

### Explanation:  
5 is only divisible by 1 and 5. The numbers 2, 3, and 4 do not divide 5.

---

## Detailed Explanation  

### Input/Output Format:  
1. **Input:** A single positive integer `n`  
2. **Output:** "YES" if the number is prime, otherwise "NO"  

### Sample Input/Output:  
#### **Sample Input 1:**  
```
5
```
**Sample Output 1:**  
```
YES
```

**Explanation:**  
5 is divisible by only 1 and 5, so it is a **prime** number.

#### **Sample Input 2:**  
```
6
```
**Sample Output 2:**  
```
NO
```

**Explanation:**  
6 is divisible by 1, 2, 3, and 6. Hence, it is **not a prime** number, but a **composite** number (a number with more than two factors).

#### **Sample Input 3:**  
```
1
```
**Sample Output 3:**  
```
NO
```

**Explanation:**  
1 is divisible only by itself. It does not meet the condition for being a prime number (which requires exactly two divisors).  
Note: **1 is neither a prime nor a composite number**.

---

## Constraints  
- 1 ≤ n ≤ 10^9  
- **Time limit:** 1 second  

---

## Expected Time Complexity  
- **O(√n)**  
Instead of checking all numbers from 1 to `n-1`, we only need to check divisibility up to **√n** to determine if `n` is prime.

---

## Approach  

1. **Edge Case:**  
   - If `n` is 1, return "NO" since 1 is not a prime number.

2. **Efficient Divisibility Check:**  
   - For a given `n`, if any number from **2 to √n** divides it, then `n` is **not prime**.  
   - If no divisor is found in that range, `n` is **prime**.

---

## Algorithm  

1. If `n` is 1, print "NO" and exit.
2. Loop from **2 to √n**:
   - If `n` is divisible by the current number, print "NO" and exit.
3. If no divisor is found, print "YES".

---

## Pseudocode  

```plaintext
FUNCTION isPrime(n):
    IF n == 1:
        PRINT "NO"
        RETURN

    FOR i FROM 2 TO √n:
        IF n % i == 0:
            PRINT "NO"
            RETURN

    PRINT "YES"
```

---
