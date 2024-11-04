# Move Zeros to End of Array

---

## **Problem Statement**

Given an array `arr` of `n` non-negative integers, your task is to **move all the zeros to the end** of the array while **keeping the non-zero elements at the start** of the array in their original order. Return the modified array.

---

### **Example:**

#### **Input:**  
```
n = 6  
arr = [1, 2, 0, 0, 2, 3]  
```
#### **Output:**  
```
[1, 2, 2, 3, 0, 0]  
```

#### **Explanation:**  
The non-zero elements `[1, 2, 2, 3]` retain their original order, and all the `0`s are moved to the end of the array.

---

### **Input/Output Format**

- **Input:**  
  - The first line contains an integer `n` representing the size of the array.
  - The second line contains `n` space-separated integers representing the elements of the array.

- **Output:**  
  - Print the modified array with all the `0`s moved to the end.

---

### **Constraints:**

- 1 ≤ n ≤ 10^6  
- 0 ≤ arr[i] ≤ 10^9  
- Time limit: 1 sec

---

### **Sample Inputs and Outputs**

#### **Sample Input 1:**  
```
4  
0 0 0 1  
```

#### **Sample Output 1:**  
```
1 0 0 0  
```

#### **Explanation:**  
We move all the zeros to the end, and the non-zero elements `[1]` retain their order.

#### **Sample Input 2:**  
```
5  
4 0 3 2 5  
```

#### **Sample Output 2:**  
```
4 3 2 5 0  
```

---

## **Approach**

1. **Two Pointer Approach:**  
   - Use two pointers to traverse the array.
   - One pointer (`i`) tracks the position to place the next non-zero element.
   - The second pointer (`j`) traverses the entire array to find non-zero elements.

2. **In-place Operation:**  
   - Move all non-zero elements to the front of the array.
   - Fill the remaining positions with zeros.

3. **Time Complexity:**  
   - O(n) for traversing the array twice (once for non-zero elements and once for filling zeros).

4. **Space Complexity:**  
   - O(1) since the operation is performed in-place without using extra space.

---

## **Algorithm**

1. Initialize two pointers `i = 0` and `j = 0`.
2. Traverse the array with pointer `j`:
   - If `arr[j]` is non-zero, assign `arr[i] = arr[j]` and increment `i`.
3. After the first traversal, fill the remaining positions (from `i` to `n-1`) with zeros.
4. Return the modified array.

---

## **Pseudocode**

```text
function moveZeros(n, arr):
    i = 0  // Pointer to track the position to place non-zero elements

    // First pass: Move all non-zero elements to the front
    for j = 0 to n-1:
        if arr[j] != 0:
            arr[i] = arr[j]
            i = i + 1

    // Second pass: Fill the remaining positions with zeros
    while i < n:
        arr[i] = 0
        i = i + 1

    return arr
```

---

## **Web Diagram**

```mermaid
flowchart TD
    A[Start] --> B[Initialize i = 0]
    B --> C[Traverse the array with j from 0 to n-1]
    C --> D{Is arr[j] != 0?}
    D -- Yes --> E[Place arr[j] at arr[i]]
    E --> F[Increment i]
    F --> C
    D -- No --> C
    C --> G[Fill remaining positions from i to n-1 with 0s]
    G --> H[Return the modified array]
    H --> I[End]
```

---

## **Explanation of the Web Diagram**

1. **Initialization:** We start by setting `i = 0` to keep track of the position where the next non-zero element should be placed.
2. **Traversal:** We use a `for` loop to traverse the array with index `j`.
3. **Non-Zero Check:** If the current element is non-zero, it is placed at the `i`-th position, and we increment `i`.
4. **Filling Zeros:** After the traversal, any remaining positions are filled with zeros.
5. **End:** The modified array is returned.

---

## **Companies Where This Problem Is Asked**

Below are some companies that have asked similar questions in coding interviews:

- **Amazon**  
- **Microsoft**  
- **Google**  
- **Facebook**  
- **Apple**  
- **Paytm**  
- **Tata Consultancy Services (TCS)**  
- **Accenture**  
- **Infosys**  
- **Wipro**  
- **JP Morgan**  
- **Deloitte**  

These questions assess problem-solving skills, in-place array manipulation techniques, and time complexity optimization.