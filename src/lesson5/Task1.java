package lesson5;

import java.util.Arrays;
import java.util.Scanner;

//Задача 1:
//1.1 Создать двумерный массив, заполнить его случайными числами.
//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//1.3 Найти сумму всех получившихся элементов и вывести в консоль.
public class Task1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr[i].length; a++){
                arr[i][a] = (int) (Math.random()*10);
            }
        }

        System.out.println(Arrays.deepToString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int x = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr[i].length; a++){
                arr[i][a] = arr[i][a] + x;
                sum += arr[i][a];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Сумма всех: " + sum);

    }
}
