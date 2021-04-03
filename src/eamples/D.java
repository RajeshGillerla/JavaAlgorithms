package javaprogarm;

import javaprogarm.A;
import javaprogarm.B;
import javaprogarm.D;

interface A {
	void getName();
	void rollNo();
}

interface B {
	void getName();
	void collegeName();
}	


public class D implements A,B {
	public void getName() {
		System.out.println("In C");
	}
	public void rollNo() {
		System.out.println("In C RollNo. 10");
	}
	public void collegeName() {
		System.out.println("In C . College Name XYZ");
	}
//	void rollNo()
	public static void main(String[] args) {

		A a = new D();
		B b = new D();
		D d = new D();
		a.getName();
		b.getName();
		d.getName();
		
	}
}
