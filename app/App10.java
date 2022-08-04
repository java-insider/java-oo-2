package app;

import pet2.Dog;
import pet2.Pet;

public class App10 {

    public static void main(String[] args) {
        Pet p = new Dog();

        if (p instanceof Dog d) {
            d.sit();
        }
    }
}
