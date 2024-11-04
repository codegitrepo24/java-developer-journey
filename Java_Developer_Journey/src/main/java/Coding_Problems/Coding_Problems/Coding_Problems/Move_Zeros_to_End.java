import java.util.Scanner;

public class Move_Zeros_to_End {
    
public static int[] moveZeros(int n, int[] a){
    int i = 0; // Pointer to track the position to place the next non-zero element


    // First pass: Move all non-zero elements to the front.
    for(int j=0;j<n;j++){
        if(a[j] !=0){
            a[i] = a[j]; // Place non-zero element at the i-th position.
            i++;    // Increment i to the next available position.
        }
    }

    // Second pass: Fill the remaining positions with zeros.
    while(i < n){
        a[i] = 0; // Place zero at the remaining positions.
        i++;
    }

    return a; // Return the modified array.
}

public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the test cases: ");
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            
            int a[] = new int[n];
            System.out.println("Enter the array elements: ");
            for(int k=0;k<n;k++){
                a[k] = sc.nextInt();
            }
            
            int[] result = moveZeros(n, a);
            System.out.println("Array after moving zeros to the end: ");
            for(int j=0;j<n;j++){
                System.out.println(result[j] + " ");
            }
        }
    }
}
}
