package javastudy0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jdbcInsert {

	public static void main(String[] args) {
		//insert
		Connection conn=null;
		Statement st=null;
		
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
			//자바프로그램에서는 auto commit 기본임
			int n=st.executeUpdate("insert into person values "
					+ "(10,'홍1',123.12,sysdate-1,systimestamp-1)");
			if(n==1) { //n은 변경된 데이터 개수가 리턴됨 
				System.out.println("정상동작");
			}else {
				System.out.println("비정상 동작");
			}
			
			//delete 해보기
			n=st.executeUpdate("delete from person "
					+ "where no=2"
					);
			if(n>0) { //n은 변경된 데이터 개수
				System.out.println("정상동작");
			}else {
				System.out.println("비정상 동작");
			}
			
			//update 해보기
			n=st.executeUpdate("update person "
					+ "set name='강' "
					+ "where no=1");
			if(n>0) { //n은 변경된 데이터 개수
				System.out.println("정상동작");
			}else {
				System.out.println("비정상 동작");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			
//			try {
//				if(rs!=null)rs.close();
//				if(st!=null)rs.close();
//				if(conn!=null)rs.close();
//				System.out.println("닫기 성공");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	

		


	}

}
