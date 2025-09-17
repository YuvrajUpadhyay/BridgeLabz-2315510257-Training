public class Course {
    private static String instituteName = "TechVerse Institute";

    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
