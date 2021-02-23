package com.thuchanh.animal;

import com.thuchanh.animal.Animal;
import com.thuchanh.animal.Chicken;
import com.thuchanh.edible.Edible;
import com.thuchanh.animal.Tiger;
import com.thuchanh.fruit.Apple;
import com.thuchanh.fruit.Fruit;
import com.thuchanh.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
