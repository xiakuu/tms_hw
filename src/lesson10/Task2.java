package lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Введите строки");

        String a = sc1.next();
        String b = sc2.next();
        String c = sc3.next();

        String[] arr = new String[]{a, b, c};

        String str = "";

       for(int i = 0; i < arr.length; i++){
           for(int x = 0; x < arr.length; x++){
               if(arr[x].length() > arr[i].length()){
                   str = arr[i];
                   arr[i] = arr[x];
                   arr[x] = str;

               }
           }

       }

        System.out.println("Отсортированный массив: " + Arrays.deepToString(arr));


    }
}
