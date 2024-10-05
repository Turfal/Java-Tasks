package day11.day11TEST.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("Pupa");
        List<String> members2 = new ArrayList<>();
        members2.add("Lupa");
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
