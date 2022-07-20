package javaCore.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);
    }



    private static void test(List<? extends Animal>  list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}