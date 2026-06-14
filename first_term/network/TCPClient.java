package network;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class TCPClient {
public static void main(String []args)throws Exception{
    Socket socket=new Socket("localhost",9999);
    InputStreamReader input=new InputStreamReader(socket.getInputStream());
    PrintWriter out=new PrintWriter(socket.getOutputStream());
    BufferedReader br=new BufferedReader(input);
    Scanner sc=new Scanner(System.in);
    while(true)
    {
        System.out.println("Enter message");
        String msg=sc.nextLine();
    out.println(msg);
    out.flush();
    String reply=br.readLine();
    System.out.println("Message from Server:"+reply);
    if(msg.equalsIgnoreCase("bye"))
    {
        break;
    }
}
    out.close();
    br.close();
     input.close();
    socket.close();
    sc.close();
   

}
}
