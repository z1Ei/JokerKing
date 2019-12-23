package cn.itcast.fruitsore.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tools.AdMainGUITools;

public abstract class AdMainFrame extends JFrame {
	private JLabel titleLabel = new JLabel(new ImageIcon("3.jpg"));
	private JButton btn = new JButton("进入系统");

	public AdMainFrame() {
		this.init();
		this.addComponent();
		this.addListener();
	}

	private void init() {
		this.setTitle("图书管理系统欢迎您！");
		this.setSize(600, 400);
		this.setLocation(700, 300);
		AdMainGUITools.center(this);
		AdMainGUITools.setTitleImage(this, "3.jpg");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void addComponent() {
		this.add(this.titleLabel, BorderLayout.NORTH);
		JPanel btnPanel = new JPanel();
		btnPanel.setLocation(1, 1);
		this.add(btnPanel);
		btn.setBounds(240, 20, 120, 50);
		btnPanel.add(btn);

	}

	private void addListener() {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showAdminDialog();

			}
		});

	}

	public abstract void showAdminDialog();
}
