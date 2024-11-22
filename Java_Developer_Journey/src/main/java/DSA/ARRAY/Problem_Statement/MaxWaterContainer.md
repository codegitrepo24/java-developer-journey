# Maximum Water Container Problem

## **Problem Statement**
Given a sequence of `N` non-negative integers `A[1], A[2], ..., A[i], ..., A[N]` where each integer represents the height of a vertical line drawn at position `i` on the x-axis. Find two lines such that, together with the x-axis, they form a container that holds the maximum area of water.

### **Key Points**
- The container height is determined by the shorter of the two lines.
- The width is the horizontal distance between the two lines.
- The goal is to maximize the area, calculated as:
  Area=(Width)×(Minimum height of the two lines)

## **Constraints**
- 1 <= T <= 50 (Number of test cases)
- 0 <= N <= 10^4 (Number of integers in the array)
-  1 <= A[i] <= 10^5 (Height of lines)

---

## **Input/Output**

### **Input Format**
1. T: Number of test cases
2. For each test case:
   - N: Number of integers
   - Array A[]: Heights of the lines

### **Output Format**
For each test case, output the maximum area.

---

## **Example**

### Input:
```
2
5
4 3 2 1 4
3
1 2 1
```

### Output:
```
16
2
```

### Explanation:
#### **Test Case 1**
- Heights: `[4, 3, 2, 1, 4]`
- Maximum area is achieved using the first and last lines:  
  Area = (5−1) × min(4,4) = 16
  

#### **Test Case 2**
- Heights: `[1, 2, 1]`
- Maximum area is achieved using the first and third lines:  
  Area = (3−1) × min(1,1) = 2
---

## **Approach**
We use a two-pointer approach to efficiently compute the maximum area.

1. **Initialize Two Pointers**:
   - `left` at the start of the array.
   - `right` at the end of the array.
2. **Calculate Area**:
   - Compute the area using the height of the shorter line and the distance between the two pointers.
   - Update the maximum area if the current area is greater.
3. **Move Pointers**:
   - Move the pointer corresponding to the shorter line inward to potentially find a taller line.
4. **Repeat**:
   - Continue until the two pointers meet.

---

## **Algorithm**
1. Initialize `maxArea` to 0.
2. Place `left` at the start and `right` at the end of the array.
3. While `left < right`:
   - Calculate the area:

     Area= (right−left) × min(A[left],A[right])

   - Update `maxArea` if the current area is larger.
   - Move `left` or `right` inward based on the smaller height.
4. Return `maxArea`.

---

## **Pseudocode**
```plaintext
function maxArea(heights):
    left = 0
    right = length(heights) - 1
    maxArea = 0
    
    while left < right:
        width = right - left
        height = min(heights[left], heights[right])
        maxArea = max(maxArea, width * height)
        
        if heights[left] < heights[right]:
            left += 1
        else:
            right -= 1
    
    return maxArea
```

---

## **Diagram**
Below is the visualization of the problem using the [image](https://files.codingninjas.in/water-5805.jpg):

![Water Container](https://files.codingninjas.in/water-5805.jpg)

- **Red Lines**: Represent the two lines forming the container with the maximum area.
- **Height**: Determined by the shorter line.
- **Width**: Distance between the two lines.

---

## **Companies Where This Question is Asked**

| **Company**                | **Logo**                                      |
|----------------------------|-----------------------------------------------|
| Flipkart                   | ![Flipkart](https://logo.clearbit.com/flipkart.com) |
| Amazon                     | ![Amazon](https://logo.clearbit.com/amazon.com) |
| SAP Labs                   | ![SAP Labs](https://logo.clearbit.com/sap.com) |
| Protium                    | ![Protium](https://logo.clearbit.com/protium.co.in) |
| Oracle                     | ![Oracle](https://logo.clearbit.com/oracle.com) |
| Goldman Sachs              | ![Goldman Sachs](https://logo.clearbit.com/goldmansachs.com) |
| BNY Mellon                 | ![BNY Mellon](https://logo.clearbit.com/bnymellon.com) |
| PhonePe                    | ![PhonePe](https://logo.clearbit.com/phonepe.com) |
| Adobe                      | ![Adobe](https://logo.clearbit.com/adobe.com) |
| Cognizant                  | ![Cognizant](https://logo.clearbit.com/cognizant.com) |
| Paytm (One97 Communications)| ![Paytm](https://logo.clearbit.com/paytm.com) |
| Directi                    | ![Directi](https://logo.clearbit.com/directi.com) |
| Microsoft                  | ![Microsoft](https://logo.clearbit.com/microsoft.com) |
| Dunzo                      | ![Dunzo](https://logo.clearbit.com/dunzo.com) |
| Expedia Group              | ![Expedia](https://logo.clearbit.com/expedia.com) |
| Google                     | ![Google](https://logo.clearbit.com/google.com) |
| Samsung                    | ![Samsung](https://logo.clearbit.com/samsung.com) |
| Twilio                     | ![Twilio](https://logo.clearbit.com/twilio.com) |
| Hashedin                   | ![Hashedin](https://logo.clearbit.com/hashedin.com) |
| Lemnisk                    | ![Lemnisk](https://logo.clearbit.com/lemnisk.co) |
| Gainsight                  | ![Gainsight](https://logo.clearbit.com/gainsight.com) |
| Quinstreet Software        | ![Quinstreet](https://logo.clearbit.com/quinstreet.com) |

---
