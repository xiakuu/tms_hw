package lesson10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Введите строку");

        String a = sc1.next();

        String b = "";

        for(int i = 0; i < a.length(); i++){
            b = b.concat(String.valueOf(a.charAt(i))).concat(String.valueOf(a.charAt(i)));
        }

        System.out.println(b);

    }
}
