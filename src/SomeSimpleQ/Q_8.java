package SomeSimpleQ;

public class Q_8 {
    // How to swap two integers
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        // using with  third variable
     /*   int t;
        t=x;
        x=y;
        y=t;
        */

        //without third variable
        x = x + y; // x =15
        y = x - y; // y = 5
        x = x - y; // x = 10
        y = x - y; // y = 5

        System.out.println(x);
        System.out.println(y);
    }
}
