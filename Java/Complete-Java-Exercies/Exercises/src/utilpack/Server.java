package utilpack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	private static Socket socket;
	public static void main(String[] args) {
		 try
	        {
	 
	            int port = 2400;
	            ServerSocket serverSocket = new ServerSocket(port);
	            System.out.println("Server Started and listening to the port 2400");
	 
	            //Server is running always. This is done using this while(true) loop
	            while(true)
	            {
	                //Reading the message from the client
	                socket = serverSocket.accept();
	                InputStream is = socket.getInputStream();
	                InputStreamReader isr = new InputStreamReader(is);
	                BufferedReader br = new BufferedReader(isr);
	                String input = br.readLine();
	                System.out.println("Message received from client is "+input);
	                String returnMessage;
                    System.out.println("Enter the Message to send to the Client");
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String serverInput = br1.readLine();
	                OutputStream os = socket.getOutputStream();
	                OutputStreamWriter osw = new OutputStreamWriter(os);
	                BufferedWriter bw = new BufferedWriter(osw);
	                bw.write(serverInput);
	                System.out.println("Message sent to the client is "+serverInput);
	                bw.flush();
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                socket.close();
	            }
	            catch(Exception e){}
	        }
	}
}

