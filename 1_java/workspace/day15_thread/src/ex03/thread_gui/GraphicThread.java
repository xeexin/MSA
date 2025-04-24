package ex03.thread_gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	int y, x, num;
	Color color;
	Random random;

	// 생성자함수 - 초기화
	public GraphicThread(int num) {
		this.num = num;
		color = Color.MAGENTA; // 대소문자 똑같은 색상임
		random = new Random();
		setSize(500, 400); // 프레임 크기 설정 : 너비 500 높이 400 짜리의 화면(프레임)을 만들 것
		setVisible(true); // 화면 보여주기
		
		setLocation(300,300); //보여질 프레임 (화면)의 위치

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼

	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 10, 10);
		g.fillOval(x, y, 10, 10);
	}

	@Override
	public void run() { // 스레드 구현부(실행부)
		Rectangle rect = getBounds();

		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);

			repaint();
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	} // end run()

	public static void main(String[] args) {
		// 1. 자체로 만들기
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		
		//2. 
		new Thread(new GraphicThread(200)).start();
	}

}
