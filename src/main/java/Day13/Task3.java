package Day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Person.parseFileToObjList());
    }
}
class Person{
    private String name;
    private int year;

    public Person(String name, int year){
        this.name = name;
        this.year = year;
    }

    public static List<Person> parseFileToObjList() throws FileNotFoundException {
        File file = new File("people");
        Scanner sc = new Scanner(file);
        List<Person> result = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            String temp = sc.nextLine();
            String name = temp.substring(0, temp.indexOf(" "));
            String StringYear = temp.substring(temp.lastIndexOf(" ")).replace(" ", "");
            int year = Integer.parseInt(StringYear);
            if(year < 0){
                throw new RuntimeException("Некорректный файл");
            }
            result.add(new Person(name, year));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
