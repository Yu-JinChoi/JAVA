import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NorthPanel extends JPanel {
	Point start=null, end=null;
	double x, y;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(new Color(206,167,61));
			for(int i=0; i<8; i++) {
				g.setColor(Color.BLACK);
				g.drawLine(getWidth()/9*(i+1), 0, getWidth()/9*(i+1), 450);
			}
			for(int j=0; j<9; j++) {
				g.setColor(Color.BLACK);
				g.drawLine(0, 500 / 10*(j+1), getWidth(), 500 / 10*(j+1));
			}
			
			g.setColor(Color.WHITE);
			g.fillOval(getWidth()/9*4, 0, 75, 50);
			
			g.setColor(Color.BLACK);
			g.fillOval(getWidth()/9*4, 400, 75, 50);
		}
		
		NorthPanel() {
			
			MyMouseListener listener = new MyMouseListener();
			
			addMouseListener(listener);
			addMouseMotionListener(listener);
			
			JButton back = new JButton("Back");
			JButton next = new JButton("Next");
			JButton wallbt = new JButton("장애물");
			JButton lost = new JButton("기권");
			
			int w_wallnum = 10;
			int b_wallnum = 10;
			
			JLabel wall = new JLabel("Wall : 10", w_wallnum);
			JLabel wall2 = new JLabel("Wall : 10", b_wallnum);
			
			JLabel state = new JLabel("Black");
			
			next.setFont(new Font("Gothic", Font.BOLD, 20));
			back.setFont(new Font("Gothic", Font.BOLD, 20));
			wallbt.setFont(new Font("Gothic", Font.BOLD, 20));
			lost.setFont(new Font("Gothic", Font.BOLD, 20));
			
			wall.setFont(new Font("Gothic", Font.ITALIC, 20));
			wall2.setFont(new Font("Gothic", Font.ITALIC, 20));
			state.setFont(new Font("Gothic", Font.ITALIC, 32));
			
			wall.setBounds(30, 550, 100, 60);
			wall2.setBounds(570, 550, 100, 60);
			state.setBounds(290, 535, 100, 80);
			
			wall.setForeground(Color.BLACK);
			wall2.setForeground(Color.WHITE);
			state.setForeground(Color.BLACK);
			
			back.setBounds(20, 600, 110, 50);
			wallbt.setBounds(200, 600, 110, 50);
			lost.setBounds(380, 600, 110, 50);
			next.setBounds(550, 600, 110, 50);
			
			add(wall);
			add(state);
			add(wall2);
			add(back);
			add(wallbt);
			add(lost);
			add(next);
			
			lost.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	                new main();
	            }
	        });
		}
		
		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		}
}
