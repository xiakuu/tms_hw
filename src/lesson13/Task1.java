package lesson13;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String a = sc.next();

        for (char q : a.toCharArray()) {
            if (Character.isDigit(q)) {
                hashSet.add((int)q - '0');
            }
        }
        System.out.println(hashSet);
    }
}
