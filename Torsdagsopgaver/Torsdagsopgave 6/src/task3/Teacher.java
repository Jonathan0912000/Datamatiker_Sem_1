package task3;
import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    public void addCurrentCourse(String course) {
        currentCourses.add(course);
    }

    @Override
    public String toString() {
        return super.toString() + ", Can Teach: " + canTeach + ", Current Courses: " + currentCourses;
    }
}
