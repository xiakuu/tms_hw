package lesson14;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner birthDay = new Scanner(System.in);
        Scanner birthMonth = new Scanner(System.in);
        Scanner birthYear = new Scanner(System.in);

        System.out.println("введите год - месяц - день рождения");
        LocalDate ld = LocalDate.of(birthYear.nextInt(), birthMonth.nextInt(), birthDay.nextInt());
        System.out.println(ld.plusYears(100));



    }
}
