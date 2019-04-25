package socketprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Scanner sc = new Scanner(System.in);
    Socket s;
    String msg = "";
    String servmsg = "";
    public Client() throws IOException {
        try{
            while(!servmsg.equals("stop"))
            {
            s = new Socket("localhost",2000);
            
            //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            System.out.print("Message to Server : ");
            msg = sc.nextLine();
            out.println(msg+"\n");
            if(msg.equals("stop")) {System.out.println("over");break; }
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            servmsg = in.readLine();
            if(servmsg!=null)
            	System.out.println("Message from Server : "+servmsg);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            s.close();
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Client();
    }
}