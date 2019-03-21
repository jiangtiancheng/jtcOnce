package com.jtc08.jtc10;

//import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	/**
	 * 该方法实现将一个文件中的内容复制到另一个文件中
	 * @param from  要复制内容的文件
	 * @param to   目标文件
	 */
	public void  getCopy(File from,File to){
	    String froms = from.getPath();   //获得原文件与目标文件的地址
	    String tos = to.getPath();
		if(from.exists()){               //判断原文件是否存在
			try {
				FileInputStream fro = new FileInputStream(froms);
//				BufferedInputStream b1 = new BufferedInputStream(fro);
//				b1.available();
				byte[] bu = new byte[fro.available()];
				fro.read(bu);             //将文件以字节流的形式读入字节数组
				fro.close();
				if(to.exists()){         //判断目标文件是否存在
					FileOutputStream t = new FileOutputStream(tos,true);//创建字节流输出，构造方法中用FileOutputStream(to地址,true)的形式不会覆盖原文件内容
					BufferedOutputStream buf = new BufferedOutputStream(t);
					buf.write(bu);       //写出
					buf.flush();
					buf.close();
				}else{
					System.out.println("找不到目标文件啦！！！！！");
				}
			}
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}else{
			System.out.println("找不到原文件啦！！！！！！！");
		}
		
		
	}

	public static void main(String[] args) {
		File from = new File("E:\\QWDownload1\\a.txt");
		File to = new File("E:\\QWDownload1\\b.txt");
		Copy a = new Copy();
		a.getCopy(from, to);
		

	}

}
