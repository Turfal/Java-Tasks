package day5.Tsk1;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String printInfo(){
        return "Color: " + getColor() +"\n"+
                "Model: " + getModel() +"\n"+
                "Year: " + getYear();
    }
}
