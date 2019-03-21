package com.jtc08.jtc11;

public class RunnPlay implements Runnable {
	private void par() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + "    " + i);

			}
			else {
				System.out.println(Thread.currentThread().getName() + "    " + i);
			}
		}
	}

	public void run() {
		this.par();
	}

}
