package lesson4;

//Задача 2:
//Найти минимальный-максимальный элементы и вывести в консоль.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int masLength = sc1.nextInt();
        int[] mas = new int[masLength];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<mas.length; i++){
            mas[i] = (int) (Math.random() * 10);

            if(mas[i] > max){
                max = mas[i];
            }
            if(mas[i] < min){
                min = mas[i];
            }


        }
        System.out.println("Массив" + Arrays.toString(mas));
        System.out.println("Максимальное число массива: " + max + ", минимальное: " + min);

    }
}
