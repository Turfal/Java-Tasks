package day11.day11TEST.Task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Pupa", 2000));
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Loka", 2050));
        MusicBand a = new MusicBand("1", 2000, members);
        MusicBand b = new MusicBand("2", 3000, members2);

        a.printMembers();
        b.printMembers();
        MusicBand.transferMembers(a, b);
        System.out.println();
        a.printMembers();
        b.printMembers();

    }
}
