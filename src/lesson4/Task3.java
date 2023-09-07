package lesson4;

//Задача 3:
//Найти индексы минимального и максимального элементов и вывести в консоль.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[10];

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);

            if (mas[i] > max) {
                max = mas[i];
                maxIndex = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                minIndex = i;
            }
        }

        System.out.println("Массив: " + Arrays.toString(mas));
        System.out.println("Минимальное число: " + min + ", индекс: " + minIndex);
        System.out.println("Максимальное число: " + max + ", индекс: " + maxIndex);
    }
}
