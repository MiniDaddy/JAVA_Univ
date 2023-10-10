/**
 * 내부 클래스를 이용한 이벤트 처리
 */
package chap14_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Event2 extends JFrame{
	//JLabel 객체를 속성으로 등록
	JLabel jl;
	
	//JButton 객체를 속성으로 2개 등록
	JButton jb1,jb2;
	
	//생성자
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1=new JButton("  안녕하세요.  ");
		jb2=new JButton("  반갑습니다.  ");
		
		jl=new JLabel("버튼을 누르세요");
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		
		//3.이벤트를 받아들일 컴포넌트에 리스너 등록
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		
		setTitle("이벤트 테스트2");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//이벤트를 처리할 클래스 작성
	//1. 처리할 이벤트 종류 결정 - ActionEvent
	//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성
	
	private class EventProcess implements ActionListener {
		//4.리스너 인터페이스에 선언된 메서드 오버라이딩해서 이벤트 처리루틴 작성
		@Override
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand()); //버튼 눌러서 가져온거 그대로 입력
		}
	}

}

public class EventTest2 {
	public static void main(String[] args) {
		new Event2();
	}

}