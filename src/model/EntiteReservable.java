package model;

public class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int identification;
	
	public void setIdentification(int identifiant) {
		this.identification=identifiant;
	}
	
	public int getIdentification() {
		return identification;
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier.estLibre(jour, mois);
	}
	
	
}
