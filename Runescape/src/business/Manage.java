package business;

import java.util.ArrayList;

public class Manage implements IManage{

	private static ArrayList<God> god = new ArrayList<God>();
	private static ArrayList<Tier> tier = new ArrayList<Tier>();

	//Add God in ArrayList
	public void addGod(God god) {
		this.god.add(god);
	}
	//Add Tier in ArrayList
	public void addTier(Tier tier) {
		this.tier.add(tier);
	}
	//Print all God
	public ArrayList<God> printAllGod() {
		return god;
	}
	//Print all Tier
	public ArrayList<Tier> printAllTier() {
		return tier;
	}
	//Get Tier Data by ID
	public Tier getTierData(int ID){
		for(Tier t : tier) {
			if(t.getTierID()==ID) {
				return t;
			}
		}
		return null;
	}
	//Search God by name
	public God searchGod(String name) {
		for(God g:god) {
			if(g.getName().equals(name)) {
				return g;
			}
		}
		return null;
	}
	//Filter God by Tier ID
	public ArrayList<God> filterGod(int tierID) {
		ArrayList<God> selGod = new ArrayList<God>();
		for(God g:this.god) {
			if(g.getTierID()==tierID) {
				selGod.add(g);
			}
		}
		return selGod;
	}
}
