package day4;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Tsk3 {
    //Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
    //матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
    //В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
    //строк несколько, вывести индекс последней из них.
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
            if(sum>=maxSum){
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(maxSumInd);
    }
}

