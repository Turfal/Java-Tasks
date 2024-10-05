package day11.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("Bittles", 2000));
        musicBandList.add(new MusicBand("Sasiski", 2001));
        musicBandList.add(new MusicBand("Sosulki", 2002));
        musicBandList.add(new MusicBand("Kishki", 2003));
        musicBandList.add(new MusicBand("Kakshki", 2004));
        musicBandList.add(new MusicBand("Kirieshki", 1999));
        musicBandList.add(new MusicBand("Krutki", 1998));
        musicBandList.add(new MusicBand("Kaki", 1997));
        musicBandList.add(new MusicBand("Kropki", 1996));
        musicBandList.add(new MusicBand("Kakipuki", 1995));

        for(MusicBand musicBand : musicBandList){
            System.out.println("Имя группы: " + musicBand.getName() + ", Год группы: " + musicBand.getYear());
        }
        System.out.println("----------------------------------" + "\nГруппы после 2000" + "\n----------------------------------");
        for (MusicBand musicBand : groupsAfter2000(musicBandList)){
            System.out.println("Имя группы: " + musicBand.getName() + ", Год группы: " + musicBand.getYear());
        }

    }
    public  static List<MusicBand> groupsAfter2000 (List<MusicBand> bands){
        List<MusicBand> after2000 = new ArrayList<>();

        for(MusicBand musicBand : bands){
            if(musicBand.getYear() >= 2000){
                after2000.add(musicBand);
            }
        }
        return after2000;
    }
}
