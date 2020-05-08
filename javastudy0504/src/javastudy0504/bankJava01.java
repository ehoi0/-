package javastudy0504;

class Account{
	public static int totalCount=0;  
	public int money=0;
	public String id=null;
	public String pw=null;
	
	public Account () {  //������
		totalCount++;
	}
	public Account(String id,String pw) {  //���̵� �н����� ����
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
	
	public void display() {   //��ȸ
		System.out.println("----------");
		System.out.println("�� ��������:"+Account.totalCount+"��");
		System.out.println("id��:"+id);
		System.out.println("money��:"+money+"��");
		System.out.println("----------");
		
	}
	
	public void add(int money) {       // �Ա�
		this.money=this.money+money;
		
	}
	
	public void minus(int money) {     //���
		this.money=this.money-money;
		
	}
	
	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String inputString=null;

		boolean flag=true;
		
		while(flag) {
			System.out.println(this.id+"���� �޴�\n"+"1.�Ա�  \t2.��� \t3.����");
			inputString=sc.nextLine();
		switch(inputString) {
		
			 case "1":
				 	 display();
				 	 System.out.println("�Աݾ��� �Է��ϼ���");
				 	 int money=Integer.parseInt(sc.nextLine());
				 	 add(money);
				 	 display();
				 break;
			 case "2":
				 display();
			 	 System.out.println("��ݾ��� �Է��ϼ���");
			 	 money=Integer.parseInt(sc.nextLine());
			 	 minus(money);
			 	 display();
				 break;
			 case "3":
				 System.out.println("�������");
				 flag=false;
				 break;
			 default:
				 System.out.println("�߸��� �Է� �Դϴ�.");
				 
		}
	}
		
	}
	
	
}

class bank {
	public static int totalCount=0;
	public String name=null;
	public Account [] account=new Account[10];
	public int accountCount=0;
	//�α��� ���� ������-1  �α��� �Ǹ� �ش� �ε���
	public int accountCurrent=-1;
	
	public bank() { //������
			totalCount++;
	}
	public bank(String name) {
		totalCount++;
		this.name=name;
	}
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
		account[accountCount++]=new Account(id,pw);
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
		System.out.println("�� �����:"+bank.totalCount);
		System.out.println("���� �����̸���:"+name);
		for(int i=0;i<accountCount;i++) {
			account[i].display();
		}
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
		System.out.println("1.������� 2.������ ��� 3.���� �α���  4.�α׾ƿ� "
				+"5.���� ���� 6.����");
		String stringInput=sc.nextLine();
		switch(stringInput) {
			case "1":
				accountAdd();
				displayAll();
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
//				System.out.println("���ϴ� id�� �Է��ϼ���");
//				id=sc.nextLine();
//				System.out.println("���ϴ� pw�� �Է��ϼ���");
				pw=sc.nextLine();
				delete(pw);
				}else {
					System.out.println("�α��� �ϼ���");
				}
				break;
			case "6":
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
			Account.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("���� �Ϸ�");
		}else {
			System.out.println("���� ����");
		}
	}
	
}



public class bankJava01 {

	public static void main(String[] args) {

		bank bk=new bank("�ѱ�����");
		bk.menu();
		
		

		
	}

}
