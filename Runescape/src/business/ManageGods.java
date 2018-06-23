package business;

import java.util.ArrayList;

import data.ReadGodData;

public class ManageGods {

	private static ArrayList<God> god = new ArrayList<God>();
	
	public void searchGod() {
		ReadGodData rgd = new ReadGodData();
		rgd.getGod();
		//return God
	}
	public void addGod(God god) {
		this.god.add(god);
	}
	public void printGod() {
		for (God g : this.god) {
			//System.out.println(g.getAge()+g.getName());
		}
	}

}
