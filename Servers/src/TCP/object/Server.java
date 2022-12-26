/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCP.object;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import model.Student;

/**
 *
 * @author maiva
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket=new ServerSocket(8080);
        
        while (true) {            
            Socket s=serverSocket.accept();
            ObjectInputStream inputStream=new ObjectInputStream(s.getInputStream());
            
            Student ss=(Student) inputStream.readObject();
            System.out.println(ss);
            Student s2=new Student("B19DCCN688");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(s.getOutputStream());
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
        }
    }
}
