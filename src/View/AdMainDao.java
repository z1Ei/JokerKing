package View;
//����Ա����

import java.util.ArrayList;

public class AdMainDao {
	// ��ȡ��������
	public ArrayList<AdMainStudentinto> queryAlldata() {
		return AdMainDataBase.data;
	}

	// �������
	public void addStudentItem(AdMainStudentinto studentItem) {
		AdMainDataBase.data.add(studentItem);
	}

	// �޸�����
	public void updateStudentItem(String updateNumber) {
		// ��ѯ����������
		for (int i = 0; i < AdMainDataBase.data.size(); i++) {
			AdMainStudentinto thisStudentItem = AdMainDataBase.data.get(i);
			if (thisStudentItem.getNumber().equals(updateNumber)) {
				AdMainDataBase.data.equals(i);
			}
		}
	}

	// ɾ������
	public void delStudentItem(String delNumber) {
		// ��ѯ����������
		for (int i = 0; i < AdMainDataBase.data.size(); i++) {
			AdMainStudentinto thisStudentItem = AdMainDataBase.data.get(i);
			if (thisStudentItem.getNumber().equals(delNumber)) {
				AdMainDataBase.data.remove(i);
			}
		}
	}
}
