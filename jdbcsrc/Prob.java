package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prob {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		kaja("E");
		
	}
//hr ����
	public static void kaja(String fn) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin"
				+ ":@localhost:1521:XE","hr","hr");
		Statement stmt=conn.createStatement();
		String sql="select last_name,first_name, to_char(salary,'999,999')salary from employees"
				+" where first_name like '%"+fn+"%' order by salary ";
		ResultSet rs=stmt.executeQuery(sql);
		// ���⿡ �����Ͻÿ�
		if(rs.next()) {
			do{
			System.out.println(rs.getString("first_name")+"("+
			rs.getString("last_name")+")"+rs.getString("salary")+"��");}
			while(rs.next());
		}
		else {
			System.out.println("DB ���� ���� �߻�: ");
		}
		rs.close();
		stmt.close();
		conn.close();
		
	}
}