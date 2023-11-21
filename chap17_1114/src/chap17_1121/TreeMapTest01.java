package chap17_1121;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest01 {

	public static void main(String[] args) {
		TreeMap<Integer,String> score=new TreeMap<Integer,String>();
		
		score.put(97, "국어");
		score.put(88, "수학");
		score.put(100, "국사");
		score.put(85, "생윤");
		score.put(75, "지리");
		
		//첫번째 요소를 map.Entry형으로 생성 <key,value>
		Map.Entry<Integer, String> high_low=score.firstEntry();	// << firstEntry, lastEntry 제일 낮은 값과 높은 값 저장
		//Map.Entry << 항상 정렬됨
		
		System.out.println("가장 낮은 성적은 "+high_low.getKey()+"점인 "+high_low.getValue()+"입니다."); 
		
		//학점 출력
		//80 미만은 C,D에 해당하고 80 이상은 A,B에 해당
		Map<Integer, String> cd=score.headMap(80); //80 미만 맵 생성
		Map<Integer, String> ab=score.tailMap(80); //80 이상 맵 생성
		
		System.out.println("학점 A, B에 해당하는 과목과 점수\n"+ab);
		
		System.out.println("학점 C, D에 해당하는 과목과 점수\n"+cd);
		
		System.out.println("점수순 출력(오름차순) >> "+score);
		System.out.println("점수순 출력(내림차순) >> "+score.descendingMap()); //내림차순
		
	}

}
