package com.project;
import java.util.Scanner;

public class FirstPage {
	
	Scanner scan = new Scanner(System.in);
	
	public void firstPage() {
		while(true) {
		System.out.println("      \n\n__________WELCOME TO SKNSITS__________\n\n");
		
		
		System.out.println("Please Select below option : \n\nPress '1' for Student \nPress '2' Admin");
		
		System.out.println("Enter the Exit for close the program\n");
		
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
		case "exit":
			
			System.exit(0);
			
		default:
			
			System.err.println("Wrong Input ): ");
		
		
		}
		
		
	}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPage fr = new FirstPage();
		
		fr.firstPage();
		

	}

}
