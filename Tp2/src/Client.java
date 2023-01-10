

public class Client {
	//ATTRIBUT
	String nom;
	String tel;
	Table table;
	
	//CONSTRUCTEUR
	public Client(){
		nom="";
		tel="";
		table=null;
	}
	
	public Client(String n,String t,Table nouvTable) {
		nom=n;
		tel=t;
		table=nouvTable;
	}
	
	public Client(Client c) {
		nom=c.nom;
		tel=c.tel;
		table=c.table;
	}
	
	//ENCAPSULATION
	
	//GETEUR
	public String getNom() {
		return this.nom;
	}
	
	public String getTel() {
		return this.tel;
	}
	
	public Table getTable() {
		return this.table;
	}
	
	//SETEUR
	
	public void setNom(String n) {
		this.nom=n;
	}
	
	public void setTel(String t) {
		this.tel=t;
	}
	
	public void setTable(Table t) {
		this.table=t;
	}
	
	//METHODES USUELLES
	
	public String toString () {
		String message;
		message="nom : "+getNom()+" tel : "+getTel()+" table :"+getTable().getNumero();
		return message;
	}
	
	//METHODES SPECIFIQUES
	public void delierMaTable() {
		if (this.getTable()!=null) {
			this.setTable(null);
			this.table.setClient(null);
		}
	}
	
	public void lierMaTable(Table t) {
		if(t!=null) {
			this.delierMaTable();
			t.delierMonClient();
			this.setTable(t);
			t.setClient(this);
		}
	}
}
