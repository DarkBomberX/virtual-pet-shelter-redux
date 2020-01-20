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
		testPet.tick();
		assertEquals(4,testPet.getHunger());
		assertEquals(4,testPet.getThirst());
		assertEquals(4,testPet.getSleep());
		assertEquals(4,testPet.getBathroom());
		assertEquals(4,testPet.getBordom());
	}
	
	@Test
	public void nameDescription() {
		VirtualPet testPet = new VirtualPet("Majima","Playful mix breed");
		assertEquals("Majima",testPet.getName());
		assertEquals("Playful mix breed",testPet.getDescription());
		assertEquals(5,testPet.getHunger());
		assertEquals(5,testPet.getThirst());
		assertEquals(5,testPet.getSleep());
		assertEquals(5,testPet.getBathroom());
		assertEquals(5,testPet.getBordom());
	}
	
	@Test
	public void stats() {
		VirtualPet testPet = new VirtualPet("Majima","Playful mix breed", 5, 5, 5, 5, 5);
		assertEquals("Majima",testPet.getName());
		assertEquals("Playful mix breed",testPet.getDescription());
		assertEquals(5,testPet.getHunger());
		assertEquals(5,testPet.getThirst());
		assertEquals(5,testPet.getSleep());
		assertEquals(5,testPet.getBathroom());
		assertEquals(5,testPet.getBordom());
	}
	
	private VirtualPet createDefaultTestPet() {
		VirtualPet testPet = new VirtualPet("Majima","Playful mix breed", 5, 5, 5, 5, 5);
		return testPet;
		
	}
}
