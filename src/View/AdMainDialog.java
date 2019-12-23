package View;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.*;

import tools.AdMainGUITools;

public abstract class AdMainDialog extends JDialog {
	private JLabel jl = new JLabel("图书管理列表");
	private JScrollPane js = new JScrollPane();
	protected JTable jt = new JTable();

	private JLabel number = new JLabel("图书编号");
	private JLabel name = new JLabel("图书名称");
	private JLabel age = new JLabel("图书价格");
	private JLabel sex = new JLabel("图书单位");

	// 添加功能组件
	protected JTextField addNumber = new JTextField(6);
	protected JTextField addName = new JTextField(6);
	protected JTextField addAge = new JTextField(6);
	protected JTextField addSex = new JTextField(6);
	private JButton addBtn = new JButton("添加图书");

	// 修改功能组件
	protected JTextField updateNumber = new JTextField(6);
	protected JTextField updateName = new JTextField(6);
	protected JTextField updateAge = new JTextField(6);
	protected JTextField updateSex = new JTextField(6);
	private JButton updateBtn = new JButton("修改图书");

	// 删除功能组件
	protected JTextField delNumber = new JTextField(6);
	protected JTextField delName = new JTextField(6);
	private JButton delBtn = new JButton("删除图书");

	// 构造方法
	public AdMainDialog() {
		this(null, true);
	}

	public AdMainDialog(Frame owner, boolean modal) {
		super(owner, modal);
		this.init();
		this.addComponent();
		this.addListener();
	}

	private void init() {
		this.setTitle("图书管理系统！");
		this.setSize(600, 400);
		AdMainGUITools.center(this);
		this.setResizable(false);

	}

	private void addComponent() {
		this.setLayout(null);
		jl.setBounds(265, 20, 70, 25);
		this.add(jl);

		jt.getTableHeader().setReorderingAllowed(false);
		jt.getTableHeader().setResizingAllowed(false);
		jt.setEnabled(false);
		js.setBounds(50, 50, 500, 200);
		js.setViewportView(jt);
		this.add(js);
		// 字段标题
		number.setBounds(50, 250, 70, 25);
		name.setBounds(150, 250, 70, 25);
		age.setBounds(250, 250, 70, 25);
		sex.setBounds(350, 250, 70, 25);
		this.add(number);
		this.add(name);
		this.add(age);
		this.add(sex);
		// 增加组件
		addNumber.setBounds(50, 280, 80, 25);
		addName.setBounds(150, 280, 80, 25);
		addAge.setBounds(250, 280, 80, 25);
		addSex.setBounds(350, 280, 80, 25);
		this.add(addNumber);
		this.add(addName);
		this.add(addAge);
		this.add(addSex);
		addBtn.setBounds(460, 280, 90, 25);
		this.add(addBtn);
		// 修改组件
		updateNumber.setBounds(50, 310, 80, 25);
		updateName.setBounds(150, 310, 80, 25);
		updateAge.setBounds(250, 310, 80, 25);
		updateSex.setBounds(350, 310, 80, 25);
		this.add(updateNumber);
		this.add(updateName);
		this.add(updateAge);
		this.add(updateSex);
		updateBtn.setBounds(460, 310, 90, 25);
		this.add(updateBtn);
		// 删除组件
		delNumber.setBounds(50, 340, 80, 25);
		this.add(delNumber);
		delBtn.setBounds(460, 340, 90, 25);
		this.add(delBtn);
	}

	private void addListener() {
		// 添加按钮监听
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addStudentItem();

			}
		});
		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateStudentItem();

			}
		});
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delStudentItem();

			}
		});

	}

	// 查询方法
	public abstract void queryStudentItem();

	public abstract void addStudentItem();

	public abstract void updateStudentItem();

	public abstract void delStudentItem();
}
