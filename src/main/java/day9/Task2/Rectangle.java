package day9.Task2;

public class Rectangle extends Figure  {
    private double shir;
    private double vis;

    public double getShir() {
        return shir;
    }

    public void setShir(double shir) {
        this.shir = shir;
    }

    public double getVis() {
        return vis;
    }

    public void setVis(double vis) {
        this.vis = vis;
    }

    public Rectangle(String color, double shir, double vis) {
        super(color);
        this.shir = shir;
        this.vis = vis;
    }

    @Override
    public double area() {
        return getShir()*getVis();
    }

    @Override
    public double perimeter() {
        return 2*(getShir()+getVis());
    }
}
