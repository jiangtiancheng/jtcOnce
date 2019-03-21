package com.jtc08.jtc14;

public class Play2 {

	public String getGrade(int i) {
		int x = i;
		String s = "";
		if (x < 60) {
			s = s + "D";
		}else if (x < 75) {
			// System.out.println("C");
			s = s + "C";
		}else if (x < 90) {
			s = s + "B";
		}else {
			s = s + "A";
		}
		return s;
	}

	public static void main(String[] args) {
		Play2 p = new Play2();
		String a = p.getGrade(66);
		System.out.println(a);

	}

}
