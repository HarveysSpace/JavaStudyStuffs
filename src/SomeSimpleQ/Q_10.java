package SomeSimpleQ;

public class Q_10 {
    // How to swap two Strings variable without using third variable

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        System.out.println("Before Swap :");
        System.out.println("The value of a :" + a);
        System.out.println("The value of b :" + b);

        a = a+b; // HelloWorld
        b= a.substring(0,a.length()-b.length());
        a = a.substring(a.length()-b.length());
        System.out.println("------------");
        System.out.println("After Swap :");
        System.out.println("The value of a :" + a);
        System.out.println("The value of b :" + b);
    }
}
