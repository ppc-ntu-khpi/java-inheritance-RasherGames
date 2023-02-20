package test;

import domain.Elephant;
import domain.Animal;
public class TestAnimal {

    public static void main(String[] args) {
           Animal animal = new Animal("Bob", 5);
        animal.eat();
        animal.sleep();

        Elephant elephant = new Elephant("Dumbo", 3);
        elephant.eat();
        elephant.sleep();
        elephant.trumpet();
    }
}
