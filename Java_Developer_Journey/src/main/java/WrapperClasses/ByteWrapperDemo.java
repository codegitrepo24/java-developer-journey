package main.java.WrapperClasses;

public class ByteWrapperDemo {
    public static void main(String[] args) {
        
        // 1. Creating Byte objects (Autoboxing)
        Byte byteObj1 = Byte.valueOf((byte) 10);
        Byte byteObj2 = 20; // Autoboxing
    
        // 2. Converting Byte to primitive byte (Unboxing)
        byte primitiveByte = byteObj1.byteValue();
        System.out.println("Primitive byte: " + primitiveByte);

        // 3. Parsing String to Byte
        Byte parsedByte = Byte.parseByte("50");
        System.out.println("Parsed Byte: " + parsedByte);

        // 4. String Representation of Byte
        String byteString = byteObj1.toString();
        System.out.println("String representation of Byte: " + byteString);

        // 5. Byte Comparisons
        System.out.println("Comapring byteObj1 and byteObj2: " + Byte.compare(byteObj1, byteObj2));
        System.out.println("Are byteObj1 and byteObj2 equal? " + byteObj1.equals(byteObj2));

        // 6. Constants (Max and Min Values)
        System.out.println("Max Byte Value: " + Byte.MAX_VALUE);
        System.out.println("Min Byte Value: " + Byte.MIN_VALUE);

        // 7. Hash Code
        System.out.println("Hash Code of byteObj1: " + byteObj1.hashCode());

        // 8. Unsigned Comparison
        System.out.println("Unsigned comaprison between -1 and 1: " + Byte.compareUnsigned((byte)-1, (byte) 1));

        // Example: Byte Array Operations
        Byte[] byteArray = {Byte.valueOf((byte) 10), Byte.valueOf((byte) 20), Byte.valueOf((byte) 30)};
        for (Byte b : byteArray) {
            System.out.println("Byte value in array: " + b);
        }

        // 9. Autoboxing in Collections
        java.util.ArrayList<Byte> byteList = new java.util.ArrayList<>();
        byteList.add((byte) 100); // Autoboxing
        byteList.add((byte) 127);
        System.out.println("Byte list: " + byteList);
    }
}
