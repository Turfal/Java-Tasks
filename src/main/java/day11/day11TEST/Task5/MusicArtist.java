package day11.day11TEST.Task5;

public class MusicArtist {
    private final String name;
    private final int year;

    public MusicArtist(String name, int year){
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
