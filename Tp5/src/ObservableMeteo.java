
public class ObservableMeteo extends Observable{
	
	//ATTRIBUTS METIER
	
	String libelle;
	String dateHeure;
	double temperature;
	double pression;
	
	//CONSTRUCTEUR
	
	public ObservableMeteo(String l) {
		libelle=l;
		dateHeure="";
		temperature=0;
		pression=0;
	}
	
	public ObservableMeteo(String l, String d, double t, double p) {
		libelle=l;
		dateHeure=d;
		temperature=t;
		pression=p;
	}
	
	//ENCAPSULATION
	
	public String getLibelle() {
		return libelle;
	}
		
	public String getDateHeure() {
		return dateHeure;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getPression() {
		return pression;
	}
	
	//METHODES
	
	public void setValeursObservees(String d,double t,double p) {
		dateHeure=d;
		temperature=t;
		pression=p;
		notifierObservateurs();
	}
}
