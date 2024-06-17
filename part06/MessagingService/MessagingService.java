package MessagingService;

import java.util.ArrayList;

public class MessagingService {
private  ArrayList<Message> messages = new ArrayList<>();

public MessagingService(){
    this.messages = new ArrayList<>();
}
public void add(Message message){
    if(message.getContent().length() <=280){
        messages.add(message);
    }else{
        System.out.println("Please, write a shorter message!");
    }
}

public ArrayList<Message> getMessages(){
    return messages;
}


}
