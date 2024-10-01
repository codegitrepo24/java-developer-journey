# Calculate Simple Interest

## Problem Statement
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

- **Note**: Return the answer as a **floor integer** value.

## Input/Output Format

### Input:
1. An integer representing the **principal amount**.
2. A floating-point number representing the **rate of interest**.
3. An integer representing the **time period** in years.

### Output:
An integer representing the **floored value** of the calculated Simple Interest.

## Simple Interest Formula:
\[
\text{Simple Interest} = \frac{\text{Principal} \times \text{Rate} \times \text{Time}}{100}
\]

## Sample Input 1:
2000 
2.2 
4

## Sample Output 1:
176


## Explanation of Sample Input 1:
The given input consists of:
- Principal = 2000
- Rate of Interest = 2.2%
- Time Period = 4 years

Using the Simple Interest formula:
\[
\text{Simple Interest} = \frac{2000 \times 2.2 \times 4}{100} = 176
\]

Since the result is already an integer, the floored value is **176**.

## Notes:
- Ensure the output is floored to the nearest integer value.
- The principal amount and time period will always be positive integers.
- The rate of interest can be a decimal value.

