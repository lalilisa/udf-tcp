/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP.object;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import model.Student;

/**
 *
 * @author maiva
 */
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        DatagramSocket datagramSocket=new DatagramSocket(5000);
        
        byte [] reciData=new byte[1000];
        DatagramPacket datagramPacket=new DatagramPacket(reciData, reciData.length);
        datagramSocket.receive(datagramPacket);
        ByteArrayInputStream arrayInputStream=new ByteArrayInputStream(reciData);
        ObjectInputStream inputStream=new ObjectInputStream(arrayInputStream);
        Student s=(Student) inputStream.readObject();
        System.err.println(s);
        
  
        
    }
}
