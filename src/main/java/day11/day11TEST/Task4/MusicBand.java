package day11.day11TEST.Task4;

import day11.Task5.Members;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<String> members;

    public MusicBand(String name, int year, List<String> members){
        this.members = members;
        this.name = name;
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public static void transferMembers(MusicBand musicBand, MusicBand musicBand2){
        for(String m : musicBand.getMembers()){
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
