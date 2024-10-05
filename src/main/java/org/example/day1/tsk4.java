package org.example.day1;

public class tsk4 {
    public static void main(String[] args) {
        //Вывести Олимпиада Х года, до 2020 включительно, используя цикл while
        int year = 1980;
        while (year!=2024){
            System.out.println("Олимпиада " + year + " года");
            year+=4;
        }
    }
}
