package jdbcsrc;

import java.sql.*;
import java.util.Scanner;

public class ReadEmp {

	public static void main(String[] args) throws Exception{
		//1. jdbc driver �ε� - class.forName()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. DBMS�� ���� - DriverManager.getConnetion("jdbc url", "����", "��ȣ")
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		System.out.println(conn);
		//3. Statment/PreparedStatement ��ü ����
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner (System.in);
		System.out.print("�˻��� �μ���ȣ�� �Է��ϼ���:");
		String num = scan.nextLine();
		scan.close();
		//4. ó���Ϸ��� ��ɿ� ���� SQL���� �����ϰ� �����Ų��.
		String sql ="select ename, sal, deptno from emp "
		+"where deptno="+num;
		ResultSet rs = stmt.executeQuery(sql);
		//5. ��� ó��		
		if(rs.next()) {			
			do {//���� ������� �ϰ� ���� �ݺ����θ� üũ�ϰ� ���� �� 
				//ó������ �ݺ����θ� üũ�ϰ� ���� ���� while
			System.out.println(rs.getString("ename")+":"+
					rs.getInt("sal")+":"+rs.getInt("deptno"));}
			while(rs.next()); }
		else {System.out.println(num+"�� �μ��� �ٹ��ϴ� ������ �����ϴ�.");
		
			//date ���̿��� getdate�ص� �ǰ� getString �ص� �ȴ�.
		}System.out.println("--------------��------------");
		rs.close();
		stmt.close();
		conn.close();
		//������� ��ü�� �������� close�� ����� �ش�.
	}

}
