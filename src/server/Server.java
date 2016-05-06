/**
 * 
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author GongKai
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {  
        ServerSocket server = new ServerSocket(5678);  
        Socket client = server.accept();  
        BufferedReader in = new BufferedReader(new InputStreamReader(  
                client.getInputStream()));  
        PrintWriter out = new PrintWriter(client.getOutputStream());  
        while (true) {  
            String str = in.readLine();  
            System.out.println(str); 
            out.println("Server has received.");  
            out.flush();  
            if (str.equals("end"))  
                break;  
        }  
        client.close();  
    }
}
