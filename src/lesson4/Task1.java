package lesson4;
//Задача 1:
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        //   System.out.println("Введите размер второго массива");
        //   Scanner sc1 = new Scanner(System.in);
        //   int a = sc1.nextInt();
        //   int[] mas2 = new int[a];

        for(int a = 0; a < mas1.length; a++){
            mas1[a] = (int) (Math.random() * 10);
        }
    //    for(int bMas : mas2){
    //        mas2[bMas] = (int) (Math.random() * 10);
    //    }

        for(int i = 0; i < mas1.length; i++){
            System.out.println(mas1[i]);
        }
        System.out.println("Начало массива в обратном порядке");
        for(int b = (mas1.length-1); b >= 0; b--){
            System.out.println(mas1[b]);
        }
    }
}
