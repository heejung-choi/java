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
		String sql2 ="select ename, to_char(hiredate, 'yyyy\"년\" mm\"월\" dd\"일\"') hiredate from emp";
		ResultSet rs;
		if(flag==true)
		rs = stmt.executeQuery(sql);
		else
		rs = stmt.executeQuery(sql2);		
		if(rs.next()) {			
			do { 
			if(flag==true) {
			System.out.println(rs.getString("ename")+" 직원의 월급은 "+
					rs.getString("sal")+"원 입니다.");}
			
			else {
				System.out.println(rs.getString("ename")+" 직원은 "+
						rs.getString("hiredate")+"에 입사하였습니다.");}	
			}
			while(rs.next()); }	
		else { 	System.out.println("데이터가 없습니다.");					
		}		
		rs.close();		
		conn.close();
	}
}
