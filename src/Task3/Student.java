package Task3;

import java.util.LinkedList;
import java.util.List;

public class Student {
    public String name;
    public String group;
    public int course;
    public int gradeHistory;
    public int gradeLiterature;
    public int gradeMath;

    public Student(String name, String group, int course, int gradeHistory, int gradeLiterature, int gradeMath) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradeHistory = gradeHistory;
        this.gradeLiterature = gradeLiterature;
        this.gradeMath = gradeMath;
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
                '}';
    }
}
