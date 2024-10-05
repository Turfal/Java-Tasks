package day14;

public class Shoes {
    private final String nameOfShoes;
    private final int length;
    private final int count;

    public Shoes(String nameOfShoes, int length, int count){
        this.nameOfShoes = nameOfShoes;
        this.length = length;
        this.count = count;
    }

    public String getNameOfShoes() {
        return nameOfShoes;
    }

    public int getLength() {
        return length;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return nameOfShoes + " " + length + " " + count + "\n";
    }
}
