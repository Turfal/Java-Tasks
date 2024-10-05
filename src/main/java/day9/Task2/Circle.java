package day9.Task2;

public class Circle extends Figure{
    private double radC;

    public void setRadC(double radC){
        this.radC = radC;
    }

    public double getRadC(){
        return radC;
    }

    public Circle(String color, double radC){
        super(color);
        this.radC = radC;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(getRadC(), 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*getRadC();
    }
}
