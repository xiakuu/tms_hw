package lesson13.task2;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.addList("носорог");
        collection.addList("бегемот");
        collection.addList("белка");
        collection.addList("лиса");
        collection.getList();
        collection.addFirst("test1");
        collection.removeLast();
    }
}
