package com.jtc07.jtc26;

public class SumFromAtoBdeleteC {
	
	public int getTotal(int a, int b, int c) {
		int total = 0;
		int i;
		if (a == b) {
			total = -1;
		}
		if (a > b) {
			if (c > b && c < a) {
				for (i = b + 1; i < a; i++) {
					if (i == c) {
						continue;
					}
					total = total + i;
				}
			}else{
				total = -1;
			}
		}else {
			if (c > a && c < b) {
				for (i = a + 1; i < b; i++) {
					if (i == c) {
						continue;
					}
					total = total + i;
				}
			}else{
				total = -1;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		SumFromAtoBdeleteC sum = new  SumFromAtoBdeleteC();
		int s = sum.getTotal(1, 5, 6);
		System.out.println(s);

	}

}
