import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String major;
    private List<Course> registeredCourses = new ArrayList<>();

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public List<Course> getRegisteredCourses() { return registeredCourses; }

    public boolean isRegisteredIn(Course c) {
        return registeredCourses.contains(c);
    }

    public void addCourse(Course c) {
        registeredCourses.add(c);
    }
}
