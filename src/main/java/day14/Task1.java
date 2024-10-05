package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File readFile = new File("src/main/resources/shoes.csv");
        File writeFile = new File("src/main/resources/txtShoes");
        List<Shoes> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(readFile)){
            List<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
            for (String line : lines) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    list.add(new Shoes(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        // Запись данных в файл
        try (PrintWriter pw = new PrintWriter(writeFile)) {
            pw.println("|----------------------|--------|------------|");
            pw.println("|       НАЗВАНИЕ       | РАЗМЕР | КОЛИЧЕСТВО |");
            pw.println("|----------------------|--------|------------|");

            for (Shoes shoes : list) {
                String newName = shoes.getNameOfShoes();
                if(shoes.getNameOfShoes().length() > 18){
                    newName = shoes.getNameOfShoes().substring(0, 16) + "...";
                }
                pw.println(String.format("| %-20s | %-6s | %-10s |",
                        newName, shoes.getLength(), shoes.getCount()));
            }
            pw.println("|----------------------|--------|------------|");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
