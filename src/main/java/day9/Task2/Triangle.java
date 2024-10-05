package day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private final double p = (getA() + getB() + getC())/2;

    private double getP() {
        return p;
    }

    @Override
    public double area() {
        return Math.sqrt(getP()*(getP()-getA())*(getP()-getB())*(getP()-getC()));
    }

    @Override
    public double perimeter() {
        return getA()+getB()+getC();
    }
}
