package com.jtc08.jtc04.Exception;

import java.io.File;

public class FileOpteration {
	public void myMiss(int  f) throws FileTooLargeException{
		if(f>1024){
			throw new FileTooLargeException("iuaguhiuth");
		}
		
	}

}
