package day3;

import java.util.Scanner;

public class Tsk2 {
    //Реализовать программу, которая пока работает, принимает на вход от пользователя
    //два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
    //результат деления и выводит его в консоль. Программа останавливает свою работу
    //тогда, когда пользователь вводит 0 в качестве делителя.
    //(для этих вещественных чисел необходимо использовать тип double и метод
    //nextDouble() у Scanner’а соответственно).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b = Integer.MAX_VALUE;

        while (b!=0){
            System.out.println("Введите число: ");
            a = sc.nextDouble();
            System.out.println("Введите делитель: ");
            b = sc.nextDouble();
            if(b!=0) {
                System.out.println("Ответ: " + a / b);
                System.out.println();
            }
        }
    }
}
