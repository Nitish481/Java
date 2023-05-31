import java.util.*;

public class ass_11 {
    static class Instructor {
        String name;
        long phone;

        public void set(String n, long p) {
            name = n;
            phone = p;
        }

        public void view() {
            System.out.println("Instructor details: ");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("");
        }
    }

    static class Textbook {
        String title, author, publisher;

        public void set(String t, String a, String p) {
            title = t;
            author = a;
            publisher = p;
        }

        public void view() {
            System.out.println("Textbook details: ");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publisher: " + publisher);
            System.out.println("");
        }
    }

    static class Course {
        String courseName;
        Instructor instructor;
        Textbook textbook;

        public void set(String c, Instructor i, Textbook t) {
            courseName = c;
            instructor = i;
            textbook = t;
        }

        public void view() {
            System.out.println("Course details: ");
            System.out.println("Course name: " + courseName);
            instructor.view();
            textbook.view();
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get instructor details
        System.out.print("Enter instructor name: ");
        String instructorName = scanner.nextLine();
        System.out.print("Enter instructor phone number: ");
        long instructorPhone = scanner.nextLong();

        // Create an instructor object
        Instructor instructor = new Instructor();
        instructor.set(instructorName, instructorPhone);

        // Get textbook details
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter textbook title: ");
        String textbookTitle = scanner.nextLine();
        System.out.print("Enter textbook author: ");
        String textbookAuthor = scanner.nextLine();
        System.out.print("Enter textbook publisher: ");
        String textbookPublisher = scanner.nextLine();

        // Create a textbook object
        Textbook textbook = new Textbook();
        textbook.set(textbookTitle, textbookAuthor, textbookPublisher);

        // Get course details
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        // Create a course object
        Course course = new Course();
        course.set(courseName, instructor, textbook);

        // Display course details
        course.view();

        scanner.close();
    }
}
