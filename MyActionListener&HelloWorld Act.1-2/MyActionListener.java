import java .awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyActionListener implements ActionListener {
	public void actionPerformanced(ActionEvent e) {
		Toolkit.getDefaultToolKit().beep();
	}
}