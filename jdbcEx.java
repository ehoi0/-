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
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε��Ϸ�");
			//2. ������ ���̽��� ����:�ʿ���3���� url,user,pw
			//jdbc:oracle:thin<<�̰� ��ǰ��
			//@:�̰� ���� ������ �ּ�
			//1521 ��Ʈ��ȣ �⺻������ 1521��
			//xe�� �õ� ID
			String url="jdbc:oracle:thin:@localhost:1522:xe";
			String user="human";
			String pw="human";
			//�����ϱ�
			con=DriverManager.getConnection(url,user,pw);
			System.out.println("������ ���̽� ���� ����");
			
			st=con.createStatement(); //������ �ҷ�����
			rs=st.executeQuery(//������
					"select * from member");
			
			while(rs.next()) {
				int no=rs.getInt(1);
				String hp=rs.getString("hp"); //���ڴ�� �÷��� �־��൵ ��
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
