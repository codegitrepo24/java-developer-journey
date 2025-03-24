// Write a program to print the Fibonacci series up to 10 terms
public class FibboSeries {
    public static void main(String[] args){
        int num = 10;

        int first = 0, second = 1;


        for(int i=1;i<=10;i++){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
