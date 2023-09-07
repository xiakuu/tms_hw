package lesson4;

//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int counter = 0;

        for(int i = 0; i < mas.length; i++){
            mas[i] = (int) (Math.random() * 10);

            if(mas[i] == 0){
                counter++;
            }
        }
        System.out.println(Arrays.toString(mas));
        if (counter > 0){
            System.out.println("Количество нулевых элементов: " + counter);
        } else{
            System.out.println("В массиве нет нулевых элементов");
        }

    }
}
