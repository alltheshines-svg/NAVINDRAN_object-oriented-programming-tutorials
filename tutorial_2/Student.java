//Attributes of the class
public class Student {
    private String name;
    private int age;
    double gpa;

    //Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

   //Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    //Another Methods
    public void study() {
        System.out.println(name + " is studying.");
    }

    //Yte Another Method
    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }
}