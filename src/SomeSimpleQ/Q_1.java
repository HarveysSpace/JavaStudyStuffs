package SomeSimpleQ;

import java.util.Scanner;

public class Q_1 {
    // REVERSE GIVEN STR
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mySTR = scan.nextLine();
        String rev = "";
        int len = mySTR.length();

        for (int i = len-1; i>=0; i--){
          rev = rev +  mySTR.charAt(i);
        }
        System.out.println(rev);
    }

}
