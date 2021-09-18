package ch07.sec06.ex01.package2;
import ch07.sec06.ex01.package1.A;

public class D extends A {
	public D() {
		super();				//가능
		this.field = "value";	//가능
		this.method();			//가능
	}
}
// 다른 패키지에 있는 클래스여도 자식클래스여서 import만 해주면 사용 가능.
