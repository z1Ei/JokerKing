package View;
//管理员操作

import java.util.ArrayList;

public class AdMainDao {
	// 获取所有数据
	public ArrayList<AdMainStudentinto> queryAlldata() {
		return AdMainDataBase.data;
	}

	// 添加数据
	public void addStudentItem(AdMainStudentinto studentItem) {
		AdMainDataBase.data.add(studentItem);
	}

	// 修改数据
	public void updateStudentItem(String updateNumber) {
		// 查询集合中数据
		for (int i = 0; i < AdMainDataBase.data.size(); i++) {
			AdMainStudentinto thisStudentItem = AdMainDataBase.data.get(i);
			if (thisStudentItem.getNumber().equals(updateNumber)) {
				AdMainDataBase.data.equals(i);
			}
		}
	}

	// 删除数据
	public void delStudentItem(String delNumber) {
		// 查询集合中数据
		for (int i = 0; i < AdMainDataBase.data.size(); i++) {
			AdMainStudentinto thisStudentItem = AdMainDataBase.data.get(i);
			if (thisStudentItem.getNumber().equals(delNumber)) {
				AdMainDataBase.data.remove(i);
			}
		}
	}
}
