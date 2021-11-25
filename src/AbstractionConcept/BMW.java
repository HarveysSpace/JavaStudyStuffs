package AbstractionConcept;

public class BMW implements Car{
    // All Interface methods are should be defined to override in here
    @Override
    public void start() {
        System.out.println("BMW started");
    }
    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }
    @Override
    public void refuel() {
        System.out.println("BMW need refuel");
    }
    public void BMWbreak(){
        System.out.println("BMW break");
    }
}
