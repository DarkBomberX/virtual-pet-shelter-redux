import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelterTestObject;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void setUp() {
		virtualPetShelterTestObject = new VirtualPetShelter();
		pet1 = new VirtualPet("Majima", "Dumb");
		pet2 = new VirtualPet("lil Kanye", "Based");

	}

	@Test
	public void boardPet() {
		virtualPetShelterTestObject.boardPet(pet1);
		assertEquals(1, virtualPetShelterTestObject.showAllPets().size());
		assertEquals("Dumb", virtualPetShelterTestObject.showOnePet("Majima").getDescription());
	}

	@Test
	public void adoptPet() {
		virtualPetShelterTestObject.boardPet(pet1);
		virtualPetShelterTestObject.adoptPet("Majima");
		assertEquals(0, virtualPetShelterTestObject.showAllPets().size());
		assertEquals(null, virtualPetShelterTestObject.showOnePet("Majima"));
	}

	@Test
	public void feedAllPets() {
		virtualPetShelterTestObject.boardPet(pet1);
		virtualPetShelterTestObject.boardPet(pet2);
		virtualPetShelterTestObject.feedAllPet();
		assertEquals(10, virtualPetShelterTestObject.showOnePet("Majima").getHunger());
		assertEquals(10, virtualPetShelterTestObject.showOnePet("lil Kanye").getHunger());
	}

	@Test
	public void waterAllPets() {
		virtualPetShelterTestObject.boardPet(pet1);
		virtualPetShelterTestObject.boardPet(pet2);
		virtualPetShelterTestObject.waterAllPet();
		assertEquals(11, virtualPetShelterTestObject.showOnePet("Majima").getThirst());
		assertEquals(11, virtualPetShelterTestObject.showOnePet("lil Kanye").getThirst());
	}

	@Test
	public void playWithPet() {
		virtualPetShelterTestObject.boardPet(pet1);
		virtualPetShelterTestObject.playWithPet("Majima");
		assertEquals(9, virtualPetShelterTestObject.showOnePet("Majima").getBordom());
	}

	@Test
	public void tickAll() {
		virtualPetShelterTestObject.boardPet(pet1);
		virtualPetShelterTestObject.boardPet(pet2);
		virtualPetShelterTestObject.tickAll();
		assertEquals(4, virtualPetShelterTestObject.showOnePet("Majima").getHunger());
		assertEquals(4, virtualPetShelterTestObject.showOnePet("lil Kanye").getHunger());
		assertEquals(4, virtualPetShelterTestObject.showOnePet("Majima").getSleep());
		assertEquals(4, virtualPetShelterTestObject.showOnePet("lil Kanye").getSleep());
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
