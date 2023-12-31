package jdbc_oct_30_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A {
public static void main(String[] args) {
	
	try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id ");
		String id = sc.next();
		

		System.out.println("Enter your email ");
		String email = sc.next();

		System.out.println("Enter your fee ");
		String fee = sc.next();
		

		System.out.println("Enter your name ");
		String name = sc.next();
		
		sc.close();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db_1","root","Aman@1998");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into students values('"+id+"','"+email+"','"+fee+"','"+name+"')");
	con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
