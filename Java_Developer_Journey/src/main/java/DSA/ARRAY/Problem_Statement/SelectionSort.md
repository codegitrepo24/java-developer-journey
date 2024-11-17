# Selection Sort Algorithm - Problem Statement and Explanation

## Problem Statement

Selection sort is a sorting algorithm that works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning of the unsorted region of the array. The algorithm is simple and works by selecting the smallest element from the unsorted section and swapping it with the first unsorted element. This process is repeated for all elements in the array.

### Input Format:
- The first line contains the number of test cases, \( T \).
- For each test case:
  - The first line contains the integer \( N \) — the size of the array.
  - The second line contains \( N \) non-negative integers, which are the elements of the array.

### Output Format:
- For each test case, output the sorted array in non-decreasing order.

### Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Arr[i] <= 1000

### Example 1:

**Input:**
```
1
5
6 2 8 4 10
```

**Output:**
```
2 4 6 8 10
```

**Explanation:**
1. Initially, the unsorted array is: [6, 2, 8, 4, 10].
2. Find the minimum element (2) and swap it with the first element: [2, 6, 8, 4, 10].
3. Find the minimum element (4) in the remaining unsorted array and swap it with the second element: [2, 4, 8, 6, 10].
4. Continue this process until the array is fully sorted.

### Example 2:

**Input:**
```
2
2
1 2
4
4 3 2 1
```

**Output:**
```
1 2
1 2 3 4
```

---

## Approach

### Selection Sort Explanation:
Selection Sort is an in-place sorting algorithm that works by iteratively selecting the smallest (or largest, depending on sorting order) element from the unsorted portion of the array and moving it to the correct sorted position.

### Steps:
1. **Find the Minimum**: Traverse the array from the current position to the end and find the minimum element.
2. **Swap**: Swap the minimum element found with the current element at the position.
3. **Repeat**: Move to the next position in the array and repeat until the array is fully sorted.

The algorithm is simple and intuitive but has a time complexity of \(O(N^2)\), which makes it inefficient for large datasets compared to more advanced algorithms like QuickSort or MergeSort.

### Time Complexity:
- **Worst Case**: \(O(N^2)\), where \(N\) is the number of elements in the array.
- **Best Case**: \(O(N^2)\) because we still have to go through all elements to find the minimum.
- **Space Complexity**: \(O(1)\), as the sorting is done in-place with no extra space required.

---

## Pseudocode

```text
SelectionSort(arr):
  for i = 0 to n-1:
    minIndex = i
    for j = i+1 to n:
      if arr[j] < arr[minIndex]:
        minIndex = j
    Swap arr[i] with arr[minIndex]
```

### Explanation of Pseudocode:
- `arr`: The input array to be sorted.
- The outer loop runs from `0` to `n-1`, where `n` is the size of the array.
- `minIndex` is initialized to the current index `i`. The inner loop runs from `i+1` to `n` to find the smallest element in the unsorted part of the array.
- After the inner loop, the smallest element is swapped with the element at index `i`.
- This process continues until the entire array is sorted.

---

## Diagram

The selection sort works by selecting the minimum element from the unsorted portion of the array and placing it at the beginning. Here's a visualization of how selection sort works:

![Selection Sort Diagram](https://files.codingninjas.in/capture2-6720.JPG)

**Explanation of the Diagram:**
1. In each step, the unsorted portion of the array is highlighted.
2. The minimum element from the unsorted portion is selected and swapped with the first element of the unsorted portion.
3. This process continues until all elements are sorted.

---

## Companies Using This Algorithm

Selection sort is often asked in interviews by various companies to test the candidate's understanding of basic sorting algorithms. Below is a table of some companies that commonly ask questions related to sorting algorithms, including selection sort:

| Company Name            | Logo                                               |
|-------------------------|----------------------------------------------------|
| Cognizant               | ![Cognizant](https://logo.clearbit.com/cognizant.com) |
| PwC India               | ![PwC](https://logo.clearbit.com/pwc.com)           |
| Mindtree                | ![Mindtree](https://logo.clearbit.com/mindtree.com) |
| DELL Dell India         | ![DELL](https://logo.clearbit.com/dell.com)         |
| Raja Software Labs      | ![RSL](https://logo.clearbit.com/rajasoftwarelabs.com) |
| LTI-Larsen & Toubro Infotech | ![LTI](https://logo.clearbit.com/lntinfotech.com)   |

---

## Conclusion

Selection sort is an easy-to-understand algorithm that works by selecting the minimum element from the unsorted portion of the array and moving it to the sorted section. While it is not the most efficient sorting algorithm, it is still commonly asked in interviews to assess problem-solving and algorithmic thinking skills. Understanding the working of selection sort and being able to implement it is a crucial part of learning data structures and algorithms.

