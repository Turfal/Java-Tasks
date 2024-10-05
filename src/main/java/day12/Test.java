package day12;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Klop");

        user1.subscribe(user2);
        System.out.println("Пользователь: " + user1.getUsername() +". Подписан на пользователя: " + user2.getUsername()+ " " +user1.isSubscribed(user2));
        System.out.println("Пользователи друзья: " + user1.isFriend(user2));
        user2.subscribe(user1);
        System.out.println("Пользователи друзья: " + user1.isFriend(user2));
        System.out.println();
        user1.sendMessage(user2, "Привет! клоп");
        user2.sendMessage(user1, "Ghbdtn!");
        user2.sendMessage(user1, "{B{{B{{B{B{");
        user1.sendMessage(user2, "{F{{F{F{F{F{{");
        MessageDatabase.showDialog(user1, user2);
        System.out.println();
        System.out.println(MessageDatabase.getMessages());
    }
}
