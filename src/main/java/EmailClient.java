public class EmailClient implements Observer {
    public void update(String message) {
        System.out.println("Email: " + message);
    }
}