package lesson13.task3;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student("Test1", "A", 3, new int[]{1, 2, 3, 4});
        Student st2 = new Student("Test2", "B", 1, new int[]{6, 2, 3, 7});
        Student st3 = new Student("Test3", "C", 3, new int[]{4, 5, 5, 6});
        Student st4 = new Student("Test4", "D", 2, new int[]{5, 6, 9, 10});

        st1.setAverageMark();
        st2.setAverageMark();
        st3.setAverageMark();
        st4.setAverageMark();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        printStudents(students, 3);
        avarageMarkDelete(students);


    }

    public static void printStudents(ArrayList<Student> students, int course){
        System.out.println("Список студентов " + course + " курса:");
        for(Student st : students){
            if(st.course == course){
                System.out.println(st);
            }
        }
    }

    public static void avarageMarkDelete(ArrayList<Student> students){
        ArrayList<Student> studentsBuffer = new ArrayList<>();
        try {
            for (Student st : students) {
                if (st.averageMark > 3) {
                   studentsBuffer.add(st);
                }
            }
            System.out.println("Студенты со средним баллом выше 3-х:\n" +  studentsBuffer);
        } catch (ConcurrentModificationException e){
            System.out.println(e);
        }
    }


}
