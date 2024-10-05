package day12;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }
    public static List<Message> getMessages(){
        return messages;
    }
    public static void showDialog(User us1, User us2){
        for(Message mes : messages){
            if(mes.getSender() == us1 && mes.getReceiver() == us2 ||
            mes.getSender() == us2 && mes.getReceiver() == us1){
                System.out.println(mes.getSender() + ": " + mes.getText());
            }
        }
    }
}
