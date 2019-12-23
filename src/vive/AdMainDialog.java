package vive;

import java.awt.*;

import javax.swing.*;

import tools.AdMainGUITools;

public abstract class AdMainDialog extends JDialog {
	private JLabel tableLabel = new JLabel("图书管理系统");
	private JScrollPane tablePane = new JScrollPane();
	protected JTable table = new JTable();

	private JLabel numberLabel = new JLabel("图书编号");
	private JLabel nameLabel = new JLabel("图书名称");
	private JLabel sexLabel = new JLabel("图书价格");
	private JLabel ageLabel = new JLabel("图书单位");

	protected JTextField addNumberText = new JTextField(10);
	protected JTextField addNameText = new JTextField(10);
	protected JTextField addSexText = new JTextField(10);
	protected JTextField addAgeText = new JTextField(10);
	private JButton addBtn = new JButton("添加图书");

	protected JTextField updateNumberText = new JTextField(10);
	protected JTextField updateNameText = new JTextField(10);
	protected JTextField updateSexText = new JTextField(10);
	protected JTextField updateAgeText = new JTextField(10);
	private JButton updateBtn = new JButton("修改图书");

	protected JTextField delNumberTxt = new JTextField(10);
	private JButton delBtn = new JButton("删除图书");

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
		this.setTitle("欢迎来到图书管理系统！");
		this.setSize(600, 400);
		AdMainGUITools.center(this);
		this.setResizable(false);
	}

	private void addComponent() {
		// TODO Auto-generated method stub

	}

	private void addListener() {
		// TODO Auto-generated method stub

	}
}
