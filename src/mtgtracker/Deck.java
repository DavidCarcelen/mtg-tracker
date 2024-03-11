package mtgtracker;

import java.util.ArrayList;

public class Deck {
	//ATRIBUTOS
	private ArrayList <Card> deckList = new ArrayList <Card>();
	private String name;
	private String format;
	
	//CONSTRUCTOR
	public Deck (String name, String format) {
		this.name = name;
		this.format = format;
	}
	
	//GETTER
	public String getName () {
		return this.name;
	}
	public String getFormat () {
		return this.format;
	}
	
	//SETTER
	public void setName(String name) {
		this.name = name;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	public void showDeckList (ArrayList <Card> deckList) {
		for (Card i : deckList) {
			System.out.println(i);
		}
	}

}
