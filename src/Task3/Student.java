package Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String group;
    public int course;
    public int gradeHistory;
    public int gradeLiterature;
    public int gradeMath;
    public static ArrayList<Integer> test;

    public Student(String name, String group, int course, int gradeHistory, int gradeLiterature, int gradeMath) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeHistory = gradeHistory;
        this.gradeLiterature = gradeLiterature;
        this.gradeMath = gradeMath;
    }

    public static void printStudents(List<Student> student, int course){
        for (Student s : student){
            if (s.course == course){
                System.out.println(s.name + " обучается на " + course + " курсе");
            }
        }
    }

    public static void nextCourseStudent(List<Student> student){
        for (Student s : student){
            if ((s.gradeHistory + s.gradeMath + s.gradeLiterature)/3 >= 3){
                System.out.println(s.name + " Переведён на следующий курс");
                s.course = s.course + 1;
            }
        }
    }

    public static void delStudent(List<Student> student){
        ArrayList<Integer> myList = new ArrayList<>();
        //Student.test = new int[];
        for (Student s : student){
            if ((s.gradeHistory + s.gradeMath + s.gradeLiterature)/3 < 3){
                System.out.println(s.name + " отчислен");
                System.out.println(student.indexOf(s));
                myList.add(student.indexOf(s));
            }
        }
        //String[] arr = myList.toArray(new String[myList.size()]);
        Student.test = myList;
        System.out.println(Student.test);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", gradeHistory=" + gradeHistory +
                ", gradeLiterature=" + gradeLiterature +
                ", gradeMath=" + gradeMath +
                '}' + "\n";
    }
}
