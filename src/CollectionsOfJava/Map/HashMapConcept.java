package CollectionsOfJava.Map;

import CollectionsOfJava.ListConcept.Employee;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        // HashMap is a class implements to Map interface
        // Extends AbstractMap
        // It contains only unique elements
        // stores the value in key-value pair
        // It may have one null key and multiple null values
        // It maintains no order
        // Hashmap is non - Syncronized -- not thread safe ( it is accesseble multiple times )
        // ConcurrentModificationException -- Fail-Fast condition
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(1,"SDET");
        hmap.put(2,"Selenium");
        hmap.put(3,"QTP");
        hmap.put(4,"RFT");
        for(Map.Entry m : hmap.entrySet()){ // we use Entry class for get the all elements (key-value) or only keys or only values o from hashmap
            System.out.println(m);
        }
        hmap.remove(3); // it removes to element that has key

        System.out.println("After remove third key: " + hmap);

        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

        Employee e1 = new Employee("Tom",25,"Admin");
        Employee e2 = new Employee("Hamza", 28,"SeniorTester");
        Employee e3 = new Employee("Jayce", 33,"SD");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);
    //traverse hashmap
        for (Map.Entry<Integer,Employee> e: emp.entrySet()) {
            int key = e.getKey();
            Employee value = e.getValue();
            System.out.println("Employee " + key + " Info:  ");
            System.out.println(value.name + " " + value.Age + " " + value.dept);
        }


    }
}
