import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Swing extends JFrame{

	public GridLayout_Swing() {
		setTitle("GridLayout");
		setLayout(new GridLayout(2, 2));
		
		add(new JButton("��ư1"));
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
}
