import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends JFrame {
	int width = 700; int height = 700;
	main() {
		setTitle("Quoridor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JButton button = new JButton("1�ο� ����");
		JButton button2 = new JButton("2�ο� ����");
		JButton button3 = new JButton("2�ο� ��Ʈ��ũ ����(���� ����)");
		JButton button4 = new JButton("2�ο� ��Ʈ��ũ ����(���� ����)");
		JButton button5 = new JButton("�������� Load");
		JButton button6 = new JButton("�������� ����");
		JButton button7 = new JButton("ȯ�漳��");
		JButton button8 = new JButton("����");
		
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose(); new Quoridor();
            }
        });
		
		button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose(); new Quoridor2();
            }
        });
		
		button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });
		
		button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose(); new setting();
            }
        });
		
		button.setBounds(180, 230, 150, 30);
		button2.setBounds(370, 230, 150, 30);
		button3.setBounds(116, 310, 214, 30);
		button4.setBounds(370, 310, 214, 30);
		button5.setBounds(180, 390, 150, 30);
		button6.setBounds(370, 390, 150, 30);
		button7.setBounds(180, 470, 150, 30);
		button8.setBounds(370, 470, 150, 30);
		
		c.add(button);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);
		c.add(button6);
		c.add(button7);
		c.add(button8);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("KakaoTalk_20180601_175349720.jpg");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public static void main(String [] args) {
		new main();
	}
}
