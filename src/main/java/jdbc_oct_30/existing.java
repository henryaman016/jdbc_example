package jdbc_oct_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class existing {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db_1","root","Aman@1998");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into students values('1','aman@gmail.com','147852','aman')");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
