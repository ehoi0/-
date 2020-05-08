package javastudy0504;

class Account{
	public static int totalCount=0;  
	public int money=0;
	public String id=null;
	public String pw=null;
	
	public Account () {  //생성자
		totalCount++;
	}
	public Account(String id,String pw) {  //아이디 패스워드 생성
		this();  // 생성자 호출
		this.id=id;
		this.pw=pw;
	}
	
	//입력을 받아  아이디 비밀번호 확인
	public boolean isLogin(String id,String pw) { //리턴값은 되도록이면 1개만
		boolean returnValue=false;
		if(this.id.equals(id)&&this.pw.equals(pw)) {
			returnValue=true;
		}//아이디랑 패스워드가 같은사람이 존재하면 true를 리턴한다.
		
		return returnValue;
	}
	
	public void display() {   //조회
		System.out.println("----------");
		System.out.println("총 계정수는:"+Account.totalCount+"개");
		System.out.println("id는:"+id);
		System.out.println("money는:"+money+"원");
		System.out.println("----------");
		
	}
	
	public void add(int money) {       // 입금
		this.money=this.money+money;
		
	}
	
	public void minus(int money) {     //출금
		this.money=this.money-money;
		
	}
	
	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String inputString=null;

		boolean flag=true;
		
		while(flag) {
			System.out.println(this.id+"님의 메뉴\n"+"1.입금  \t2.출금 \t3.종료");
			inputString=sc.nextLine();
		switch(inputString) {
		
			 case "1":
				 	 display();
				 	 System.out.println("입금액을 입력하세요");
				 	 int money=Integer.parseInt(sc.nextLine());
				 	 add(money);
				 	 display();
				 break;
			 case "2":
				 display();
			 	 System.out.println("출금액을 입력하세요");
			 	 money=Integer.parseInt(sc.nextLine());
			 	 minus(money);
			 	 display();
				 break;
			 case "3":
				 System.out.println("사용종료");
				 flag=false;
				 break;
			 default:
				 System.out.println("잘못된 입력 입니다.");
				 
		}
	}
		
	}
	
	
}

class bank {
	public static int totalCount=0;
	public String name=null;
	public Account [] account=new Account[10];
	public int accountCount=0;
	//로그인 되지 않으면-1  로그인 되면 해당 인덱스
	public int accountCurrent=-1;
	
	public bank() { //생성자
			totalCount++;
	}
	public bank(String name) {
		totalCount++;
		this.name=name;
	}
	public void accountAdd() {  //계정등록
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("원하는 id를 입력하세요");
		String id=sc.nextLine();
		if(isId(id)) {  //특정함수 호출해서 중복확인
			System.out.println("아이디가 중복");
			return;
		}
		System.out.println("원하는 pw를 입력하세요");
		String pw=sc.nextLine();
		account[accountCount++]=new Account(id,pw);
		//배열에 순서대로 데이터를 넣기위해 변수에 ++
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
		//아이디랑 패스워드가 같은사람이 존재하면 true를 리턴한다.
		boolean returnValue=false;
		for(int i=0;i<accountCount;i++) {
			if(account[i].isLogin(id,pw)) {
				returnValue= true;
				accountCurrent=i;
				break;
			}
		}//true이면?  로그인 된다     false 면 로그인안됨
		return returnValue;
	}
	
	public void logout() {
		accountCurrent=-1;
		System.out.println("로그아웃 되었습니다.");
	}
	
	public void displayAll() {
		System.out.println("총 은행수:"+bank.totalCount);
		System.out.println("현재 은행이름은:"+name);
		for(int i=0;i<accountCount;i++) {
			account[i].display();
		}
	}
	public void useAccoumt() {
		if(accountCurrent!=-1) {  //-1아닐때만 작동
			account[accountCurrent].menu();
		} else {
			System.out.println("잘못된 로그인");
		}
	}
	
	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean flag=true;
	while(flag)	{
		System.out.println("1.계정등록 2.모든계정 출력 3.계정 로그인  4.로그아웃 "
				+"5.계정 삭제 6.종료");
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
				System.out.println("id를 입력하세요");
				String id=sc.nextLine();
				System.out.println("pw를 입력하세요");
				String pw=sc.nextLine();
				
				if(Login(id, pw)) {
					System.out.println("로그인 성공");
					useAccoumt();
				}else {
					System.out.println("로그인 실패");
				}

				break;
			case "4":
				logout();
				break;
			case "5":
				if(accountCurrent!=-1) {
				System.out.println("pw를 입력하세요");
//				System.out.println("원하는 id를 입력하세요");
//				id=sc.nextLine();
//				System.out.println("원하는 pw를 입력하세요");
				pw=sc.nextLine();
				delete(pw);
				}else {
					System.out.println("로그인 하세요");
				}
				break;
			case "6":
				System.out.println("종료");
				flag=false;
				break;
			default:
				System.out.println("잘못입력 하셨습니다.");
				
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
		if(flag) {  //찾으면 삭제
			for(int i=accountCurrent;i+1<accountCount;i++) {
				account[i]=account[i+1];
			}
			Account.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
}



public class bankJava01 {

	public static void main(String[] args) {

		bank bk=new bank("한국은행");
		bk.menu();
		
		

		
	}

}
