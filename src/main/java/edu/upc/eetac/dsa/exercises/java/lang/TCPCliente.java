package edu.upc.eetac.dsa.exercises.java.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPCliente {

	  public static void main(String[] args) throws IOException {
	        /*if (args.length < 2) {
	            System.err.println("You have to pass the server name and the server port");
	            System.exit(-1);
	        }*/
	        String server = "localhost";
	        int port = 12345;

	        Socket socket = new Socket(server, port);
	        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        String time = reader.readLine();
	        System.out.println(time);
	    }
	}
