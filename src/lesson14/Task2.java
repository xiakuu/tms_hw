package lesson14;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {

        Predicate<Integer> checkArr = x -> x > 0;

        int[] arr = new int[]{1, 2, 3, 4, -5, 7, -4, -3, -2, 6, -1};

        for(int i : arr){
            if (checkArr.test(i)){
                System.out.println(i);
            }
        }
    }
}
