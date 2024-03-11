package mtgtracker;

public class Store {
	//ATRIBUTOS
	private String name;
	private int plazasMax;
	
	//CONSTRUCTOR
	public Store (String name, int plazasMax) {
		this.name = name;
		this.plazasMax = plazasMax;
	}
	
	//GETTERS
	public String getName () {
		return this.name;
	}
	public int getPlazasMax () {
		return this.plazasMax;
	}
	
	//SETTERS
	public void setName (String name) {
		this.name = name;
	}
	public void setPlazasMax (int plazasMax) {
		this.plazasMax = plazasMax;
	}

}
