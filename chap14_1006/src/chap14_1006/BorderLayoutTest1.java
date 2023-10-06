package chap14_1006;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayout1 extends JFrame{
	public BorderLayout1() {
		
		Container ct = getContentPane();
		
		BorderLayout bl = new BorderLayout(10,10);
		
		ct.setLayout(bl);
		
		ct.add(new JButton("오른쪽 버튼"),BorderLayout1.LEFT_ALIGNMENT);
		ct.add(new JButton("왼쪽 버튼"),BorderLayout1.RIGHT_ALIGNMENT);
		ct.add(new JButton("위쪽 버튼"),BorderLayout1.TOP_ALIGNMENT);
		ct.add(new JButton("아래쪽 버튼"),BorderLayout1.BOTTOM_ALIGNMENT);
		ct.add(new JButton("중앙쪽 버튼"),BorderLayout1.CENTER_ALIGNMENT);
		
		setTitle("BorderLayout Test");
		setSize(400,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
}

public class BorderLayoutTest1 {
	public static void main(String[] args) {
		new BorderLayout1();

	}

}
