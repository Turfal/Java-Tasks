package Day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("nums");

        int result = 0;
        try {
           Scanner scanner = new Scanner(file);
           String[] array = scanner.nextLine().split(" ");
           if (array.length != 10){
               throw new RuntimeException("Некорректный входной файл");
           }
           for (String s : array) {
                result += Integer.parseInt(s);
           }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println(result);
    }
}
