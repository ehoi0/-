package javastudy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collection01 {

	public static void main(String[] args) {
		//collection 자료구조      List map
		//자료구조  변수,클래스,배열 등 (데이터를 어떻게 저장할거냐)
		//배열 -여러개의 데이터,같은 데이터
		//변수, 객체, 클래스, 배열  이런게 발전되서 나온게 list
		//배열은 미리 크기를 정해놓고 사용(중간에 null같은 연속되지 않은 데이터 사용가능)
		//list- 배열과 마찬가지로 미리 크기를 정해놓고 사용 하지만 연속된 데이터만 사용가능
		//list 종류 두가지  
		//arraylist(배열로 만든것)   삽입삭제가 별로없고 검색을 많이할떄
		//linklist(연속되어있지않음) 다음 데이터를 따라가는 주소가 있음 삽입삭제가 많이  필요할떄
        //하드웨어의 발전으로 속도차이가 크지않음 되도록 arraylist를 쓰자
		//제네릭 데이터를 한정지어주는것
		
		//list 연속된 데이터 사용할려면 컬렉션을 써야됨 자바.유틸.컬렉션
		
		ArrayList<Integer> arrList=//선언
				new ArrayList<Integer>();
		//Integer= wrapper클래스(감싼) 정수를 다루는 어레이리스트
		//boxing unboxing 형변환
		arrList.add(40);  //데이터 넣기,추가
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
	    //get으로 확인 인덱스로 값찾기
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("");
//		//remove 데이터 삭제하기
//		arrList.remove(1);    //인트 인덱스 삭제  Integer 30리턴
//		for(int i:arrList) {
//			System.out.println(i);
//		}
//		System.out.println("");
//		arrList.remove((Integer)10);   //오브젝트  객체 삭제  true 리턴 
//		for(int i:arrList) {
//			System.out.println(i);
//		}
//		System.out.println("");
		
		Collections.sort(arrList);  //정렬  (알아서 정렬함)
		Iterator<Integer> iter=arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
		//Indexof  특정 데이터 위치 찾기
		int index=arrList.indexOf((Integer)20);
		System.out.println(index);
		index=arrList.indexOf((Integer)20); //자동 형변환 boxing
		System.out.println(index);
		System.out.println("");
		
		
		//contains   존재유무 true false
		System.out.println(arrList.contains(20));
		
		
		
		
		
		
	}

}
