package day3;

import java.util.Objects;
import java.util.Scanner;

public class Tsk1 {
    public static void main(String[] args) {
        // Реализовать программу, которая в консоль выводит название страны, принимая на
        //вход название города. Программа должна работать до тех пор, пока не будет введено
        //слово “Stop”.
        //Реализовать, используя следующие данные:
        //Москва, Владивосток, Ростов - Россия
        //Рим, Милан, Турин - Италия
        Scanner sc = new Scanner(System.in);

        String city = null;
        while (!Objects.equals(city, "Stop")) {
            city = sc.nextLine();
            switch (city.toLowerCase()) {
                case "москва":
                case "владивосток":
                case "ростов": {
                    System.out.println("Россия");
                    break;
                }
                case "рим":
                case "милан":
                case "турин": {
                    System.out.println("Италия");
                    break;
                }
                case "ливерпуль":
                case "манчестер":
                case "лондон": {
                    System.out.println("Англия");
                    break;
                }
                case "stop":{
                    break;
                }
                default: {
                    System.out.println("Неизвестная страна");
                    break;
                }
            }
        }
    }
}
