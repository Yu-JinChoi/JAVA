import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class setting extends JFrame {
	setting() {
		setTitle("ȯ�漳��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel label = new JLabel("ȯ�� ����");
		label.setFont(new Font("Gothic", Font.BOLD, 60));
		label.setForeground(Color.WHITE);
		
		JButton name_change = new JButton("����� �̸� ����");
		JButton directory = new JButton("Save/Load ������丮 ����");
		JButton directory2 = new JButton("����� Game ���丮 ����");
		JButton sound = new JButton("ȿ���� ũ��");
		JButton wall_change = new JButton("��ֹ� ���� ����");
		JButton save_set = new JButton("����� ���� ����");
		JButton back_main = new JButton("�ڷ�");
		
		label.setBounds(215, 150, 300, 90);
		
		name_change.setBounds(180, 280, 150, 30);
		directory.setBounds(365, 280, 203, 30);
		directory2.setBounds(137, 375, 193, 30);
		sound.setBounds(365, 375, 150, 30);
		wall_change.setBounds(180, 470, 150, 30);
		save_set.setBounds(365, 470, 150, 30);
		back_main.setBounds(310, 565, 80, 30);
		
		c.add(label);
		c.add(name_change);
		c.add(directory);
		c.add(directory2);
		c.add(sound);
		c.add(wall_change);
		c.add(save_set);
		c.add(back_main);
		
		back_main.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose(); new main();
            }
        });
		
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
}
