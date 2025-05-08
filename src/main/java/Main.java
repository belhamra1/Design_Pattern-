// Main.java
public class Main {
    public static void main(String[] args) {
        MessageService service = new MessageService();

        Observer email = new EmailClient();
        Observer sms = new SMSClient();
        Observer app = new AppClient();

        service.add(email);
        service.add(sms);
        service.add(app);

        service.notify("System update at 5 PM");
    }
}
