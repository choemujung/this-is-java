package ch09.sec03.ex03;

public class Outter {
	//before java7
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//since java8
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
