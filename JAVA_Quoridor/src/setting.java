import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class setting extends JFrame {
	setting() {
		setTitle("환경설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel label = new JLabel("환경 설정");
		label.setFont(new Font("Gothic", Font.BOLD, 60));
		label.setForeground(Color.WHITE);
		
		JButton name_change = new JButton("사용자 이름 변경");
		JButton directory = new JButton("Save/Load 저장디렉토리 변경");
		JButton directory2 = new JButton("복기용 Game 디렉토리 변경");
		JButton sound = new JButton("효과음 크기");
		JButton wall_change = new JButton("장애물 갯수 변경");
		JButton save_set = new JButton("저장된 게임 관리");
		JButton back_main = new JButton("뒤로");
		
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
