package SomeSimpleQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q_5 {
    // Find duplicated element in Array

    public static void main(String[] args) {
        int[] a = {2,8,6,5,7,3,2,8,9,5};
    // 1. compare each elements which is worst solution
      /*  for (int i = 0; i < a.length; i++){
            for (int j =i+1; j<a.length ; j++){
                if (a[i] == a[j] ){
                    System.out.println("this element is duplicated " + a[j]);
                    break;
                }
            }
            }*/
    // 2. By using HashSet which is not allowed store duplicated element in it

        /*   Set<Integer> mySet = new HashSet<>();
        for (int i:a) {
            if(!mySet.add(i)){
                System.out.println("this is duplicated " + i);
            }
        }*/
    // 3. By using Hash Map
        Map<Integer,Integer> myMap = new HashMap();
        for (int i: a) {
        Integer count = myMap.get(i);
            if(count == null ){
                 myMap.put(i,1);
        }
            else {
                myMap.put(i,++count);
        }
        }

      Set<Map.Entry<Integer,Integer>> entrySet = myMap.entrySet();
        for (Map.Entry<Integer,Integer> entry :entrySet) {
        if(entry.getValue()>1){
            System.out.println("the duplicated element is " +entry.getKey());
        }
        }
    }
    }

