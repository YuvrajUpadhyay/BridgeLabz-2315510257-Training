import java.util.*;
class Course {
    String name;
    ArrayList<Student> enrolledStudents = new ArrayList<>();
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    void enroll(Course c) {
        courses.add(c);
        c.enrolledStudents.add(this);
    }
}

class School {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
    }
}
