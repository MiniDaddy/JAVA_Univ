/**
 * 202295032 정광민
 * -------------------- 기말고사 대비 공부해두기 ---------------------
 * 
 */
package chap15_1031;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

//성별 panel
class RadioPanel extends JPanel implements ActionListener{
	//radio 그룹 생성
	ButtonGroup gb = new ButtonGroup();
	//label 생성
	JLabel jl1 = new JLabel(" 당신의 성별은? ");
	JLabel jl2 = new JLabel();
	//radio button 생성
	JRadioButton[] jrb = new JRadioButton[5];
	
	String gender[] = {"남자","여자"};
	
	public RadioPanel(){
		//성별을 radio버튼 객체로 배열 생성
		for(int i=0; i<gender.length; i++) {
			jrb[i]=new JRadioButton(gender[i]);
			add(jrb[i]); //gender panel에 객체 추가
			gb.add(jrb[i]); //button group에 추가
			
			jrb[i].addActionListener(this); //리스너 등록
			
		}
		//JPanel 이용해서 panel 만들기이므로 여기선 Container 안씀
		//화면에 label 추가
		add(jl1);
		add(jl2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s.toString());
	}
}

//혈액형 panel
class ComboPanel extends JPanel implements ItemListener{
	ButtonGroup gb = new ButtonGroup();
	JLabel jl1 = new JLabel(" 당신의 혈핵형은? ");
	JLabel jl2 = new JLabel();
	public ComboPanel() {
		JComboBox<String> bloodCombo = new JComboBox<String>();
		//리스트
		String bloodList[] = {"A형","B형","O형","AB형","기타"};
		
		for(int i=0; i<bloodList.length; i++) bloodCombo.addItem(bloodList[i]); //bloodCombo 값 추가
		
		//화면에 추가
		add(jl1);
		add(jl2);
		add(bloodCombo);
		
		bloodCombo.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s=e.getItem();
		jl2.setText(s.toString());
		
	}	
}

/*GUI*/
class JTabPane extends JFrame{
	public JTabPane() {
		Container ct = getContentPane();
		JTabbedPane jtp = new JTabbedPane();
		
		//radio, combo 판넬 생성
		RadioPanel rp=new RadioPanel();
		ComboPanel cp=new ComboPanel();
		
		//JTabbedPane에 Panels 추가
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		
		//Container에 추가
		ct.add(jtp);
		
		setTitle("title");
		setSize(400,150);
		setVisible(true);
	}
}

public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabPane();

	}

}
