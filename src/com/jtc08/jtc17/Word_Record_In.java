package com.jtc08.jtc17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Word_Record_In {
	private static int n = 1;
	
	public int getTimes(){
		return n++;
	}
	public String recordMessage(String action) {
		String str = "";
		try {
			FileWriter fw = new FileWriter("E:\\QWDownload1\\e.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str_time = f.format(new Date());
			Word_Record_In w = new Word_Record_In();
			str = w.getTimes()+"/"+action + "  " + str_time;
		
			bw.write(str);
			bw.newLine();
			bw.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

		return str;
	}
	public ArrayList<String>   checkMessage(){
		ArrayList<String>  arr = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("E:\\QWDownload1\\e.txt");
			BufferedReader br = new BufferedReader(fr);
			String res = "";
			while (( res =br.readLine()) != null) {
		      arr.add(res);
			}
			br.close();
		}
		catch ( IOException e) {
			
			e.printStackTrace();
		}
		return arr;
	}

	public static void main(String[] args)  {
		Word_Record_In w = new Word_Record_In();
//		w.recordMessage("修改员工");
//		w.recordMessage("增加会员");
//		w.recordMessage("查询会员");
//		w.recordMessage("增加会员");
//		w.recordMessage("增加员工");
//		w.recordMessage("查询员工");
//		w.recordMessage("修改会员");
//		w.recordMessage("删除员工");
//		w.recordMessage("查询会员");
//		w.recordMessage("增加员工");
//		w.recordMessage("查询会员");
//		w.recordMessage("修改员工");
//		w.recordMessage("修改会员");
//		w.recordMessage("增加员工");
//		w.recordMessage("查询员工");
//		w.recordMessage("查询会员");
//		w.recordMessage("删除员工");
//		w.recordMessage("修改会员");
//		w.recordMessage("查询员工");
//		w.recordMessage("查询会员");
//		w.recordMessage("修改员工");
//		
		
		ArrayList<String> s = w.checkMessage();
		
		for(int i=0;i<s.size();i++){
			String str = s.get(i);
//			System.out.println(str);
			int in = str.lastIndexOf('/');
			String str_s = str.substring(in, in+4);
//			System.out.println(str_s);
			if(str_s.equals("增加会员")){
				ArrayList<String> addClient = new ArrayList<String>();
				addClient.add(str);
			}else if(str_s.equals("删除会员")){
				ArrayList<String> deleteClient = new ArrayList<String>();
				deleteClient.add(str);
			}else if(str_s.equals("修改会员")){
				ArrayList<String> changeClient = new ArrayList<String>();
				changeClient.add(str);
			}else if(str_s.equals("查询会员")){
				ArrayList<String> findClient = new ArrayList<String>();
				findClient.add(str);
			}else if(str_s.equals("增加员工")){
				ArrayList<String> addEmployee = new ArrayList<String>();
				addEmployee.add(str);
			}else if(str_s.equals("删除员工")){
				ArrayList<String> deleteEmployee = new ArrayList<String>();
				deleteEmployee.add(str);
			}else if(str_s.equals("修改员工")){
				ArrayList<String> changeEmployee = new ArrayList<String>();
				changeEmployee.add(str);
			}else if(str_s.equals("查询员工")){
				ArrayList<String> findEmployee = new ArrayList<String>();
				findEmployee.add(str);
			}
		}
		
		
//		for(int i=0;i<s.length;i++){
//			String str = s[i];
//			System.out.println(str);
//		}
	
//		
//		try {
//			FileReader fr = new FileReader("E:\\QWDownload1\\e.txt");
//			BufferedReader br = new BufferedReader(fr);
//			String res = "";
//			while ((res = br.readLine()) != null) {
//				System.out.println(res);
//			}
//			br.close();
//		}
//		catch ( IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
	}

}
