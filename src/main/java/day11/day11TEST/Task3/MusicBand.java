package day11.day11TEST.Task3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
