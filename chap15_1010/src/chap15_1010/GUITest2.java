package chap15_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener{
	JTextArea jta;
	JTextField jtf;
	public GUI2() {
		jta = new JTextArea(10, 20);
		jtf = new JTextField("파일 이름을 입력하세요",20);
		JButton jb = new JButton("읽어오기");
		
		//에어리어 수정 불가
		jta.setEditable(false);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel jp = new JPanel();
		
		//판넬에 텍스트필드 추가
		jp.add(jtf);
		//버튼추가
		jp.add(jb);
		
		//컨테이너에 판넬추가
		ct.add(jp);
		//텍스트에어리어 추가
		ct.add(jta);
		
		jb.addActionListener(this);
		
		setTitle("GUI 테스트2");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			//입출력을 위한 예외처리
			//파일 이름으로 입력 객체 생성
			String s = jtf.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			//내용을 읽어와서 텍스트 에어리어에 넣음
			jta.setText(dis.readUTF());
			fis.close();
			System.out.println(s+"파일 읽어오기 완료");	
		} catch (Exception e) {
			System.out.println("파일 읽어오기 실패");
		}
	}
}

public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}

}
