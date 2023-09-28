package lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Введите строки");

        String a = sc1.next();
        String b = sc2.next();
        String c = sc3.next();

        String[] arr = new String[]{a, b, c};

        int average = 0;
        String str = "";

        for(String s : arr){
            average += s.length();
        }
        average /= arr.length;
        System.out.println(average);

        for(String x : arr){
            if(x.length() < average){
                str = str.concat("Строка " + x + ", длина: " + x.length() + "; ");
            }
        }

        System.out.println(str);
    }
}
