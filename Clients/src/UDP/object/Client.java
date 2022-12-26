/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP.object;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import model.Student;

/**
 *
 * @author maiva
 */
public class Client {
    public static void main(String[] args) throws IOException{
        DatagramSocket datagramSocket=new DatagramSocket();
        Student  s=new Student("Trimai");
        byte [] toServer=new byte[1000];
        ByteArrayOutputStream arrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(arrayOutputStream);
        objectOutputStream.writeObject(s);
        toServer=arrayOutputStream.toByteArray();
        DatagramPacket datagramPacket=new DatagramPacket(toServer, toServer.length,InetAddress.getByName("localhost"),5000);
        datagramSocket.send(datagramPacket);
    }
}
