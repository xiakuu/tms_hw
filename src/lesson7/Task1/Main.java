package lesson7.Task1;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.getJobTitle();
        director.getJobTitle();
        worker.getJobTitle();
    }

}
