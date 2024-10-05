package day11.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String groupName;
    private final int year;

    private List<String> nameAndLastName;

    public MusicBand(String groupName, int year, List<String> nameAndLastName){
        this.nameAndLastName = nameAndLastName;
        this.groupName = groupName;
        this.year = year;
    }

    public List<String> getNameAndLastName() {
        return nameAndLastName;
    }

    public void setNameAndLastName(List<String> nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public int getYear() {
        return year;
    }

    public String getGroupName() {
        return groupName;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for(String member : a.getNameAndLastName()){
            b.getNameAndLastName().add(member);
        }
        a.getNameAndLastName().clear();
    }
    public void printMembers(){
        System.out.println(this.nameAndLastName);
    }
}
