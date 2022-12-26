/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCP.bytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author maiva
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8080);
        
        while(true){
            Socket s=serverSocket.accept();
            InputStream inputStream=s.getInputStream();
            byte [] msvbyte=new byte[1000];
            int length=inputStream.read(msvbyte);
            String msv=new String(msvbyte, 0, length);
            System.out.println(msv);
            OutputStream outputStream=s.getOutputStream();
            String greeding="Hello";
            outputStream.write(greeding.getBytes());
            outputStream.flush();
            s.close();
        }
    }
}
