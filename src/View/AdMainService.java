package View;
/*
 * 管理员服务类
 */

import java.util.ArrayList;

public class AdMainService {
	private AdMainDao adminDao = new AdMainDao();

	// 查询服务
	public ArrayList<AdMainStudentinto> queryStudentItem() {
		ArrayList<AdMainStudentinto> data = adminDao.queryAlldata();
		return data;
	}

	// 添加服务
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

	// 修改服务
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
		// 如果存在相同的学号数据，则可以更新
		return false;
	}

	// 删除服务
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
