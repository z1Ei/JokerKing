package View;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdMainDialogTest extends AdMainDialog {
// ���幹�캯����ʼ������
	public AdMainDialogTest() {
		super();
		queryStudentItem();// ��������
	}

	// �������jt����
	public void queryStudentItem() {
		String[] thead = new String[] { "ͼ����", "ͼ������", "ͼ��۸�", "ͼ�鵥λ" };
		String[][] tbody = new String[][] { { "1", "�����μǡ�", "284", "��" }, { "2", "����¥�Ρ�", "245", "��" },
				{ "3", "��ˮ䰴���", "212", "��" }, { "4", "���������塷", "224", "��" } };
		TableModel data = new DefaultTableModel(tbody, thead);
		jt.setModel(data);
	}

	@Override
	public void addStudentItem() {

	}

	@Override
	public void updateStudentItem() {

	}

	@Override
	public void delStudentItem() {

	}

	public static void main(String[] args) {
		new AdMainDialogTest().setVisible(true);
	}

}
