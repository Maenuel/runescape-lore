package business;

import java.util.ArrayList;

public class Manage {

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
	public ArrayList<String> searchGod(String name) {
		for (God g : this.god) {
			if (g.getName().equals(name)) {
				ArrayList <String> data = new ArrayList <String>();
				data.add(g.getName());
				data.add(g.getAge());
				data.add(g.getColors());
				data.add(g.getAscension());
				data.add(g.getGender());
				data.add(g.getBirthRace());
				data.add(g.getDescription());
				data.add(g.getImage());
				data.add(String.valueOf(g.getTierID()));
				return data;
			}
		}
		ArrayList <String> data = new ArrayList<String>();
		data.add("Null");
		return data;
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
