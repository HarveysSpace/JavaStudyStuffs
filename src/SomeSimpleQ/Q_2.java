package SomeSimpleQ;

public class Q_2 {
    // remove unwanted special chars from str
    public static void main(String[] args) {
    String mySTR = "한국어 Crazy Guy 54564321@#$ -+ ";
    mySTR = mySTR.replaceAll("[^a-zA-Z]","");
    System.out.println(mySTR);
    }
}
