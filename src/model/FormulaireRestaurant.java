package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPersonnes;
	private int numService;
	private int jour;
	private int mois;
	
	public FormulaireRestaurant(int jour,int mois,int personnes,int service) {
		super(new ReservationRestaurant(jour,mois,service,0));
		this.nbPersonnes = personnes;
		this.numService = service;
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getNbPersonnes() {
		return nbPersonnes;
	}
	
	public int getNombrePersonnes() {
		return this.getNbPersonnes();
	}
	
}
