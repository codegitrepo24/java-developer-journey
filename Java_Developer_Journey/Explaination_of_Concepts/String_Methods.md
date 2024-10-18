### **Different Types of String Methods in Java with Examples**

Java provides a rich set of **String methods** for manipulating and handling strings. Here is a detailed overview of the most commonly used string methods with examples.

---

## 1. **`length()`**  
Returns the length of the string (number of characters).

**Example:**
```java
public class StringLengthExample {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Length: " + str.length());  // Output: 11
    }
}
```

---

## 2. **`charAt(int index)`**  
Returns the character at the specified index (0-based).

**Example:**
```java
public class CharAtExample {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Character at index 2: " + str.charAt(2));  // Output: v
    }
}
```

---

## 3. **`substring(int beginIndex)` / `substring(int beginIndex, int endIndex)`**  
Extracts a substring starting from the given index. If both `beginIndex` and `endIndex` are specified, it extracts a substring from `beginIndex` to `endIndex - 1`.

**Example:**
```java
public class SubstringExample {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Substring from index 6: " + str.substring(6));  // Output: World
        System.out.println("Substring from 0 to 5: " + str.substring(0, 5));  // Output: Hello
    }
}
```

---

## 4. **`equals(Object anotherString)` / `equalsIgnoreCase(String anotherString)`**  
- `equals()` compares the content of two strings for equality.
- `equalsIgnoreCase()` compares two strings ignoring case differences.

**Example:**
```java
public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        System.out.println(str1.equals(str2));  // Output: false
        System.out.println(str1.equalsIgnoreCase(str2));  // Output: true
    }
}
```

---

## 5. **`toLowerCase()` / `toUpperCase()`**  
Converts all characters in the string to lowercase or uppercase.

**Example:**
```java
public class CaseConversionExample {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str.toLowerCase());  // Output: java programming
        System.out.println(str.toUpperCase());  // Output: JAVA PROGRAMMING
    }
}
```

---

## 6. **`trim()`**  
Removes leading and trailing spaces from the string.

**Example:**
```java
public class TrimExample {
    public static void main(String[] args) {
        String str = "   Hello   ";
        System.out.println("Trimmed String: '" + str.trim() + "'");  // Output: 'Hello'
    }
}
```

---

## 7. **`replace(char oldChar, char newChar)` / `replaceAll(String regex, String replacement)`**  
- `replace()` replaces all occurrences of a specific character with another.
- `replaceAll()` replaces all occurrences of a substring or matches with a regex pattern.

**Example:**
```java
public class ReplaceExample {
    public static void main(String[] args) {
        String str = "Java is fun!";
        System.out.println(str.replace('a', 'o'));  // Output: Jovo is fun!
        System.out.println(str.replaceAll("fun", "awesome"));  // Output: Java is awesome!
    }
}
```

---

## 8. **`contains(CharSequence sequence)`**  
Checks if the string contains the specified sequence of characters.

**Example:**
```java
public class ContainsExample {
    public static void main(String[] args) {
        String str = "Java is powerful";
        System.out.println(str.contains("power"));  // Output: true
    }
}
```

---

## 9. **`startsWith(String prefix)` / `endsWith(String suffix)`**  
- `startsWith()` checks if the string starts with the given prefix.
- `endsWith()` checks if the string ends with the given suffix.

**Example:**
```java
public class StartsEndsWithExample {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.startsWith("Hello"));  // Output: true
        System.out.println(str.endsWith("World"));  // Output: true
    }
}
```

---

## 10. **`split(String regex)`**  
Splits the string into an array based on the given delimiter or regular expression.

**Example:**
```java
public class SplitExample {
    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);  // Output: apple banana orange
        }
    }
}
```

---

## 11. **`indexOf(String str)` / `lastIndexOf(String str)`**  
- `indexOf()` returns the first occurrence of the specified string or character.
- `lastIndexOf()` returns the last occurrence.

**Example:**
```java
public class IndexOfExample {
    public static void main(String[] args) {
        String str = "Programming in Java";
        System.out.println(str.indexOf('a'));  // Output: 12
        System.out.println(str.lastIndexOf('a'));  // Output: 18
    }
}
```

---

## 12. **`isEmpty()` / `isBlank()`**  
- `isEmpty()` returns true if the string has no characters.  
- `isBlank()` returns true if the string contains only whitespace characters.

**Example:**
```java
public class IsEmptyExample {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "   ";
        System.out.println(str1.isEmpty());  // Output: true
        System.out.println(str2.isBlank());  // Output: true
    }
}
```

---

## 13. **`concat(String str)`**  
Concatenates the given string to the end of another string.

**Example:**
```java
public class ConcatExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        System.out.println(str1.concat(str2));  // Output: Hello World
    }
}
```

---

### **Conclusion:**  
These are some of the most commonly used string methods in Java. Understanding these methods helps you perform a wide variety of operations on strings, such as searching, replacing, splitting, and checking properties. Each method has its unique use case, and mastering them is essential for working effectively with strings in Java.