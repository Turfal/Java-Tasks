package day7.Task1.Task2;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AIRBUS", 2020, 30, 10);
        Airplane airplane2 = new Airplane("EMIRATE", 2024, 31, 20);

        airplane.fillUp(100);
        airplane.fillUp(200);
        airplane2.fillUp(350);

        System.out.println(airplane.info());
        System.out.println();
        Airplane.compareAirplanes(airplane, airplane2);
    }
}
