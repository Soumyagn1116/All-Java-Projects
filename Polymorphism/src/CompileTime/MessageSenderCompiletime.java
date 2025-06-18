package CompileTime;
public class MessageSenderCompiletime {

    void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }

    void sendMessage(String message, String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }

    void sendMessage(String message, boolean isUrgent) {
        if (isUrgent)
            System.out.println("Urgent: " + message);
        else
            System.out.println("Sending message: " + message);
    }

    public static void main(String[] args) {
        MessageSenderCompiletime sender = new MessageSenderCompiletime();
        sender.sendMessage("Hello");
        sender.sendMessage("Hello!", "Soumya");
        sender.sendMessage("Server down!", true);
    }
}

