package model;



public class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int identification;
	private Formulaire formulaire;
	
	public void setIdentification(int identifiant) {
		this.identification=identifiant;
	}
	
	public int getIdentification() {
		return identification;
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier.estLibre(jour, mois);
	}
	
	public boolean compatible() {
		if (formulaire instanceof FormulaireRestaurant) {
			return (formulaire.jour!=null && formulaire.mois!=null && formulaire.nbPersonnes!=null && formulaire.numServices);
		}else
			return false;
	}
	
	public boolean reserver(int jour, int mois) {
		if(this.compatible() && calendrier.estLibre(jour,mois))
			return calendrier.reserver(jour, mois);
		else
			return false;
	}
	
}
