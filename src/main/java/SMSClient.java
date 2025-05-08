public class SMSClient implements Observer {
    public void update(String message) {
        System.out.println("SMS: " + message);
    }
}