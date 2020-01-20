import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		boolean running = true;
		while (running) {
			System.out.println("Welcome to Eddie's Pet Shelter!");
			tellOptions();

			String pick = input.nextLine();

			if (pick.equals("1")) {
				boardPet(input,virtualPetShelter);
			} else if (pick.equals("2")) {
				adoptPet(input,virtualPetShelter);
			} else if (pick.equals("3")) {
				virtualPetShelter.feedAllPet();
				virtualPetShelter.tickAll();
			} else if (pick.equals("4")) {
				virtualPetShelter.waterAllPet();
				virtualPetShelter.tickAll();
			} else if (pick.equals("5")) {
				playWithPet(input,virtualPetShelter);
				virtualPetShelter.tickAll();
			} else if (pick.equals("6")) {
				listPets(virtualPetShelter);
			} else if (pick.equals("7")) {
				running = false;
				System.out.println("See you later, Dawgs!");
			}else {
				System.out.println("Pick a valid Option");
			}

		}

	}

	public static void tellOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1: Board a Pet");
		System.out.println("2: Adopt a Pet");
		System.out.println("3: Feed The Pets");
		System.out.println("4: Give Water To Pets");
		System.out.println("5: Play With a Pet");
		System.out.println("6: List Pets");
		System.out.println("7: Exit");
	}
	
	public static void boardPet(Scanner input,VirtualPetShelter virtualPetShelter) {
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine();
		System.out.println("What's it like?");
		String description = input.nextLine();
		VirtualPet vp = new VirtualPet(name,description);
		virtualPetShelter.boardPet(vp);
	}
	
	public static void listPets(VirtualPetShelter virtualPetShelter) {
		
		for (Map.Entry<String, VirtualPet> entry : virtualPetShelter.showAllPets().entrySet()) {
			VirtualPet pet = entry.getValue();
			
			System.out.println(pet.getName()+ " : "+ pet.getDescription());
		}
	}
	
	public static void adoptPet(Scanner input,VirtualPetShelter virtualPetShelter) {
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine();
		virtualPetShelter.adoptPet(name);
		System.out.println("You Adopted " + name);
	}
	
	public static void playWithPet(Scanner input,VirtualPetShelter virtualPetShelter) {
		System.out.println("What's the Pet's Name?");
		String name = input.nextLine();
		virtualPetShelter.playWithPet(name);
	}

}
