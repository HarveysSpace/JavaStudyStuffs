package CollectionsOfJava.ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> myLList = new LinkedList<String>();
        //add
        myLList.add("Test");
        myLList.add("qtp");
        myLList.add("Selenium");
        myLList.add("RPA");
        myLList.add("RFT");
        System.out.println("Content of myLList: "+ myLList);

        myLList.addFirst("addedFirst");
        System.out.println("Content of myLList with addedFirst: "+ myLList);

        myLList.addLast("addedLast");
        System.out.println("Content of myLList with addedLast: "+ myLList);
        //get
        System.out.println("first element of myLList: " + myLList.get(0));
        //Set
        myLList.set(0,"Harvey");
        System.out.println("first element of myLList after set:  " + myLList);

        //remove first and last element
        myLList.removeFirst();  // Also you can remove specific element by using only remove(); method
        myLList.removeLast();
        System.out.println("After removed first and last element Content of myLList: "+ myLList);

        // how to print all the values from linkedlist
        //using for loop
        System.out.println("----Using For Loop----");
        for (int i =0; i<myLList.size(); i++){
            System.out.println(myLList.get(i));
        }
        //advance for loop
        System.out.println("----Using Advance For Loop----");
        for (String s:myLList) {
            System.out.println(s);

        }
        //iterator
        System.out.println("----Using Iterator Loop----");
        Iterator<String > it =myLList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //while loop
        System.out.println("----Using While Loop----");
        int num = 0;
        while (myLList.size()>num){
            System.out.println(myLList.get(num));
            num++;
        }


    }
}
