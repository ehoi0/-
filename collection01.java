package javastudy0511;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collection01 {

	public static void main(String[] args) {
		//collection �ڷᱸ��      List map
		//�ڷᱸ��  ����,Ŭ����,�迭 �� (�����͸� ��� �����Ұų�)
		//�迭 -�������� ������,���� ������
		//����, ��ü, Ŭ����, �迭  �̷��� �����Ǽ� ���°� list
		//�迭�� �̸� ũ�⸦ ���س��� ���(�߰��� null���� ���ӵ��� ���� ������ ��밡��)
		//list- �迭�� ���������� �̸� ũ�⸦ ���س��� ��� ������ ���ӵ� �����͸� ��밡��
		//list ���� �ΰ���  
		//arraylist(�迭�� �����)   ���Ի����� ���ξ��� �˻��� �����ҋ�
		//linklist(���ӵǾ���������) ���� �����͸� ���󰡴� �ּҰ� ���� ���Ի����� ����  �ʿ��ҋ�
        //�ϵ������ �������� �ӵ����̰� ũ������ �ǵ��� arraylist�� ����
		//���׸� �����͸� ���������ִ°�
		
		//list ���ӵ� ������ ����ҷ��� �÷����� ��ߵ� �ڹ�.��ƿ.�÷���
		
		ArrayList<Integer> arrList=//����
				new ArrayList<Integer>();
		//Integer= wrapperŬ����(����) ������ �ٷ�� ��̸���Ʈ
		//boxing unboxing ����ȯ
		arrList.add(40);  //������ �ֱ�,�߰�
		arrList.add(30);
		arrList.add(20);
		arrList.add(10);
	    //get���� Ȯ�� �ε����� ��ã��
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("");
//		//remove ������ �����ϱ�
//		arrList.remove(1);    //��Ʈ �ε��� ����  Integer 30����
//		for(int i:arrList) {
//			System.out.println(i);
//		}
//		System.out.println("");
//		arrList.remove((Integer)10);   //������Ʈ  ��ü ����  true ���� 
//		for(int i:arrList) {
//			System.out.println(i);
//		}
//		System.out.println("");
		
		Collections.sort(arrList);  //����  (�˾Ƽ� ������)
		Iterator<Integer> iter=arrList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
		//Indexof  Ư�� ������ ��ġ ã��
		int index=arrList.indexOf((Integer)20);
		System.out.println(index);
		index=arrList.indexOf((Integer)20); //�ڵ� ����ȯ boxing
		System.out.println(index);
		System.out.println("");
		
		
		//contains   �������� true false
		System.out.println(arrList.contains(20));
		
		
		
		
		
		
	}

}
