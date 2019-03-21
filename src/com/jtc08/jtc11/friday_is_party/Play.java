package com.jtc08.jtc11.friday_is_party;

import java.io.IOException;
import java.net.ServerSocket;

public class Play {

	public static void main(String[] args) {
		try {
			ServerSocket s = new  ServerSocket();
			String str =s.getInetAddress().getHostName();
			System.out.println("str:"+str);
		}
		catch (IOException e) {
			e.printStackTrace();
		}


	}

}
