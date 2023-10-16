package lesson13.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    String group;
    int course;
    int[] marks;
    double averageMark;

    public Student(String name, String group, int course, int[] marks){
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;

    }

    public void setAverageMark(){
        for(int i = 0; i < marks.length; i++){
            averageMark += marks[i];
        }
        averageMark /= marks.length;
        System.out.println("средняя оценка студента " + name + " составляет: " + averageMark);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
