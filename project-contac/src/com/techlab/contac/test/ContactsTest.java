package com.techlab.contac.test;

import com.techlab.contac.Contacts;

import java.sql.*;
import java.util.Scanner;

public class ContactsTest {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int choice=0;
		System.out.println("enter case");
		try(Scanner sc = new Scanner(System.in))
		{
			choice=Integer.parseInt(sc.nextLine());
			
		}
		catch(Exception e)
		{
			System.out.println("choose integer");
		}
			Contacts c =new Contacts();
		switch(choice) {
		
		case 1:
			
	
		c.display();
		break;
		
		case 2:
			c.Update();
			break;
		case 3:
		c.Delete();
		break;
		
		case 4:
			c.insert();
			break;
		}
		}
		
		
		
		
		
	}


