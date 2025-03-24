import java.util.Scanner;

public class Intro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
       
        
        System.out.printf("Name: %s, Age: %d, city: %s ", name, age, city); 
        sc.close();
    }
}

// Why Does This Work?
// sc.nextInt(); reads the integer but leaves a newline (\n) in the buffer.
// sc.nextLine(); (added after nextInt()) consumes that newline.
// sc.nextLine(); for city now correctly waits for the user to input the city name.
