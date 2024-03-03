import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp_serverdemo {
    public static void main(String[] args) {
        try{
            //socket,connection, binding
            ServerSocket ss = new ServerSocket(7777);// You can pass the port number as parameter
            Socket s = ss.accept();
            System.out.println("Connection established with client");
            DataInputStream dos1 = new DataInputStream(s.getInputStream());//Data inputstream is used to get the data sent by the client
            System.out.println("Client says:"+dos1.readUTF());//utf is the encryption format it is the best practice to always use encryption
            ss.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }    
}
