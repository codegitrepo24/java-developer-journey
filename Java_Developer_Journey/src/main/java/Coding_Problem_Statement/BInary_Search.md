# **Binary Search in Sorted Array**  

## **Problem Statement**  
You are given an integer array `A` of size `N`, sorted in **non-decreasing order**. You are also given an integer `target`. Your task is to write a function to search for the `target` in the array `A`. If it exists, return its **index** in **0-based indexing**. If the `target` is not present in the array, return `-1`.  

### **Note**:  
- Your algorithm must have **O(log N)** time complexity.  

---

## **Constraints**  
- 1 ≤ N ≤ 10<sup>5</sup>  
- 1 ≤ A[i] ≤ 10<sup>9</sup>  
- 1 ≤ target ≤ 10<sup>9</sup>  
- **Time Limit**: 1 second  

---

## **Sample Input/Output**  

### **Sample Input 1**  
```
7  
1 3 7 9 11 12 45  
3  
```

### **Sample Output 1**  
```
1
```

**Explanation**:  
The array is `[1, 3, 7, 9, 11, 12, 45]`.  
The index of element `3` is `1`. Hence, the answer is `1`.  

### **Sample Input 2**  
```
7  
1 2 3 4 5 6 7  
9  
```

### **Sample Output 2**  
```
-1
```

**Explanation**:  
The array is `[1, 2, 3, 4, 5, 6, 7]`.  
Since `9` is not present in the array, the answer is `-1`.  

---

## **Approach**  

The problem requires us to search for an element in a **sorted array**. The optimal way to do this is by using **Binary Search**, which ensures **O(log N)** time complexity. Binary search works by repeatedly dividing the search interval in half until the target element is found or the interval is empty.  

---

## **Algorithm**  
1. **Initialize** two pointers: `start` at the beginning of the array and `end` at the last index.  
2. **Calculate** the `mid` index:  
   - `mid = (start + end) / 2`.  
3. **Check** the element at `mid`:
   - If `A[mid] == target`, return `mid` (the index of the target element).  
   - If `A[mid] > target`, move the `end` pointer to `mid - 1` (search in the left half).  
   - If `A[mid] < target`, move the `start` pointer to `mid + 1` (search in the right half).  
4. **Repeat** steps 2–3 until `start` is greater than `end`.  
5. If the element is not found, return `-1`.  

---

## **Pseudocode**  

```
function binarySearch(arr, n, target):
    start = 0
    end = n - 1
    
    while start <= end:
        mid = (start + end) / 2
        
        if arr[mid] == target:
            return mid  // Target found
        
        else if arr[mid] > target:
            end = mid - 1  // Search in left half
        
        else:
            start = mid + 1  // Search in right half
    
    return -1  // Target not found
```

---

## **Companies That Ask This Question**  
This question is frequently asked in coding interviews for software development roles at the following companies:  

| Company | Logo |
|---------|------|
| Oracle | ![Oracle](https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Oracle_logo.svg/2560px-Oracle_logo.svg.png) |
| Infosys | ![Infosys](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Infosys_logo.svg/2560px-Infosys_logo.svg.png) |
| Paytm | ![Paytm](https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Paytm_logo.svg/2560px-Paytm_logo.svg.png) |
| Media.net | ![Media.net](https://media.net/static/imgs/logos/logo_dark.svg) |
| Adobe | ![Adobe](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Adobe_Corporate_Logo.png/800px-Adobe_Corporate_Logo.png) |
| Accenture | ![Accenture](https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Accenture_logo.svg/2560px-Accenture_logo.svg.png) |
| Celeb-AI | ![Celeb-AI](https://celeb-ai.com/static/media/logo.ce3410d7.svg) |
| Consleague | ![Consleague](https://www.consleague.com/assets/img/logo/logo-dark.png) |
| MAQ Software | ![MAQ Software](https://www.maqsoftware.com/images/maq-logo.svg) |
| Josh Technology Group | ![Josh Technology](https://www.joshtechnologygroup.com/images/logo.svg) |
| Kempston | ![Kempston](https://www.kempstoncontrols.co.uk/images/logo_kempston.svg) |
| Nosh Technologies | ![Nosh Technologies](https://nosh.tech/images/logo.svg) |
| EPAM Systems | ![EPAM](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/EPAM_logo.svg/2560px-EPAM_logo.svg.png) |
| Touch Computing Technologies Pvt. | ![Touch Computing](https://touchcomputingtech.com/images/logo-light.png) |
| Carbynetech | ![Carbynetech](https://carbynetech.com/images/logo.png) |
| HyreSnap | ![HyreSnap](https://www.hyresnap.com/images/logo.svg) |

---

## **Time Complexity**  
- **Time Complexity**: O(log N), where N is the size of the input array.  
- **Space Complexity**: O(1) (constant space).  

---

This solution efficiently finds the target in a **sorted array** using the **binary search algorithm**.