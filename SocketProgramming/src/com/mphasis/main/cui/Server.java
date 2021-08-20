package com.mphasis.main.cui;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(5678);
            System.out.println("Server started");
            while(true){
                socket = serverSocket.accept();
                OutputStream s1out = socket.getOutputStream();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
                bw.write("hello\n");
                bw.flush();
                System.out.println("Client connected");
               // System.out.println(socket.getInetAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
