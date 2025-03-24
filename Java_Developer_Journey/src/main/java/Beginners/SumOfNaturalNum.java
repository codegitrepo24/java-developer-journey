public class SumOfNaturalNum {
    public static void main(String[] args){
       
        int sum = 0;
        int num;

        for(num=1;num<=10;num++)
        {
            sum +=num;
        }

        System.out.println("The sum of the first 10 natural numbers: " + sum);
    }
}
