public class Student {
    private int roll;
    private String name;
    private double score;

    // Constructors
    public Student() {
        this.roll = 0;
        this.name = "";
        this.score = 0.0;
    }

    public Student(int roll) {
        this.roll = roll;
        this.name = "";
        this.score = 0.0;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.score = 0.0;
    }

    public Student(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.score = other.score;
    }

    // Setters
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Getters
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    // Display attributes
    public void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }

    // Test the class
    public static void main(String[] args) {
        // Create objects with different constructors
        Student s1 = new Student();
        Student s2 = new Student(1);
        Student s3 = new Student(2, "Alice");
        Student s4 = new Student(3, "Bob", 90.5);

        // Test copy constructor
        Student s5 = new Student(s4);
        System.out.println("Original student:");
        s4.display();
        System.out.println("Copied student:");
        s5.display();
        System.out.println("Changing original student's attributes...");
        s4.setRoll(4);
        s4.setName("Charlie");
        s4.setScore(85.0);
        System.out.println("Original student:");
        s4.display();
        System.out.println("Copied student:");
        s5.display();
    }
}
