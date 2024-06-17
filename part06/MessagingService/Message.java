package MessagingService;

public class Message {

    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Message)) {
            return false;
        }
        Message comparedMessage = (Message) compared;
        return this.sender.equals(comparedMessage.sender) && this.content.equals(comparedMessage.content);
    }
}