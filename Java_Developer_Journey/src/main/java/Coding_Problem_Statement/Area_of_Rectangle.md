# Rectangle Class Design

## Problem Statement

Design a class called `Rectangle` with the following properties and functionality:

- **Data Members**:
  - `length`: Length of the rectangle.
  - `breadth`: Breadth of the rectangle.

- **Member Function**:
  - `getArea()`: Calculates and returns the area of the rectangle, computed as `length * breadth`.

### Notes

- The **area** of a rectangle is calculated using the formula: 
  \[
  \text{Area} = \text{length} \times \text{breadth}
  \]
  
- **Constraints**:
  - \( 0 \leq L, B \leq 100 \)

- **No input handling** is required in this class; simply define the data members and methods as specified.

### Example

| Input  | Output |
| ------ | ------ |
| 4, 20  | 80     |
| 2, 10  | 20     |

- **Explanation of Sample Input 1**: With length = 4 and breadth = 20, the area is \( 4 \times 20 = 80 \).
- **Explanation of Sample Input 2**: With length = 2 and breadth = 10, the area is \( 2 \times 10 = 20 \).

---

## Approach

The `Rectangle` class is designed with a simple structure:

1. **Define the Data Members**: 
   - The `Rectangle` class includes two data members, `length` and `breadth`, to store the dimensions of the rectangle.

2. **Define the `getArea()` Method**:
   - The `getArea()` method calculates the area by multiplying `length` and `breadth` and returns the result.

3. **Constraints Handling**:
   - Ensure that the values of `length` and `breadth` fall within the defined constraint range of \(0 \leq L, B \leq 100\).

This approach provides a clean, modular structure with encapsulated functionality to calculate the rectangle's area based on its dimensions.

---

## Algorithm

1. **Create the Rectangle Class**:
   - Define two data members, `length` and `breadth`, to store the dimensions of the rectangle.

2. **Implement the `getArea()` Method**:
   - Within `getArea()`, calculate the area by multiplying `length` with `breadth`.
   - Return the computed area.

---

## Pseudocode

```plaintext
Class Rectangle:
    Data Members:
        - length
        - breadth

    Function getArea():
        Return length * breadth
```

---

## Web Diagram

```
+---------------------+
|      Rectangle      |
+---------------------+
| - length: int       |
| - breadth: int      |
+---------------------+
| + getArea(): int    |
+---------------------+
```

- **Rectangle**: Represents the class.
- **Data Members**:
  - `length`: Length of the rectangle.
  - `breadth`: Breadth of the rectangle.
- **Methods**:
  - `getArea()`: Method that calculates and returns the area.

---

## Companies that Ask This Question

This question has been asked in interviews by:
- **Tata Consultancy Services (TCS)**