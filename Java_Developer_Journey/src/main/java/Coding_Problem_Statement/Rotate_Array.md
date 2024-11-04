
# Array Rotation Problem

## Problem Statement  
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.

### Example  
- **Input:**  
  `arr` = [1, 2, 3, 4, 5]  
  `k` = 1  
  **Rotated Array:** [2, 3, 4, 5, 1]  
  **For k = 2:** [3, 4, 5, 1, 2]  
  **For k = 3:** [4, 5, 1, 2, 3]  

### Detailed Explanation  
- **Sample Input 1:**  
  ```
  n = 8  
  arr = [7, 5, 2, 11, 2, 43, 1, 1]  
  k = 2  
  ```
  **Sample Output 1:**  
  ```
  Rotated Array: [2, 11, 2, 43, 1, 1, 7, 5]
  ```

  **Explanation:**  
  - Rotate 1 step: [5, 2, 11, 2, 43, 1, 1, 7]  
  - Rotate 2 steps: [2, 11, 2, 43, 1, 1, 7, 5]  

- **Sample Input 2:**  
  ```
  n = 4  
  arr = [5, 6, 7, 8]  
  k = 3  
  ```
  **Sample Output 2:**  
  ```
  Rotated Array: [8, 5, 6, 7]
  ```

### Constraints
- **1 ≤ n ≤ 10³**  
- **1 ≤ arr[i] ≤ 10⁹**  
- **1 ≤ k < n**  

### Expected Time Complexity  
O(n), where ‘n’ is the size of the input array ‘arr’ and ‘k’ is the number of rotations.

---

## Approach

1. **Handling Rotations:**  
   - If `k > n`, take `k = k % n` to reduce unnecessary rotations.
   - The problem can be solved efficiently by reversing sections of the array.

2. **Rotation in Three Steps:**
   - Reverse the first `k` elements.
   - Reverse the remaining `n - k` elements.
   - Reverse the entire array to get the rotated array.

---

## Algorithm

1. Take input: an integer `n`, the array `arr`, and the rotation count `k`.
2. Adjust `k` using modulo operation: `k = k % n`.
3. Reverse:
   - First `k` elements.
   - Elements from `k` to `n-1`.
   - The entire array.
4. Return the rotated array.

---

## Pseudocode

```plaintext
FUNCTION rotateArray(arr, k)
    n = length(arr)
    k = k % n

    reverse(arr, 0, k - 1)
    reverse(arr, k, n - 1)
    reverse(arr, 0, n - 1)

    RETURN arr

FUNCTION reverse(arr, start, end)
    WHILE start < end
        SWAP arr[start] WITH arr[end]
        INCREMENT start
        DECREMENT end
```

---

## Web Diagram

```mermaid
graph TD
A[Start] --> B[Input Array 'arr' and Integer 'k']
B --> C[Calculate Effective Rotations: k % n]
C --> D[Reverse First k Elements]
D --> E[Reverse Remaining Elements from k to n-1]
E --> F[Reverse the Entire Array]
F --> G[Return Rotated Array]
```

---

## Companies Where This Question Is Asked

| Company                         | Logo |
|---------------------------------|------|
| Wells Fargo                     | ![Wells Fargo](https://logo.clearbit.com/wellsfargo.com) |
| LinkedIn                        | ![LinkedIn](https://logo.clearbit.com/linkedin.com) |
| Arcesium                        | ![Arcesium](https://logo.clearbit.com/arcesium.com) |
| Deutsche Bank                   | ![Deutsche Bank](https://logo.clearbit.com/db.com) |
| Salesforce                      | ![Salesforce](https://logo.clearbit.com/salesforce.com) |
| Infosys                         | ![Infosys](https://logo.clearbit.com/infosys.com) |
| Microsoft                       | ![Microsoft](https://logo.clearbit.com/microsoft.com) |
| Tata Consultancy Services (TCS) | ![TCS](https://logo.clearbit.com/tcs.com) |
| Wipro                           | ![Wipro](https://logo.clearbit.com/wipro.com) |
| Paytm                           | ![Paytm](https://logo.clearbit.com/paytm.com) |
| Cognizant                       | ![Cognizant](https://logo.clearbit.com/cognizant.com) |
| Accolite                        | ![Accolite](https://logo.clearbit.com/accolite.com) |
| Deloitte                        | ![Deloitte](https://logo.clearbit.com/deloitte.com) |
| Zoho Corporation                | ![Zoho](https://logo.clearbit.com/zoho.com) |
| Tesla                           | ![Tesla](https://logo.clearbit.com/tesla.com) |
| KPMG                            | ![KPMG](https://logo.clearbit.com/kpmg.com) |
| Virtusa                         | ![Virtusa](https://logo.clearbit.com/virtusa.com) |

---

## Hints

1. For an index `i`, determine where it will move after `k` rotations.
2. Observe how the positions of elements change after each rotation. Use three-step reversal for optimal performance.
```

