package SomeSimpleQ;

import java.util.Arrays;

public class Q_7_StringMAnupulation {
    public static void main(String[] args) {
        String str = "The rains have started here";
        System.out.println(str.length()); // size of str
        System.out.println(str.charAt(5)); // get index of str
        System.out.println(str.indexOf('e')); // gives first location of that character

        System.out.println(str.indexOf('s',9)); // you can set the starter point by using ths method it will start count from 9th index
        System.out.println(str.indexOf('s',str.indexOf('s')+1)); // this is more useful than that method we used on line 10

        System.out.println(str.indexOf("have")); // you can also use for words it gives first char locations of word which is 'h' here
        System.out.println(str.indexOf("Hello")); // if there is no such a in str that you write it gives -1

        String str1 = "The rains Have started here" ;
        System.out.println(str.equals(str1)); // String comparison it returns boolean data type but its key sensitive
        System.out.println(str.equalsIgnoreCase(str1)); // its ignore the keys type when compare them


        System.out.println(str.substring(0,11)); // substring
        System.out.println(str.trim()); //its only trim the before and after spaces of the str

        System.out.println(str.replace(" ","")); // you can clear the spaces using replace method
        String str2 = "Hello_World_Test_Selenium ";
        String[] myStrArr = str2.split("_");  // split the str by using regex and it returns array!
        System.out.println(Arrays.toString(myStrArr));

        String str3 = "hello";
        System.out.println(str3.concat("ooooo!")); // it adds string to the end part

        String a = "Hello";
        String b = "World";

        int m = 100;
        int k = 200;
        System.out.println("Hello + World : "+a+b);
        System.out.println(m+k);
        System.out.println("Hello + World + 100 + 200"+ a+b+m+k); // if we add string before any operators with ints it will concat the numbers its not gonna count

    }
}

