package com.jtc08.jtc14;

public class Begin_a_Party {

	public static void main(String[] args) {
		int x = 2;
		if (x < 2) {
			x++;
		}
		else {
			x--;
		}
		System.out.println(x);

		int y = 2;
		y = y < 2 ? ++y : --y;
		System.out.println(y);

	}

}
