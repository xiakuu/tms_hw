package lesson19.Task1;

public class ThreadMinValue implements Runnable {
    private int[] arr;
    private int minVal = Integer.MAX_VALUE;

    public ThreadMinValue(int[] arr){
        this.arr = arr;
    }

    public int getMinVal() {
        return minVal;
    }

    public void run(){
        for(int i : arr){
            if(minVal > i){
                minVal = i;
            }
        }
    }

}
