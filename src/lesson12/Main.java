package lesson12;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        String path1 = new File("src/lesson12/romeo-and-juliet.txt").getAbsolutePath();
        String path2 = new File("src/lesson12/longword.txt").getAbsolutePath();

        try(FileReader fw = new FileReader(path1)){
            int a;
            String buffer = "";
            while ((a = fw.read()) != -1){
                if((char)a == ' ' || (char)a == '\n' || (char)a == '[' || (char)a == ']' ||(char)a == ',' || (char)a == '.'){
                    words.add(buffer);
                    buffer = "";
                }else{
                    buffer = buffer.concat(String.valueOf((char)a));
                }
            }

        }catch(IOException e){
            System.out.println(e);
    }
        String longword = "";
        for(String s : words){
         if(s.length() > longword.length() && !s.contains("=")){
             longword = s;
         }

        }
        try(FileWriter fw = new FileWriter(path2)){
            fw.write(longword);
            fw.flush();
        }catch (IOException ex){
            System.out.println(ex);
        }

        System.out.println(longword);




    }
}
