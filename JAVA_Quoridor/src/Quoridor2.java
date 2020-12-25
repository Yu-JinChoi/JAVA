import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class Quoridor2 extends JFrame {
	Quoridor2() {
		setTitle("Quoridor 2인용 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		NorthPanel2 np = new NorthPanel2();
		
		add(np, BorderLayout.CENTER);
		
		np.setLayout(null);
		
		setSize(700, 700);
		setVisible(true);
	}
}
