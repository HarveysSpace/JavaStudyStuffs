package AbstractionConcept;

public interface Car {
    //Interfaces are can have ONLY "static final variable"
    int hp = 400; // by default static final variable
    final int wheels = 4; // no need to put final keyword because it's by default static final variable
    static int doors = 4; // no need to put static keyword because it's by default static final variable

    // We can only defines Abstract methods in interface
    // All the methods are abstract by default in interface and no need to abstract keyword
    // that mean is they cannot have body like abstract methods in abstract class
    // Only method declaration
    // 100% Abstraction because we cannot any different implentations than methods in interface
    // Cannot have an object like Abstract class

    public void start();
    public void stop();
    public void refuel();

}
