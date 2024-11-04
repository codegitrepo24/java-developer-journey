import java.util.Scanner;

public class Find_Unique {
    public static int findUnique(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length;i++){
            ans = ans ^ arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases: ");
        int t = sc.nextInt();

        while(t--> 0){

            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
    
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Unique element in the array: " + findUnique(arr));
        }

        sc.close();
        
    }
}
