package javastudy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javastudy0511.studentKor;





//�л� ��ü ����
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
	//���� ����
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
//	//����
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
//	//����
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
//	//���
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
			//������ �л� ���� �����ϴ� ���α׷����� ����� ����.
		//�л���ü�� ���� ���� ���� ���� ���� �� ��ռ����� �Է¹޾� ����ϴ�
		//���α׷��� ������
		ArrayList<student> arrList=new ArrayList<student>();
		
		arrList.add(new student("���ϱ�",50,60,90));
		arrList.add(new student("���̱�",60,70,80));
		arrList.add(new student("����",70,80,70));
		arrList.add(new student("����",80,90,60));
		arrList.add(new student("�����",90,100,50));
		
		System.out.println("----------------------");
		System.out.println("�������� ������ ����");
		studentKor st=new studentKor();
	    Collections.sort(arrList,st);
	    for(student s:arrList) {
	    	System.out.println(s);
	    	}
//	    System.out.println("");
//	    
//	    System.out.println("----------------------");
//		System.out.println("�������� ������ ����");
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
//		System.out.println("�������� ������ ����");
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
//		System.out.println("��� ������ ����");
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
