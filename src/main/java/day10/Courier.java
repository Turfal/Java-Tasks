package day10;

public class Courier implements Worker {
    private int salary;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() >= 2000)
            salary*=2;
    }

    public String toString(){
        return "Зарплата: " + salary;
    }
}
