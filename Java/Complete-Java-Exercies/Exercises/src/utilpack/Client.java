package utilpack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	private static Socket socket;
	public static void main(String[] args) {
		try
        {
            String host = "localhost";
            int port = 2400;
            InetAddress address = InetAddress.getByName(host);
            socket = new Socket(address, port);
            while(true) {
	            OutputStream os = socket.getOutputStream();
	            OutputStreamWriter osw = new OutputStreamWriter(os);
	            BufferedWriter bw = new BufferedWriter(osw);
	            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	            String input = br1.readLine();
	            if(input.equalsIgnoreCase("exit")) {
	            	break;
	            }
	            String sendMessage = input + "\n";
	            bw.write(sendMessage);
	            bw.flush();
	            System.out.println("Message sent to the server : "+sendMessage);
	            InputStream is = socket.getInputStream();
	            InputStreamReader isr = new InputStreamReader(is);
	            BufferedReader br = new BufferedReader(isr);
	            String message = br.readLine();
	            System.out.println("Message received from the server : " +message);
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
	}
}
