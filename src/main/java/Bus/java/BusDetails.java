package Bus.java;

public class BusDetails {
	private int busId;
	private String bname;
	private int bnumber;
	private int broot;
	

	public BusDetails(int busId, String bname, int bnumber, int broot) {
		this.busId = busId;
		this.bname = bname;
		this.bnumber = bnumber;
		this.broot = broot;
	}


	public BusDetails() {
		// TODO Auto-generated constructor stub
	}


	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public int getBnumber() {
		return bnumber;
	}


	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}


	public int getBroot() {
		return broot;
	}


	public void setBroot(int broot) {
		this.broot = broot;
	}


	public String toString() {
		return busId+"\t"+bname+"\t"+bnumber+"\t"+broot;
	}


	public static void adminMainMenu() {
		// TODO Auto-generated method stub
		
	}

}
