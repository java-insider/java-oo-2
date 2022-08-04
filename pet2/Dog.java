package pet2;

public class Dog extends Pet {

    @Override
    public void feed() {
        System.out.println("Dog eating");
    }

    public void sit() {
        System.out.println("Dog sitting");
    }
}
