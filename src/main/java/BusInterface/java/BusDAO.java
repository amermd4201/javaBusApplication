package BusInterface.java;

import java.util.List;

import Bus.java.BusDetails;

public interface BusDAO {
	public void addBus();
	public BusDetails viewProduct(int busId);
	public List<BusDetails> viewAllBus();
	public void updateBus(int busId);
	public void deleteBus(int busId);
	public void back();
	public void bill();
	BusDetails viewProduct(int busId, int bid);

}
