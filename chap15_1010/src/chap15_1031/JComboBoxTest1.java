package chap15_1031;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComBox extends JFrame implements ItemListener{ //<-ItemListener
	JLabel imageLabel; //<<itemStateChanged에서 이미지를 저장하는 영역으로 사용하기 위해 생성자 밖에다 지정
	public JComBox(){
		//만들 객체 생성
		imageLabel = new JLabel();
		JComboBox<String> fruitCombo = new JComboBox<String>();
		
		//combobox에 저장할 데이터 모음
		String fruitList[] = {"persimmom","banana","pear","apple","cherry","peach"};
		
		//세팅
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		//콤보박스에 배열 넣어주기
		for(int i=0; i<fruitList.length; i++) {fruitCombo.addItem(fruitList[i]);}
		
		//ct에 콤보박스 추가
		ct.add(fruitCombo);
		//label구역 지정
		ct.add(imageLabel);
		
		//콤보박스에 이벤트리스너 등록
		fruitCombo.addItemListener(this);
		
		//출력
		setTitle("title");
		setSize(200,200);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem(); //String fruit 선언하고 콤보박스 아이템 String으로 갖고오기
		imageLabel.setIcon(new ImageIcon("image/"+fruit+".jpg")); //label에 사진 표시하기.
		
	}
}


public class JComboBoxTest1 {
	public static void main(String[] args) {
		new JComBox();
	}

}
