package lesson17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;



        System.out.print("введите строку:");
        str = sc.nextLine();


        Pattern pat = Pattern.compile("\\b[a-zA-Zа-яА-Я]{2,6}\\b");
        Matcher matcher = pat.matcher(str);



        while (matcher.find())
            System.out.print(matcher.group() + " ");
    }
}