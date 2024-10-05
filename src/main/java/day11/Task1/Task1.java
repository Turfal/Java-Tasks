package day11.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Tesla"));
        carsList.add(new Car("BMW"));
        carsList.add(new Car("Toyota"));
        carsList.add(new Car("Mercedes"));
        carsList.add(new Car("Metsubishi"));

        carsList.remove(0);
        carsList.add(2, new Car("SASITE"));
        for(Car car: carsList){
            System.out.println(car.getCarName());
        }
    }
}
class Car{
        private String carName;

        public Car(String carName){
            this.carName = carName;
        }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
