
public class TesterrelationSymetrique1x1 {

	public static void main(String[] args) {
		
		Client client1;
		client1= new Client("Martin","0101010101",null);
		
		Client client2;
		client2= new Client ("Durand","0202020202",null);
		
		Table table1;
		table1= new Table("t01",null);
		
		Table table2;
		table2= new Table("t02",null);
		
		table1.setClient(client1);
		client1.setTable(table1);
		
		table2.setClient(client2);
		client2.setTable(table2);
		
		client1.lierMaTable(table2);
		
		
		System.out.println(client1.toString());
		System.out.println(table1.toString());
		System.out.println(table2.toString());
		System.out.println(client2.toString());
		
		
	}

}
