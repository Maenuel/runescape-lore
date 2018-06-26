package business;

import java.util.ArrayList;

public interface IManage {
	public void addGod(God god);
	public void addTier(Tier tier);
	public ArrayList<God> printAllGod();
	public ArrayList<Tier> printAllTier();
	public Tier getTierData(int ID);
	public God searchGod(String name);
	public ArrayList<God> filterGod(int tierID);
}
