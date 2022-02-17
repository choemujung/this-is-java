package ch10.sec03.ex01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		//Class clazz = Class.forName("java.lang.String2"); -> 이클립스가 빨간줄로 표시해줌
	}
}
