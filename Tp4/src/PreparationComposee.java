
import java.util.ArrayList;

public class PreparationComposee extends PreparationDeCuisine{
	private ArrayList<PreparationDeCuisine> enfants;
	public int getPrix() {
		int compteur =this.prix;
		for (PreparationDeCuisine e : enfants) {
			compteur+=e.getPrix();
		}
		return compteur;
	}
}
