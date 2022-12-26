/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCP.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author maiva
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8080);
        
        while (true) {            
            Socket s=serverSocket.accept();
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line=br.readLine();
            System.out.println(line);
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            String hello="Hello";
            bufferedWriter.write(hello+"\n");
            bufferedWriter.flush();
            s.close();
        }
    }
}
