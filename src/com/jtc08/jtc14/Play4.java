package com.jtc08.jtc14;

public class Play4 {

	public void drawRect() {
		int i;
		int j;
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				if (i == 0 | j == 0 | i == 8 | j == 8) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Play4 p = new Play4();
		p.drawRect();

	}

}
