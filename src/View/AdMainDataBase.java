package View;

import java.util.ArrayList;

//���崢��������
public class AdMainDataBase {
	public static ArrayList<AdMainStudentinto> data = new ArrayList<AdMainStudentinto>();
	// ��ʼ������
	static {
		data.add(new AdMainStudentinto("1", "�����μǡ�", 280, "��"));
		data.add(new AdMainStudentinto("2", "����¥�Ρ�", 250, "��"));
		data.add(new AdMainStudentinto("3", "��ˮ䰴���", 180, "��"));
		data.add(new AdMainStudentinto("4", "���������塷", 180, "��"));
		data.add(new AdMainStudentinto("5", "��ʫ����", 200, "��"));
		data.add(new AdMainStudentinto("6", "�����", 215, "��"));
	}
}
