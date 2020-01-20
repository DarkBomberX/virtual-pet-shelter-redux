import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelterTestObject;
	VirtualPet pet1;

	@Before
	public void setUp() {
		virtualPetShelterTestObject = new VirtualPetShelter();
	}

	@Test
	public void boardPet() {
		virtualPetShelterTestObject.boardPet();
		assertEquals(1,virtualPetShelterTestObject.pets.size());
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
		
	}
	
	@Test
	public void seeOnePet() {
		
	}
}
