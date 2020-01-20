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
		VirtualPet testPet = createDefaultTestPet();
		testPet.water();
		assertEquals(11,testPet.getThirst());
		
	}
	
	@Test
	public void rest() {
		VirtualPet testPet = createDefaultTestPet();
		testPet.rest();
		assertEquals(15,testPet.getSleep());
	}

	@Test
	public void bathroom() {
		VirtualPet testPet = createDefaultTestPet();
		testPet.bathroom();
		assertEquals(7,testPet.getBathroom());
	}
	
	@Test
	public void play() {
		VirtualPet testPet = createDefaultTestPet();
		testPet.play();
		assertEquals(9,testPet.getBordom());
	}
	
	@Test
	public void tick() {
		VirtualPet testPet = createDefaultTestPet();
		
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
