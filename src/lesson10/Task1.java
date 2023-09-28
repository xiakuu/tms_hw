package lesson10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Введите строки");

        int longLenght = Integer.MIN_VALUE;
        String longStr = "";
        int shortLenght = Integer.MAX_VALUE;
        String shortStr = "";

        String a = sc1.next();
        String b = sc2.next();
        String c = sc3.next();

        String[] arr = new String[]{a, b, c};

        for (String s : arr) {
            if (s.length() > longLenght) {
                longLenght = s.length();
                longStr = s;
            }
            if (s.length() < shortLenght) {
                shortLenght = s.length();
                shortStr = s;
            }
        }
        System.out.println("Длинная строка: " + longStr + ", длинна: " + longLenght);
        System.out.println("Короткая строка: " + shortStr + ", длинна: " + shortLenght);

    }
}
