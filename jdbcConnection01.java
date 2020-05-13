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
			//4.ResultSet������(import����) <��û������>
			rs=st.executeQuery("select * from person");
			while(rs.next()) {
				int no=rs.getInt(1);  //1�־ �ǰ� �÷��� "no" �־ �ǰ�
				String name=rs.getString(2);
				double height=rs.getDouble(3);
				//�ڹٿ����� java.util.Date  DB�� ������ java.sql.Date
				Date birth1=rs.getDate(4); //��¥
				Date birth2=rs.getTime(4); //�ð�
				Date birth3=rs.getTimestamp(4);//��¥,�ð� �Ѵ� ������
				Date regist=rs.getTimestamp(5);
				
				System.out.println(no+"~ "+name+"~ "+height+"~ "+
								   birth1+"~ "+birth2+"~ "+birth3
								   +"~ "+regist);
				//������ ����
				DateFormat df=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
				System.out.println(df.format(birth1));//��¥�� ��Ȯ�� �ð��� �⺻��
				System.out.println(df.format(birth2));//�ð��� ��Ȯ ��¥�� �⺻
				System.out.println(df.format(birth3));// �Ѵ� �߳���
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ݴ��۾� finally <add catch ���� ó���ϱ�>
		finally {
			
				try {
					if(rs!=null)rs.close();
					if(st!=null)rs.close();
					if(conn!=null)rs.close();
					System.out.println("�ݱ� ����");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
