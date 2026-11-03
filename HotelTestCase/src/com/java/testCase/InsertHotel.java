package com.java.testCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertHotel {
	public static void addHotel() throws Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter hotel name: ");
			String name=sc.next();
			System.out.println("Enter room type: ");
			String room=sc.next();
			System.out.println("Enter room price: ");
			float price=sc.nextFloat();
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hotel", "root","42004");
			Statement st = cn.createStatement();
			String xyz="insert into hotel(name,room,price) values('"+name+"','"+room+"',"+price+")";
			st.executeUpdate(xyz);
			System.out.println("Data Inserted");

			}
			catch (Exception e) {
			}
		}
	}

}