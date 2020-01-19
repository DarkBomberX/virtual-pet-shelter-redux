import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void feed() {
		VirtualPet testPet = createDefaultTestPet();
		testPet.feed();
		assertEquals(10,testPet.getHunger());
	}
	
	@Test 
	public void water() {
		
	}
	
	@Test
	public void rest() {
		
	}

	@Test
	public void bathroom() {
		
	}
	
	@Test
	public void play() {
		
	}
	
	@Test
	public void tick() {
		
	}
	
	@Test
	public void nameDescription() {
		
	}
	
	@Test
	public void stats() {
		
	}
	
	private VirtualPet createDefaultTestPet() {
		VirtualPet testPet = new VirtualPet("Majima","Playful mix breed", 5, 5, 5, 5, 5);
		return testPet;
		
	}
}
