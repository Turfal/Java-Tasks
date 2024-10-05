package day9.Task1;

public class Teacher extends Human{
    private String prdName;

    public String getPrdName(){
        return prdName;
    }
    public void setPrdName(String prdName){
        this.prdName = prdName;
    }

    public Teacher(String name, String prdName){
        super(name);
        this.prdName = prdName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());

    }
}
