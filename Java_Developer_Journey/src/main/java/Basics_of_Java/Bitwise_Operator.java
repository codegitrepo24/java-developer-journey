package main.java.Basics_of_Java;

public class Bitwise_Operator {
    public static void main(String[] args){
        int a = 5; // 0101 in binary
        int b = 9; // 1001 in binary

        // Bitwise AND
        System.out.println("Bitwise AND:  a & b = " + (a & b) + " Explaination: 0001 => 1" ); // 0001 => 1

        // Bitwise OR
        System.out.println("Bitwise OR: a | b = " + (a | b) + " Explaination: 1101 => 13" ); // 1101 => 13


        // Bitwise XOR
        System.out.println("Bitwise XOR: a ^ b = " + (a ^ b) + " Explaination: 1100 => 12"); // 1100 => 12 

        // Bitwise NOT
        System.out.println(("Bitwise NOT: ~a = ") + (~a) + " Explaination: ~0101 => 1010 (Two's complement => -6) ");  // ~0101 => 1010 (Two's complement => -6)

        // Left Shift (Shift bits of a to the left by 2 places)
        System.out.println("Left Shift (Shift bits of a to the left by 2 places): a << 2 = " + (a << 2) + " Explaination: 0101 << 2 => 10100 => 20 "); // 0101 << 2 => 10100 => 20

        // Right Shift (Shift bits of b to the right by 2 places)
        System.out.println("Right Shift (Shift bits of b to the right by 2 places): b >> 2 = " + (b >> 2) + " Explaination: 1001 << 2 => 0010 => 2"); // 1001 << 2 => 0010 => 2

        // Unsigned Right Shift (Shift bits of b to the right by 2 places, fill with zero)
        System.out.println("Unsigned Right Shift (Shift bits of b to the right by 2 places, fill with zero): b >>> 2 = " + (b >>> 2) + " Explaination: 1001 >>> 2 => 0010 => 2"); // 1001 >>> 2 => 0010 => 2


    }
}
