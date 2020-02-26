package example3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RealEstate rE = new RealEstate("temp", new Address(null, null, null));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- Add a House");
		System.out.println("2- Display All Houses");
		System.out.println("3- Search by Price");
		System.out.println("4- Exit");
		
		int menuSelect = sc.nextInt();
		
		if(menuSelect == 1)
		{
			 String kind = sc.nextLine();
			 int numOfRoom = sc.nextInt();
			 int area = sc.nextInt();
			 double price = sc.nextDouble();
			 String street = sc.nextLine();
			 String town = sc.nextLine();
			 String city = sc.nextLine();
			 
			 House h1 = new House(kind, area, numOfRoom, price, new Address(street, town, city));
			 rE.addHouse(h1);
			 	 
		}
		if(menuSelect == 2)
		{
			System.out.println(rE.displayAllHouses());
		}
		if(menuSelect == 3)
		{
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			
			System.out.println(rE.searchByPrice(p1, p2));
		}
		if(menuSelect == 4)
		{
			System.exit(0);
		}
		
	}
}
