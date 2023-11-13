package lesson19.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < arr.length; i++){
            System.out.println("Введите число");
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
                i = 5;
            }
        }

        ThreadMaxValue thMax = new ThreadMaxValue(arr);
        ThreadMinValue thMin = new ThreadMinValue(arr);
        thMax.run();
        thMin.run();
        System.out.println("Максимальное число: " + thMax.getMaxVal());
        System.out.println("Минимальное число: " + thMin.getMinVal());






    }
}
