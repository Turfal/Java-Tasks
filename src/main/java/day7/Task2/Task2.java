package day7.Task2;

public class Task2 {
    public static void main(String[] args) {
        Player player = new Player(90);
        Player player1 = new Player(91);
        Player player2 = new Player(92);
        Player player3 = new Player(93);
        Player player4 = new Player(94);
        Player player5 = new Player(95);

        Player.info();

        player1.run();
        player1.run();
        System.out.println(player1.getStamina());
    }
}
