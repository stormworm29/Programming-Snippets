package socketprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    
    ServerSocket ss;
    
    Socket s;
    
    public Server() throws IOException {
        
        ss = new ServerSocket(2000);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Server ready for accepting client");
        String msgtoclient = "";
        try {
        while(true) {
            s = ss.accept();
            //System.out.println(s);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String clientmsg = in.readLine();
            System.out.println("Message from Client : "+clientmsg);
            if(clientmsg.equals("stop")) {System.out.println("over");break; }
            
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            System.out.print("Message for Client : ");
            msgtoclient = sc.nextLine();
            out.println(msgtoclient);
            if(msgtoclient.equals("stop")) {System.out.println("over");break; }
        }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            s.close();
            ss.close();
        }
        
    }
    public static void main(String[] args) throws IOException {
        new Server();
    }
}