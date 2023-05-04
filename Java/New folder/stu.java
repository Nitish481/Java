public class stu {
    private int roll;
    private String name;
    private double score;

    // Constructor
    public stu(int roll, String name, double score) {
        this.roll = roll;
        this.name = name;
        this.score = score;
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

    // Copy method
    public void copy(stu other) {
        other.setRoll(this.roll);
        other.setName(this.name);
        other.setScore(this.score);
    }

    // Test the class
    public static void main(String[] args) {
        stu s1 = new stu(1, "Alice", 90.5);
        System.out.println("Original student:");
        s1.display();

        stu s2 = new stu(2, "Bob", 85.0);
        System.out.println("Copying student 1 to student 2...");
        s1.copy(s2);
        System.out.println("Copied student:");
        s2.display();

        System.out.println("Changing student 1's attributes...");
        s1.setRoll(3);
        s1.setName("Charlie");
        s1.setScore(95.0);
        System.out.println("Student 1:");
        s1.display();
        System.out.println("Student 2:");
        s2.display();
    }
}
