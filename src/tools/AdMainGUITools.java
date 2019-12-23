package tools;

import java.awt.*;

import javax.swing.*;

public class AdMainGUITools {
	static Toolkit kit = Toolkit.getDefaultToolkit();

	public static void center(Component c) {
		int x = (kit.getScreenSize().width - c.getWidth()) / 2;
		int y = (kit.getScreenSize().height - c.getHeight()) / 2;
		c.setLocation(x, y);
	}

	public static void setTitleImage(JFrame frame, String titleIconPath) {
		frame.setIconImage(kit.createImage(titleIconPath));

	}

}
