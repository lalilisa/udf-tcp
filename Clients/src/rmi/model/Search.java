/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author maiva
 */
public interface Search  extends Remote{
    
    void hello() throws RemoteException;
}
