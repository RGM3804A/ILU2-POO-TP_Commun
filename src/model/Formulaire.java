package model;

public abstract class Formulaire<T extends Reservation> {
	protected T reservation;
	private int IdentificationEntite;
	
	protected<T extends Reservation> Formulaire(T reservation) {
		this.reservation = reservation;
	}
	
	public int getJour() {
		return reservation.getJour();
	}
	
	public int getMois() {
		return reservation.getMois();
	}
	
	public void setIdentificationEntite(int identifiant) {
		this.IdentificationEntite = identifiant;
	}
	
	public int getIdentificationEntite() {
		return IdentificationEntite;
	}
	
}
