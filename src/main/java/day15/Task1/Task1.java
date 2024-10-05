package day15.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("nums");
        try(Scanner scanner = new Scanner(file)){
            String[] array = scanner.nextLine().split(" ");
            double nums = 0;
            for (String s : array) {
                nums += Integer.parseInt(s);
            }
            System.out.println(nums);
            System.out.println(nums/array.length);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
