import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Quoridor extends JFrame {
	
	Quoridor() {
		setTitle("Quoridor 1인용 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		NorthPanel np = new NorthPanel();
		
		add(np, BorderLayout.CENTER);
		
		np.setLayout(null);
		
		
		setSize(700, 700);
		setVisible(true);
	}
}
