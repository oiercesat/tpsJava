import java.util.ArrayList;

public class PlatCuisine {
	//ATTRIBUT
	String libelle;
	String recette;
	ArrayList<Ingredient> mesIngredients= new ArrayList<Ingredient>();
	
	//CONSTRUCTEUR
		public PlatCuisine(String rec,String lib,ArrayList<Ingredient> ingr){
			recette=rec;
			libelle=lib;
			mesIngredients=ingr;
		}
		
		//ENCAPSULATION
		
		public String getRecette() {
			return recette;
		}
		
		public String getLib() {
			return libelle;
		}
		
		public ArrayList<Ingredient> getIngredient() {
			return mesIngredients;
		}

		
		public void setRecette(String rec) {
			recette=rec;
		}
		
		public void setLib(String lib) {
			libelle=lib;
		}
		
		//METHODE SPECIFIQUE
		
		public void ajouterIngredient(Ingredient ingr) {
			boolean estPresent=false;
			for (int i=0;i<getIngredient().size();i++) {
				if(mesIngredients.get(i)==ingr) {
					estPresent=true;
				}
			}
			if(!estPresent) {
				mesIngredients.add(ingr);
				ingr.lierMonPlat(this);
				}
		}
		
		public void supprimerIngredient(Ingredient ingr) {
			if(!getIngredient().isEmpty()){
				for (int i=0; i<getIngredient().size();i++) {
					if(mesIngredients.get(i) == ingr) {
						mesIngredients.remove(i);
						ingr.lierMonPlat(this);
					}
				}
			}
		}

}
