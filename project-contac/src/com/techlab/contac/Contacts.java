package com.techlab.contac;

import java.sql.*;
public class Contacts {


	public void display() throws Exception {
		try {
			Connection conn =getConnection();
			PreparedStatement statement = conn.prepareStatement("Select * from contact");
			
			
			ResultSet resultset = statement.executeQuery();

			while (resultset.next()) {

				System.out.println(resultset.getString("FirstName") + " " + resultset.getString("LastName") + " "
						+ resultset.getString("Number") + " " + resultset.getString("Email"));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Displayed");
		}

	}

	public void insert()throws Exception {
		try {
			Connection conn =getConnection();
			PreparedStatement statement = conn.prepareStatement("INSERT INTO contact (FirstName, LastName, Email, ) VALUES (?,?,?,?)");
			int rows = statement.executeUpdate("insert into contact(FirstName,Lastname,Number,Email)\r\n"
					+ "values(\"Hrithik\",\"Roshan\",\"933299\",\"bbbvv@gmail\");");
			int rows1 = statement.executeUpdate("insert into contact(FirstName,Lastname,Number,Email)\r\n"
					+ "values(\"Shahrukh\",\"Khan\",\"888999\",\"aaavv@gmail\");");
			int rows2 = statement.executeUpdate("insert into contact(FirstName,Lastname,Number,Email)\r\n"
					+ "values(\"Virat\",\"Kohli\",\"659999\",\"cccbvv@gmail\");");
			int rows3 = statement.executeUpdate("insert into contact(FirstName,Lastname,Number,Email)\r\n"
					+ "values(\"Rahul\",\"Rahul\",\"888999\",\"gggbvv@gmail\");");
			int rows4 = statement.executeUpdate("insert into contact(FirstName,Lastname,Number,Email)\r\n"
					+ "values(\"Jack\",\"Tony\",\"333999\",\"bbvv@gmail\");");
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
		}finally {
			System.out.println("Inserted");
		}

		
		
		
	}
	
	public void Update()throws Exception{
		try {
			Connection conn=getConnection();
			PreparedStatement statement = conn.prepareStatement("INSERT INTO contact (FirstName, LastName, Email, ) VALUES (?,?,?,?)");
			int rows=statement.executeUpdate("update contact  set Number=9999999 where FirstName= \"Hrithik\";");
			System.out.println("updated");
		}catch(SQLException e)
		{
			System.out.println(e);
		}finally {
			
		}
	}
	
	public void Delete()throws Exception{
		try {
			Connection conn=getConnection();
			PreparedStatement statement = conn.prepareStatement("delete from contact where FirstName=\"Rahul\";");
			int rows=statement.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}finally {
			System.out.println("Updated");
		}
		
	}

	public static Connection getConnection() {
Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/project?user=root&password=root");
			if (conn != null)
				return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;

	}
		


}

