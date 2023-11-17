package chap17_1117;

import java.util.TreeSet;

public class TreeSetLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto_num=new TreeSet<Integer>();
		
		while(lotto_num.size()<6) {
			int num=(int)(Math.random()*45+1); //로또번호 하나
			lotto_num.add(num);
		}
		System.out.println("오늘의 로또 번호 >> "+lotto_num);
	}

}
