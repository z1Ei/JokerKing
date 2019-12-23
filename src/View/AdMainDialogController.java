package View;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.*;

/*
 * 管理员界面操作类
 */
public class AdMainDialogController extends AdMainDialog {
	// 定义服务类，提供完整功能服务
	private AdMainService as = new AdMainService();

	// 构造方法
	public AdMainDialogController() {
		super();
	}

	public AdMainDialogController(Frame owner, boolean modal) {
		super(owner, modal);
		// 创建对象时展示数据
		queryStudentItem();
	}

	// 查询方法
	public void queryStudentItem() {
		String[] thead = { "图书编号", "图书名称", "图书价格", "图书单位" };
		// 调用adminServer的查询服务
		ArrayList<AdMainStudentinto> dataList = as.queryStudentItem();
		// 调用list2Array方法，将查询到的集合转为数组，方便为JTable赋值
		String[][] tbody = list2Array(dataList);
		// 将查询到的结果为jt赋值
		TableModel dataModel = new DefaultTableModel(tbody, thead);
		jt.setModel(dataModel);
	}

	// 集合数据转为二维数组方法
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

	// 添加方法
	@Override
	public void addStudentItem() {
		// 获取数据
		String Number = addNumber.getText();
		String Name = addName.getText();
		String Age = addAge.getText();
		String Sex = addSex.getText();
		// 调用adminService的添加服务
		boolean addSuccess = as.addStudentItem(Number, Name, Age, Sex);
		// 如果添加成功
		if (addSuccess) {
			// 添加后刷新数据
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "图书重复，请检查！");
		}

	}

	// 修改方法
	@Override
	public void updateStudentItem() {
		String upNumber = updateNumber.getText();
		String upName = updateName.getText();
		String upAge = updateAge.getText();
		String upSex = updateSex.getText();
		// 调用adminService的修改服务
		boolean updateSuccess = as.updateStudentItem(upNumber, upName, upAge, upSex);
		// 如果修改成功
		if (updateSuccess) {
			// 修改后刷新数据
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "图书不存在，请检查！");
		}

	}

	@Override
	public void delStudentItem() {
		String delNum = delNumber.getText();
		String delNm = delName.getText();
		// 调用adminService的修改服务
		boolean delSuccess = as.delStudentItem(delNum, delNm);
		// 如果删除成功
		if (delSuccess) {
			// 删除后刷新数据
			queryStudentItem();
		} else {
			JOptionPane.showMessageDialog(this, "图书不存在，请检查！");
		}

	}
}
