package View;
/*
 * ����Ա������
 */

import java.util.ArrayList;

public class AdMainService {
	private AdMainDao adminDao = new AdMainDao();

	// ��ѯ����
	public ArrayList<AdMainStudentinto> queryStudentItem() {
		ArrayList<AdMainStudentinto> data = adminDao.queryAlldata();
		return data;
	}

	// ��ӷ���
	public boolean addStudentItem(String number, String name, String age, String sex) {
		ArrayList<AdMainStudentinto> data = queryStudentItem();
		for (int i = 0; i < data.size(); i++) {
			AdMainStudentinto st = data.get(i);
			if (number.equals(st.getNumber())) {
				return false;
			}
		}
		AdMainStudentinto thisStudentItem = new AdMainStudentinto(number, name, Integer.parseInt(age), sex);
		adminDao.addStudentItem(thisStudentItem);
		return true;
	}

	// �޸ķ���
	public boolean updateStudentItem(String number, String name, String age, String sex) {
		ArrayList<AdMainStudentinto> data = queryStudentItem();
		for (int i = 0; i < data.size(); i++) {
			AdMainStudentinto st = data.get(i);
			if (number.equals(st.getNumber())) {
				adminDao.delStudentItem(number);
				AdMainStudentinto thisStudentItem = new AdMainStudentinto(number, name, Integer.parseInt(age), sex);
				adminDao.addStudentItem(thisStudentItem);
				return true;
			}
		}
		// ���������ͬ��ѧ�����ݣ�����Ը���
		return false;
	}

	// ɾ������
	public boolean delStudentItem(String delNumber, String delName) {
		ArrayList<AdMainStudentinto> data = queryStudentItem();
		for (int i = 0; i < data.size(); i++) {
			AdMainStudentinto st = data.get(i);
			if (delNumber.equals(st.getNumber())) {
				adminDao.delStudentItem(delNumber);
				return true;
			}
		}
		return false;
	}

}
