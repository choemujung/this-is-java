package ch09.sec03.ex01;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ� �ʱ�ȭ
	//static B field3 = new B();   // �Ұ�
	static C field4 = new C();   // ����
	
	static void method2() {
		//B var1 = new B();   // �Ұ�
		C var2 = new C();   // ����
	}
	
	class B {}
	static class C{}
}
