import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutFrame extends Frame{
	public LayoutFrame() {
		super("LayoutFrame");
//		setTitle("LayoutFrame");
		
		setSize(800, 450);
		setVisible(true);
		
//		BorderLayout borderLayout = new BorderLayout();
//		setLayout(borderLayout);
		setLayout(new BorderLayout());
		
		Button eastBtn = new Button("동");
		Button westBtn = new Button("서");
		Button southBtn = new Button("남");
		Button northBtn = new Button("북");
		Button centerBtn = new Button("가운데");
		
		add(centerBtn, BorderLayout.CENTER);
		add(eastBtn, BorderLayout.EAST);
		add(westBtn, BorderLayout.WEST);
		add(southBtn, BorderLayout.SOUTH);
		add(northBtn, BorderLayout.NORTH);
		
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
