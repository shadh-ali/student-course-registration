public class Course {
    private String code;
    private String name;
    private int creditHours;
    private int capacity;
    private int enrolled = 0;

    public Course(String code, String name, int creditHours, int capacity) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.capacity = capacity;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getCreditHours() { return creditHours; }

    public boolean isAvailable() {
        return enrolled < capacity;
    }

    public void enroll() {
        enrolled++;
    }

    @Override
    public String toString() {
        return code + " - " + name + " (" + creditHours + " hrs, seats left: " + (capacity - enrolled) + ")";
    }
}
