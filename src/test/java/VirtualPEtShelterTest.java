import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelterTestObject;
	VirtualPet pet1;
	
	@Before
	public void setUp() {
		virtualPetShelterTestObject = new VirtualPetShelter();
		pet1 = new VirtualPet("Majima", "Playful, mixed breed", 20, 20, 20, 20);
	}
	
	
	@Test
	public void whenAddPet() {
		virtualPetShelterTestObject.add(pet1);
		VirtualPetShelter addPet = virtualPetShelterTestObject.findPet("Majima");
		assertThat(addPet, is(pet1));
	}
	
	@Test
	public void whenRemovePet() {
		virtualPetShelterTestObject.remove(pet1);
		assertEquals(null, virtualPetShelterTestObject.remove(pet1));	
		}
}
