package presentation;

import java.awt.List;
import java.util.ArrayList;

import business.Tier;
import data.ReadTierData;

public class TiersList extends List {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8966723860136141110L;
	
	private ArrayList<Tier> tiers;
	
	public TiersList() {
		this.tiers = new ReadTierData().getTiers();
		
		for(Tier tier: tiers) {
			this.add(tier.getTierType());
		}
	}
	
	public ArrayList<Tier> getTiers() {
		return this.tiers;
	}
}
