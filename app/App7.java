package app;

import pet2.Cat;
import pet2.Dog;
import pet2.Fish;
import pet2.Pet;

public class App7 {

    public static void main(String[] args) {
        Pet d = new Dog();
        //d.feed();

        Pet c = new Cat();
        //c.feed();

        feedPet(d);
        feedPet(c);
        feedPet(new Fish());
    }

    private static void feedPet(Pet p) {
        p.feed();
    }
}
