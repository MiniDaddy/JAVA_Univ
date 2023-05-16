package chap09.exam05;

import chap09.exam04.A;

public class C {
	public C() {
		A a=new A();
		a.field1=1;
//		a.field2=1; //Default라 다른 패키지 접근 불가능
//		a.field3=1; //private라 접근 불가능함
		
		a.method1();
//		a.method2(); //Default라 다른 패키지 접근 불가능
//		a.method3(); //private라 접근 불가능함
	}
}
