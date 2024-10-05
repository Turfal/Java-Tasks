package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AIRBUS", 2020, 30, 10);

        airplane.fillUp(100);
        airplane.fillUp(200);

        System.out.println(airplane);
    }
}
