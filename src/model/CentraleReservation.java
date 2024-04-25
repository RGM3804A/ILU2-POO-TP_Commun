package model;

public class CentraleReservation<T extends EntiteReservable> {
	private T[] entite;
	private int nbEntite = 0;
	
	/*public<T extends EntiteReservable> CentraleReservation(T[] entites) {
		this.entite = entites;
		this.nbEntite = entite.length;
	}*/
	
	public void ajouterEntiteE(T entite) {
		this.entite[nbEntite]= entite;
		nbEntite++;
	}
	
	public int[] donnerPossibilites() {
		int[] numeroReservation = new int[nbEntite];
		for(int i=0;i<nbEntite;i++) {
			if(entite[i].compatible())
				numeroReservation[i] = entite[i].getIdentification();
			else
				numeroReservation[i] = 0;
		}return numeroReservation;
	}
}
