package vive;

import java.awt.*;

import javax.swing.*;

import tools.AdMainGUITools;

public abstract class AdMainDialog extends JDialog {
	private JLabel tableLabel = new JLabel("ͼ�����ϵͳ");
	private JScrollPane tablePane = new JScrollPane();
	protected JTable table = new JTable();

	private JLabel numberLabel = new JLabel("ͼ����");
	private JLabel nameLabel = new JLabel("ͼ������");
	private JLabel sexLabel = new JLabel("ͼ��۸�");
	private JLabel ageLabel = new JLabel("ͼ�鵥λ");

	protected JTextField addNumberText = new JTextField(10);
	protected JTextField addNameText = new JTextField(10);
	protected JTextField addSexText = new JTextField(10);
	protected JTextField addAgeText = new JTextField(10);
	private JButton addBtn = new JButton("���ͼ��");

	protected JTextField updateNumberText = new JTextField(10);
	protected JTextField updateNameText = new JTextField(10);
	protected JTextField updateSexText = new JTextField(10);
	protected JTextField updateAgeText = new JTextField(10);
	private JButton updateBtn = new JButton("�޸�ͼ��");

	protected JTextField delNumberTxt = new JTextField(10);
	private JButton delBtn = new JButton("ɾ��ͼ��");

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
		this.setTitle("��ӭ����ͼ�����ϵͳ��");
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
