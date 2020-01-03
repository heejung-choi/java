package jdbcsrc;

import java.sql.*;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		System.out.println(conn);
		
		Statement stmt = conn.createStatement();
		boolean flag = new Random().nextBoolean();
		String sql ="select ename, to_char(sal,'999,999') sal from emp";
		String sql2 ="select ename, to_char(hiredate, 'yyyy\"��\" mm\"��\" dd\"��\"') hiredate from emp";
		ResultSet rs;
		if(flag==true)
		rs = stmt.executeQuery(sql);
		else
		rs = stmt.executeQuery(sql2);		
		if(rs.next()) {			
			do { 
			if(flag==true) {
			System.out.println(rs.getString("ename")+" ������ ������ "+
					rs.getString("sal")+"�� �Դϴ�.");}
			
			else {
				System.out.println(rs.getString("ename")+" ������ "+
						rs.getString("hiredate")+"�� �Ի��Ͽ����ϴ�.");}	
			}
			while(rs.next()); }	
		else { 	System.out.println("�����Ͱ� �����ϴ�.");					
		}		
		rs.close();		
		conn.close();
	}
}
