package com.mphasis.main.cui;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AuthenticationRemoteimpl extends UnicastRemoteObject implements AuthenticationRemote{
    public AuthenticationRemoteimpl() throws RemoteException{

    }
    public boolean validateCredentials(String username,String password)throws RemoteException{
        if(username.equalsIgnoreCase("Renuka") && password.equals("pass"))
        {
            return true;
        }
        return false;
    }
}
