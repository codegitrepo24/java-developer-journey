import java.util.Scanner;

public class Check_Prime {
    public static String isPrime(int n) {
        if (n <= 1) {
            return "No";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {

            System.out.println("Enter the number to check if it is prime or not: ");
            int n = sc.nextInt();
            System.out.println(isPrime(n));
        }
        sc.close();
    }
}