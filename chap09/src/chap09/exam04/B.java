package chap09.exam04;

public class B {
	public B(){
		A a=new A();
		a.field1=1;
		a.field2=1;
//		a.field3=1; //private라 접근 불가능함
		
		a.method1();
		a.method2();
//		a.method3(); //private라 접근이 불가능함
	}
}
