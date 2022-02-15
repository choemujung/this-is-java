package ch08.sec07.ex02;

public interface ChildInterface2 extends ParentInterface{
	@Override
	public default void method2() {/*½ÇÇà*/}
	
	public void method3();
}
