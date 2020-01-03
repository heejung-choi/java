package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadVisitor4 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");// 왜 이것만 예외처리 했을까?  close가 필요 업기 때문에
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor"; 
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);)
		//여기에  close가 필요한 것만 넣을 수 있다. closeinter tuble? 을 상속하고 있는 것은 close가 있어야 한다.
		{//select 명령 수행 resultset으로 만들어서 내보냄
			//con, stmt, rs 인터페이스
			//api만 만들면 jvm이 만든 driver가 자동적으로 수행된다.
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
			// finally가 없어졌다. close를 직접 안쓰기 위해서 try 안에 객체생성식을 넣어주었다.
			// 그렇지 않으면 close를 할때마다 예외처리를 해줘야 한다.
		} 
	}
}
