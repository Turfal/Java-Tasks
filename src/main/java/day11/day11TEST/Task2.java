package day11.day11TEST;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && i <= 30 && i != 0)
                integerList.add(i);
            if (i % 2 == 0 && i >= 300)
                integerList.add(i);
        }
        System.out.println(integerList);
    }
}
