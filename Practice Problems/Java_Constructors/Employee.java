public class Employee {
    static String companyName = "ABC";

    private static int totalEmployees = 0;

    private final int id;

    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Employee Details:");
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("The provided object is not an Employee.");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Software Engineer");

        displayTotalEmployees();

        printEmployeeDetails(e1);
        printEmployeeDetails("Not an employee");
    }
}
