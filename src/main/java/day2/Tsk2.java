package day2;

import java.util.Scanner;

public class Tsk2 {
//    Есть два числа, которые задаются пользователем через консоль (назовем эти два
//            числа a и b). Используя цикл for, вывести все числа из диапазона между a и b,
//    которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b ; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
