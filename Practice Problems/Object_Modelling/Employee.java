import java.util.*;
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department1 {
    ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    ArrayList<Department1> departments = new ArrayList<>();

    void addDepartment(Department1 d) {
        departments.add(d);
    }

    void dissolve() {
        departments.clear();
        System.out.println("Company dissolved.");
    }
}
