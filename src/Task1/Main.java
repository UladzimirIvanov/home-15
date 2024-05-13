import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>(); //Строка создаёт коллекцию HashSet
        list.add("A");
        list.add("B");
        list.add("C"); //Добавить в начало
        list.add("C"); //Добавить в начало

        System.out.println(list);
    }
}
