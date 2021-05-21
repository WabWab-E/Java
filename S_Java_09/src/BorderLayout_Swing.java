import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_Swing extends JFrame{

	public BorderLayout_Swing() {
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		
		add("East", new JButton("µ¿"));
		add("West", new JButton("¼­"));
		add("North", new JButton("³²"));
		add("South", new JButton("ºÏ"));
		add("Center", new JButton("Áß¾Ó"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
}
