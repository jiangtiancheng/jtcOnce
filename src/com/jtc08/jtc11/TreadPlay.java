package com.jtc08.jtc11;

public class TreadPlay extends Thread {
	public TreadPlay(String name) {
		super(name);
	}

	private void par() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(this.getName() + "    " + i);

			}
			else {
				System.out.println(this.getName() + "    " + i);
			}
		}
	}

	public void run() {
		this.par();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
