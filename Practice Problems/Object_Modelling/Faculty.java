import java.util.*;
class Faculty {
    String name;
}

class Department {
    String name;
}

class University {
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void closeUniversity() {
        departments.clear();
        System.out.println("University closed.");
    }
}
