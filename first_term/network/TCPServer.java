package network;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPServer {
    public static void main(String []args) throws Exception
    {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("waiting for client..");
        Socket socket=ss.accept();
        BufferedReader br =new BufferedReader(new InputStreamReader (socket.getInputStream()) );
        PrintWriter out=new PrintWriter(socket.getOutputStream());
        Scanner sc=new Scanner(System.in);
        while(true)
        {
          String msg=br.readLine();
       System.out.println("message from client"+msg);
       out.println("Thank you");
       if(msg.equalsIgnoreCase("Bye"))
       
       {
        break;
       }
        }
       out.flush();
       out.close();
       br.close();
       socket.close();
       ss.close();


    }

}
