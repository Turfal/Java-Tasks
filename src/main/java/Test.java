import java.util.Arrays;
import java.util.Random;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//  Однопоточный тесовый сервер на localhost:3345
//   Условие завершения соединения - текст в потоке "quit"
public class Test {
    public static void main(String[] args) throws InterruptedException {
        try (ServerSocket server = new ServerSocket(3345)) {
            Socket client = server.accept();
            System.out.println("Подключение принято");

            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("DataInputStream создан");
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            System.out.println(("DataOutputStream создан"));

            while (client.isClosed()) {
                System.out.println("Сервер читает из сокета (канала)");
                String entry = in.readUTF();
                System.out.println("Прочитано в сообщении клиента" + entry);
                // серверный обработчик
                System.out.println("Сервер пытается написать в сокет(канал)");

                if (entry.equalsIgnoreCase("quit")) {
                    System.out.println("Клиент закрывает сокет");
                    out.writeUTF("Сервер ответил" + entry + " - Ok");
                    out.flush();
                    Thread.sleep(3000);
                    break;
                }

                out.writeUTF("Сервер ответил: " + entry + " - Ok");
                System.out.println("Сервер написал сообщение клиенту");
                out.flush();
            }

            // выполнен выход - завершаем соединение
            System.out.println("Клиент отсоединен");
            System.out.println("Соединение и канал закрыты");

            in.close();
            out.close();
            client.close();

            System.out.println("Соединение и канал закрыты");

            in.close();
            out.close();
            client.close();

            System.out.println("Завершено");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}