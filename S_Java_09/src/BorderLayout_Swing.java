import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_Swing extends JFrame{

	public BorderLayout_Swing() {
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		
		add("East", new JButton("��"));
		add("West", new JButton("��"));
		add("North", new JButton("��"));
		add("South", new JButton("��"));
		add("Center", new JButton("�߾�"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
}
