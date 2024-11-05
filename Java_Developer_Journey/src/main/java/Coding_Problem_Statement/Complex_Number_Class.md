
# Complex Number Operations in Java

### Problem Statement

Design a `ComplexNumber` class with two integer data members: the real part (`R`) and the imaginary part (`I`). The class should support basic operations on complex numbers such as addition and multiplication.

### Class Details

Implement the following functions in the `ComplexNumber` class:

1. **Constructor**
   - Initializes the `ComplexNumber` object with real and imaginary parts.

2. **plus**
   - Adds two complex numbers and updates the first complex number.
   - **Example**:
     - `C1 = 4 + i5`, `C2 = 3 + i1`
     - `C1.plus(C2)` results in: `C1 = 7 + i6`, `C2 = 3 + i1`

3. **multiply**
   - Multiplies two complex numbers and updates the first complex number.
   - **Example**:
     - `C1 = 4 + i5`, `C2 = 1 + i2`
     - `C1.multiply(C2)` results in: `C1 = -6 + i13`, `C2 = 1 + i2`

4. **print**
   - Prints the complex number in the format `a + ib`, where `a` is the real part and `b` is the imaginary part.
   - **Example**: `4 + i5`

### Input/Output

- **Sample Input 1**:
  ```
  4 5
  6 7
  1
  ```
- **Sample Output 1**:
  ```
  10 + i12
  ```

- **Sample Input 2**:
  ```
  4 5
  6 7
  2
  ```
- **Sample Output 2**:
  ```
  -11 + i58
  ```

### Explanation of Sample Outputs

- **Input 1**: 
  - `C1 = 4 + i5`, `C2 = 6 + i7`, Operation = 1 (Addition)
  - `C1.plus(C2)` results in `C1 = 10 + i12`
- **Input 2**: 
  - `C1 = 4 + i5`, `C2 = 6 + i7`, Operation = 2 (Multiplication)
  - `C1.multiply(C2)` results in `C1 = -11 + i58`

---

### Approach

1. **Initialization**: Create a `ComplexNumber` class with integer attributes for real and imaginary parts. Add a parameterized constructor for initialization.
2. **Addition (plus)**: Implement a method `plus` to add the attributes of another complex number to the current complex number instance.
3. **Multiplication (multiply)**: Implement a method `multiply` to multiply another complex number with the current complex number using the complex multiplication formula.
4. **Output (print)**: Implement a method `print` to display the complex number in the format `a + ib`.

### Algorithm

1. **Define Constructor** to initialize `real` and `imaginary`.
2. **Define `plus` method** to:
   - Add real parts and imaginary parts separately.
3. **Define `multiply` method** to:
   - Calculate new real and imaginary parts using the complex multiplication formula.
4. **Define `print` method** to:
   - Format and print `a + ib`.

---

### Pseudocode

```plaintext
Class ComplexNumber
    Constructor(real, imaginary)
        this.real = real
        this.imaginary = imaginary

    Method plus(other)
        this.real += other.real
        this.imaginary += other.imaginary

    Method multiply(other)
        newReal = this.real * other.real - this.imaginary * other.imaginary
        newImaginary = this.real * other.imaginary + this.imaginary * other.real
        this.real = newReal
        this.imaginary = newImaginary

    Method print()
        Print "this.real + i" + this.imaginary
End Class

Main
    Input real1, imaginary1 for C1
    Input real2, imaginary2 for C2
    Input operation (1 for addition, 2 for multiplication)

    If operation == 1
        C1.plus(C2)
        C1.print()
    Else If operation == 2
        C1.multiply(C2)
        C1.print()
End Main
```

---

### Web Diagram

```plaintext
              +----------------------+
              | ComplexNumber        |
              |----------------------|
              | - real : int         |
              | - imaginary : int    |
              |----------------------|
              | + ComplexNumber(R,I) |
              | + plus(other)        |
              | + multiply(other)    |
              | + print()            |
              +----------------------+

                      ^
                      |
                      |
              +-----------------+
              |    Main        |
              |----------------|
              | - C1 : Complex |
              | - C2 : Complex |
              +----------------+
```

---

### Companies Where Asked

This question is commonly asked in technical interviews at:

![Microsoft Logo](https://logo.clearbit.com/microsoft.com)