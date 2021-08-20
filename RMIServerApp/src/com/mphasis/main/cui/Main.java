package com.mphasis.main.cui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Main {

    public static void main(String[] args) {
        try {
            AuthenticationRemoteimpl authenticationRemote = new AuthenticationRemoteimpl();
            Naming.rebind("rmi:///Authentication",authenticationRemote);
            System.out.println("remote object registered");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
