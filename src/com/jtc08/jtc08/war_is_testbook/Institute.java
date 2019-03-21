package com.jtc08.jtc08.war_is_testbook;



public class Institute {
	private String I_name;
	private String I_location;
	private String I_president;
	private Grade  I_class;
	

	public Institute() {
		super();
	}
	

	public Institute(String i_name, String i_location, String i_president, Grade i_class) {
		super();
		I_name = i_name;
		I_location = i_location;
		I_president = i_president;
		I_class = i_class;
	}
	

	public String getI_name() {
		return I_name;
	}


	public void setI_name(String i_name) {
		I_name = i_name;
	}


	public String getI_location() {
		return I_location;
	}


	public void setI_location(String i_location) {
		I_location = i_location;
	}


	public String getI_president() {
		return I_president;
	}


	public void setI_president(String i_president) {
		I_president = i_president;
	}


	public Grade getI_class() {
		return I_class;
	}


	public void setI_class(Grade i_class) {
		I_class = i_class;
	}
	public Institute[] getInstitute(Grade[] g){
		Institute[]  ins = new Institute[60];
		
		for(int i=0;i<60;i++){
			if(i<20){
				ins[i] = new Institute("计算机学院","科技楼","赵院长",g[i]);
			}else if(i<40){
				ins[i] = new Institute("经济学院","经法楼","李院长",g[i]);
			}else if(i<60){
				ins[i] = new Institute("艺术学院","科技楼","赵院长",g[i]);
			}
			
		}
		return ins;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
