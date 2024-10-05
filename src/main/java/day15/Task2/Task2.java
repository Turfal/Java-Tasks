package day15.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("src/main/java/day15/Task2/file1");
        File file2 = new File("src/main/java/day15/Task2/file2");
        Random random = new Random();

        try(PrintWriter pw = new PrintWriter(file1)){
            for (int i = 0; i < 1000; i++) {
                pw.println(random.nextInt(100));
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        try(Scanner scanner = new Scanner(file1)) {
            try(PrintWriter pw = new PrintWriter(file2)) {
                double nums = 0;
                while (scanner.hasNextLine()){
                    for (int i = 0; i < 20; i++) {
                        nums += Integer.parseInt(scanner.nextLine());
                    }
                    pw.println(nums/20);
                    nums = 0;
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        printResult(file2);
    }
    public static void printResult(File file){
        double sum = 0;
        try(Scanner scanner = new Scanner(file)) {
           while (scanner.hasNextLine()){
               sum+=Double.parseDouble(scanner.nextLine());
           }
            System.out.println((int) sum);
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

}
