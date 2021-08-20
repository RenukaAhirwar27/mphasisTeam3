package com.mphasis.main.cui;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        Socket socket=null;
        try {
            socket = new Socket("DESKTOP-Q1QGOQF",5678);
            InputStream is = socket.getInputStream();
            BufferedReader d = new BufferedReader((new InputStreamReader(is)));
            System.out.println(d.readLine());
            System.out.println("Received");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("client connected");
    }
}
