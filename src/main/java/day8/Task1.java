package day8;

public class Task1 {
    public static void main(String[] args) {
        String stringBuilder = "";
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <= 20000; i++) {
            stringBuilder+=i;
        }
        System.out.println(stringBuilder);
        System.out.println(System.currentTimeMillis());
    }
}
