package day11.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("member1");
        members.add("member2");
        List<String> members2 = new ArrayList<>();
        members2.add("MEMBER");
        members2.add("MEMBER2");
        MusicBand musicBand = new MusicBand("First", 2000, members);
        MusicBand musicBand1 = new MusicBand("SECOND", 3000, members2);
        musicBand.printMembers();
        musicBand1.printMembers();
        System.out.println();
        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
