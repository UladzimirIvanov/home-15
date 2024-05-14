package Task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vova", "1b", 1, 4, 5, 2);
        Student student2 = new Student("Vlad", "2b", 2, 3, 4, 3);
        Student student3 = new Student("Anton", "2b", 2, 2, 2, 2);
        Student student4 = new Student("Andrei", "3a", 4, 3, 3, 3);
        Student student5 = new Student("Igor", "5a", 3, 1, 3, 1);
        Student student6 = new Student("Yan", "3c", 4, 5, 5, 4);

        LinkedList<Student> list = new LinkedList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        System.out.println(list);

        Student.nextCourseStudent(list);
        System.out.println();
        Student.printStudents(list, 5);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            Student.delStudent(list);
        }
        list.remove(Student.test.get(0));
        //Student.delStudent(list);

        System.out.println();
        System.out.println(list);
    }


}
