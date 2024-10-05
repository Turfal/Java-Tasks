package day11.day11TEST;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();

        carList.add("first");
        carList.add("second");
        carList.add("third");
        carList.add("four");
        carList.add("five");

        for(String car : carList){
            System.out.println(car);
        }
        carList.add(3, "Test");
        carList.remove(0);
        System.out.println();
        for (String car : carList)
            System.out.println(car);
    }
}
