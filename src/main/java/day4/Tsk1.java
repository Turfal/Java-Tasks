package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tsk1 {
    //С клавиатуры вводится число n - размер массива. Необходимо создать массив
    //указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
    //содержимое массива в консоль, а также вывести в консоль информацию о:
    //а) Длине массива
    //б) Количестве чисел больше 8
    //в) Количестве чисел равных 1
    //г) Количестве четных чисел
    //д) Количестве нечетных чисел
    //е) Сумме всех элементов массива
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = sc.nextInt();
        int[] array = new int[n];
        int countAbove8 = 0;
        int countOne = 0;
        int chet = 0;
        int neChet = 0;
        int sum = 0;

        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(0, 10);
            if(array[i] > 8) countAbove8++;
            if(array[i] == 1) countOne++;
            if (array[i]%2 == 0) {
                chet++;
            } else {
                neChet++;
            }
            sum+=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количестве чисел больше 8: " + countAbove8 +
                "\nКоличестве чисел равных 1: " + countOne +
                "\nКоличестве четных чисел: " + chet +
                "\nКоличестве нечетных чисел: " + neChet +
                "\nСуммa всех элементов массива: " + sum);

    }
}
