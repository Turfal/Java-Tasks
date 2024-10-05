package day11.day11TEST.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("First", 1993));
        musicBands.add(new MusicBand("Second", 1994));
        musicBands.add(new MusicBand("Tri", 1995));
        musicBands.add(new MusicBand("Koka", 1996));
        musicBands.add(new MusicBand("Loka", 1997));
        musicBands.add(new MusicBand("Moka", 2001));
        musicBands.add(new MusicBand("Kiki", 2002));
        musicBands.add(new MusicBand("Momo", 2003));
        musicBands.add(new MusicBand("Susi", 2004));
        musicBands.add(new MusicBand("Kilka", 3000));

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println();
        System.out.println(groupsAfter2000(musicBands));

    }
    public static List<MusicBand> groupsAfter2000 (List<MusicBand> musicBands){
        List<MusicBand> after2000 = new ArrayList<>();
        for(MusicBand musicBand : musicBands){
            if(musicBand.getYear() > 2000){
                after2000.add(musicBand);
            }
        }
        return after2000;
    }
}
