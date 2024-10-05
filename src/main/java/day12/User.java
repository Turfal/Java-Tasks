package day12;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subs = new ArrayList<>();

    public User(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubs() {
        return subs;
    }

    public void subscribe(User user){
        subs.add(user);
        System.out.println("Пользователь "+this.username+ " успешно подписалcя на пользователя: " + user.getUsername());
    }
    public boolean isSubscribed(User user){
        boolean res = false;
        for(User us : subs){
            if (us == user) {
                res = true;
                break;
            }
        }
        return res;
    }

    public boolean isFriend(User user){
        return isSubscribed(user) && user.isSubscribed(this);
    }
    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString(){
        return this.username;
    }
}
