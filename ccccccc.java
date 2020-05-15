package javastudy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javastudy0511.studentKor;





//학생 객체 생성
class student {
	public String name;
	public double kor,eng,math;
	
	
	public double avg() {
		return (kor+eng+math)/3;
		
	}

	public student(String name, double kor, double eng, double math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", kor=" + kor + ", eng=" + eng + ","
				+ " math=" + math + "avg="+avg()+"]";
	}
}
	//국어 성적
	class studentKor implements Comparator<student>{

		@Override
		public int compare(student o1, student o2) {
			int returnValue=0;
			if(o1.kor>o2.kor) {
				returnValue=-1;
			}else if(o1.kor<o2.kor) {
				returnValue=1;
			}
			return returnValue;
		}
	}
//	
//	//영어
//	class studentEng implements Comparator<student>{
//
//		@Override
//		public int compare(student o1, student o2) {
//			int returnValue=0;
//			if(o1.eng>o2.eng) {
//				returnValue=-1;
//			}else if(o1.eng<o2.eng) {
//				returnValue=1;
//			}
//			return returnValue;
//		}
//	}
//	
//	//수학
//	class studentMath implements Comparator<student>{
//
//		@Override
//		public int compare(student o1, student o2) {
//			int returnValue=0;
//			if(o1.math>o2.math) {
//				returnValue=-1;
//			}else if(o1.math<o2.math) {
//				returnValue=1;
//			}
//			return returnValue;
//		}
//	}
//	
//	//평균
//	class studentAvg implements Comparator<student>{
//
//		@Override
//		public int compare(student o1, student o2) {
//			int returnValue=0;
//			if(o1.avg()>o2.avg()) {
//				returnValue=-1;
//			}else if(o1.avg()<o2.avg()) {
//				returnValue=1;
//			}
//			return returnValue;
//		}
//	}
	
	

	
	

public class ccccccc {

	public static void main(String[] args) {
			//간단히 학생 성적 관리하는 프로그램ㅇ르 만들어 보자.
		//학생객체를 만들어서 국어 영어 수학 순위 와 평균순위를 입력받아 출력하는
		//프로그램을 만들자
		ArrayList<student> arrList=new ArrayList<student>();
		
		arrList.add(new student("김일구",50,60,90));
		arrList.add(new student("김이구",60,70,80));
		arrList.add(new student("김삼수",70,80,70));
		arrList.add(new student("김사수",80,90,60));
		arrList.add(new student("김오수",90,100,50));
		
		System.out.println("----------------------");
		System.out.println("국어점수 순위별 정렬");
		studentKor st=new studentKor();
	    Collections.sort(arrList,st);
	    for(student s:arrList) {
	    	System.out.println(s);
	    	}
//	    System.out.println("");
//	    
//	    System.out.println("----------------------");
//		System.out.println("영어점수 순위별 정렬");
//		
//	    Collections.sort(arrList,new Comparator<student>() {
//
//			@Override
//			public int compare(student o1, student o2) {
//				int returnValue=0;
//				if(o1.eng<o2.eng) {
//					returnValue=1;
//				}else if(o1.eng>o2.eng) {
//					returnValue=-1;
//				}
//				return returnValue;
//			}
//	    	
//	    });
//	    for(student s:arrList) {
//	    	System.out.println(s);
//	    	}
//	    
//	    System.out.println("");
//	    System.out.println("----------------------");
//		System.out.println("수학점수 순위별 정렬");
//		
//	    Collections.sort(arrList,new Comparator<student>() {
//
//			@Override
//			public int compare(student o1, student o2) {
//				int returnValue=0;
//				if(o1.math<o2.math) {
//					returnValue=1;
//				}else if(o1.math>o2.math) {
//					returnValue=-1;
//				}
//				return returnValue;
//			}
//	    	
//	    });
//	    for(student s:arrList) {
//	    	System.out.println(s);
//	    	}
//	    
//	    System.out.println("");
//	    System.out.println("----------------------");
//		System.out.println("평균 순위별 정렬");
//		
//	    Collections.sort(arrList,new Comparator<student>() {
//
//			@Override
//			public int compare(student o1, student o2) {
//				int returnValue=0;
//				if(o1.avg() <o2.avg()) {
//					returnValue=1;
//				}else if(o1.avg()>o2.avg()) {
//					returnValue=-1;
//				}
//				return returnValue;
//			}
//	    	
//	    });
//	    for(student s:arrList) {
//	    	System.out.println(s);
//	    	}
	   

		

	}

}
