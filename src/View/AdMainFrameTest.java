package View;

import cn.itcast.fruitsore.view.*;
import test.AdMainTest;

/*
 * �����������
 */
public class AdMainFrameTest extends AdMainFrame {
	public void showAdminDialog() {
		// �ڸ÷����д�������Ա���沢��ʾ
		new AdMainTest();// ������һ������
		setVisible(false);// ���������ϵͳ��ť���������ʧ��
		// thisΪ�����ڣ�true������Ϊģ̬����չʾ
		new AdMainDialogController(this, false).setVisible(true);
	}

}
