	package com.bcj.customercrud;
	
	import java.util.Scanner;
	
	public class Applicationui {
	static String updateField;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc= new Scanner(System.in);
			System.out.println("====menu====");
			
			System.out.println("1)save customer\n2)modify cutomer\n3)delete customer");
			System.out.println("enter ur choice");
			int choice =sc.nextInt();
			
			if(choice ==1)		
			saveCustomer();
			
			if(choice ==2)
			modifyCustomer();
			
			if(choice==3)
			deleteCustomer();
			
		}
		private static void deleteCustomer() {
			// TODO Auto-generated method stub
			System.out.println("enter  the customer first name to delete     ");
			Scanner sc = new Scanner(System.in);
			String firstName=sc.nextLine();
					
			System.out.println("How do you want to send data ");
			System.out.println("1)By hardcoding the database values in getConnection()\n2)By properties file");
			String  choice=sc.next();
			CustomerCrudController custCrudCntlr=new CustomerCrudController();
			
			if(custCrudCntlr.deleteCustomer(firstName,choice))
				System.out.println(" customer deleted successfully ");
			else System.out.println("customer doesn't exist");
			
			sc.close();
			
		}
		private static void modifyCustomer() {
			// TODO Auto-generated method stub
					
			System.out.println("enter  the customer first name to modify");
			Scanner sc = new Scanner(System.in);
			String firstName=sc.nextLine();
			
			System.out.println("which details you want to update  1)customer First Name\n2) customer last name \n3) email 4)mobile \n"
					+ "enter your choice");
			String updateChoice=sc.nextLine();
			
			if(updateChoice.equals("1"))	{		
				System.out.println("enter your first Name");
			 updateField=sc.next();
			}
			
			if(updateChoice.equals("2")){
				System.out.println("enter your last Name");
			 updateField=sc.next();
			}
	
			if(updateChoice.equals("3")){
				System.out.println("enter your email");
			 updateField=sc.next();
			}
			
			if(updateChoice.equals("4")){
				System.out.println("enter your mobile No.");
			 updateField=sc.next();
			}
				
				System.out.println("How do you want to send data ");
			System.out.println("1)By hardcoding the database values in getConnection()\n2)By properties file");
			String  choice=sc.next();
			CustomerCrudController custCrudCntlr=new CustomerCrudController();			
			if(custCrudCntlr.updateCustomer(firstName,updateField,updateChoice,choice))
				System.out.println(" customer updated  successfully ");
			else System.out.println("customer doesn't exist");
			sc.close();
			
		}
		private static void saveCustomer(){
	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter  your  first name ");
			String firstName=sc.nextLine();
			
			System.out.println("enter  your last  name ");
			String lastName=sc.nextLine();
	
			System.out.println("enter  your email ");
			String email=sc.nextLine();
			
			System.out.println("enter  your mobile  ");
			String mobile =sc.nextLine();
			System.out.println("How do you want to send data ");
			System.out.println("1)By hardcoding the database values in getConnection()\n2)By properties file");
			String  choice=sc.next();
			
			
			
			RegistrationController regcontrlr= new RegistrationController();
			if(regcontrlr.saveCustomer(firstName, lastName, email, mobile,choice))
			System.out.println(" customer registered successfully");
			else System.out.println(" customer rigistration failed ");
			
			sc.close();
			
			}
				
			
	
	
	}
