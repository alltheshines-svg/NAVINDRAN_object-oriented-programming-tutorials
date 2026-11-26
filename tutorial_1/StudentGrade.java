import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        char grade;
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);

        scanner.close();
    }
}