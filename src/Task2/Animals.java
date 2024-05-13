package Task2;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> list = new LinkedList<>();
    public void myAdd(String animal){
        list.addFirst(animal);
    }
    public void myDel(){
        list.removeLast();
    }
}
