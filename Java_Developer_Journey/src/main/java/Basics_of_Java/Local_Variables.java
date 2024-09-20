package Java_Developer_Journey.src.main.java.Basics_of_Java;

public class Local_Variables {

    // Local Variables
    public static void main(String[] args){
        int a = 10;
        if(a > 5)
        {
            int b = 10;
            a = a + b;
        }
        System.out.println(a,b);  
        /******
        error: cannot find symbol
        System.out.println(a,b);
                        ^
        symbol:   variable b
        location: class A
         **********/

         
    }
}
