package ch07.sec02.ex01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);

		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);

		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ��ϼ���?");
		dmbCellPhone.receiveVoice("�� ��!");
		dmbCellPhone.hangUp();

		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}