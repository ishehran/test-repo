package src.InheritenceAssignment;

public class SmsNotificaiton extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Connecting to SMS Telecom provider... SMS sent: " + message);
    }
}
