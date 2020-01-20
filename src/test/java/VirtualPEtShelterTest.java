import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelterTestObject;
	VirtualPet pet1;

	@Before
	public void setUp() {
		virtualPetShelterTestObject = new VirtualPetShelter();
		pet1 = new VirtualPet("Majima", "Dumb");
		
		
	}

	@Test
	public void boardPet() {
		virtualPetShelterTestObject.boardPet(pet1);
		assertEquals(1,virtualPetShelterTestObject.pets.size());
		assertEquals("Dumb",virtualPetShelterTestObject.pets.get("Majima").getDescription());
	}

	@Test
	public void adoptPet() {
		
	}
	
	@Test
	public void feedAllPets() {
		
	}
	
	@Test
	public void waterAllPets() {
		
	}
	
	@Test
	public void playWithPet() {
		
	}
	
	@Test
	public void tickAll() {
		
	}
	
	@Test
	public void seeAllPets() {
		assertEquals(0, virtualPetShelterTestObject.showAllPets().size());
	}
	
	@Test
	public void seeOnePet() {
		virtualPetShelterTestObject.boardPet(pet1);
		VirtualPet vp = virtualPetShelterTestObject.showOnePet("Majima");
		
		assertEquals("Dumb", vp.getDescription());
		assertEquals(5, vp.getHunger());
	}
}
