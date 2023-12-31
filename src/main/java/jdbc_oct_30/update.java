package jdbc_oct_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
public static void main(String[] args) {
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db_1","root","Aman@1998");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("update students SET fee='458716' where id='1'");
	con.close();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
