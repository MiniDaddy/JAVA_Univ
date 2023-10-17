package chap15_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//1. 처리할 이벤트 종류 << 버튼
//2. 이벤트에 적합한 이벤트리스너 인터페이스를 사용한다
class GUI1 extends JFrame implements ActionListener{
	private JTextArea jta;
	private JTextField jtf;
	public GUI1() {
		
		jta = new JTextArea("파일의 내용을 입력하세요", 10, 20);
		jtf = new JTextField("파일 이름을 입력하세요",20);
		JButton jb = new JButton("파일로 생성");
		
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel jp = new JPanel();
		
		//판넬에 텍스트필드 추가
		jp.add(jtf);
		//버튼추가
		jp.add(jb);
		
		//텍스트에어리어 추가
		ct.add(jta);
		//컨테이너에 판넬추가
		ct.add(jp);
		
		//3.이벤트 받아들일 버튼의 리스너 등록
		jb.addActionListener(this);
		
		setTitle("GUI 테스트1");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	//리스너 인터페이스에 선언된 메소드를 오버라이딩 하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			//입출력을 위한 예외처리
			//파일 이름으로 출력 객체 생성
			String s = jtf.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			//텍스트 에어리어의 내용을 파일에 넣음
			dos.writeUTF(jta.getText());
			fos.close();
			System.out.println(s+"파일 생성 완료");	
		} catch (Exception e) {
			
		}
	}
}


public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}

}
