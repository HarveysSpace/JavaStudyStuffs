package SomeSimpleQ;

public class Singleton {
    //in OOP, Singleton class can have only 1 object. You can create another one but it will point the same object(instance of the class)
    //How the design singleton class:
    //1. make constructor as private
    //2.write a public static method (getInstance()) that has return type of object of this singleton class (Lazy Initialization)

    //Difference between Singleton and Normal class
    // for normal class we use constructor whereas for singleton class we use getInstance() method for instantiation

    private static Singleton singleton_Instance = null; // instance variable of this class
    public String str;

    private Singleton(){
        str="hey i m using singleton class pattern";
    }
    //Lazy Initialization
    public static Singleton getInstance(){
     if (singleton_Instance == null)
         singleton_Instance= new Singleton();
     return singleton_Instance;
    }
    public static void main(String[] args) {
    Singleton x = Singleton.getInstance();
    Singleton y = Singleton.getInstance();
    Singleton z = Singleton.getInstance();

    x.str = (x.str).toUpperCase(); // it will apply uppercase method to str that in singleton object, y and z will use same obj
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

    z.str = (z.str).toLowerCase(); //even you use the last object of in this order ('z') to make apply LowerCase method it will change for all of them
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

    }
}
