package lesson19.Task2;

import java.util.Arrays;

public class ThreadInsertion implements Runnable {
    int[] arr;

    public ThreadInsertion(int[] arr) {
        this.arr = arr;
    }


    @Override
    public String toString() {
        return "ThreadInsertion{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void run() {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else
                    break;
            }
            arr[i + 1] = value;

        }
    }
}
