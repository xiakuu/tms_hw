package lesson19.Task1;

public class ThreadMaxValue implements Runnable {
    private int[] arr;
    private int maxVal = Integer.MIN_VALUE;

    public ThreadMaxValue(int[] arr){
        this.arr = arr;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void run(){
        for(int i : arr){
            if(maxVal < i){
                maxVal = i;
            }
        }
    }
}
