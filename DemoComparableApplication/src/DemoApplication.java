
import java.util.*;

public class DemoApplication {

	public static void main(String args[]) {
		
		ArrayList<Customer> al = new ArrayList<Customer>();

		for (int i = 0; i < 3; i++) {
			al.add(getCustomerDetails());
		}
		

		while (true) {
			
			System.out.println();
			System.out.println();
			
			System.out.println("1) sort by firstName\n" + " 2)sort by age\n" + "3) sort by lastName " + "\n 4) exit");
			System.out.println();
			
			Scanner s = new Scanner(System.in);
			System.out.println("enter your choice");
			int choice = s.nextInt();

			if (choice == 1) {
				System.out.println("sorting by firstname...");
				System.out.println();
				
				Collections.sort(al, new FirstNameComparator());
				
				for (Customer cst : al) {
					System.out.println(cst.toString());
				}
				
			}
			
			
			
			if (choice == 2) {

				System.out.println("sorting by age...");
				System.out.println();

				Collections.sort(al, new AgeComparator());
				for (Customer st : al) {
					System.out.println(st.toString());
				}
			}

			
			if (choice == 3) {

				System.out.println("sorting by LastName...");
				System.out.println();

				Collections.sort(al, new LastNameComparator());
				for (Customer st : al) {
					System.out.println(st.toString());
				}

			}
			
			
			if (choice == 4) {
				System.exit(0);
			}
		}

	}

	public static Customer getCustomerDetails() {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name of customer");
		cust.setFirstName(sc.nextLine());
		System.out.println("enter last name of customer");
		cust.setLastName(sc.nextLine());
		System.out.println("enter age of customer ");
		cust.setAge(sc.nextInt());

		return cust;
	}

}