package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Religion");
        passedCourses.add("History");

        Student student = new Student("John", passedCourses);
        student.addCourse("Physics");
        student.addCourse("Religion");

        ArrayList<String> canTeachCourses = new ArrayList<>();
        canTeachCourses.add("Religion");
        canTeachCourses.add("Computer Science");

        Teacher teacher = new Teacher("Lærer Klara", canTeachCourses);
        teacher.addCurrentCourse("Gymnastik");

        System.out.println(student);
        System.out.println(teacher);
    }
}

