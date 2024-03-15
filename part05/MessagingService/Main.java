package MessagingService;

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();
        Message message = new Message("Eirin","Hello World!");
        messagingService.add(message);
        Message message1 = new Message("John","Hello!");
        messagingService.add(message1);
        System.out.println(messagingService.getMessages());
    }
}
