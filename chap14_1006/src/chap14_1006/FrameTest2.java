package chap14_1006;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame2 extends JFrame{
	public FirstFrame2() {
		Container ct = getContentPane();
		JButton jb = new JButton("테스트 버튼2");
		
		ct.add(jb);
		setTitle("두 번째 GUI 프로그램 - JFrame상속");
		setSize(400,300);
		setVisible(true);
	}
}
public class FrameTest2 {
	public static void main(String[] args) {
		new FirstFrame2();
	}
}
