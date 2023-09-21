package lesson9.Task1;
//dog is eating meat, bones, dogfood
//rabbit is eating grass
//tiger is eating meat
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        dog.voice();
        dog.eat("dogfood");
        rabbit.voice();
        rabbit.eat("grass");
        tiger.voice();
        tiger.eat("meat");
    }


}
