package SolidPrinciple.InterfaceSegmetedPrinciple;

public class Dog implements Pet{


    @Override
    public void groom() {
        System.out.println("people groom dogs");

    }

    @Override
    public void feed() {
        System.out.println("dog eat rice");
    }
}
