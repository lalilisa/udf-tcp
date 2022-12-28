/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi.model.Search;

/**
 *
 * @author maiva
 */
public class Client {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        
//        Search s=(Search) Naming.lookup("rmi://localhost:5000/hello");
        Registry r=LocateRegistry.getRegistry(5000);
        Search s=(Search) r.lookup("hello");
        s.hello();
    }
}
