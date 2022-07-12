package BusMain.java;

import java.util.Scanner;

import BusMenu.java.BusDetailsMenu;

public class BusTicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true) {
	System.out.println("========================");
	System.out.println("|  BUS TICKET SYSTEM   |");
	System.out.println("========================");
	System.out.println("|      1.ADMIN         |");
	System.out.println("|      2.PASSENGER     |");
	System.out.println("|      3.EXIT          |");
	System.out.println("========================");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		BusDetailsMenu.adminMainMenu();
		break;
	case 2:
		BusDetailsMenu.passengerMainMenu();
		break;
	case 3:
		System.exit(0);
		break;
		default:
			System.out.println("plese select your choice 1-3 only");
	}
}
	}

}
