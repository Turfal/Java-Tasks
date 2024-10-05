package day11.Task5;

public class Members {
    private String member;
    private int year;

    public String getMember(){
        return member;
    }
    public int getYear(){
        return year;
    }
    public Members(String name, int year){
        this.member = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Members{" +
                "member='" + member + '\'' +
                ", year=" + year +
                '}';
    }
}
