package javastudy0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jdbcConnection01 {

	public static void main(String[] args) {
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		
		try {
			//1.사용할 데이터베이스 드라이브 등록(선택)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//jdbc:oracle:thin<<이건 제품명
			//@:이건 로컬 아이피 주소
			//1521 포트번호 기본적으로 1521씀
			//xe는 시드 ID
			//2.해당 데이터베이스에 접속  (필요한 3가지  url,user,pw)
			String url="jdbc:oracle:thin:@localhost:1522:xe";
			String user="human";
			String pw="human";
			
			conn=DriverManager.getConnection(url,user,pw);
			System.out.println("연결성공");
			//3.connection을 통해서 statement 객체 생성
			//statement는 서로 (client,server) 주고 받을때 사용<import 주의>
			st=conn.createStatement();
			//4.ResultSet얻어오기(import주의) <요청실행결과>
			rs=st.executeQuery("select * from person");
			while(rs.next()) {
				int no=rs.getInt(1);  //1넣어도 되고 컬럼명 "no" 넣어도 되고
				String name=rs.getString(2);
				double height=rs.getDouble(3);
				//자바에서는 java.util.Date  DB에 넣을때 java.sql.Date
				Date birth1=rs.getDate(4); //날짜
				Date birth2=rs.getTime(4); //시간
				Date birth3=rs.getTimestamp(4);//날짜,시간 둘다 가져옴
				Date regist=rs.getTimestamp(5);
				
				System.out.println(no+"~ "+name+"~ "+height+"~ "+
								   birth1+"~ "+birth2+"~ "+birth3
								   +"~ "+regist);
				//데이터 포맷
				DateFormat df=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
				System.out.println(df.format(birth1));//날짜는 정확히 시간은 기본값
				System.out.println(df.format(birth2));//시간은 정확 날짜는 기본
				System.out.println(df.format(birth3));// 둘다 잘나옴
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//닫는작업 finally <add catch 예외 처리하기>
		finally {
			
				try {
					if(rs!=null)rs.close();
					if(st!=null)rs.close();
					if(conn!=null)rs.close();
					System.out.println("닫기 성공");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
