package utilpack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class DBConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		try (
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Welcome@123");
			)
		{
			CallableStatement cs = con.prepareCall("{call proc3(?,?)}");
			cs.registerOutParameter(2, Types.INTEGER);
			cs.setString(1, "ramu");
			cs.execute();
			int flag = cs.getInt(2);
			System.out.println("flag value ... :"+flag);
		}
	}
}
