package day5.Tsk2;

public class Motorbike {
    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    private final int year;
    private final String color;
    private final String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getInfo(){
        return "Year: " + getYear() +
                "\nModel: " + getModel() +
                "\nColor: " + getColor();
    }
}
