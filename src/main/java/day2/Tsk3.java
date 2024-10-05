package day2;

import java.util.Scanner;

public class Tsk3 {
    public static void main(String[] args) {
        //Тоже самое(Tsk2) c циклом while
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a<=b){
            if(a%5 == 0 && a%10!=0){
                System.out.println(a);
            }
            a++;
        }
    }
}
