package business;

public class God {
	
	String age;
	String era;
	String colors;
	String ascension;
	String gender;
	String birthRace;
	String name;
	String description;
	String image;
	int godID;
	int	tierID;
	
	public God(String age,String era,String colors,String ascension,String gender,
			String birthRace,String name,String description, String image, int tierID,int godID) {
		this.age=age;
		this.era=era;
		this.colors=colors;
		this.ascension=ascension;
		this.gender=gender;
		this.birthRace=birthRace;
		this.name=name;
		this.description=description;
		this.image=image;
		this.tierID=tierID;
		this.godID=godID;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEra() {
		return era;
	}
	public void setEra(String era) {
		this.era = era;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getAscension() {
		return ascension;
	}
	public void setAscension(String ascension) {
		this.ascension = ascension;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthRace() {
		return birthRace;
	}
	public void setBirthRace(String birthRace) {
		this.birthRace = birthRace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getTierID() {
		return tierID;
	}
	public void setTierID(int tierID) {
		this.tierID = tierID;
	}
	public int getGodID() {
		return godID;
	}
	public void setGodID(int godID) {
		this.godID=godID;
	}
}
