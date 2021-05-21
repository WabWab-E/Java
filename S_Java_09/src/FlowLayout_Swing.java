import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_Swing extends JFrame{

	public FlowLayout_Swing() {
		
		setTitle("FlowLayout");
		
		JPanel panel = new JPanel();
		
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
}
