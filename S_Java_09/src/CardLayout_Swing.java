import java.awt.*;

import javax.swing.*;

public class CardLayout_Swing extends JFrame{
	CardLayout cl;

	public CardLayout_Swing() {
		
		setTitle("CardLayout");
		cl = new CardLayout();		
		setLayout(cl);
		
		add("0", new JButton("버튼 1"));
		add("1", new JButton("버튼 2"));
		add("2", new JButton("버튼 3"));
		add("3", new JButton("버튼 4"));
		add("4", new JButton("버튼 5"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public void rotate() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
			cl.next(this.getContentPane());
		}
	}
}
