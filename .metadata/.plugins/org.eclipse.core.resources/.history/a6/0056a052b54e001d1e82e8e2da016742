package com.project;
import java.util.Scanner;

public class FirstPage {
	
	Scanner scan = new Scanner(System.in);
	
	public void firstPage() {
		while(true) {
		System.out.println("      \n\n**************************WELCOME TO SKNSITS**************************\n\n");
		
		
		System.out.println("Please Select below option : \n\n1.Student \n2.Admin\n3.Exit");
		
		
		
		switch(scan.next().toLowerCase()) {
		
		case "1":
			
			Student1 std = new Student1();
			std.student();
			
			
			break;
		case "2":
			AdminLogin admin=new AdminLogin();
		
			admin.admin();
			//Admin Section
			break;
		case "3":
			System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			
			System.err.println("\n*******************************Thank you for visiting us*******************************\nyou have exited Successfully");
			
			System.exit(0);
			
		default:
			
			System.err.println("Wrong Input ): ");
			System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
		
		}
		
		
	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPage fr = new FirstPage();
		
		fr.firstPage();
		

	}

}
