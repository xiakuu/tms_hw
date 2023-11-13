package lesson19.Task2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 2, 9, 4, 2, 3, 7, 8};

        ThreadBubble threadBubble = new ThreadBubble(arr);
        ThreadInsertion threadInsertion = new ThreadInsertion(arr);
        ThreadSelection threadSelection = new ThreadSelection(arr);

        threadBubble.run();
        threadInsertion.run();
        threadSelection.run();


        System.out.println(threadBubble.toString());
        System.out.println(threadInsertion.toString());
        System.out.println(threadSelection.toString());

    }



}
