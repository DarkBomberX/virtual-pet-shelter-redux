import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	
	public void boardPet(VirtualPet petToBoard) {
		pets.put(petToBoard.getName(), petToBoard);
	}
	
	public void adoptPet() {
		
	}
	
	public void feedAllPet() {
		
	}
	
	public void waterAllPet() {
		
	}
	
	public void playWithPet() {
		
	}
	
	public void tickAll() {
		
	}
	
	public Map<String, VirtualPet> showAllPets() {
		return pets;
	}

	public VirtualPet showOnePet(String name) {
		return null;
	}
}
