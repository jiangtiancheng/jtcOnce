package com.jtc08.jtc11.cs_is_what;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClients {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 6666);
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())), true);
			while (true) {
				BufferedReader key_in = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("从键盘输入内容：");
				String content = key_in.readLine();
				out.println(content);
				if (content.equalsIgnoreCase("exit")) {
					break;
				}
				String msg_Server = in.readLine();
				System.out.println("从服务器接受的内容：" + msg_Server);
			}
			System.out.println("客户端关闭！！！！");
		}
		finally {
			s.close();

		}

	}

}
