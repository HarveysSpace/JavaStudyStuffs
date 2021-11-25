package SomeSimpleQ;

public class Q_4 {
    //find missing number in array
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 8};
        int sum = 0;
        int ct = 0;
     /*   for (int i = 0; i < myArr.length; i++) {
            sum = sum + myArr[i];
        }
        for (int i = 1; i <= myArr.length + 1; i++) {
            ct += i;
        }
        System.out.println("your missing number is  " + (ct - sum));
*/
        for (int i = 0; i < myArr.length; i++) {
            if (i + 1 != myArr.length && myArr[i] != myArr[i + 1] - 1) {
                System.out.println("your missing number is " + (myArr[i] + 1));
            }

        }
    }
}
