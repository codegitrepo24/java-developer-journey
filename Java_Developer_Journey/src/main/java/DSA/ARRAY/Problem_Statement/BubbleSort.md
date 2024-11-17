# Bubble Sort Algorithm

## Problem Statement
Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are not in sorted order. 

You are given an unsorted array of `N` non-negative integers. Your task is to sort this array in non-decreasing order using the Bubble Sort algorithm.

For example, if the input array is `{6, 2, 8, 4, 10}`, the sorted output after applying Bubble Sort would be `{2, 4, 6, 8, 10}`.

### Constraints
- `1 <= T <= 100` - The number of test cases
- `1 <= N <= 100` - The size of each array
- `1 <= Arr[i] <= 1000` - Elements of the array are non-negative integers

### Input/Output Format

#### Input
1. An integer `T` representing the number of test cases.
2. For each test case:
   - An integer `N` representing the size of the array.
   - `N` space-separated integers representing the elements of the array.

#### Output
For each test case, print the sorted array in non-decreasing order.

### Example
#### Input
```
1
5
6 2 8 4 10
```

#### Output
```
2 4 6 8 10
```

#### Explanation
After applying the Bubble Sort algorithm, the array `{6, 2, 8, 4, 10}` is sorted to `{2, 4, 6, 8, 10}`.

---

## Approach

Bubble Sort sorts an array by comparing adjacent elements and swapping them if they are in the wrong order. The algorithm repeats this process until no swaps are needed, indicating that the array is sorted.

### Algorithm

1. Start from the first element in the array.
2. Compare each pair of adjacent elements.
3. If the current element is greater than the next element, swap them.
4. Continue this process for each pass through the array.
5. With each complete pass, the largest unsorted element "bubbles" up to its correct position.
6. Repeat until the array is fully sorted.

### Pseudocode

```plaintext
function bubbleSort(arr)
    for i from 0 to length(arr) - 1
        for j from 0 to length(arr) - i - 1
            if arr[j] > arr[j + 1]
                swap(arr[j], arr[j + 1])
    return arr
```

### Explanation of the Image

The provided image demonstrates how Bubble Sort works step-by-step. The initial array is `{6, 2, 8, 4, 10}`.

1. **First Pass**: 
   - Compare `6` and `2`, swap to get `{2, 6, 8, 4, 10}`.
   - Compare `8` and `4`, swap to get `{2, 6, 4, 8, 10}`.

2. **Next Pass**:
   - Continue comparing adjacent elements and swapping as needed until the array is fully sorted.

The array becomes `{2, 4, 6, 8, 10}` after all passes are completed.

---

## Diagram for Bubble Sort Logic

The following diagram illustrates the process of sorting the array `{6, 2, 8, 4, 10}` step-by-step using the Bubble Sort algorithm.

![Bubble Sort Diagram](https://files.codingninjas.in/capture-6583.JPG)

---

## Table of Companies Asking This Question

| Company                                  | Logo                                                                                                 |
|------------------------------------------|------------------------------------------------------------------------------------------------------|
| Lenskart                                 | ![Lenskart](https://logo.clearbit.com/lenskart.com)                                                  |
| Cisco                                    | ![Cisco](https://logo.clearbit.com/cisco.com)                                                        |
| Optum                                    | ![Optum](https://logo.clearbit.com/optum.com)                                                        |
| Wells Fargo                              | ![Wells Fargo](https://logo.clearbit.com/wellsfargo.com)                                             |
| Cognizant                                | ![Cognizant](https://logo.clearbit.com/cognizant.com)                                                |
| Cyber Infrastructure (CIS)               | ![CIS](https://logo.clearbit.com/cisin.com)                                                          |
| Infosys                                  | ![Infosys](https://logo.clearbit.com/infosys.com)                                                    |
| Ola                                      | ![Ola](https://logo.clearbit.com/ola.com)                                                            |
| Siemens                                  | ![Siemens](https://logo.clearbit.com/siemens.com)                                                    |
| Goldman Sachs                            | ![Goldman Sachs](https://logo.clearbit.com/goldmansachs.com)                                         |
| Morgan Stanley                           | ![Morgan Stanley](https://logo.clearbit.com/morganstanley.com)                                       |
| Tata Consultancy Services (TCS)          | ![TCS](https://logo.clearbit.com/tcs.com)                                                            |
| HCL Technologies                         | ![HCL](https://logo.clearbit.com/hcltech.com)                                                        |
| SAP Labs                                 | ![SAP Labs](https://logo.clearbit.com/sap.com)                                                       |
| Ajira Tech                               | ![Ajira Tech](https://logo.clearbit.com/ajiratech.com)                                               |
| Ernst & Young (EY)                       | ![EY](https://logo.clearbit.com/ey.com)                                                              |
| Unthinkable Solutions                    | ![Unthinkable Solutions](https://logo.clearbit.com/unthinkable.co)                                   |
| Gaba Software                            | ![Gaba Software](https://logo.clearbit.com/gabasoftware.com)                                         |
| Comviva                                  | ![Comviva](https://logo.clearbit.com/comviva.com)                                                    |
| HashedIn                                 | ![HashedIn](https://logo.clearbit.com/hashedin.com)                                                  |
| Capgemini Consulting India Pvt Ltd       | ![Capgemini](https://logo.clearbit.com/capgemini.com)                                                |
| Wipro                                    | ![Wipro](https://logo.clearbit.com/wipro.com)                                                        |
| Mindtree                                 | ![Mindtree](https://logo.clearbit.com/mindtree.com)                                                  |
| RuPay                                    | ![RuPay](https://logo.clearbit.com/rupay.co.in)                                                      |
| Thirdware Solutions                      | ![Thirdware Solutions](https://logo.clearbit.com/thirdware.com)                                      |
| PwC India                                | ![PwC](https://logo.clearbit.com/pwc.in)                                                             |
| Newgen Software                          | ![Newgen Software](https://logo.clearbit.com/newgensoft.com)                                         |
| CETPA Infotech Pvt. Ltd.                 | ![CETPA Infotech](https://logo.clearbit.com/cetpainfotech.com)                                       |
| Incture Technologies                     | ![Incture Technologies](https://logo.clearbit.com/incture.com)                                       |
| Hexaview Technologies                    | ![Hexaview Technologies](https://logo.clearbit.com/hexaview.com)                                     |
| BETSOL                                   | ![BETSOL](https://logo.clearbit.com/betsol.com)                                                      |
| Decos Pvt Ltd                            | ![Decos Pvt Ltd](https://logo.clearbit.com/decos.com)                                                |
