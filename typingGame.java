package javastudy0506;

class typingGameEx {
	public static int totalCount=0; 
	public String id=null;
	public String pw=null;
	public int countJ=0;
	public int sucJ=0;
	public int countW=0;
	public int sucW=0;
	public int countS=0;
	public int sucS=0;
	
	public typingGameEx() {  //������
		totalCount++;
	}
	
	public typingGameEx(String id,String pw) {  //���̵� �н����� ����
		this();  // ������ ȣ��
		this.id=id;
		this.pw=pw;
	}
	
	//�Է��� �޾�  ���̵� ��й�ȣ Ȯ��
	public boolean isLogin(String id,String pw) { //���ϰ��� �ǵ����̸� 1����
		boolean returnValue=false;
		if(this.id.equals(id)&&this.pw.equals(pw)) {
			returnValue=true;
		}//���̵�� �н����尡 ��������� �����ϸ� true�� �����Ѵ�.
		
		return returnValue;
	}
	
	

   public void easyPractice() {  //�ڸ�����
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("�ڸ����� ");
	   boolean flag=true;
	 while(flag) {
	    String [] easy= new String[] {"��","��","��","��","��","��","��","��","��","��",
			   						 "��","��","��",
			   						"��","��","��","��","��","��","��","��","��","��",
			   						 "��","��","��"}; //26
	  
	    int randomNum=(int)(Math.random()*26);
	    System.out.println("���� ȭ�鿡 ��µǴ� �ڸ��� �Է��Ͻÿ�  ����:'0' ");
	    System.out.println("�Է��ϼ���:"+ easy[randomNum]);
	    System.out.println(">>");
	    String input=sc.nextLine();
	   
	    if(input.equals(easy[randomNum])) {
		   System.out.println("�����Դϴ�");
		   sucJ++;
		   countJ++;
	   }
	    else if(input.equals("0")) {
	    	flag=false;
	    	System.out.println("�ڸ�����");
	    	score(sucJ,countJ);
	    	
	   }else {
		   System.out.println("�����Դϴ�");
		   countJ++;

		 
		   
	   }
	 }
   
   }
   
   public void longPractice() {   //��� ����
	   System.out.println("��� ����");
	   java.util.Scanner sc=new java.util.Scanner(System.in);
		
	   boolean flag=true;
		 while(flag) {
		    String [] sentence= new String[10];
		    sentence[0] ="������ ���� ��� �� ���� �㰡 ��´�.";
		    sentence[1] ="���� ���� ��Ӵ�.";
		    sentence[2] ="�ٴ� �� ���� ���� �� �ִ�.";
		    sentence[3] ="�� �Ұ� �ܾ簣 ��ģ��.";
		    sentence[4] ="�׸��� ��";
		    sentence[5] ="�ݰ��굵 ���İ�";
		    sentence[6] ="�� ��� ��";
		    sentence[7] ="�� �ڰ� �� ��";
		    sentence[8] ="�� ���� �⿪�ڵ� �𸥴�.";
		    sentence[9] ="���� �ϴÿ� ������";
		  
		    int randomNum=(int)(Math.random()*10);
		    System.out.println("���� ȭ�鿡 ��µǴ� �Ӵ��� �Է��Ͻÿ�  ����:'0' ");
		    System.out.println("�Է��ϼ���:"+ sentence[randomNum]);
		    System.out.println(">>");
		    String input=sc.nextLine();
		   
		    if(input.equals(sentence[randomNum])) {
			   System.out.println("�����Դϴ�");
			   sucS++;
			   countS++;
		   }
		    else if(input.equals("0")) {
		    	flag=false;
		    	System.out.println("��� ����");
		    	score(sucS,countS);
		    	
		   }else {
			   System.out.println("�����Դϴ�");
			   countS++;

			 
			   
		   }
		 }
	 
   }
   
	public void score (double a,double b) {  //�������
		 double score=(a/b)*100;
		 System.out.println("����:"+(int)a);
		 System.out.print("��Ȯ��:");
		 if(b!=0) {
			 System.out.println(String.format("%.1f%%", score));
		 }else {
			 System.out.println(0);
		 }
		
		
	}
	
   public void wordPractice() {   //�ܾ� ����
	   System.out.println("�ܾ� ����");
	   java.util.Scanner sc=new java.util.Scanner(System.in);
		
	   boolean flag=true;
		 while(flag) {
		    String [] word= new String[] {"����","����","ġŲ","����","��","å��","����","����","Ȱ","��ǻ��",
				   						 "�±ر�","�ٶ�","��",
				   						"����","�ڵ���","����","����","���б�","����б�","�ڵ���","������","���ȭ","����",
				   						 "�縻","�尩","�����"}; //26
		  
		    int randomNum=(int)(Math.random()*26);
		    System.out.println("���� ȭ�鿡 ��µǴ� �ܾ �Է��Ͻÿ�  ����:'0' ");
		    System.out.println("�Է��ϼ���:"+ word[randomNum]);
		    System.out.println(">>");
		    String input=sc.nextLine();
		   
		    if(input.equals(word[randomNum])) {
			   System.out.println("�����Դϴ�");
			   sucW++;
			   countW++;
		   }
		    else if(input.equals("0")) {
		    	flag=false;
		    	System.out.println("�ܾ� ����");
		    	score(sucW,countW);
		    	
		   }else {
			   System.out.println("�����Դϴ�");
			   countW++;

			 
			   
		   }
		 }
	   
   }
   
   public void showinfo() {
	    System.out.println("�ڸ� ����");
	    score(sucJ,countJ);
	    System.out.println("");
	    System.out.println("��� ����");
	    score(sucS,countS);
	    System.out.println("");
	    System.out.println("�ܾ� ����");
	    score(sucW,countW);
	    System.out.println("");

  }

	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println(this.id+"���� �޴�\n"+"1.�ڸ�����  2.��� ����  3.�ܾ� ����  4.���� ���� 0.����");
		String input=sc.nextLine();
		switch (input) {
		    case "1":
		    	easyPractice();
		    	   break;
		    case "2":
		    	longPractice();
		    	   break;
		    case "3":
		    	wordPractice();
		    	   break;
		    case "4":
		    	showinfo();
		    	   break;
		    case "0":
		    	System.out.println("����");
		    	flag=false;
		    	break;
		    default:
		    	System.out.println("�߸��� �Է� �Դϴ�.");
		    	
		 }
		}
	}
}

class typing {
	public static int totalCount=0;
//	public String name=null;
	public typingGameEx [] account=new typingGameEx[10];
	public int accountCount=0;
	//�α��� ���� ������-1  �α��� �Ǹ� �ش� �ε���
	public int accountCurrent=-1;
	
	public typing() { //������
			totalCount++;
	}
//	public typing(String name) {
//		totalCount++;
//		this.name=name;
//	}
	public void accountAdd() {  //�������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("���ϴ� id�� �Է��ϼ���");
		String id=sc.nextLine();
		if(isId(id)) {  //Ư���Լ� ȣ���ؼ� �ߺ�Ȯ��
			System.out.println("���̵� �ߺ�");
			return;
		}
		System.out.println("���ϴ� pw�� �Է��ϼ���");
		String pw=sc.nextLine();
		account[accountCount++]=new typingGameEx(id,pw);
		//�迭�� ������� �����͸� �ֱ����� ������ ++
	}
	private boolean isId(String id) {
		boolean returnValue=false;
		for(int i=0;i<accountCount;i++) {
			if(account[i].id.equals(id)) {
				returnValue= true;
			};
		}
		return returnValue;
	}
	
	public boolean Login(String id,String pw) {
		//isLogin(id,pw)
		//���̵�� �н����尡 ��������� �����ϸ� true�� �����Ѵ�.
		boolean returnValue=false;
		for(int i=0;i<accountCount;i++) {
			if(account[i].isLogin(id,pw)) {
				returnValue= true;
				accountCurrent=i;
				break;
			}
		}//true�̸�?  �α��� �ȴ�     false �� �α��ξȵ�
		return returnValue;
	}
	
	public void logout() {
		accountCurrent=-1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public void displayAll() {  
		System.out.println("���� �� ����");
		System.out.println(typingGameEx.totalCount+"��");
	}
	public void useAccoumt() {
		if(accountCurrent!=-1) {  //-1�ƴҶ��� �۵�
			account[accountCurrent].menu();
		} else {
			System.out.println("�߸��� �α���");
		}
	}
	
	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean flag=true;
	while(flag)	{
		System.out.println("1.������� 2.�� ���� ��� 3.���� �α���  4.�α׾ƿ� "
				+"5.���� ���� 0.����");
		String stringInput=sc.nextLine();
		switch(stringInput) {
			case "1":
				accountAdd();
				
				break;
			case "2":
				displayAll();
				break;
			case "3":
				System.out.println("id�� �Է��ϼ���");
				String id=sc.nextLine();
				System.out.println("pw�� �Է��ϼ���");
				String pw=sc.nextLine();
				
				if(Login(id, pw)) {
					System.out.println("�α��� ����");
					useAccoumt();
				}else {
					System.out.println("�α��� ����");
				}

				break;
			case "4":
				logout();
				break;
			case "5":
				if(accountCurrent!=-1) {
				System.out.println("pw�� �Է��ϼ���");

				pw=sc.nextLine();
				delete(pw);
				}else {
					System.out.println("�α��� �ϼ���");
				}
				break;
			case "0":
				System.out.println("����");
				flag=false;
				break;
			default:
				System.out.println("�߸��Է� �ϼ̽��ϴ�.");
				
		}
	  }	
	}
	
	public void delete(String pw) {
		delete(account[accountCurrent].id,pw);
		
	}
	
	public void delete(String id,String pw) {
		boolean flag=false;
		for(int i=0;i<accountCount;i++) {
			if(account[i].isLogin(id, pw)) {
				accountCurrent=i;
				flag=true;
				break;
			}
								
		}
		if(flag) {  //ã���� ����
			for(int i=accountCurrent;i+1<accountCount;i++) {
				account[i]=account[i+1];
			}
			typingGameEx.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("���� �Ϸ�");
		}else {
			System.out.println("���� ����");
		}
	}
	
}
public class typingGame {

	public static void main(String[] args) {
		//1.�޴�
		//2.���� ����  �ڸ����� ��� ª��
		//3.��� �� ����:  ��Ȯ�� %     
		typing ty=new typing();
		ty.menu();

	}

}
