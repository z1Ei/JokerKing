package View;

import cn.itcast.fruitsore.view.*;
import test.AdMainTest;

/*
 * 主界面操作类
 */
public class AdMainFrameTest extends AdMainFrame {
	public void showAdminDialog() {
		// 在该方法中创建管理员界面并显示
		new AdMainTest();// 调用上一个界面
		setVisible(false);// 当点击进入系统按钮这个界面消失。
		// this为父窗口，true：设置为模态窗口展示
		new AdMainDialogController(this, false).setVisible(true);
	}

}
