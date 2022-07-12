package BusMenu.java;

import java.util.List;
import java.util.Scanner;

import Bus.java.BusDetails;
import BusInterface.java.BusDAOimpl;

public class BusDetailsMenu {
	static Scanner sc=new Scanner(System.in);
	static BusDAOimpl BusDAO = new BusDAOimpl();
	
	public static void adminMainMenu() {
		System.out.println("-------------------------");
		System.out.println("|   ADMIN MAIN MENU     |");
		System.out.println("-------------------------");
		System.out.println("|  1.ADD BUS            |");
		System.out.println("|   2.VIEW BUS          |");
		System.out.println("|   3.VIEW ALL BUSSES   |");
		System.out.println("|  4.UPDATE BUS         |");
		System.out.println("|   5.DELETE BUS        |");
		System.out.println("|   6.BACK              |");
		System.out.println("enter your choice ?");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			BusDAO.addBus();
			adminMainMenu();
			break;
		case 2:
			System.out.println("enter search Bus Id?");
			BusDetails bus=BusDAO.viewBusDetails(sc.nextInt());
			System.out.println("BusId"+"\t"+"bname"+"\t"+"bnumber"+"\t"+"Broot");
			System.out.println("----------------------------------------");
			System.out.println(bus);
			adminMainMenu();
			break;
		case 3:
			List<BusDetails> buses=BusDAO.viewAllBus();
			System.out.println("BusId"+"\t"+"bname"+"\t"+"bnumber"+"\t"+"Broot");
			System.out.println("----------------------------------------");
			for (BusDetails bi:buses) {
				System.out.println(bi);
			}
			adminMainMenu();
			break;
		case 4:
			System.out.println("Which bus do you want to update");
			BusDAO.updateBus(sc.nextInt());
			adminMainMenu();
			break;
		case 5:
			System.out.println("Which bus do you want to delete");
			BusDAO.deleteBus(sc.nextInt());
			adminMainMenu();
			break;
		case 6:
			BusDAO.back();
			break;
			default :
				System.out.println("plese select your choice 1-5 only");
			
		}
	}

	
	public static void passengerMainMenu() {
		System.out.println("------------------------");
		System.out.println("|    PASSENGER MAIN MENU  |");
		System.out.println("-------------------------");
		System.out.println("|     1.VIEW BUS     |");
		System.out.println("|     2.VIEW ALL BUSSES |");
		System.out.println("|     3.BILL         |");
		System.out.println("|      4.BACK         |");
		System.out.println("---------------------------");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter search busid?");
			BusDetails b=BusDAO.viewBusDetails1(sc.nextInt());
			System.out.println("busid"+"\t"+"bname"+"\t"+"bnumber"+"\t"+"Broot");
			System.out.println("---------------------------");
			System.out.println(b);
			passengerMainMenu();
			break;
		case 2:
			List<BusDetails> buses=BusDAO.viewAllBus();
			System.out.println("busid"+"\t"+"bname"+"\t"+"bnumber"+"\t"+"Broot");
			System.out.println("---------------------------");
			for (BusDetails bb:buses) {
				System.out.println(bb);
			}
			passengerMainMenu();
			break;
		case 3:
			BusDAO.bill();
			passengerMainMenu();
			break;
		case 4:
			BusDAO.back();
			break;
			default:
				System.out.println("plese select your choice 1-4 only");
			}
	}
}
