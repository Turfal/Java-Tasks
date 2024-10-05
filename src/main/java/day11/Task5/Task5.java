package day11.Task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Members> mebersList = new ArrayList<>();
        mebersList.add(new Members("Bob", 2001));
        mebersList.add(new Members("Clop", 2002));
        List<Members> members1 = new ArrayList<>();
        members1.add(new Members("Lox", 3000));
        members1.add(new Members("Kek", 3001));
        MusicBand musicBand = new MusicBand("First", 2000, mebersList);
        MusicBand musicBand1 = new MusicBand("Second", 3000, members1);

        musicBand.printMembers();
        musicBand1.printMembers();
        System.out.println();
        MusicBand.transferMembers(musicBand, musicBand1);
        musicBand.printMembers();
        musicBand1.printMembers();

    }
}
