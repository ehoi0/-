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
	
	public typingGameEx() {  //생성자
		totalCount++;
	}
	
	public typingGameEx(String id,String pw) {  //아이디 패스워드 생성
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
	
	

   public void easyPractice() {  //자리연습
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("자리연습 ");
	   boolean flag=true;
	 while(flag) {
	    String [] easy= new String[] {"ㅂ","ㅈ","ㄷ","ㅅ","ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅋ",
			   						 "ㅌ","ㅊ","ㅍ",
			   						"ㅛ","ㅕ","ㅑ","ㅐ","ㅔ","ㅣ","ㅏ","ㅓ","ㅗ","ㅠ",
			   						 "ㅠ","ㅜ","ㅡ"}; //26
	  
	    int randomNum=(int)(Math.random()*26);
	    System.out.println("다음 화면에 출력되는 자리를 입력하시오  종료:'0' ");
	    System.out.println("입력하세요:"+ easy[randomNum]);
	    System.out.println(">>");
	    String input=sc.nextLine();
	   
	    if(input.equals(easy[randomNum])) {
		   System.out.println("정답입니다");
		   sucJ++;
		   countJ++;
	   }
	    else if(input.equals("0")) {
	    	flag=false;
	    	System.out.println("자리연습");
	    	score(sucJ,countJ);
	    	
	   }else {
		   System.out.println("오답입니다");
		   countJ++;

		 
		   
	   }
	 }
   
   }
   
   public void longPractice() {   //긴글 연습
	   System.out.println("긴글 연습");
	   java.util.Scanner sc=new java.util.Scanner(System.in);
		
	   boolean flag=true;
		 while(flag) {
		    String [] sentence= new String[10];
		    sentence[0] ="낮말은 새가 듣고 밤 말은 쥐가 듣는다.";
		    sentence[1] ="등잔 밑이 어둡다.";
		    sentence[2] ="뛰는 놈 위에 나는 놈 있다.";
		    sentence[3] ="소 잃고 외양간 고친다.";
		    sentence[4] ="그림의 떡";
		    sentence[5] ="금강산도 식후경";
		    sentence[6] ="꿩 대신 닭";
		    sentence[7] ="내 코가 석 자";
		    sentence[8] ="낫 놓고 기역자도 모른다.";
		    sentence[9] ="마른 하늘에 날벼락";
		  
		    int randomNum=(int)(Math.random()*10);
		    System.out.println("다음 화면에 출력되는 속담을 입력하시오  종료:'0' ");
		    System.out.println("입력하세요:"+ sentence[randomNum]);
		    System.out.println(">>");
		    String input=sc.nextLine();
		   
		    if(input.equals(sentence[randomNum])) {
			   System.out.println("정답입니다");
			   sucS++;
			   countS++;
		   }
		    else if(input.equals("0")) {
		    	flag=false;
		    	System.out.println("긴글 연습");
		    	score(sucS,countS);
		    	
		   }else {
			   System.out.println("오답입니다");
			   countS++;

			 
			   
		   }
		 }
	 
   }
   
	public void score (double a,double b) {  //점수계산
		 double score=(a/b)*100;
		 System.out.println("점수:"+(int)a);
		 System.out.print("정확도:");
		 if(b!=0) {
			 System.out.println(String.format("%.1f%%", score));
		 }else {
			 System.out.println(0);
		 }
		
		
	}
	
   public void wordPractice() {   //단어 연습
	   System.out.println("단어 연습");
	   java.util.Scanner sc=new java.util.Scanner(System.in);
		
	   boolean flag=true;
		 while(flag) {
		    String [] word= new String[] {"감자","고구마","치킨","피자","연","책상","의자","나무","활","컴퓨터",
				   						 "태극기","바람","흙",
				   						"먼지","자동차","젤리","과자","중학교","고등학교","핸드폰","자전거","운둥화","지갑",
				   						 "양말","장갑","음료수"}; //26
		  
		    int randomNum=(int)(Math.random()*26);
		    System.out.println("다음 화면에 출력되는 단어를 입력하시오  종료:'0' ");
		    System.out.println("입력하세요:"+ word[randomNum]);
		    System.out.println(">>");
		    String input=sc.nextLine();
		   
		    if(input.equals(word[randomNum])) {
			   System.out.println("정답입니다");
			   sucW++;
			   countW++;
		   }
		    else if(input.equals("0")) {
		    	flag=false;
		    	System.out.println("단어 연습");
		    	score(sucW,countW);
		    	
		   }else {
			   System.out.println("오답입니다");
			   countW++;

			 
			   
		   }
		 }
	   
   }
   
   public void showinfo() {
	    System.out.println("자리 연습");
	    score(sucJ,countJ);
	    System.out.println("");
	    System.out.println("긴글 연습");
	    score(sucS,countS);
	    System.out.println("");
	    System.out.println("단어 연습");
	    score(sucW,countW);
	    System.out.println("");

  }

	public void menu() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println(this.id+"님의 메뉴\n"+"1.자리연습  2.긴글 연습  3.단어 연습  4.나의 전적 0.종료");
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
		    	System.out.println("종료");
		    	flag=false;
		    	break;
		    default:
		    	System.out.println("잘못된 입력 입니다.");
		    	
		 }
		}
	}
}

class typing {
	public static int totalCount=0;
//	public String name=null;
	public typingGameEx [] account=new typingGameEx[10];
	public int accountCount=0;
	//로그인 되지 않으면-1  로그인 되면 해당 인덱스
	public int accountCurrent=-1;
	
	public typing() { //생성자
			totalCount++;
	}
//	public typing(String name) {
//		totalCount++;
//		this.name=name;
//	}
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
		account[accountCount++]=new typingGameEx(id,pw);
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
		System.out.println("현재 총 유저");
		System.out.println(typingGameEx.totalCount+"명");
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
		System.out.println("1.계정등록 2.총 유저 출력 3.계정 로그인  4.로그아웃 "
				+"5.계정 삭제 0.종료");
		String stringInput=sc.nextLine();
		switch(stringInput) {
			case "1":
				accountAdd();
				
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

				pw=sc.nextLine();
				delete(pw);
				}else {
					System.out.println("로그인 하세요");
				}
				break;
			case "0":
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
			typingGameEx.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
}
public class typingGame {

	public static void main(String[] args) {
		//1.메뉴
		//2.게임 종류  자리연습 긴글 짧은
		//3.결과 총 점수:  정확도 %     
		typing ty=new typing();
		ty.menu();

	}

}
