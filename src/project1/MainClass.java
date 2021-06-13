package project1;

import java.util.Scanner;

public class MainClass {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		MyFiles myfl = new MyFiles();
		String ch = new String();	
		String str = new String();
		sc = new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com.");
		do
		{	System.out.println("What would you like to do:-");
			System.out.println("1. Retrieve current files\n2. Bussiness-level operations\n3. Exit");
			System.out.print("Select one of the above options:");
			ch=sc.nextLine();
						switch (ch) {
			case "1":	{	myfl.DisplayAll();
						break;
						}
			case "2": 	{	do
							{	System.out.println("1. Add a file.");
								System.out.println("2. Delete a file.");
								System.out.println("3. Search a file.");
								System.out.println("4. Back to Main menu.");
								System.out.print("Select one of the above options:");
								ch=sc.nextLine();
								switch (ch) 
								{
									case "1": {	System.out.print("Enter the name of file:");
												str= sc.nextLine();
												myfl.AddFile(str);	
												break;
											}
									case "2": {	System.out.print("Enter the name of file:");
												str= sc.nextLine();
												myfl.RemFile(str);
												break;
											}
									case "3": {	Boolean bool;
												System.out.print("Enter the name of file:");
												str= sc.nextLine();
												bool=myfl.FindFile(str);
												if(bool)
													System.out.println("File "+str+" is found.");
												else
													System.out.println("File "+str+" not found.");
												break;
											}
									case "4": break;
									default:
										System.out.println("Please enter correct input.");	break;
								}
							}while(!ch.equals("4"));
							break;
						}
			case "3": break;
			default:
				System.out.println("Please enter correct input.");	break;
			}
			
		}while(!ch.equals("3"));
	}
}
