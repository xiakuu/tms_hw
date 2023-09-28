package lesson10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Введите строки");

        String a = sc1.next();
        String b = sc2.next();
        String c = sc3.next();

        String[] arr = new String[]{a, b, c};

        for(String s : arr){
            if (isUnique(s)){
                System.out.println("Слово " + s + " уникальное");
            }

        }


    }

    public static boolean isUnique(String str){
        for(int i = 0; i < str.length(); i++){
            for(int a = 0; a < str.length(); a++){
                if(str.charAt(i) != str.charAt(a)){
                    return false;
                }
            }
        }
        return true;
    }
}
