package business;

public class Tier {
	String description;
	String tierType;
	int tierID;
	public Tier(String tierType,String description,int tierID) {
		this.tierType=tierType;
		this.description=description;
		this.tierID=tierID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTierType() {
		return tierType;
	}
	public void setTierType(String tierType) {
		this.tierType = tierType;
	}
	public int getTierID() {	
		return tierID;
	}
	public void setID(int iD) {
		tierID = iD;
	}
}
