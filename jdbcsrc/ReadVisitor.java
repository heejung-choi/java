package jdbcsrc;

import java.sql.*;

public class ReadVisitor {

	public static void main(String[] args) throws Exception{
		//1. jdbc driver 로딩 - class.forName()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. DBMS에 접속 - DriverManager.getConnetion("jdbc url", "계정", "암호")
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		System.out.println(conn);
		//3. Statment/PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		//4. 처리하려는 기능에 따라서 SQL문을 전달하고 수행시킨다.
		String sql ="select name, writedate, memo from visitor";
		ResultSet rs = stmt.executeQuery(sql);
		//5. 결과 처리
		while(rs.next()) {
			System.out.println(rs.getString("name")+":"+
					rs.getDate("writedate")+":"+rs.getString("memo"));
			//date 형이여도 getdate해도 되고 getString 해도 된다.
		}System.out.println("--------------끝----------");

	}

}
