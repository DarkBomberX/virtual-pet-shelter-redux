public class VirtualPet {
	
	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int bordom;
	private int sleep;
	private int bathroom;

	public VirtualPet(String name, String description, int hunger, int thirst, int bordom, int sleep, int bathroom) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.bordom = bordom;
		this.sleep = sleep;
		this.bathroom = bathroom;
	}
	
	public VirtualPet(String name, String description) {
		
	}
	
	public void feed() {
		hunger= hunger + 5;
	}
	
	public void water() {
		thirst +=6;
	}
	
	public void rest() {
		sleep +=10;
	}

	public void bathroom() {
		bathroom +=2;
	}
	
	public void play() {
		
	}
	
	public void tick() {
		
	}

//	Getters
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBordom() {
		return bordom;
	}

	public int getSleep() {
		return sleep;
	}

	public int getBathroom() {
		return bathroom;
	}
}
