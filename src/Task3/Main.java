package Task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vova", "1", 3, 4, 5, 2);
        Student student2 = new Student("Vlad", "2", 2, 3, 4, 3);
        Student student3 = new Student("Anton", "2", 2, 2, 2, 2);

        LinkedList<Student> list = new LinkedList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
    }
}
