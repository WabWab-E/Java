import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame{
	
	public FirstFrame() {
		
		setTitle("ù ��° ������");
		setSize(800,450);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				
				dispose();
				System.exit(0);
			}
		});
		
	}
}
