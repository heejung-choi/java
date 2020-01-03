package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadVisitor3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {//throws jvm�� �˾Ƽ� ����ó��
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			String sql = "select name, to_char(writedate, 'yyyy\"��\" mm\"��\" dd\"��\"') writedate, memo from visitor";
			//'yyyy\"��\" mm\"��\" dd\"��\"') �̷��� �ۼ��ϸ� ó�� select �� �����ο��ȣ�� �����ɷ� �ν��Ѵ�.
			//���� �齽����(\)�� �Է��ؼ� ���ڷθ� �ν��ϰ� ����� �Ѵ�.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				//System.out.print(rs.getString("name")+"\t");
				//System.out.print(rs.getString("writedate")+"\t");
				//System.out.println(rs.getString("memo"));
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3)+"\t");
				//�޼ҵ� �̸����� �൵ �ǰ� ���ڷ� �༭ ����ص� �ȴ�.
				// ������ ���������Ҷ� �÷������� �ٲ۴ٰų�, �߰��� �÷��� �����ϰ� �� �� get �޼ҵ嵵 ����� �� �ٲ���� �Ѵ�.
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e);
			//System.err ǥ�� ���� ��� �޼���
			//System.out ǥ�� ���
		} finally {//�ݵ�� �����ϰ��� �ϴ� ����
			try {//null�� ����, �� ��ü���� �ȵ� ���¿��� close()�� ȣ���ϸ� nullpointerException�� �ɸ���.
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
