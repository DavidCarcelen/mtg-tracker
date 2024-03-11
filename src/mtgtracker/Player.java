package mtgtracker;

import java.util.ArrayList;

public class Player {
	//ATRIBUTOS
	private ArrayList <Deck> decks = new ArrayList <Deck>();
	private String name;
	
	public Player (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showDecks (ArrayList <Deck> decks) {
		for (Deck i : decks) {
			System.out.println(i);
		}
	}

}
