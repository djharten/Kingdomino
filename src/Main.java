import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		List<TileInfo<String, Integer, String, Integer>> tileList = TileInfo.createTiles();
		
		welcomeMessage(sc);
		
		System.out.print("Please enter the name for Player 1: ");
		Player player1 = new Player(sc.nextLine());
		System.out.print("Please enter the name for Player 2: ");
		Player player2 = new Player(sc.nextLine());
		
		// Fills the array with a random order of the values 1-48, to simulate the tiles being drawn
		// in random order.
		int[] orderOfTiles = randomNumberGenerator();
		
		// currentIndex keeps track of the location of the last tile we are using on the current turn.
		int currentIndex = 0;
		int val = -1;
		
		for(int i = 1; i <= 12; i++) {
			
			for(int j = 1; j <= 4; j++) {
				val = orderOfTiles[currentIndex];
				makeTile(tileList, val);
				currentIndex++;
			}
			// Prints out the upcoming 4 numbers on the "back" of the tiles, so the user has a better
			// idea of what game board pieces are going to be available in the next turn.
			if(i != 12) {
				System.out.print("Next numbers: ");
				for(int k = 0; k < 4; k++) {
					System.out.print(val + " ");
					val = orderOfTiles[currentIndex];
					currentIndex++;
				}
				currentIndex -= 4;
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}

	}
	
	// Creates an array of random numbers from 1-48 in order to "pull" all game tiles in random
	// order. We use an array so that we can not only grab the current game board pieces, but look
	// ahead to the next 4 numbers that are on the "back" of the tile so a user can better determine
	// their game strategy.
	public static int[] randomNumberGenerator() {
		int[] orderOfTiles = new int[48];
		Set<Integer> usedNumbers = new HashSet<>();
		Random rand = new Random();
		int randNum;
		for(int i = 0; i < 48; i++) {
			do {
				randNum = rand.nextInt(48) + 1;
			} while(usedNumbers.contains(randNum));
			orderOfTiles[i] = randNum;
			usedNumbers.add(randNum);
		}
		return orderOfTiles;
	}
	
	public static void welcomeMessage(Scanner sc) throws IOException {
		System.out.println("Welcome to the game of KingDomino! What would you like to do?");
		System.out.println("[1]: Play the game");
		System.out.println("[2]: Learn the rules");
		System.out.println("[3]: Quit");
		System.out.print("Please enter your selection: ");
		int ans = 0;
		try {
			ans = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("Invalid entry! Please try again");
			System.out.println();
			sc.nextLine();
			welcomeMessage(sc);
		}
		if(ans < 1 || ans > 3) {
			System.out.println("Invalid entry! Please try again");
			System.out.println();
			welcomeMessage(sc);
		} else if(ans == 1) {
			// Play the actual game.
		} else if(ans == 2) {
			explainRules();
		} else {
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
	
	public static void explainRules() throws IOException {
		// TODO: Write rules
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("rules.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error! Rules file not found!");
			System.exit(0);
		}
		String textLine = null;
		while((textLine = br.readLine()) != null) {
			System.out.println(textLine);
		}
	}
	
	// Creates a "game tile" for each piece that goes on the board.
	public static void makeTile(List<TileInfo<String, Integer, String, Integer>> tileList, int val) {
		
		String leftTile = tileList.get(val).getLeftTile();
		String rightTile = tileList.get(val).getRightTile();
		int leftCrown = tileList.get(val).getLeftCrownVal();
		int rightCrown = tileList.get(val).getRightCrownVal();
		
		int tileLength = leftTile.length() + rightTile.length() + 11;
		String border = "";
		for(int i = 0; i < tileLength; i++) {
			border += "*";
		}
		System.out.println(border);
		System.out.println("* " + leftTile + " " + leftCrown + " | " + rightTile + " " + rightCrown + " *");
		System.out.println(border);
		System.out.println();
	}
	
}