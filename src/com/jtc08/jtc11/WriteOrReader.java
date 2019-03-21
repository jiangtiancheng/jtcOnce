package com.jtc08.jtc11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOrReader {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("E:\\QWDownload1\\e.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			String str = "都会哭\n的视频空间否\n倒是见过\n离开的收购价\n来判断看过";
			String[] arr_str=str.split("\n");
			for(int i=0;i<arr_str.length;i++){
				bw.write(arr_str[i]);
				bw.newLine();
			}
//			bw.write("对景挂画-\n抵抗力和-\n破佛基金-\n木工房管理-\n打开了几分");
//			bw.newLine();
			bw.close();

//			FileReader fr = new FileReader("E:\\QWDownload1\\e.txt");
//			BufferedReader br = new BufferedReader(fr);
//			String res = "";
//			while ((res = br.readLine()) != null) {
//				System.out.println(res);
//			}
//			br.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
