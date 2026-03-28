package src.InheritenceAssignment;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Connecting to SMTP server... Email sent: " + message);
    }
    
}
