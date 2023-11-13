package lesson19.Task2;

import java.util.Arrays;

public class ThreadBubble implements Runnable {
    int[] arr;

    public ThreadBubble(int[] arr) {
        this.arr = arr;
    }


    @Override
    public String toString() {
        return "ThreadBubble{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void run() {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tmp;

            }
        }
    }
}
