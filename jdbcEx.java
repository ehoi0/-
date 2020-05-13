package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			//2. 데이터 베이스와 연결:필요한3가지 url,user,pw
			//jdbc:oracle:thin<<이건 제품명
			//@:이건 로컬 아이피 주소
			//1521 포트번호 기본적으로 1521씀
			//xe는 시드 ID
			String url="jdbc:oracle:thin:@localhost:1522:xe";
			String user="human";
			String pw="human";
			//연결하기
			con=DriverManager.getConnection(url,user,pw);
			System.out.println("데이터 베이스 연결 성공");
			
			st=con.createStatement(); //데이터 불러오기
			rs=st.executeQuery(//담을곳
					"select * from member");
			
			while(rs.next()) {
				int no=rs.getInt(1);
				String hp=rs.getString("hp"); //숫자대신 컬럼명 넣어줘도 됨
				String addr=rs.getString(3);
				String name=rs.getString(4);
				System.out.println(no+":"+name+":"+hp+":"+addr+":");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
