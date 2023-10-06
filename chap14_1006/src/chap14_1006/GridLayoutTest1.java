package chap14_1006;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayout1 extends JFrame{
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10); //4행 5열
		
		ct.setLayout(gl);
		
		//20개 버튼 만들어서 컴포넌트에 전달
		for(int i=1; i<=20; i++) {
			ct.add(new JButton("버튼"+i));
		}
		
		setTitle("GridLayout Test");
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class GridLayoutTest1 {
	public static void main(String[] args) {
		new GridLayout1();
	}

}
