package jdbcsrc;

import java.sql.*;

public class InsertTable2 {
	public static void main(String args[]) throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT into product values"+
						"('"+args[0]+"', '"+args[1]+"', '"+args[2]+"',"+
					          args[3]+","+ args[4]+")");
			//'' �� �ִ°��� char ���̱� �����̴�.
			// executeUpdate ������ �ϴ°��� ����Ŀ���̴�. �ڵ����� Ŀ�Եȴ�. (JDBC�� Ư¡)
			System.out.println("�����͵��� �߰��Ͽ����ϴ�.");
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}

//pid -00004
//classid-20
//name- ¯���� ������
//balance - 100
//price - 5000