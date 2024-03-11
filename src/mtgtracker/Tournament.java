package mtgtracker;

import java.util.ArrayList;

public class Tournament {
	
	//ATRIBUTOS
	private ArrayList <Player> tournamentList = new ArrayList <Player>();
	private Store store;
	private String format;
	private int plazas;
	private int rounds;
	private int hora;
	private boolean top8 = false;
	
	
	//CONSTRUCTOR
	public Tournament(Store store, String format, int plazas, int rounds, int hora ) {
		this.store = store;
		this.format = format;
		this.plazas = plazas;
		this.rounds = rounds;
		this.hora = hora;
		
	}
	//GETTERS
	public Store getStore() {
		return this.store;
	}
	public String getFormat() {
		return this.format;
	}
	public int getPlazas() {
		return this.plazas;
	}
	public int getRounds() {
		return this.rounds;
	}
	public int getHora() {
		return this.hora;
	}
	
	//SETTERS
	public void setStore(Store store) {
		this.store = store;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	public void showPlayers (ArrayList <Player> tournamentList) {
		for (Player i : tournamentList) {
			System.out.println(i);
		}
	}

}
