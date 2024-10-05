package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", "Math");
        Student student = new Student("Poul");

        System.out.println(teacher.evaluate(student.getName()));
    }
}
