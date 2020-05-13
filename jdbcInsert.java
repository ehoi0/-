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
			//1.����� �����ͺ��̽� ����̺� ���(����)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//jdbc:oracle:thin<<�̰� ��ǰ��
			//@:�̰� ���� ������ �ּ�
			//1521 ��Ʈ��ȣ �⺻������ 1521��
			//xe�� �õ� ID
			//2.�ش� �����ͺ��̽��� ����  (�ʿ��� 3����  url,user,pw)
			String url="jdbc:oracle:thin:@localhost:1522:xe";
			String user="human";
			String pw="human";
			conn=DriverManager.getConnection(url,user,pw);
			System.out.println("���Ἲ��");
			//3.connection�� ���ؼ� statement ��ü ����
			//statement�� ���� (client,server) �ְ� ������ ���<import ����>
			st=conn.createStatement();
			//�ڹ����α׷������� auto commit �⺻��
			int n=st.executeUpdate("insert into person values "
					+ "(10,'ȫ1',123.12,sysdate-1,systimestamp-1)");
			if(n==1) { //n�� ����� ������ ������ ���ϵ� 
				System.out.println("������");
			}else {
				System.out.println("������ ����");
			}
			
			//delete �غ���
			n=st.executeUpdate("delete from person "
					+ "where no=2"
					);
			if(n>0) { //n�� ����� ������ ����
				System.out.println("������");
			}else {
				System.out.println("������ ����");
			}
			
			//update �غ���
			n=st.executeUpdate("update person "
					+ "set name='��' "
					+ "where no=1");
			if(n>0) { //n�� ����� ������ ����
				System.out.println("������");
			}else {
				System.out.println("������ ����");
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
//				System.out.println("�ݱ� ����");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	

		


	}

}
