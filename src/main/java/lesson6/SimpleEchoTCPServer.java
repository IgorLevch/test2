package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoTCPServer {
    private static final int PORT = 8189;


    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) { // создали сервер сокет и забили определенный порт
            System.out.println("Server started");
            Socket socket = serverSocket.accept();  // начинаем этот порт слушать методом accept
            System.out.println("Client connected"); // кто-то постучался в порт - мы говорим -- клиент подключился

            DataInputStream in = new DataInputStream(socket.getInputStream()); // получаем входящий поток данных
            // от клиента
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // формируем исходящий поток,
            // в который что-то пишем.
            while (true) {
                String income = in.readUTF();
                System.out.println("Received: " + income);
                Thread.sleep(50);
                out.writeUTF("ECHO: " + income);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}
