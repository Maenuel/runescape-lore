package business;

import java.util.ArrayList;

public interface IManage {
	public void addGod(God god);
	public void addTier(Tier tier);
	public void printAllGod();
	public void printAllTier();
	public void getTierData(int ID);
	public ArrayList<String> searchGod(String name);
	public void filterGod(int tierID);
}
