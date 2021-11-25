package AbstractionConcept;

public class HDFCBank extends Bank {

    public void loan(){ // Overriding from Abstract class (loan abstract method) which is "bank" // it can have body now
        System.out.println("HDFCBank--Loan Method");
    }
    //If we add another abstract method in Bank Abstract class we have to override that method in this class again
    // basically if we extend our class to abstract class we have to override all the abstract methods from that abstract class


    public void funds(){
        System.out.println("HDFCBank Funds");
    }

}
