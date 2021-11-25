package AbstractionConcept;

public class TestCar {
    public static void main(String[] args) {
        BMW myBMW = new BMW();
        myBMW.start();
        myBMW.stop();
        myBMW.refuel();
        myBMW.BMWbreak();
        System.out.println(myBMW.hp);
        System.out.println(myBMW.wheels);
        System.out.println(myBMW.doors);

        Car bmwint = new BMW();
        bmwint.start();
        bmwint.stop();
        bmwint.refuel();
        System.out.println(bmwint.hp);
        System.out.println(bmwint.wheels);
        System.out.println(bmwint.doors);
    }
}
