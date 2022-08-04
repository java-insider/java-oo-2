package app;

import pet2.Dog;
import pet2.Pet;

public class App9 {

    public static void main(String[] args) throws Exception {

        Pet p = new Dog();
        p.feed();

        //Fish f = (Fish) p;
        //f.feed();

        if (p instanceof Dog) {
            Dog d = (Dog) p;
            d.sit();
        } else {
            System.out.println("O tipo não é um Dog");
        }
    }
}
