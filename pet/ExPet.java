package pet;

public class ExPet {

    public static void main(String[] args) {
        System.out.println("--> DOG");
        Dog p1 = new Dog();
        p1.setColor("black");
        p1.walk();
        p1.talk();

        System.out.println("--> CAT");
        Cat p2 = new Cat();
        p2.setColor("white");
        p2.walk();
        p2.talk();

        System.out.println("--> FISH");
        Fish p3 = new Fish();
        p3.setColor("yellow");
        p3.swim();
    }
}
