package CollectionsOfJava.ListConcept;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;

public class ArrayListConcept {
    public static <E> void main(String[] args) {

        int[] a = new int[3]; // thi is a static array - size is fixed- its not dynamic - dynamic array is ArrayList
        //----ArrayList----
        // It can duplicate values
        // Don't need to use particular data type it can contain any data type
        // Maintain insertions ordered
        // Not synchronized by default that's why it's slower that other collections
        // Allows random access to fetch the element because it stores the values on the basis of indexes -- like ar.get(index) method



       /* ArrayList ar = new ArrayList(); // ArrayList is a class which is already in java.util.package and ar is an object of this class

       ar.add(5);
       ar.add("hmz");
       ar.add('&');
       ar.add('&');

        System.out.println(ar.size());
        System.out.println(ar.get(3)); // to get the value from an index*/

        // Whenever get the all the elements from collection you can use for loop or iterator because it's basis of indexes
       /* System.out.print("These are the elements of ArrayList..: ");
        for (int i = 0 ; i<ar.size(); i++){
            System.out.print(ar.get(i) + " ");
        }
*/
        // Non-Generic Vs Generic
        // Non-Generic is the collection that not defined any dataypes
        // On the other hand if the collection has a specific data type it calls generic
        ArrayList<Integer> arGeneric = new ArrayList<>(); // as you can see the yellow marked also gone because it's generic

        ArrayList<E> ar1 = new ArrayList<E>();// if you re not sure what kinda datatype you wanna use at this time you can also pass to 'E' as a paramater

        // Employee class objects
        Employee e1 = new Employee("Hamza",28,"SDET");
        Employee e2 = new Employee("Mark",33,"SDET");
        Employee e3 = new Employee("Liyla",25,"SDET");

        // Create an objects of ArrayList!

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        // iterator to traverse the values
        Iterator<Employee> TestingTeam = employeeList.iterator();
        while (TestingTeam.hasNext()) {
            Employee emp = TestingTeam.next();
            System.out.println(emp.name);
            System.out.println(emp.Age);
            System.out.println(emp.dept);
        }
            // addAll() method
            ArrayList<String> myl_1 = new ArrayList<>();
            myl_1.add("dev");
            myl_1.add("sdet");
            myl_1.add("Selenium");

            ArrayList<String> myl_2 = new ArrayList<>();
            myl_2.add("super");
            myl_2.add("easy");
            myl_2.add("peasy");

            myl_1.addAll(myl_2); // this method adds all the elements from myl_2 to myl_1

            for (int i = 0; i < myl_1.size(); i++) {

                System.out.println(myl_1.get(i));
            }
        // removeAll
        System.out.println("----After Remove All----");
            myl_1.removeAll(myl_2); // it removes all the myl_2 elements from myl_1
        for (int i = 0; i < myl_1.size(); i++) {

            System.out.println(myl_1.get(i));
        }

       // retainAll
        ArrayList<String> myl_3 = new ArrayList<>();
        myl_3.add("dev");
        myl_3.add("sdet");
        myl_3.add("Selenium");

        ArrayList<String> myl_4 = new ArrayList<>();
        myl_4.add("dev");
        myl_4.add("easy");

        myl_3.retainAll(myl_4); // it gives common values between ArrayLists
        System.out.println("----After Retain All----");
        for (int i = 0; i < myl_3.size(); i++) {

            System.out.println(myl_3.get(i));
        }

    }
}

