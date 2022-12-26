/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Student;

/**
 *
 * @author maiva
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            Socket s=new Socket("localhost",8080);
            Student s2=new Student("B19DCCN688 TriMai");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(s.getOutputStream());
            objectOutputStream.writeObject(s2);
            
            ObjectInputStream inputStream=new ObjectInputStream(s.getInputStream());
            Student ss=(Student) inputStream.readObject();
            System.out.println(ss);

            objectOutputStream.flush();
    }
}
