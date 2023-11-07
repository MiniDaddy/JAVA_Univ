package chap16_1107;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener{
	JLabel lottoLabel=new JLabel();
	public Lotto() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JButton lottoBtn=new JButton("로또 번호 자동생성");
		
		ct.add(lottoBtn);
		ct.add(lottoLabel);
		
		lottoBtn.addActionListener(this);
		
		
		setTitle("Lotto GUI");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
		int[] lottoNum=new int[6];
		
		//중복검사
		int temp=0;
		int i=0;
		a:while(i<6) { //<< a:while 함으로써 continue a 하며 찍어서 돌아갈 수 있게끔 함
			temp=rand.nextInt(45)+1;
			for(int j=0; j<=i; j++) { //지금까지 i에 넣은 수들만큼 반복
				if(lottoNum[j]==temp) continue a; //중복시 숫자생성부터 재시도 
			}
			lottoNum[i]=temp; //중복 없을 시 넣기
			i++;
		}
		lottoLabel.setText("이번 주 로또 당첨 번호 >> "+Arrays.toString(lottoNum)); //Arrays.toString(배열)
	}
}

public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}

}
