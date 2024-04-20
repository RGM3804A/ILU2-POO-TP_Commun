package model;

public abstract class Reservation {
	private int numJour;
	private int numMois;
	
	protected Reservation(int jour, int mois) {
		this.numJour = jour;
		this.numMois = mois;
	}
	
	public int getMois() {
		return numMois;
	}
	
	public int getJour() {
		return numJour;
	}
	
	public abstract String toString();
}
