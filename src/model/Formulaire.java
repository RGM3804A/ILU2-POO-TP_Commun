package model;

public abstract class Formulaire<T extends Reservation> {
	protected T reservation;
	private int IdentificationEntite;
	
	protected Formulaire(T reservation) {
		this.reservation = reservation;
	}
	
	public int getJour() {
		return reservation.getJour();
	}
	
	public int getMois() {
		return reservation.getMois();
	}
	
	/*public<T extends ReservationRestaurant> int getNumService(T reservation) {
		return reservation.getNumService();
	}*/
	
	public void setIdentificationEntite(int identifiant) {
		this.IdentificationEntite = identifiant;
	}
	
	public int getIdentificationEntite() {
		return IdentificationEntite;
	}
	
}
