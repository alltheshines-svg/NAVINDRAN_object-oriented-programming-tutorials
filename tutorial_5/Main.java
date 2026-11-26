public class Main {
    public static void main (String[] args) {
        Student s1 = new Student();

        s1.setStudentID("202607010108");
        s1.setName("Navindran");
        s1.setCgpa(3.5);
        s1.setProgramme("DIT1113");

        System.out.println("Student ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());
        System.out.println("Programme: " + s1.getProgramme());
    }
}