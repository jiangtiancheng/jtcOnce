package com.jtc08.jtc17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_play {

	public static void main(String[] args) {
		
		SimpleDateFormat f =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str_time = f.format(new Date());
		System.out.println(str_time);
	}

}
