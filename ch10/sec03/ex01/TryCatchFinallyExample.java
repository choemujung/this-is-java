package ch10.sec03.ex01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		//Class clazz = Class.forName("java.lang.String2"); -> ��Ŭ������ �����ٷ� ǥ������
	}
}
