package Day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }
    public static List<String> parseFileToStringList() {
        List<String> res = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("people"));
            for(int i = 0; i < 4; i++){
                String temp = sc.nextLine();
                res.add(temp);
                String StringYear = temp.substring(temp.lastIndexOf(" ")).replace(" ", "");
                int year = Integer.parseInt(StringYear);
                if(year < 0){
                    throw new RuntimeException("Некорректный файл");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return res;
    }
}
