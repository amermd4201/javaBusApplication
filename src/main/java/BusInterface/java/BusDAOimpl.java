package BusInterface.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bus.java.BusDetails;

public class BusDAOimpl implements BusDAO {
	
 //BusTicketSystem = null;
	Scanner sc=new Scanner(System.in);
	static List<BusDetails> originalList = new ArrayList<BusDetails>();
	static List<BusDetails> tempList=new ArrayList<BusDetails>();
	BusDetails bus = null;
	int n=1;

	
	public void addBus() {
		// TODO Auto-generated method stub
		while (n==1) {
			bus = new BusDetails();
			System.out.println("Enter the bus id ?");
			bus.setBusId(sc.nextInt());
			System.out.println("Eanter the bus name ?");
			bus.setBname(sc.next());
			System.out.println("Enter the bus number ?");
			bus.setBnumber(sc.nextInt());
			System.out.println("enter the bus root ?");
			bus.setBroot(sc.nextInt());
			originalList.add(bus);
			System.out.println("Do you want more busses :");
			n=sc.nextInt();
		}
		System.out.println("Successfully bus added");
	
	}


	public BusDetails viewProduct(int busId, int bid) {
		// TODO Auto-generated method stub
		BusDetails bus=null;
		for(BusDetails b:originalList) {
			if(b.getBusId()==bid) {
				bus=b;
				break;
				
			}
		}
		return bus;
	}

	@Override
	public List<BusDetails> viewAllBus() {
		return originalList;
	
	}

	@Override
	public void updateBus(int busId) {
		// TODO Auto-generated method stub
		tempList=new ArrayList<BusDetails>();
		for(BusDetails b1:originalList) {
			if(b1.getBusId()==busId) {
				System.out.println("select your choice: 1.Bus name 2.Bus number 3.root");
				int choice =sc.nextInt();
				if(choice==1) {
					System.out.println("Enter updated Bus name?");
					b1.setBname(sc.next());
				}else if(choice==2) {
					System.out.println("Enter updated Bus Number?");
					b1.setBnumber(sc.nextInt());
				}else if(choice==3) {
					System.out.println("Enter Bus root?");
					b1.setBroot(sc.nextInt());
				}else {
					System.out.println("please slect your choice range 1-3 only");
				}
				tempList.add(b1);
			}else {
				tempList.add(b1);
			}
		}
		originalList=new ArrayList<BusDetails>();
		for(BusDetails b2:tempList) {
			originalList.add(b2);
		}
		System.out.println("Successfully BusDetails updated");
		
	}

	@Override
	public void deleteBus(int busId) {
		tempList = new ArrayList<BusDetails>();
		for(BusDetails b1:originalList) {
			if(b1.getBusId()==busId) {
		}else {
			tempList.add(b1);
		}
		}
		originalList = new ArrayList<BusDetails>();
		for(BusDetails b3:tempList) {
			originalList.add(b3);
		}
		System.out.println("successfully Bus Deleted");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		//BusTicketSystem.main(null);
		
	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		System.out.println("Under Development");
		
	}


	@Override
	public BusDetails viewProduct(int busId) {
		// TODO Auto-generated method stub
		return null;
	}


	public BusDetails viewBusDetails(int choice) {
		// TODO Auto-generated method stub
		return null;
	}


	public BusDetails viewBusDetails1(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}


	public BusDetails viewBusDetails11(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}
	}
