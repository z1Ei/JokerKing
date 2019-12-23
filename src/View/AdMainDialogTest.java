package View;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdMainDialogTest extends AdMainDialog {
// 定义构造函数初始化数据
	public AdMainDialogTest() {
		super();
		queryStudentItem();// 测试数据
	}

	// 加入测试jt数据
	public void queryStudentItem() {
		String[] thead = new String[] { "图书编号", "图书名称", "图书价格", "图书单位" };
		String[][] tbody = new String[][] { { "1", "《西游记》", "284", "本" }, { "2", "《红楼梦》", "245", "本" },
				{ "3", "《水浒传》", "212", "本" }, { "4", "《三国演义》", "224", "本" } };
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
