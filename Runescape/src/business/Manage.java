package business;

import java.util.ArrayList;

public class Manage {

	private static ArrayList<God> god = new ArrayList<God>();
	private static ArrayList<Tier> tier = new ArrayList<Tier>();

	public void addGod(God god) {
		this.god.add(god);
	}
	public void addTier(Tier tier) {
		this.tier.add(tier);
	}
	public void printAllGod() {
		for (God g : this.god) {
			//System.out.println(g.getAge()+g.getName());
		}
	}
	public void printAllTier() {
		for(Tier t: this.tier) {
			System.out.println(t.getDescription()+" "+t.getTierID()+" "+t.getTierType());
		}
	}
	public void getTierData(int ID) {
		
	}
	public void searchGod(String name){
		if(god.contains(name)) {
			//int d= god.indexOf(name);
			System.out.println("Gott wurde gefunden");
		}
	}
}
