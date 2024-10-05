package day11.Task5;

import java.util.List;

public class MusicBand {
    private final String groupName;
    private final int year;

    private List<Members> nameAndLastName;

    public MusicBand(String groupName, int year, List<Members> members){
        this.nameAndLastName = members;
        this.groupName = groupName;
        this.year = year;
    }

    public List<Members> getNameAndLastName() {
        return nameAndLastName;
    }

    public void setNameAndLastName(List<Members> nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public int getYear() {
        return year;
    }

    public String getGroupName() {
        return groupName;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for(Members members : a.getNameAndLastName()){
            b.getNameAndLastName().add(members);
        }
        a.getNameAndLastName().clear();
    }
    public void printMembers(){
        System.out.println(this.nameAndLastName);
    }
}
