import java.io.*;
import java.net.Socket;

public class TestAsClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 3345);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());){

            System.out.println("Client connecting...");
            System.out.println("Initialization comp...");
            System.out.println("Client is writing in chanel == dos, Client is read = dis");

            while (!socket.isInputShutdown()){
                if(bufferedReader.ready()){
                    System.out.println("Client is giving message to chanel");
                    Thread.sleep(1000);
                    String clientCommand = bufferedReader.readLine();

                    dataOutputStream.writeUTF(clientCommand);
                    dataOutputStream.flush();
                    System.out.println("Client send message: " + clientCommand + "server");
                    Thread.sleep(1000);

                    if(clientCommand.equalsIgnoreCase("quit")){
                        System.out.println("Client close connect");
                        Thread.sleep(2000);
                        if(dataInputStream.read() > -1){
                            System.out.println("Reading from tread");
                            String in = dataInputStream.readUTF();
                            System.out.println(in);
                        }
                        break;
                    }
                    System.out.println("Client send message");
                    Thread.sleep(2000);
                    if(dataInputStream.read() > -1){
                        System.out.println("Reading from tread");
                        String in = dataInputStream.readUTF();
                        System.out.println(in);
                    }
                }
            }
            System.out.println("Connection is closed");
        } catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}
