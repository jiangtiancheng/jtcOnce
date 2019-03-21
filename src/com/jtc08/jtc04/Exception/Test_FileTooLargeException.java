package com.jtc08.jtc04.Exception;

import java.io.File;

public class Test_FileTooLargeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f =155555;
		FileOpteration f1 = new FileOpteration();
		try {
			f1.myMiss(f);
		}
		catch (FileTooLargeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
