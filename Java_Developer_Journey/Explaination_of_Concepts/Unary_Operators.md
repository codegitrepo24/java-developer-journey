
# Unary Operators in Java

Unary operators in Java are operators that work with only one operand to perform various operations such as incrementing/decrementing a value, negating an expression, or inverting a boolean value. Unary operators are the simplest operators in Java as they involve only one operand.

## Types of Unary Operators

| Operator | Symbol | Description                                                       |
|----------|--------|-------------------------------------------------------------------|
| Unary Plus  | `+`    | Represents a positive value. It's usually redundant.              |
| Unary Minus | `-`    | Negates an expression or changes its sign.                       |
| Increment   | `++`   | Increases a variable's value by 1.                               |
| Decrement   | `--`   | Decreases a variable's value by 1.                               |
| Logical NOT | `!`    | Inverts the value of a boolean expression.                       |
| Bitwise Complement | `~` | Inverts all the bits of an integer.                           |

## 1. Unary Plus (`+`)

- **Syntax**: `+a`
- The unary plus operator indicates a positive number. In most cases, it has no significant effect as numbers are positive by default in Java.
- **Example**:
    ```java
    int a = 5;
    int result = +a; // result = 5
    ```

## 2. Unary Minus (`-`)

- **Syntax**: `-a`
- The unary minus operator negates an expression, changing its sign from positive to negative or vice versa.
- **Example**:
    ```java
    int a = 5;
    int result = -a; // result = -5
    ```

## 3. Increment Operator (`++`)

- **Syntax**: `++a` or `a++`
- The increment operator increases the value of a variable by 1. There are two types of increment operations:
    1. **Pre-increment**: `++a` (Increments the value before using it in an expression)
    2. **Post-increment**: `a++` (Increments the value after using it in an expression)
  
### Pre-increment Example:
```java
int a = 5;
int result = ++a; // result = 6, a = 6
```

### Post-increment Example:
```java
int a = 5;
int result = a++; // result = 5, a = 6
```

## 4. Decrement Operator (`--`)

- **Syntax**: `--a` or `a--`
- The decrement operator decreases the value of a variable by 1. Like the increment operator, there are two types:
    1. **Pre-decrement**: `--a` (Decreases the value before using it in an expression)
    2. **Post-decrement**: `a--` (Decreases the value after using it in an expression)

### Pre-decrement Example:
```java
int a = 5;
int result = --a; // result = 4, a = 4
```

### Post-decrement Example:
```java
int a = 5;
int result = a--; // result = 5, a = 4
```

## 5. Logical NOT (`!`)

- **Syntax**: `!booleanValue`
- The logical NOT operator is used to invert the value of a boolean expression. If the expression is `true`, applying `!` makes it `false`, and vice versa.
- **Example**:
    ```java
    boolean isTrue = true;
    boolean result = !isTrue; // result = false
    ```

## 6. Bitwise Complement (`~`)

- **Syntax**: `~a`
- The bitwise complement operator flips all the bits of an integer. It converts all `0`s to `1`s and all `1`s to `0`s. It essentially negates a number in binary form.
- **Example**:
    ```java
    int a = 5;  // In binary: 0000000000000101
    int result = ~a; // In binary: 1111111111111010 (which is -6 in decimal)
    ```




