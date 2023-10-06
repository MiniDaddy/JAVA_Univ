package chap14_1006;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame{
	public JPanel2() {
		Container ct = getContentPane();
		
		//배치관리자 설정
		ct.setLayout(new BorderLayout(5,5)); //큰 5,5칸짜리 레이아웃
		
//판넬1 객체 생성
		JPanel jp1 = new JPanel();
		//판넬의 그리드 배치 관리자 설정 
		jp1.setLayout(new GridLayout(5,1)); //5줄 1칸짜리 판넬 하나
		//판넬1에 라디오 버튼 추가
		jp1.add(new JRadioButton("JAVA"));
		jp1.add(new JRadioButton("C"));
		jp1.add(new JRadioButton("JS"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("C#"));
		
//판넬2 객체 생성
		JPanel jp2 = new JPanel();
		//판넬의 그리드 배치 관리자 설정 
		jp1.setLayout(new GridLayout(5,1)); //5줄 1칸짜리 판넬 하나
		//판넬2에 라디오 버튼 추가
		jp2.add(new JButton("JAVA"));
		jp2.add(new JButton("C"));
		jp2.add(new JButton("JS"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("C#"));
		
//판넬3 객체 생성
		JPanel jp3 = new JPanel();
		//판넬의 그리드 배치 관리자 설정 
		jp1.setLayout(new GridLayout(1,1)); //1줄 1칸짜리 판넬 하나
		//판넬3의 레이블 추가
		jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택하세요"));
		
		//컨테이너에 판넬 올리기
		ct.add(jp1,BorderLayout.WEST);
		ct.add(jp2,BorderLayout.EAST);
		ct.add(jp3,BorderLayout.NORTH);
		
		setTitle("JPanel Test2");
		setSize(500,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class JPanelTest2 {
	public static void main(String[] args) {
		new JPanel2();
	}

}
