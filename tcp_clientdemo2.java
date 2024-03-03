import java.util.Scanner;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;


public class tcp_clientdemo2 {
    public static void main(String args[]){
        try {
            Socket socket = new Socket("localhost",7777);
            DataInputStream datain = new DataInputStream(socket.getInputStream());
            DataOutputStream dataout = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String input="",output="";
            do{
                System.out.println("Enter message to server: ");
                input = scanner.nextLine();
                dataout.writeUTF(input);
                dataout.flush();
                output = datain.readUTF();
                System.out.println("Server says: "+output);
            }while(!(input.equals("Bye") && output.equals("Bye")));
            socket.close();
            scanner.close();
            //System.exit(1);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
