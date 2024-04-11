package model;

public class CalendrierAnnuel {
	private Mois[] mois;
	
	public CalendrierAnnuel() {
		String[] nomMois = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		int[] nbJour = {31,28,31,30,31,30,31,31,30,31,30,31};
		this.mois = new Mois[12];
		for(int i = 0;i < 12; i++)
			mois[i] = new Mois(nomMois[i],nbJour[i]);
	}
	
	public boolean estLibre(int jour, int nbMois) {
		return mois[nbMois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int nbMois) {
		try {
			mois[nbMois-1].reserver(jour);
			return true;
		} catch(IllegalStateException e) {
			return false;
		}
	}
	
	public class Mois {
		private String mois;
		private Boolean[] jours;
		
		public Mois(String nomMois,int nbJour){
			this.mois = nomMois;
			this.jours = new Boolean[nbJour];
			for(int i = 0; i< nbJour; i++)
				this.jours[i] = true;
		}
		
		public boolean estLibre(int numeroJour) {
			if(numeroJour <= jours.length) {
				return jours[numeroJour-1];
			} else
				return false;
		}
		
		public void reserver(int numeroJour) throws IllegalStateException {
			if(!estLibre(numeroJour))
				throw new IllegalStateException();
			jours[numeroJour-1]=false;
		}
	}
}
