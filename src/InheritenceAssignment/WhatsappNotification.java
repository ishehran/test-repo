package src.InheritenceAssignment;

public class WhatsappNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Connecting to WhatsApp API... WhatsApp message sent: " + message);
    }
    
}
