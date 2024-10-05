package day11.day11TEST.Task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;

    private final List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members){
        this.members = members;
        this.name = name;
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2){
        for(MusicArtist m : musicBand.getMembers()){
            musicBand2.getMembers().add(m);
        }
        musicBand.getMembers().clear();
     }

     public void printMembers(){
         System.out.println(this.members);
     }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
