import java.util.*;
class Professor {
    String name;

    void assignCourse(Course1 c) {
        c.professor = this;
    }
}

class Student1 {
    String name;

    void enrollCourse(Course1 c) {
        c.enrolledStudents.add(this);
    }
}

class Course1 {
    String title;
    Professor professor;
    ArrayList<Student1> enrolledStudents = new ArrayList<>();
}
