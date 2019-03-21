package com.jtc08.jtc08.welcome_to_the_hero_alliance;

import java.util.ArrayList;


public class College {
	private String c$name;
	private String c$location;
	private String c$president;
	private ArrayList<C_Class> c$class;
	public College() {
		super();
	}
	public College(String c$name, String c$location, String c$president, ArrayList<C_Class>  c$class) {
		super();
		this.c$name = c$name;
		this.c$location = c$location;
		this.c$president = c$president;
		this.c$class = c$class;
	}
	
	public College(String c$name, String c$location, String c$president) {
		super();
		this.c$name = c$name;
		this.c$location = c$location;
		this.c$president = c$president;
	}
	public String getC$name() {
		return c$name;
	}
	public void setC$name(String c$name) {
		this.c$name = c$name;
	}
	public String getC$location() {
		return c$location;
	}
	public void setC$location(String c$location) {
		this.c$location = c$location;
	}
	public String getC$president() {
		return c$president;
	}
	public void setC$president(String c$president) {
		this.c$president = c$president;
	}
	public ArrayList<C_Class> getC$class() {
		return c$class;
	}
	public void setC$class(ArrayList<C_Class>  c$class) {
		this.c$class = c$class;
	}
	

}
