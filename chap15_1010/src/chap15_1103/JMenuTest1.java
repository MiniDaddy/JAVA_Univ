package chap15_1103;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf; //선택메뉴 이름 출력용
	public JMenu1(){
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		//1. JMenuBar 객체 생성
		JMenuBar jmb = new JMenuBar();
		//2. JMenu 객체 생성
		JMenu menu1=new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		//서브메뉴 JMenuItem 생성
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this); //누르면 jtf에 떠야하기 때문
		menu1.add(jmi); //파일 누르면 새파일 창 뜸
		
		jmi=new JMenuItem("저장하기"); //이미 저장 했으니 같은 jmi에다가 덮어씌움
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		//menu2에 서브메뉴 이름만 다르게 똑같이 반복
		jmi=new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);

		jmi=new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);

		jmi=new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);

		
		//3.서브메뉴  JCheckBoxMenuItem 객체 생성
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);

		//3.서브메뉴 JRadioButtonMenuItem 객체 생성
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi);
		
		//5.menu1,menu2를 메뉴바에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		
		//6.setJMenuBar 메서드를 이용하여 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf=new JTextField();
		ct.add(jtf,BorderLayout.SOUTH);
		
		//출력
		setSize(300,200);
		setVisible(true);
		setTitle("title");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}

public class JMenuTest1 {
	public static void main(String[] args) {
		new JMenu1();
	}
	
}
