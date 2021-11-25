package AbstractionConcept;

public class TestBank {
    public static void main(String[] args) {

        HDFCBank hb = new HDFCBank(); // hb is oObject and reference of HDFCBank class
        hb.credit(); // calls from Bank Abstract class through on HDFCBank class which is extended to Bank Abstract class
        hb.debit();
        hb.loan(); //overrided from abstract class
        hb.funds(); // non-overrided method

        System.out.println(hb.amount);
        System.out.println(hb.rate);
        System.out.println(hb.loanRate);

        Bank b = new HDFCBank(); // b is object of HDFCBank class but reference of Bank class
        b.credit();
        b.debit();
        b.loan();
        // b.funds(); // we can't call this method because funds() method is just part of HDFCBank class
        // but this b object is referenced by Bank class and Bank class is subclass of HDFCBank class parent cannot access to child's methodin that case
        System.out.println(b.amount);
        System.out.println(b.rate);
        System.out.println(b.loanRate);

        // Bank b1 = new Bank(); // it gives error because Abstract classes are cannot have object
    }
}
