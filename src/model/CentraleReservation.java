package model;

public class CentraleReservation<T extends EntiteReservable> {
	private T[] entite;
	private int nbEntite;
	
	public<T extends EntiteReservable> CentraleReservation() {
		this.entite = new T[];
	}
	
	public<T extends EntiteReservable> void ajouterEntiteE(T entite) {
		entite[nbEntite]= entite;
		nbEntite++;
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] numeroReservation = new int[nbEntite];
		for(int i=0;i<nbEntite;i++) {
			if(entite[i].compatible())
				numeroReservation[i] = entite[i].getIdentification();
			else
				numeroReservation[i] = 0;
		}return numeroReservation;
	}
}
