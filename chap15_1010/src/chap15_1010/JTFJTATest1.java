package chap15_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTFJTA1 extends JFrame implements ActionListener{
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jl = new JLabel("입력");
	public JTFJTA1() {
		jtf=new JTextField(20);
		jta=new JTextArea(10,20);
		jta.setEditable(false);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel jp = new JPanel();
		
		jp.add(jtf);
		jp.add(jta);
		ct.add(jp);
		ct.add(jl);
		
		jtf.addActionListener(this);
		
		setTitle("JTFJTA Test1");
		setSize(500,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(jta.getLineCount()<=jta.getRows()) {
			jta.append(ae.getActionCommand()+'\n');
			jtf.setText("");
		}else {
			jl.setText("입력 종료");
			jtf.setEditable(false);
		}
		
	}
}

public class JTFJTATest1 {
	public static void main(String[] args) {
		new JTFJTA1();
	}

}
