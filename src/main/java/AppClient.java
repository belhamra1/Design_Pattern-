public class AppClient implements Observer {
    public void update(String message) {
        System.out.println("App: " + message);
    }
}