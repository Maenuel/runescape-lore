package presentation;

import business.Manage;
import data.ReadGodData;
import data.ReadTierData;

public class main {

	public static void main(String[] args) {
		ReadGodData rgd = new ReadGodData();	
		ReadTierData rtd= new ReadTierData();
		Manage manage = new Manage();
		rgd.getGod();
		rtd.getTier();
		//manage.printAllTier();
		manage.searchGod("Sarafdomin");
		//manage.printAllGod();
		

	}

}
