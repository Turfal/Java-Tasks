package day7.Task1.Task2;

public class Airplane {
    private final String producer;
    private final int year;
    private final int length;
    private final int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }
    public void fillUp(int count){
        this.fuel += count;
    }
    public static void compareAirplanes(Airplane airplane, Airplane airplane2){
        if(airplane.length > airplane2.length){
            System.out.println("Самый длинный самолет:\n" + airplane.info());
        }else {
            System.out.println("Caмый длинный самолет:\n" + airplane2.info());
        }
    }
    public String info(){
        return "Изготовитель: " + producer +
                "\nГод выпуска: " + year +
                "\nДлина: " + length +
                "\nВес: " + weight +
                "\nКоличество топлива в баке: " + getFuel();
    }
}
