package lesson14;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        StringBuilder sb = new StringBuilder(sc.next());

        Supplier<String> reverse = () -> {
            return String.valueOf(sb.reverse());
        };

        System.out.println("Реверс строки: " + reverse.get());
    }
}
