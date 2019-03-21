package com.jtc08.jtc11.cs_is_what;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6666);
		try {
			Socket s = server.accept();
			System.out.println("客户端Ip地址是：" + s.getInetAddress().getHostAddress() + ",远程端口是：" + s.getPort() + ",本地端口是：" + s.getLocalPort());
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())), true);
			while (true) {
				String msg = in.readLine();
				if (msg.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.println("接收到的客户端信息：" + msg);
				out.println("服务器响应内容：" + msg+"对景挂画");
			}
			System.out.println("服务器关闭！！！！");

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			server.close();
		}

	}

}
