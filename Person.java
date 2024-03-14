import java.util.ArrayList;

public abstract class Person {
    private String name;



    public Person() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean addCourse(String course) {
        return true;
    }


    abstract boolean addCourse(ArrayList<String> passedCourse);
}
