package main.java.DSA.ARRAY;

import java.util.Scanner;

public class NonDecreasingArray{
    public static boolean canBeNonDecreasing(int[] arr){
        int n = arr.length;
        int violations = 0;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                violations++;

                if(violations>1){
                    return false; // More than one modification needed
                }

                 // Check if modifying arr[i] or arr[i+1] could fix the violation
                if(i == 0 || arr[i-1] <= arr[i+1]){
                    arr[i] = arr[i+1];// Modify arr[i] to arr[i+1]
                }else{
                    arr[i+1] = arr[i]; // Modify arr[i+1] to arr[i]
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases: ");
        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            System.out.println("Enter size of the array: ");
            int N = sc.nextInt();
            int[] ARR = new int[N];

            System.out.println("Enter the array elements: ");
            for(int i=0;i<N;i++){
                ARR[i] = sc.nextInt();
            }

            boolean result = canBeNonDecreasing(ARR);
            System.out.println(result);

        }
        sc.close();
    }
}