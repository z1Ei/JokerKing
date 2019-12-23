package textpass;

import java.awt.event.*;
import javax.swing.*;
import View.AdMainFrameTest;
import test.AdMainTest;
import tools.AdMainGUITools;

public class MainFramePass extends JFrame implements ActionListener {
	private JPanel jp = new JPanel();
	private JLabel[] jlArray = { new JLabel("�û���"), new JLabel("����"), new JLabel("") };
	private JButton[] jbArray = { new JButton("��½"), new JButton("���") };
	private JTextField jtxtName = new JTextField();
	private JPasswordField jtxtPassword = new JPasswordField();

	public MainFramePass() {
		jp.setLayout(null);
		for (int i = 0; i < 2; i++) {
			jlArray[i].setBounds(30, 20 + i * 50, 80, 26);
			jbArray[i].setBounds(50 + i * 110, 130, 80, 26);
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			jbArray[i].addActionListener(this);
		}
		jtxtName.setBounds(80, 20, 180, 30);
		jp.add(jtxtName);
		jtxtName.addActionListener(this);
		jtxtPassword.setBounds(80, 70, 180, 30);
		jp.add(jtxtPassword);
		jtxtPassword.setEchoChar('*');
		jtxtPassword.addActionListener(this);
		jlArray[2].setBounds(10, 180, 300, 30);
		jp.add(jlArray[2]);
		this.add(jp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��½");
		AdMainGUITools.center(this);
		AdMainGUITools.setTitleImage(this, "2.jpg");

		this.setResizable(false);
		this.setBounds(500, 400, 300, 250);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtxtName) {
			jtxtPassword.requestFocus();
		} else if (e.getSource() == jbArray[1]) {
			jlArray[2].setText("");
			jtxtName.setText("");
			jtxtPassword.setText("");
			jtxtName.requestFocus();
		} else {
			if (jtxtName.getText().equals("main") && String.valueOf(jtxtPassword.getPassword()).equals("123")) {
				jlArray[2].setText("��½�ɹ�");
				setVisible(false);
				new AdMainFrameTest().setVisible(true);

			} else {
				jlArray[2].setText("��½ʧ�ܣ�����˺������Ƿ���ȷ");
			}
		}
	}

}
