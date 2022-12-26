/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author maiva
 */
public class Client {
    public static void main(String[] args) throws IOException {
            Socket s=new Socket("localhost",8080);
           
            OutputStream os=s.getOutputStream();
            String msv="B19DCCN688";
            os.write(msv.getBytes());
            InputStream inputStream=s.getInputStream();
            byte [] readData=new byte[1000];
            int length=inputStream.read(readData);
            System.out.println(new String(readData, 0, length));
            os.close();
            inputStream.close();
            
    }
}
