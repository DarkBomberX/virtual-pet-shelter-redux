import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetTest {
	
	VirtualPet testPet;
	
	@Before
	public void setup() {
		testPet = new VirtualPet("Majima","Playful mix breed", 5, 5, 5, 5, 5);
	}

	@Test
	public void feed() {
		
		testPet.feed();
		assertEquals(10,testPet.getHunger());
	}
	
	@Test 
	public void water() {
		
		testPet.water();
		assertEquals(11,testPet.getThirst());
		
	}
	
	@Test
	public void rest() {
		
		testPet.rest();
		assertEquals(15,testPet.getSleep());
	}

	@Test
	public void bathroom() {
		
		testPet.bathroom();
		assertEquals(7,testPet.getBathroom());
	}
	
	@Test
	public void play() {
		
		testPet.play();
		assertEquals(9,testPet.getBordom());
	}
	
	@Test
	public void tick() {
		
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
	
}
