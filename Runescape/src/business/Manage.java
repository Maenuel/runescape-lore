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
	public void printAllGod() {
		for (God g : this.god) {
			// System.out.println(g.getAge()+g.getName());
		}
	}
	//Print all Tier
	public void printAllTier() {
		for (Tier t : this.tier) {
			// System.out.println(t.getDescription()+" "+t.getTierID()+" "+t.getTierType());
		}
	}
	//Get Tier Data by ID
	public void getTierData(int ID) {
		for (Tier t : this.tier) {
			if (t.getTierID() == ID) {
				//System.out.println("Tier gefunden");
			}
		}
	}
	//Search God by name
	public void searchGod(String name) {
		for (God g : this.god) {
			if (g.getName().equals(name)) {
				// System.out.print("Gott gefunden");
			}
		}
	}
	//Filter God by Tier ID
	public void filterGod(int tierID) {
		for(God g:this.god) {
			if(g.getTierID()==tierID) {
				//System.out.println(g.getName());
			}
		}
	}
}
