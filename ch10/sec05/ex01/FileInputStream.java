package ch10.sec05.ex01;

public class FileInputStream implements AutoCloseable {
	public String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "��(��) �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "��(��) �ݽ��ϴ�.");
	}
}