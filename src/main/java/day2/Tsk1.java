package day2;

import java.util.Scanner;

public class Tsk1 {
//    Реализовать программу, которая принимает на вход через консоль с помощью
//    класса Scanner, число, соответствующее количеству этажей в здании. Используя
//    условный оператор if, необходимо вывести в консоль сообщение о типе такого дома./

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        if(count>0 && count <= 4){
            System.out.println("Малоэтажный");
        }else if (count >= 5 && count <= 8){
            System.out.println("Среднеэтажный");
        }else if(count>=9){
            System.out.println("Многоэтажный");
        }else System.out.println("Ошибка");
    }
}
