package day5.Tsk1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2020);
        car.setColor("Yellow");
        car.setModel("Model Y");

        System.out.println(car.printInfo());
    }
}
