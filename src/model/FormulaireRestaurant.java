package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonnes;
	
	public FormulaireRestaurant(int jour,int mois,int personnes,int service) {
		super(new ReservationRestaurant(jour,mois,service,0));
		this.nbPersonnes = personnes;
	}
	
	public int getNumService() {
		return this.reservation.getNumService();
	}
	
	public int getNbPersonnes() {
		return nbPersonnes;
	}
	
	public int getNombrePersonnes() {
		return this.getNbPersonnes();
	}
}
