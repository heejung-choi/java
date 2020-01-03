package jdbcsrc;

import java.sql.*;
import java.util.Scanner;

public class ReadEmp {

	public static void main(String[] args) throws Exception{
		//1. jdbc driver 로딩 - class.forName()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. DBMS에 접속 - DriverManager.getConnetion("jdbc url", "계정", "암호")
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		System.out.println(conn);
		//3. Statment/PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner (System.in);
		System.out.print("검색할 부서번호를 입력하세요:");
		String num = scan.nextLine();
		scan.close();
		//4. 처리하려는 기능에 따라서 SQL문을 전달하고 수행시킨다.
		String sql ="select ename, sal, deptno from emp "
		+"where deptno="+num;
		ResultSet rs = stmt.executeQuery(sql);
		//5. 결과 처리		
		if(rs.next()) {			
			do {//먼저 수행부터 하고 나서 반복여부를 체크하고 싶을 때 
				//처음부터 반복여부를 체크하고 싶을 때는 while
			System.out.println(rs.getString("ename")+":"+
					rs.getInt("sal")+":"+rs.getInt("deptno"));}
			while(rs.next()); }
		else {System.out.println(num+"번 부서에 근무하는 직원이 없습니다.");
		
			//date 형이여도 getdate해도 되고 getString 해도 된다.
		}System.out.println("--------------끝------------");
		rs.close();
		stmt.close();
		conn.close();
		//만들어준 객체의 역순으로 close를 만들어 준다.
	}

}
