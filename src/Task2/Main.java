package Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.myAdd("Cat");
        animals.myAdd("Dog");
        animals.myAdd("Cow");
        System.out.println(animals.list);
        animals.myDel();
        System.out.println(animals.list);
    }
}
