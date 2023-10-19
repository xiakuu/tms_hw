package lesson14;

import java.util.Scanner;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        double rate = 3.3;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сумму в BYN");
        String money = sc.next();
        String[] moneyByn;
        moneyByn = money.split(" ");
        Consumer<Integer> convert = x -> {
            double exchangedMoney;
            exchangedMoney = x / rate;
            System.out.println("В долларах: " + exchangedMoney);
        };
         convert.accept(Integer.valueOf(moneyByn[0]));

    }
}
