
public class Adaptateur implements ICible{
	//ATTRIBUT
	Disponible utilise;
	//CONSTRUCTEUR
	Adaptateur (){
		utilise=null;
	}

	//METHODES
	public void operation() {
		Disponible utilise = new Disponible();
		utilise.operationDisponible();
	}
}
