package day10;

public class Picker implements Worker {
    private int salary;
    private final Warehouse warehouse;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrder() >= 2){
            salary*=2;
        }
    }

    public String toString(){
         return  "Зарплата: " + salary;
    }
}
