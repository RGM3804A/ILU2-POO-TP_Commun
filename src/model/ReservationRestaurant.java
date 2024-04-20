package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour,mois);
		this.numService = service;
		this.numTable = table;
	}
	
	public void setTable(int table) {
		this.numTable = table;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder("Le " + this.getJour() + "/" + this.getMois() +"\nTable "+ numTable +" pour le ");
		if(numService == 1)
			chaine.append("premier service.");
		if(numService == 2)
			chaine.append("deuxième service.");
		return chaine.toString();
	}
}
