package day4;

public class Tsk4 {
    public static void main(String[] args) {

    }
    public static int calculator(int num1, char operator, int num2) {
        int result;
        if(operator == '+'){
            result = num1+num2;
        }else if (operator == '-'){
            result = num1-num2;
        }else if (operator == '/'){
            result = num1/num2;
        } else if(operator == '*') {
            result = num1*num2;
        } else {
            result = 0;
        }
        return result;
    }
}
