package presentation;

import java.awt.List;
import java.util.ArrayList;

import business.God;
import data.ReadGodData;

public class GodsList extends List {
	/**
	 * 
	 */
	private static final long serialVersionUID = 320832406771677666L;
	private ArrayList<God> gods;
	
	public GodsList() {
		this.gods = new ReadGodData().getGods();
		
		for(God god: gods) {
			this.add(god.getName());
		}
	}
	
	public ArrayList<God> getGods() {
		return this.gods;
	}
}
