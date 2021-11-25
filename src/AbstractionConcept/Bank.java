package AbstractionConcept;

public abstract class Bank {
    int amount = 100;
    final int rate = 10;
    static int loanRate = 5;


    // Abstract class has to one abstract method need to create AT LEAST! but can have more abs methods and non-abs methods
    // partial abstraction here
    // the abstraction mean is "hiding the implementation logic"
    // Cannot have an object

    public abstract void loan(); // Abstract method does not have body!!

    //These are common methods for all child classes
    // we dont need to define them again in any child class we can reach them directly
    // but we have to define method for Abstract ones in child class like we did for loan() method !!!
    public void credit() {   // non-abstract method
        System.out.println("Bank Credit");
    }

    public void debit(){    // non-abstract method
        System.out.println("Bank Debit");
    }

    //Abstract classes are faster than interfaces as a performance

}
