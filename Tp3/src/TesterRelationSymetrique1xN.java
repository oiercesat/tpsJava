
public class TesterRelationSymetrique1xN {

	public static void main(String[] args) {
		
		Ingredient ingredient1;
		Ingredient ingredient2;
		Ingredient ingredient3;
		
		PlatCuisine plat1;
		PlatCuisine plat2;
		
		plat1=new PlatCuisine("tartineBeurre","recette",null);
		plat2=new PlatCuisine("fromageSeul","recette",null);
	
		
		ingredient1=new Ingredient("pain",plat1);
		ingredient2=new Ingredient("beurre",plat1);
		ingredient3=new Ingredient("fromage",plat2);
		
		plat1.ajouterIngredient(ingredient1);
		plat1.ajouterIngredient(ingredient2);
		plat2.ajouterIngredient(ingredient3);
		
		
		System.out.println(ingredient1.toString());
		System.out.println(ingredient2.toString());
		System.out.println(ingredient3.toString());
	}

}
