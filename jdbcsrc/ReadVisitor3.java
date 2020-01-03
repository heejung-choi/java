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
		try {//throws jvm이 알아서 예외처리
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor";
			//'yyyy\"년\" mm\"월\" dd\"일\"') 이렇게 작성하면 처음 select 의 더블인용부호가 닫힌걸로 인식한다.
			//따라서 백슬레시(\)를 입력해서 문자로만 인식하게 해줘야 한다.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				//System.out.print(rs.getString("name")+"\t");
				//System.out.print(rs.getString("writedate")+"\t");
				//System.out.println(rs.getString("memo"));
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3)+"\t");
				//메소드 이름으로 줘도 되고 숫자로 줘서 출력해도 된다.
				// 단점은 유지보수할때 컬럼순서를 바꾼다거나, 중간에 컬럼을 변경하게 될 때 get 메소드도 사양을 다 바꿔줘야 한다.
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
			//System.err 표준 오류 출력 메서드
			//System.out 표준 출력
		} finally {//반드시 수행하고자 하는 내용
			try {//null인 상태, 즉 객체생성 안된 상태에선 close()를 호출하면 nullpointerException이 걸린다.
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
