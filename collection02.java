package javastudy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	public double width,height;
	
	public double area() {
		return width*height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Rectangle other = (Rectangle) obj;
////		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
////			return false;
////		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
////			return false;
//		if(this.width*height==other.width*height) {
//			return true;
//		}else {
//		return false;
//		}
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	//위 코드 없이 출력할시 해시코드가 출력됨




	@Override
	public int compareTo(Rectangle other) {
		int returnValue =0;
	
		if(this.area()==other.area()) {
			returnValue=0;
		}else if(this.area()>other.area()) {
			returnValue=-1;
		}else if(this.area()<other.area()) {
			returnValue=1;
		}
		//this 랑 other를 비교해서 this가 클떄 -1이 리턴되면 내림차순 정렬
		////this 랑 other를 비교해서 this가 클떄 1이 리턴되면 오름차순 정렬
		//-1;교환필요  0같음  1교환필요없음
		return returnValue;
	}
	
}

class RectangleWidthAsc implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle arg0, Rectangle arg1) {
		int returnValue=0;
		if(arg0.width>arg1.width) {
			returnValue=-1;
		}else if(arg0.width<arg1.width) {
			returnValue=1;
		}else {
			
		}
		return returnValue;
		
	}
	  
}


public class collection02 {

	public static void main(String[] args) {
		//컬렉션을 사용하려면  equals랑 hashcode를 재정의 해야한다.
		// int String 잘 돌아감 
		//우리가 만든 클래스의 문제점
		System.out.println(new Rectangle(10,10));
		
		ArrayList< Rectangle> arrList=new ArrayList< Rectangle>();
		arrList.add(new Rectangle(10,10));
		arrList.add(new Rectangle(11,11));
		arrList.add(new Rectangle(12,12));
		arrList.add(new Rectangle(13,13));
		arrList.add(new Rectangle(14,14));
		arrList.add(new Rectangle(13,20));
		
		for(int i=0; i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println("");
		arrList.remove(1);
		arrList.remove(new Rectangle(12,12));

		for(Rectangle r:arrList) {
			System.out.println(r);
		}
		
		System.out.println("");
		Rectangle rect=new Rectangle(15,15);
		arrList.add(rect);
		arrList.remove(rect);
		for(Rectangle r:arrList) {
			System.out.println(r);
		}
		
		//객체정렬
		//compareTo,  compare   정렬 코드
		//compareTo --> compareable 인터페이스  
		//매개변수 1개:자기자신 매개변수비교
		//compare  -->comparator 인터페이스
		//매개변수 2개: 매개변수 2개 비교
		Collections.sort(arrList);
		System.out.println("");
		for(Rectangle r:arrList) {
			System.out.println(r);
		}
		//width or height 정렬
		//arrList, 뒤에 익명클래스(이름이 없는 클래스)
		Collections.sort(arrList,new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle arg0, Rectangle arg1) {
				int returnValue=0;
				if(arg0.width>arg1.width) {
					returnValue=-1;
				}else if(arg0.width<arg1.width) {
					returnValue=1;
				}else {
					
				}
				return returnValue;
			}
			
		});
		System.out.println("");
		for(Rectangle r:arrList) {
			System.out.println(r);
		}
		
//		Collections.sort(arrList,new RectangleWidthAsc());	
		RectangleWidthAsc rAsc=new RectangleWidthAsc();
		Collections.sort(arrList,rAsc);
		System.out.println("");
		for(Rectangle r:arrList) {
			System.out.println(r);
		}
		
		

	}

}
