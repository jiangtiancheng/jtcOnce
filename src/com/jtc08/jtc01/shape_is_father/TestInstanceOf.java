package com.jtc08.jtc01.shape_is_father;

import com.jtc08.jtc01.shape_is_father.Rectangle1;
import com.jtc08.jtc01.shape_is_father.Circle;
import com.jtc08.jtc01.shape_is_father.Triangle1;

public class TestInstanceOf {
	public void addOne(Shape s){			//传参的过程即为向上转型的过程
		if(s instanceof Rectangle1){
			Rectangle1 r = (Rectangle1)s;		//打回原形，即向下转型；
			r.setHeight(r.getHeight()+5);
			r.setWidth(r.getWidth()+10);
			r.showAll();
		}else if(s instanceof Triangle1){
			Triangle1 t = (Triangle1)s;
			t.setA(t.getA()+3);
			t.setB(t.getB()+3);
			t.setC(t.getC()+3);
			t.showAll();
		}else if(s instanceof Circle){
			Circle c = (Circle)s;
			c.setR(c.getR()+10);
			c.showAll();
		}else{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
