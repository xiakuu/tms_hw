package lesson13;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 6 чисел");
        int a;

        try {
            for(int i = 0; i < 7; i++) {
                a = sc.nextInt();
                hashSet.add(a);
            }
        } catch (InputMismatchException e){
            System.out.println(e);
        }
        
            System.out.println(hashSet);
        }
    }
