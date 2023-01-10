/**
 * Classe : MainIncompletIncomplet
 * Objectif : Mettre en evidence les problemes lies e la difference entre l'objet et son adresse
 * 
 * 1. Creer un pointeur c'est different que de creer un objet 
 * 2. Cas de l'objet reference par deux pointeurs
 * 3. Creer un objet e l'identique d'un objet modele : constructeur par recopie
 * 
 * 4. Comparer deux pointeurs versus comparer deux objets
 *  4.a Comparer 2 pointeurs
 *  4.b Comparer 2 objets => la methode boolean equals(objetModele)
 * 
 * 5. Parametres des fonctions et methodes : seule la valeur de la variable est transmise 
 *  5.a Parametre "type primitif"
 *  	=> modifications de la variable sans effet au niveau appelant
 *  5.b Parametre "pointeur"
 *  	=> modification de la reference sans effet au niveau appelant
 *      => modification de l'objet reference avec effet au niveau appelant 
 * @version 2.0
 * @author Lopisteguy Philippe Oier Cesat 
 * @date 14/10/2022
 */
public class MainIncomplet {

/** 1.ATTRIBUTS              -non- **/
/** 2.CONSTRUCTEURS          -non- **/
/** 3.METHODES ENCAPSULATION -non- **/
/** 4.METHODES USUELLES      -non- **/

/** 5.METHODES SPECIFIQUES : modifierLeParametreDeTypePrimitifInt, modifierLeParametreAdresse, modifierObjetPointeParLeParametre **/

	static public void modifierLeParametreDeTypePrimitifInt (int entierRecu) {
		System.out.println ("... je reçois l'entier "+ entierRecu +" et l'augmente de 1");
		entierRecu++;  // incrementation
		System.out.println ("... pour moi il vaut "+ entierRecu +" et la fonction se termine");
	}
	
	static public void modifierLeParametreAdresse (Ingredients ingredient) {
		System.out.println ("... je reçois l'adresse de l'ingredient "+ingredient.toString());
		Ingredients unNouveau;
		unNouveau = new Ingredients ("vin", 40); // Cree unNouveau ingredient
		System.out.println ("... je cree un nouvel ingredient "+ unNouveau.toString());
		ingredient = unNouveau;					 
		System.out.println ("... le parametre reeu pointe sur ce nouvel ingredient "+ingredient.toString()+" et la fonction se termine");
	}
	
	static public void modifierObjetPointeParLeParametre (Ingredients ingredient) {
		System.out.println ("... je reçois l'adresse de l'ingredient "+ingredient.toString());
		ingredient.set_quantite(0);
		System.out.println ("... je modifie la quantite "+ ingredient.toString()+" et la fonction se termine");
	}

/** 6.METHODE PRINCIPALE: MainIncompletIncomplet() **/
	public static void main(String[] args) {
		
		 /* 1. Creer un pointeur c'est different que de creer un objet 
		 * - un pointeur est capable de stocker l'adresse d'un objet
		 * - un objet est cree par un 'new'
		 * - un 'new' retourne l'adresse de l'objet cree
		 * => on recupere l'adresse dans un pointeur
		*/
		System.out.println("\n1. Creer un pointeur c'est different que de creer un objet");
		Ingredients ingredients10;	// On cree le pointeur ingredients10, 
		ingredients10=new Ingredients("lait",10);	// on cree l'objet <"lait",10>
		// et le pointeur ingredient10 recupere l'adresse de l'objet <"lait",10>
		System.out.println("ingredient10 contient l'adresse de "+ingredients10.toString());

		/* 2. Cas de l'objet reference par deux pointeurs
		 *  a. declarer 2 pointeurs
		 *  b. creer un objet et garder son @ dans le 1er pointeur
		 *  c. copier cette @ dans le 2eme pointeur
		 *  d. afficher l'objet que pointeur le 1er et le 2eme pointeur
		 *  e. modifier l'objet via le 2eme pointeur & constater la modification
		 *  f. afficher l'objet pointe par chacun de ces 2 pointeurs
		 * => les modifications de l'objet via le 1er pointeur ont affecte les valeurs
		 *    de l'objet pointe par le 2e pointeur. Normal ! c'est le meme objet
		 */
		System.out.println("\n2. Cas de l'objet reference par deux pointeurs");
		Ingredients ingredient21;	// a. creation d'un 1er pointeur ingredient21
		Ingredients ingredient22;	// a. creation d'un 2eme pointeur ingredient22
		ingredient21=new Ingredients("sel",21);	// b. le 1er pointe sur new objet <"sel", 21>
		ingredient22=new Ingredients(ingredient21);	// c. copier l'@ de l'objet dans le 2eme pointeur
		ingredient21.afficher();	// d. affichage via 1er pointeur
		ingredient22.afficher();	// d. affichage via 2eme pointeur
		ingredient22.set_libelle("soupe");	// e. modifier l'objet via le 1er pointeur
		ingredient21.afficher();	// f. affichage via 1er pointeur
		ingredient22.afficher();	//    et 2eme pointeur
		
		 /* 3. Creer un objet e l'identique d'un objet modele : constructeur par recopie
		 *   a. ecrire un constructeur avec un objet modele en parametre (cf. classe Ingredients)
		 *   b. creer un 1er objet reference par un 1er pointeur
		 *   c. creer un 2eme objet (sur la base du 1er objet) reference par un 2eme pointeur
		 *   d. constater que les 2 pointeurs se referent e des objets de meme valeur
		 *   e. modifier le premier objet
		 *   f. constater que chaque poitneur se refere e des objets de valeurs differentes
		 * => Constructeur par recopie
		 */
		System.out.println("\n3. Creer un objet e l'identique d'un objet modele : constructeur par recopie");
		// a. est deja fait : soyez tranquilles...
		Ingredients ingredient31;	// b. cree le 1er pointeur    ingredient31
		ingredient31 = new Ingredients("milk",31);	// b. le 1er pointeur prend l'@ d'un ouvel objet <"milk", 31>
		Ingredients ingredient32 ;	// c. cree le 2eme pointeur   ingredient32
		ingredient32 = ingredient31.dupliquer();	// c. le 2eme pointeur prend l'@ du 2eme objet qui est construit
                                //    sur la base du 1er objet, cad construit par recopie
		ingredient31.afficher();	// d. affichage de ce que pointe    ingredient31
		ingredient32.afficher();	// d. affichage de ce que pointe    ingredient32
		ingredient32.set_libelle("kinder");	// e. modification de l'un des 2 objets
		ingredient31.afficher();	// f. affichage  de ce que pointe    ingredient31
		ingredient32.afficher();	// f. affichage  de ce que pointe    ingredient32
		
		/* 4. Comparer deux pointeurs versus comparer deux objets
		 *  4.a Commparer 2 pointeurs
		 *      a. creer un objet reference par un pointeur
		 *      b. copier le pointeur dans un second pointeur
		        c. observer qu'ils sont egaux (ils referencent le meme objet)
		 *  4.b Comparer 2 objets
		 *      a. creer et initialiser un premier objet reference par un 1er pointeur
		 *      b. creer et initialiser (aux meme valeurs) un second objet reference par un 2eme pointeur
		 *      c. comparer les pointeurs et constater qu'ils sont differents alors que les 2 objets references sont identiques
		 * 	d. (c'est deje fait) surcharger la methode "static public boolean equals(objetModele)" (cf. classe Ingredients) de sorte
		 *         e ce que l'objet considere compare ses attributs e ceux de l'objet modele et retourne vrai en cas d'egaliteS
		 */
		System.out.println("\n4. Comparer deux pointeurs versus comparer deux objets");
		System.out.println("   4.a Comparer deux pointeurs : pointeurs egaux"); 
		Ingredients ingredient41=new Ingredients("salt",41);	// a. creer un objet <"salt", 41> pointe par ingredient41
		Ingredients ingredient42=ingredient41.dupliquer();	// b. copier le pointeur dans un second pointeur ingredient42
		ingredient41.afficher();	// c. observer que ingredient41 et ingredien42 sont egaux
		ingredient42.afficher();
		
		System.out.println("\n   4.b Comparer deux objets => la methode boolean equals(objetModele)");
		Ingredients ingredient43=new Ingredients("vin",49);;	// a. creer un objet pointe par ingredient43 aux valeurs <"vin", 49>
		Ingredients ingredient44=new Ingredients("vin",41);;	// b. creer un 2eme objet pointe par ingredient44 aux memes valeurs <"vin", 49>
		if(ingredient43==ingredient44)
		{
			System.out.println("l'adresse est la même");
		};	// c. difference d'adresse des objets, mais memes valeurs 
		if(ingredient41.equals(ingredient42)) 
		{
			System.out.println("les quantités sont les mêmes");
		};	// d.valeurs des objets identiqueS : regarder le 'if' (cf. methode equals)
		
		 /* 5. Parametres des fonctions et methodes : c'est la valeur de la variable qui est transmise
		  *   5.a Parametre "type primitif" => modifications de la variable sans effet au niveau appelant
		  */
		System.out.println("\n5. Parametres des fonctions et methodes : c'est la valeur de la variable qui est transmise");
		System.out.println("     5.a Parametre type primitif => modifications de la variable sans effet au niveau appelant");
		int unEntier = 20;
		System.out.println ("La valeur de unEntier "+unEntier+" est transmise e la fonction"); // avant  20
		// xxxx;	// appeler :    modifierLeParametreDeTypePrimitifInt (int);
		System.out.println ("La valeur de unEntier "+unEntier+" et est INCHANGE apres la fonction"); // apres 20 inchange !!!!
		
		//  5.b Parametre "pointeur" => modification de la reference sans effet au niveau appelant
		System.out.println("\n     5.b Parametre pointeur => modification de la reference sans effet au niveau appelant");
		Ingredients ingredient00 = new Ingredients ("huile", 10);
		System.out.println ("La valeur de l'ingredient "+ingredient00.toString()+" est transmise e la fonction"); // avant <huile,10>
		// xxxx;	// appeler :   modifierLeParametreAdresse (Ingredients);
		System.out.println ("La valeur de l'ingredient "+ingredient00.toString()+" apres la fonction INCHANGE"); // apres <huile,10> inchange !!!!
		
		//  5.c Parametre "pointeur" => modification de l'objet reference avec effet au niveau appelant 
		System.out.println("\n     5.c Parametre pointeur => modification de l'objet avec effet au niveau appelant");
		Ingredients ingredient11 = new Ingredients ("the", 11);
		System.out.println ("La valeur de l'objet pointe "+ingredient11.toString()+" est transmise e la fonction"); // avant <the,10>
		// xxxx;	// appeler : 	modifierObjetPointeParLeParametre (Ingredients);
		System.out.println ("La valeur de l'objet pointe "+ingredient11.toString()+" apres la fonction C H A N G E"); // apres <vin,40> inchange !!!!
	}
}