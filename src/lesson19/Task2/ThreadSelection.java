package lesson19.Task2;

import java.util.Arrays;

public class ThreadSelection implements Runnable {
    int[] arr;

    public ThreadSelection(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ThreadSelection{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void run() {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }

        }
    }
}
