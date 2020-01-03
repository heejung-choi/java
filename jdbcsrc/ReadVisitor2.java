package jdbcsrc;

import java.sql.*;
import java.util.Scanner;

public class ReadVisitor2 {

	public static void main(String[] args) throws Exception{
		//1. jdbc driver �ε� - class.forName()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. DBMS�� ���� - DriverManager.getConnetion("jdbc url", "����", "��ȣ")
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		System.out.println(conn);
		//3. Statment/PreparedStatement ��ü ����
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner (System.in);
		System.out.print("�˻��� �̸��� �Է��ϼ���:");
		String searchName = scan.nextLine();
		scan.close();
		//4. ó���Ϸ��� ��ɿ� ���� SQL���� �����ϰ� �����Ų��.
		String sql ="select name, writedate, memo from visitor "
		+"where name= '"+searchName+"'";
		ResultSet rs = stmt.executeQuery(sql);
		//5. ��� ó��
		//while(rs.next()) {
			//System.out.println(rs.getString("name")+":"+
					//rs.getDate("writedate")+":"+rs.getString("memo"));
		if(rs.next()) {
			System.out.println(rs.getString("name")+":"+
					rs.getDate("writedate")+":"+rs.getString("memo"));}
		else {System.out.println(searchName+"���� �ۼ��� ���� �����ϴ�.");
		
			//date ���̿��� getdate�ص� �ǰ� getString �ص� �ȴ�.
		}System.out.println("--------------��------------");
		rs.close();
		stmt.close();
		conn.close();
		//������� ��ü�� �������� close�� ����� �ش�.
	}

}
