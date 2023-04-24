package e_oop.pack2;

import e_oop.pack1.A;	// 다른 패키지의 클래스를 불러서 사용할 수 있도록 도와준다. public이 아니면 사용 불가능

public class C {

	public void print() {
		A a = new A();
		
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);
		System.out.println();
	}
	
}
