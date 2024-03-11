package mtgtracker;

import java.util.Scanner;

public class MTG_TRACKER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		Player player = null;
		
		Scanner input = new Scanner (System.in);
		
		//System.out.println();
		System.out.println("Welcome to MTG Tracker\n"
				+ "");
		System.out.println("Lets create a player:\n"
				+ "Choose a name.");
		name = input.next();
		player = newPlayer(name);
		System.out.println("Player's name : " + player.getName());
		

	}
	
	public static Player newPlayer(String name) {
		 Player player = new Player(name);
		 return player;
	}

}
