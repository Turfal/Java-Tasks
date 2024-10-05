package day10;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);


        picker.doWork();
        courier.doWork();
        picker.doWork();
        courier.doWork();
        picker.bonus();
        courier.bonus();

        System.out.println();
        System.out.println(picker);
        System.out.println(courier);
        System.out.println();
        System.out.println(warehouse);
    }

    public static void quicksort(int[] array, int low, int high){
        if(array.length == 0 || low>=high) return;

        int middle = low + (high - low) / 2;
        int border = array[middle];

        int i = low, j = high;

        while (i <= j){
            while (array[i] < border) i++;
            while (array[j] > border) j--;

            if(i<=j){
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;

                i++;
                j--;
            }
        }
        if(low < j) quicksort(array, low, j);
        if(high > i) quicksort(array, i, high);
    }
}
