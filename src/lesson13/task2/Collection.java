package lesson13.task2;

import java.util.ArrayList;

public class Collection {
    static ArrayList<String> arrayList = new ArrayList<>();


   public void addList(String string){
       arrayList.add(string);
   }

    public void addFirst(String string){
        arrayList.add(0, string);
        System.out.println(arrayList);
    }
    public void removeLast(){
        arrayList.remove(arrayList.size() - 1);
        System.out.println(arrayList);
    }

    public void getList(){
        System.out.println(arrayList);
    }

}
