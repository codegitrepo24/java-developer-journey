# Bitwise Operators in Java

This document demonstrates the use of bitwise operators in Java. The following operators are discussed:

- `&` (Bitwise AND)
- `|` (Bitwise OR)
- `^` (Bitwise XOR)
- `~` (Bitwise NOT)
- `<<` (Left Shift)
- `>>` (Right Shift)
- `>>>` (Unsigned Right Shift)



### 1. Bitwise AND (`&`)

This operator compares each bit of the two operands and returns `1` only if both bits are `1`. Otherwise, it returns `0`.

Example:
- `a = 5` (0101 in binary)
- `b = 9` (1001 in binary)
- `a & b = 0001` (1 in decimal)

### 2. Bitwise OR (`|`)

This operator compares each bit of the two operands and returns `1` if at least one of the bits is `1`. Otherwise, it returns `0`.

Example:
- `a = 5` (0101 in binary)
- `b = 9` (1001 in binary)
- `a | b = 1101` (13 in decimal)

### 3. Bitwise XOR (`^`)

This operator compares each bit of the two operands and returns `1` if the bits are different. Otherwise, it returns `0`.

Example:
- `a = 5` (0101 in binary)
- `b = 9` (1001 in binary)
- `a ^ b = 1100` (12 in decimal)

### 4. Bitwise NOT (`~`)

This operator inverts each bit of the operand. It performs a bitwise NOT, flipping `0` to `1` and vice versa. The result is a two's complement, so the output is a negative number.

Example:
- `a = 5` (0101 in binary)
- `~a = 1010` (inverted, 2's complement => -6)

### 5. Left Shift (`<<`)

This operator shifts the bits of the first operand to the left by the number of positions specified by the second operand. Empty positions on the right are filled with zeros.

Example:
- `a = 5` (0101 in binary)
- `a << 2 = 10100` (20 in decimal)

### 6. Right Shift (`>>`)

This operator shifts the bits of the first operand to the right by the number of positions specified by the second operand. It preserves the sign (whether positive or negative).

Example:
- `b = 9` (1001 in binary)
- `b >> 2 = 0010` (2 in decimal)

### 7. Unsigned Right Shift (`>>>`)

This operator shifts the bits of the first operand to the right by the number of positions specified by the second operand, filling the leftmost positions with zeros. It does not preserve the sign.

Example:
- `b = 9` (1001 in binary)
- `b >>> 2 = 0010` (2 in decimal)

---


