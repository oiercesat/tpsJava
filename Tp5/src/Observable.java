import java.util.ArrayList;

public abstract class Observable {
	ArrayList <Observateur> mesObservateurs = new ArrayList <Observateur> ();
	
	public boolean ajouterObservateur(Observateur o) {
		boolean resultat=false;
		if(mesObservateurs.add(o)) {
			resultat=true;
		}
		return resultat;
		
	};
	
	public boolean existeObservateur (Observateur o) {
		boolean resultat = false;
		
		for (Observateur iObservateur : mesObservateurs ) {
			if(o==iObservateur) {
				resultat=true;
			}
		}
		return resultat;
	}

	public boolean supprimerObservateur(Observateur o) {
		boolean resultat=false;
		
		if (existeObservateur(o)) {
			mesObservateurs.remove(o);
			resultat=true;
		}
		
		return resultat;
	}
	
	public void notifierObservateurs() {
		for (Observateur iObservateur : mesObservateurs) {
			iObservateur.reagir();
		}
	}
}

