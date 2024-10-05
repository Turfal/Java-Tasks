package day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Tsk2 {
    //Создать новый массив размера 100 и заполнить его случайными числами из
    //диапазона от 0 до 10000.
    //Затем, используя циклы for each вывести:
    //- наибольший элемент массива
    //- наименьший элемент массива
    //- количество элементов массива, оканчивающихся на 0
    //- сумму элементов массива, оканчивающихся на 0
    //Использовать сортировку запрещено.
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int element : array) {
            if(element>max){
                max = element;
            }
            if(element<min){
                min = element;
            }
            if(element%10 == 0) {
                counter++;
                sum+=element;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(counter);
        System.out.println(sum);
    }
}
