package lesson6.multi_client_server;

public class App {

    public static void main(String[] args) {
        new Server(new InMemoryUserServiceImpl()).start();
    }
}
