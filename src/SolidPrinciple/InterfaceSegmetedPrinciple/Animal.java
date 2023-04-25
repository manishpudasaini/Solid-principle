package SolidPrinciple.InterfaceSegmetedPrinciple;

public interface Animal {
    void feed();

    default void eat(){
        System.out.println("eact meat");
    }
}
