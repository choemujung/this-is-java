package ch07_03.ex01;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "1234-1234", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
