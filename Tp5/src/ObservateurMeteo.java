
public class ObservateurMeteo extends Observateur {
	
	//ATTRIBUTS
	
	private ObservableMeteo observable;
	private String libelle;
	private String dateHeureLocale;
	private double tempLocale;
	private double pressionLocale;
	
	//CONSTRUCTEUR
	
	public ObservateurMeteo() {
		libelle="";
		dateHeureLocale="";
		tempLocale=0;
		pressionLocale=0;
	}
	
	public ObservateurMeteo(String l) {
		libelle=l;
		dateHeureLocale="";
		tempLocale=0;
		pressionLocale=0;
	}
	
	public ObservateurMeteo(String l,String d,double t,double p) {
		libelle=l;
		dateHeureLocale=d;
		tempLocale=t;
		pressionLocale=p;
	}
	
	//ENCAPSULATION
	
	public void setObservable(ObservableMeteo o) {
		observable=o;
	}
	public void setDateHeureLocale(String d) {
		dateHeureLocale=d;
	}
	public void setTempLocale(double t) {
		tempLocale=t;
	}
	public void setPressionLocale(double p) {
		pressionLocale=p;
	}
	public ObservableMeteo getObservableMeteo() {
		return observable;
	}
	public String getLibelle() {
		return libelle;
	}
	public String getDateHeureLocale() {
		return dateHeureLocale;
	}
	public double getTempLocale() {
		return tempLocale;
	}
	public double getPressionLocale() {
		return pressionLocale;
	}
	
	//METHODES
	
	public void reagir() {
		dateHeureLocale=observable.getDateHeure();
		tempLocale = observable.getTemperature();
		pressionLocale = observable.getPression();
	}
}
