package com.jtc08.gym_a_gym.persons.operaters3.proxy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Word_Record_In {

	private static int n = 1;// 定义一个私有的静态变量

	private int getTimes() { // 定义方法作为记录信息的序号；每调用一次记录方法，n+1
		return n++;
	}

	/**
	 * 此方法为信息记录方法，每进行一次action，就会产生对应的记录
	 * 记录内容为：序号+动作信息+操作时间---->也可将对应的信息细节以字符串拼接的形式放在动作信息后
	 * 
	 * @param action   输入的动作信息
	 *            
	 * @return 返回："信息记录成功!!!"--->有没有都行
	 */
	public String recordMessage(String action) {
		String str = "";
		String ends = "信息记录成功!!!";
		try {
			FileWriter fw = new FileWriter("D:\\java\\e.txt", true);// 利用FileWriter(Flie file，true)构造方法可以
			BufferedWriter bw = new BufferedWriter(fw);
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str_time = f.format(new Date());
			Word_Record_In w = new Word_Record_In();
			str = w.getTimes() + action + "  " + str_time;
			bw.write(str);
			bw.newLine();
			bw.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

		return ends;
	}

	public ArrayList<String> checkMessage(String action) {
		ArrayList<String> arr = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("D:\\java\\e.txt");
			BufferedReader br = new BufferedReader(fr);
			String res = "";
			while ((res = br.readLine()) != null) {
				arr.add(res);
			}
			br.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		int act_length = action.length();
		ArrayList<String> action_arr = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			String str = arr.get(i);
			int in = str.lastIndexOf('/');
			String str_s = str.substring(in, in + act_length);
			if (str_s.equals(action)) {
				action_arr.add(str);
			}
		}
		return action_arr;
	}

	public static void main(String[] args) {

		Word_Record_In w = new Word_Record_In();
		// w.recordMessage("/根据电话修改员工信息");
		// w.recordMessage("/增加会员");
		// w.recordMessage("/根据电话查询会员");
		// w.recordMessage("/增加会员");
		// w.recordMessage("/增加员工");
		// w.recordMessage("/根据电话号码查询员工");
		// w.recordMessage("/修改会员");
		// w.recordMessage("/删除员工");
		// w.recordMessage("/查询会员");
		// w.recordMessage("/增加员工");
		// w.recordMessage("/查询会员");
		// w.recordMessage("/根据电话修改员工信息");
		// w.recordMessage("/修改会员");
		// w.recordMessage("/增加员工");
		// w.recordMessage("/根据电话号码查询员工");
		// w.recordMessage("/根据查询会员");
		// w.recordMessage("/根据电话修改员工信息");
		// w.recordMessage("/修改会员");
		// w.recordMessage("/根据电话号码查询员工");
		// w.recordMessage("/查询会员");
		// w.recordMessage("/根据电话修改员工信息");

		ArrayList<String> s = w.checkMessage("/根据电话修改员工信息");

		for (int i = 0; i < s.size(); i++) {
			String str = s.get(i);
			System.out.println(str);
			// int in = str.lastIndexOf('/');
			// String str_s = str.substring(in, in+act_length);
			// System.out.println(str_s);
			// if(str_s.equals("增加会员")){
			// ArrayList<String> addClient = new ArrayList<String>();
			// addClient.add(str);
			// }else if(str_s.equals("删除会员")){
			// ArrayList<String> deleteClient = new ArrayList<String>();
			// deleteClient.add(str);
			// }else if(str_s.equals("修改会员")){
			// ArrayList<String> changeClient = new ArrayList<String>();
			// changeClient.add(str);
			// }else if(str_s.equals("查询会员")){
			// ArrayList<String> findClient = new ArrayList<String>();
			// findClient.add(str);
			// }else if(str_s.equals("增加员工")){
			// ArrayList<String> addEmployee = new ArrayList<String>();
			// addEmployee.add(str);
			// }else if(str_s.equals("删除员工")){
			// ArrayList<String> deleteEmployee = new ArrayList<String>();
			// deleteEmployee.add(str);
			// }else if(str_s.equals("修改员工")){
			// ArrayList<String> changeEmployee = new ArrayList<String>();
			// changeEmployee.add(str);
			// }else if(str_s.equals("查询员工")){
			// ArrayList<String> findEmployee = new ArrayList<String>();
			// findEmployee.add(str);
			// }
		}

	}

}
