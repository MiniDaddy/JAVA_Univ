package chap14_1006;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayout1 extends JFrame{
	public FlowLayout1() {
		
		//프레임으로부터 컨테이너 생성
		Container ct = getContentPane();
		
		//컨테이너에 컴포넌트를 수직방향으로 연속으로 배치시키는 관리자
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,10,15);
		
		//컨테이너에 레이아웃 설정
		ct.setLayout(f1);
		
		//15개 버튼 컴포넌트를 생성해 컨테이너에 추가
		for(int i=1; i<=15; i++) {
			ct.add(new JButton("버튼"+i));
		}
		
		setTitle("FlowLayout Test");
		setSize(500,300);
		
		//윈도 창 종료 시 프로세스 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//출력
		setVisible(true);
	}
}

public class FlowlayoutTest1 {
	public static void main(String[] args) {
		new FlowLayout1();

	}

}
