public class Course {
    String Name;
    String CourseID;
    int credit;

    Course(String Name,String CourseID,int credit){
        this.Name=Name;
        this.CourseID=CourseID;
        this.credit=credit;
    }
    void display(){
        System.out.println("Course Name "+Name);
        System.out.println("Course ID "+CourseID);
        System.out.println("Course Credits "+credit);
    }
}
