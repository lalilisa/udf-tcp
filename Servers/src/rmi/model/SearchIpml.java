/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author maiva
 */
public class SearchIpml extends UnicastRemoteObject implements Search{
    public SearchIpml() throws RemoteException{
    
    }
    @Override
    public void hello() throws RemoteException {
        System.out.println("Hello TriMai");
    }
    
}
