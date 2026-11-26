public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", "P001");
        Person p2 = new Student("Navindran", "202607010108");
        Person p3 = new Lecturer("Sir Nazmirul", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}