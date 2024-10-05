package day10;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Информация о складе\n" +
                "Количество собраных заказов: " + countOrder +
                "\nДоход от доставленых заказов: " + balance;
    }
}
