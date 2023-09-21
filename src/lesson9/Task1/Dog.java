package lesson9.Task1;

import java.util.Objects;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("meat") || food.equalsIgnoreCase("bones") || food.equalsIgnoreCase("dogfood")){
            System.out.println("Dog is eating " + food);
        } else {
            System.out.println("wrong food for dog! " + food );
        }

    }

    @Override
    public void voice() {
        System.out.println("dog is barking");
    }
}
