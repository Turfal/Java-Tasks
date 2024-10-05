package day6.Task2;

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
    public String info(){
        return "Изготовитель: " + producer +
                "\nГод выпуска: " + year +
                "\nДлина: " + length +
                "\nВес: " + weight +
                "\nКоличество топлива в баке: " + getFuel();
    }

    public String toString(){
        return "Изготовитель: " + producer +
                "\nГод выпуска: " + year +
                "\nДлина: " + length +
                "\nВес: " + weight +
                "\nКоличество топлива в баке: Xyй" + getFuel();
    }
}
