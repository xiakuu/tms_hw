package lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int capacity = 15;
        List<Integer> ints = new ArrayList<>(capacity);

        for(int i = 0; i < capacity; i++){
            ints.add(i, (int)(Math.random()*10));
        }
        System.out.println(ints);

        ints = ints.stream().distinct().collect(Collectors.toList());
        ints = ints.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Массив после обработки: " + ints);
        int sum = ints.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма всех чисел: " + sum);

        }
    }
