package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Student", "4P1");
        Teacher teacher = new Teacher("Teacher", "Programming");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getPrdName());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}
