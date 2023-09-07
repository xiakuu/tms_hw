package lesson4;

import java.util.Arrays;

//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д
public class Task5 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int value1 = 0;
        int value2 = 0;

        for(int a=0;a < mas.length; a++){
            mas[a] = (int) (Math.random()*10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(mas));

        int firstIndex = 0;
        int lastIndex = (mas.length-1);

        for (int i =0; i < (mas.length/2); i++){
            value1 = mas[firstIndex];
            System.out.println(mas[firstIndex] + " = " + value1);
            value2 = mas[lastIndex];
            System.out.println(mas[lastIndex] + " = " + value2);
            mas[firstIndex] = value2;
            mas[lastIndex] = value1;
            firstIndex++;
            lastIndex--;
        }
        System.out.println("преобразованный массив: " + Arrays.toString(mas));
    }
}
