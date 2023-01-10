
public class Ingredient {
	//ATTRIBUT
	String libelle;
	PlatCuisine monPlat;
	
	
	//CONSTRUCTEUR
	public Ingredient(String lib,PlatCuisine plat){
		libelle=lib;
		monPlat=plat;
	}
	
	//ENCAPSULATION
	
	public String getLib() {
		return libelle;
	}
	
	public PlatCuisine getPlat() {
		return monPlat;
	}

	public void setLib(String lib) {
		libelle=lib;
	}
	public void setPlat(PlatCuisine plat) {
		monPlat=plat;
	}
	
	//METHOS USUELLES
	public String toString() {
		String message;
		message="le libelle est : "+getLib();
		return message;
	}

	//METHODES SPECIFIQUES 
	public void delierMonPlat() {
		if(getPlat()!=null) {
			setPlat(null);
			monPlat.supprimerIngredient(this);
		}
	}
	
	public void lierMonPlat(PlatCuisine plat) {
		if(plat!=null) {
			delierMonPlat();
			setPlat(plat);
			monPlat.ajouterIngredient(this);
		}
	}
}
