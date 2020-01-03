package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadVisitor4 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");// �� �̰͸� ����ó�� ������?  close�� �ʿ� ���� ������
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "select name, to_char(writedate, 'yyyy\"��\" mm\"��\" dd\"��\"') writedate, memo from visitor"; 
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);)
		//���⿡  close�� �ʿ��� �͸� ���� �� �ִ�. closeinter tuble? �� ����ϰ� �ִ� ���� close�� �־�� �Ѵ�.
		{//select ��� ���� resultset���� ���� ������
			//con, stmt, rs �������̽�
			//api�� ����� jvm�� ���� driver�� �ڵ������� ����ȴ�.
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e);
			// finally�� ��������. close�� ���� �Ⱦ��� ���ؼ� try �ȿ� ��ü�������� �־��־���.
			// �׷��� ������ close�� �Ҷ����� ����ó���� ����� �Ѵ�.
		} 
	}
}
