package day2;

import java.util.Scanner;

public class Tsk4 {
    //Реализовать программу, которая принимает на вход через консоль с помощью класса
    //Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить
    //значение y.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y;

        if(x>=5){
            y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        }else if(x>-3 && x<5){
            y = (x + 3)*(Math.pow(x, 2) - 2);
            System.out.println(y);
        }else {
            y = 420;
            System.out.println(y);}
    }
}
