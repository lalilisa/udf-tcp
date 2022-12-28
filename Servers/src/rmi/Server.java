/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import rmi.model.Search;
import rmi.model.SearchIpml;

/**
 *
 * @author maiva
 */
public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Search s=new SearchIpml();
        LocateRegistry.createRegistry(5000);
        Naming.rebind("rmi://localhost:5000/hello", s);
    }
}
