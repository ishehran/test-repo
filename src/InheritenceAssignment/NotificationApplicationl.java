package src.InheritenceAssignment;

public class NotificationApplicationl {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotificaiton();
        Notification whatsappNotification = new WhatsappNotification();

        emailNotification.send("Hello via Email!");
        smsNotification.send("Hello via SMS!");
        whatsappNotification.send("Hello via WhatsApp!");
    }
}
