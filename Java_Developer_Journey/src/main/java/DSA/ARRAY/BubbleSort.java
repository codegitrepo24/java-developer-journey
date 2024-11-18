package main.java.DSA.ARRAY;

import java.util.Scanner;

public class BubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        // Outer loop for each pass through the array
        for(int i=0;i<n-1;i++){
            // Inner loop to compare adjacent elements
            for(int j=0;j<n-i-1;j++){
                // If the current element is greater than the next, swap them
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr);

            System.out.println("Sorted array: ");
            for(int num:arr){
                System.out.print(num + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}