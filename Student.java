import java.util.ArrayList;
public class Student extends Person{
    String name;
    ArrayList<String> passedCourse = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();
    public Student(ArrayList<String> currentCourses){
        super();
        this.name = name;
    }
    @Override
    boolean addCourse(ArrayList<String> passedCourse){
        return true;
    }
}
