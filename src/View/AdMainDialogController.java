package View;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.*;

/*
 * ����Ա���������
 */
public class AdMainDialogController extends AdMainDialog {
	// ��������࣬�ṩ�������ܷ���
	private AdMainService as = new AdMainService();

	// ���췽��
	public AdMainDialogController() {
		super();
	}

	public AdMainDialogController(Frame owner, boolean modal) {
		super(owner, modal);
		// ��������ʱչʾ����
		queryStudentItem();
	}

	// ��ѯ����
	public void queryStudentItem() {
		String[] thead = { "ͼ����", "ͼ������", "ͼ��۸�", "ͼ�鵥λ" };
		// ����adminServer�Ĳ�ѯ����
		ArrayList<AdMainStudentinto> dataList = as.queryStudentItem();
		// ����list2Array����������ѯ���ļ���תΪ���飬����ΪJTable��ֵ
		String[][] tbody = list2Array(dataList);
		// ����ѯ���Ľ��Ϊjt��ֵ
		TableModel dataModel = new DefaultTableModel(tbody, thead);
		jt.setModel(dataModel);
	}

	// ��������תΪ��ά���鷽��
	public String[][] list2Array(ArrayList<AdMainStudentinto> list) {
		String[][] tbody = new String[list.size()][4];
		for (int i = 0; i < list.size(); i++) {
			AdMainStudentinto st = list.get(i);
			tbody[i][0] = st.getNumber();
			tbody[i][1] = st.getName();
			tbody[i][2] = st.getAge() + "";
			tbody[i][3] = st.getSex();

		}
		return tbody;

	}

	// ��ӷ���
	@Override
	public void addStudentItem() {
		// ��ȡ����
		String Number = addNumber.getText();
		String Name = addName.getText();
		String Age = addAge.getText();
		String Sex = addSex.getText();
		// ����adminService����ӷ���
		boolean addSuccess = as.addStudentItem(Number, Name, Age, Sex);
		// �����ӳɹ�
		if (addSuccess) {
			// ��Ӻ�ˢ������
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "ͼ���ظ������飡");
		}

	}

	// �޸ķ���
	@Override
	public void updateStudentItem() {
		String upNumber = updateNumber.getText();
		String upName = updateName.getText();
		String upAge = updateAge.getText();
		String upSex = updateSex.getText();
		// ����adminService���޸ķ���
		boolean updateSuccess = as.updateStudentItem(upNumber, upName, upAge, upSex);
		// ����޸ĳɹ�
		if (updateSuccess) {
			// �޸ĺ�ˢ������
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "ͼ�鲻���ڣ����飡");
		}

	}

	@Override
	public void delStudentItem() {
		String delNum = delNumber.getText();
		String delNm = delName.getText();
		// ����adminService���޸ķ���
		boolean delSuccess = as.delStudentItem(delNum, delNm);
		// ���ɾ���ɹ�
		if (delSuccess) {
			// ɾ����ˢ������
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "ͼ�鲻���ڣ����飡");
		}

	}
}
