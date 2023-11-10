package chap16_1110;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class timeTest extends JFrame implements ActionListener{
	JLabel jl;
	JTextField jtf;
	JButton nowBtn, hundredBtn;
	JTextArea nowArea, hundredArea;
	
	public timeTest() {
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		
		JPanel topPanel=new JPanel();
		JPanel midPanel=new JPanel();
		JPanel botPanel=new JPanel();
		
		jl = new JLabel("당신의 생일을 공백으로 구분하여 입력(예:2020 01 01)");
		jtf = new JTextField(10);
		
		nowBtn=new JButton("현재");
		hundredBtn=new JButton("100살");
		
		nowArea=new JTextArea(4,30); nowArea.setEditable(false);
		hundredArea=new JTextArea(3,30); hundredArea.setEditable(false);
		
		topPanel.add(jl); topPanel.add(jtf);
		midPanel.add(nowBtn); midPanel.add(nowArea);
		botPanel.add(hundredBtn); botPanel.add(hundredArea);
		
		ct.add(topPanel);
		ct.add(midPanel);
		ct.add(botPanel);
		
		nowBtn.addActionListener(this);
		hundredBtn.addActionListener(this);
		
		setVisible(true);
		setTitle("TimeTest");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String birth=jtf.getText(); //입력한거 들고옴
		StringTokenizer st=new StringTokenizer(birth); //띄어쓰기로 분류
		
		int year = Integer.parseInt(st.nextToken()); //공백기준 첫 번째
		int month = Integer.parseInt(st.nextToken()); //두 번째
		int day = Integer.parseInt(st.nextToken()); //세 번째
		
		LocalDate myBirth=LocalDate.of(year, month, day); //지금 내 생일
		LocalDate now=LocalDate.now(); //지금
		LocalDate hundred=myBirth.plusYears(100); //태어난 날로부터 100년 후
		
		if(e.getActionCommand()=="현재") { //현재 버튼 클릭
			nowArea.setText("당신의 생일 : "+year+"년 "+month+"월 "+day+"일\n"
					+"오늘 날짜는:"+now.getYear()+"년 "+now.getMonthValue()+"월 "+now.getDayOfMonth()+"일\n"
					+"생일부터 오늘까지의 일 : "+myBirth.until(now, ChronoUnit.DAYS)+"\n" //until(지금, LocalDate타입의 myBirth의 days)
					+"생일부터 오늘까지의 년 : "+now.minusYears(year).getYear()); //지금부터 생일 뺀 날짜에서 year만 뺌
		}else if(e.getActionCommand()=="100살") { //100살 버튼 클릭
			hundredArea.setText("당신의 100살이 되는 날은 : "+(year+100)+"년 "+month+"월 "+day+"일\n"
					+"100살까지 남은 주(week)수 : "+now.until(hundred, ChronoUnit.WEEKS)+"\n" //100년 뒤 까지 남은 주
					+"100살까지 남은 일 수 : "+now.until(hundred, ChronoUnit.DAYS)); //100년 뒤 까지 남은 일
		}
		
	}
}
public class TimeTestGUI {
	public static void main(String[] args) {
		new timeTest();
	}

}
