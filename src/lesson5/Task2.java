package lesson5;
//Задача 2:
//Создать программу для раскраски шахматной доски с помощью цикла. Создать
//двумерный массив String 8х8. С помощью циклов задать элементам массива значения
//B(Black) или W(White). При выводе результат работы программы должен быть
//следующим:

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        boolean check = false;

        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr[i].length; a++){
                if(a == (arr[i].length - 1)){
                    if(!check){
                        check = false;
                        arr[i][a] = "W";
                    }else{
                        check = true;
                        arr[i][a] = "B";
                    }
                }else if (!check){
                   arr[i][a] = "W";
                   check = true;
                }else if(check){
                   arr[i][a] = "B";
                   check = false;
               }
               }
            }
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        }





    }
