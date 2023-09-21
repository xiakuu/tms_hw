package lesson9.Task1;

public class Rabbit extends Animal {
    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("grass")){
            System.out.println("Rabbit is eating " + food);
        }else {
            System.out.println("worng food for rabbit! " + food);
        }

    }

    @Override
    public void voice() {
        System.out.println("rabbit is making voice sounds");
    }
}
