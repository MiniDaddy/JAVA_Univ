/**
 * GUI 클래스에서 이벤트 처리하는 방법
 */
package chap14_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//1. 처리할 이벤트 종류 결정 >> ActionEvent
//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성 >> ActionListener
class Event1 extends JFrame implements ActionListener{
	JLabel jl; //JLabel 객체를 속성으로 등록
	public Event1() {
		//컨테이너 설정
		Container ct = getContentPane();
		
		//배치관리자설정
		ct.setLayout(new FlowLayout());
		
		//버튼생성
		JButton jb = new JButton("ㅎㅇ");
		//레이블 생성
		jl=new JLabel("버튼을 눌러 주세요");
		
		//컨테이너에 등록
		ct.add(jb);
		ct.add(jl);
		
		//3.이벤트를 받아드일 컴포넌트에 리스너 등록
		jb.addActionListener(this);
		
		//자잘한 설정
		setTitle("이벤트 테스트1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	//4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText("ㅎㅇ");
	}
}

//버튼 눌리면 label에 ㅎㅇ 작성(정확히는 덮어씌움)하는 코드
public class EventTest1 {
	public static void main(String[] args) {
		new Event1();
	}

}
