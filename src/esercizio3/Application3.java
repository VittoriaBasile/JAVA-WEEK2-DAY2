package esercizio3;

public class Application3 {

	public static void main(String[] args) {
		Rubrica.aggiungiContatto("Mario", "0123456789");
		Rubrica.aggiungiContatto("Maria", "9876543210");
		Rubrica.aggiungiContatto("Giuseppe", "6789054321");
		Rubrica.stampaRubrica();
		Rubrica.cercaContatto("0123456789");
		Rubrica.cercaContattoDaNome("Mario");
	}

}
