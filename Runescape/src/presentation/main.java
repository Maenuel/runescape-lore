package presentation;

import business.ManageGods;
import data.ReadGodData;

public class main {

	public static void main(String[] args) {
		ReadGodData rgd = new ReadGodData();		
		ManageGods managegods = new ManageGods();
		
		rgd.getGod();
		managegods.printGod();
		

	}

}
