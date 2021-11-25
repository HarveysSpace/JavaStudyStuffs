package SomeSimpleQ;

public class Q_6 {
    //Find Largest and smallest number in array
    public static void main(String[] args) {
    int[] arr = {1,-7,6,54,1021,-3,0,3,7894513};
    // Compare each element approach
        int largestNumber= arr[0];
        int smallestNumber= arr[0];
        for (int i = 1 ; i<arr.length; i++) {
            if (arr[i]> largestNumber) {
                largestNumber = arr[i];
            } else if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        System.out.println(largestNumber);
        System.out.println(smallestNumber);
        /*

    Set<Integer> mySortedSet = new TreeSet<>();
        for (int i: arr) {
            mySortedSet.add(i);
        }
        int[] newArr = new int[mySortedSet.size()];
        int ct = 0;
        for (int i: mySortedSet) {  // this for each loo[ is convert from treeset to array
            newArr[ct++] = i;       //we cant get the elements of treeSet through on any method
        }
        System.out.println( "the largest number is " + newArr[newArr.length-1]);
        System.out.println( "the smallest number is " + newArr[0]);*/

    }
}
