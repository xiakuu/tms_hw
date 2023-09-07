package lesson4;

import java.util.Arrays;

//Задача 6:
//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).
public class Task6 {
    public static void main(String[] args) {
        int[] mas = new int[]{1,1,9,10,14,15,17,18,19};
        int lastValue = 0;
        int check = 0;
        //   for(int i = 0; i < mas.length; i++){  //Для рандомных чисел
        //     mas[i] = (int) (Math.random()*10);
        // }
        System.out.println("Исходный массив: " + Arrays.toString(mas));
        lastValue = mas[0];
        for(int a = 0; a < mas.length; a++){
            if(mas[a] < lastValue){
                check = 1;
            }
            lastValue = mas[a];
        }
        if(check == 1){
            System.out.println("Массив не в возрастающей последовательности");
        }else {
            System.out.println("Массив в возрастающей последовательности");
        }

    }
}
