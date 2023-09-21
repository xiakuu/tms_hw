package lesson9.Task1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("tiger is growling");
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("meat")){
            System.out.println("tiger is eating " + food);
        }else {
            System.out.println("wrong food for tiger! " + food);
        }

    }
}
