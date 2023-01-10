

public class Table {
	//ATTRIBUT
	String numeroTable;
	Client client;
	
	//CONSTRUCTEUR
	public Table(){
		numeroTable="";
		client=null;
	}
	
	public Table(String id,Client c) {
		numeroTable=id;
		client=c;
	}
	
	public Table(Table t) {
		numeroTable=t.numeroTable;
		client=t.client;
	}
	
	//ENCAPSULATION
	
	//GETEUR
	public String getNumero() {
		return this.numeroTable;
	}
	
	public Client getClient() {
		return this.client;
	}
	
	//SETEUR
	
	public void setNumero(String n) {
		this.numeroTable=n;
	}
	
	public void setClient(Client c) {
		this.client=c;
	}
	
	//METHODES USUELLES
	
	public String toString () {
		String message;
		message="numero table : "+getNumero()+" client : "+getClient().getNom();
		return message;
	}
	
	//METHODES SPECIFIQUES
	
	public void delierMonClient() {
		if (this.getClient()!=null) {
			this.setClient(null);
			this.client.setTable(null);
		}
	}
	
	public void lierMonClient(Client c) {
		if(c!=null) {
			this.delierMonClient();
			c.delierMaTable();
			this.setClient(c);
			c.setTable(this);
		}
	}
}
